/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.swagger.client.ApiClient;
import io.swagger.client.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static io.swagger.client.GsonObjectMapper.gson;
import static io.swagger.client.ResponseSpecBuilders.shouldBeCode;
import static io.swagger.client.ResponseSpecBuilders.validatedWith;
import static io.swagger.client.api.TestUtils.nextId;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

/**
 * API tests for UserApi
 */
public class UserApiTest {

    private UserApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder().setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("http://petstore.swagger.io:80/v2"))).user();
    }

    @Test
    public void createUsersWithArrayInputTest() {
        List<User> body = new ArrayList<>();
        body.add(new User().id(nextId()));
        body.add(new User().id(nextId()));
        body.add(new User().id(nextId()));
        api.createUsersWithArrayInput()
                .body(body).execute(validatedWith(shouldBeCode(SC_OK)));
    }

    @Test
    public void createUsersWithListInputTest() {
        List<User> body = new ArrayList<>();
        body.add(new User().id(nextId()));
        body.add(new User().id(nextId()));
        body.add(new User().id(nextId()));
        api.createUsersWithListInput()
                .body(body).execute(validatedWith(shouldBeCode(SC_OK)));
    }

    @Test
    public void createUserTest() {
        String userName = "userName";
        User newUser = getUser().username(userName);
        api.createUser().body(newUser).execute(validatedWith(shouldBeCode(SC_OK)));
        api.getUserByName()
                .usernamePath(userName).executeAs(validatedWith(shouldBeCode(SC_OK)));
        assertThat(newUser.getUsername(), equalTo(userName));
    }

    @Test
    public void loginTest() {
        String username = "a";
        String password = "b";
        String result = api.loginUser()
                .usernameQuery(username)
                .passwordQuery(password).executeAs(validatedWith(shouldBeCode(SC_OK)));
        assertThat(result, containsString("logged in user session"));

    }

    @Test
    public void logoutTest() {
        api.logoutUser().execute(validatedWith(shouldBeCode(SC_OK)));
    }

    @Test
    public void updateUserTest() {
        String username = "me";
        User newUser = new User().username(username);
        api.createUser().body(newUser).execute(validatedWith(shouldBeCode(SC_OK)));
        api.updateUser()
                .usernamePath(username)
                .body(newUser).execute(validatedWith(shouldBeCode(SC_OK)));
        String result = api.getUserByName().usernamePath(username).executeAs(validatedWith(shouldBeCode(SC_OK))).getUsername();
        assertThat(result, equalTo(username));

    }

    private User getUser() {
        return new User().id(nextId()).username("Username")
                .email("blah@blah.com").firstName("Firstname").lastName("Lastname").userStatus(1);
    }
}