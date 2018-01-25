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
import io.swagger.client.model.Client;
import io.swagger.client.model.OuterComposite;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

import java.math.BigDecimal;
import java.util.List;

import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static io.restassured.filter.log.LogDetail.ALL;
import static io.swagger.client.GsonObjectMapper.gson;

/**
 * API tests for FakeApi
 */
@Ignore
public class FakeApiTest {

    private FakeApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder().setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .log(ALL)
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("http://petstore.swagger.io:80/v2"))).fake();
    }

    /**
     * Output boolean
     */
    @Test
    public void shouldSee200AfterFakeOuterBooleanSerialize() {
        Boolean body = null;
        api.fakeOuterBooleanSerialize().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Output composite
     */
    @Test
    public void shouldSee200AfterFakeOuterCompositeSerialize() {
        OuterComposite body = null;
        api.fakeOuterCompositeSerialize().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Output number
     */
    @Test
    public void shouldSee200AfterFakeOuterNumberSerialize() {
        BigDecimal body = null;
        api.fakeOuterNumberSerialize().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Output string
     */
    @Test
    public void shouldSee200AfterFakeOuterStringSerialize() {
        String body = null;
        api.fakeOuterStringSerialize().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterTestClientModel() {
        Client body = null;
        api.testClientModel()
                .body(body).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Invalid username supplied
     */
    @Test
    public void shouldSee400AfterTestEndpointParameters() {
        BigDecimal number = null;
        Double _double = null;
        String patternWithoutDelimiter = null;
        byte[] _byte = null;
        Integer integer = null;
        Integer int32 = null;
        Long int64 = null;
        Float _float = null;
        String string = null;
        byte[] binary = null;
        LocalDate date = null;
        OffsetDateTime dateTime = null;
        String password = null;
        String paramCallback = null;
        api.testEndpointParameters()
                .numberForm(number)
                ._doubleForm(_double)
                .patternWithoutDelimiterForm(patternWithoutDelimiter)
                ._byteForm(_byte).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * User not found
     */
    @Test
    public void shouldSee404AfterTestEndpointParameters() {
        BigDecimal number = null;
        Double _double = null;
        String patternWithoutDelimiter = null;
        byte[] _byte = null;
        Integer integer = null;
        Integer int32 = null;
        Long int64 = null;
        Float _float = null;
        String string = null;
        byte[] binary = null;
        LocalDate date = null;
        OffsetDateTime dateTime = null;
        String password = null;
        String paramCallback = null;
        api.testEndpointParameters()
                .numberForm(number)
                ._doubleForm(_double)
                .patternWithoutDelimiterForm(patternWithoutDelimiter)
                ._byteForm(_byte).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Invalid request
     */
    @Test
    public void shouldSee400AfterTestEnumParameters() {
        List<String> enumFormStringArray = null;
        String enumFormString = null;
        String enumHeaderStringArray = null;
        String enumHeaderString = null;
        List<String> enumQueryStringArray = null;
        String enumQueryString = null;
        Integer enumQueryInteger = null;
        Double enumQueryDouble = null;
        api.testEnumParameters().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Not found
     */
    @Test
    public void shouldSee404AfterTestEnumParameters() {
        List<String> enumFormStringArray = null;
        String enumFormString = null;
        String enumHeaderStringArray = null;
        String enumHeaderString = null;
        List<String> enumQueryStringArray = null;
        String enumQueryString = null;
        Integer enumQueryInteger = null;
        Double enumQueryDouble = null;
        api.testEnumParameters().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterTestInlineAdditionalProperties() {
        Object param = null;
        api.testInlineAdditionalProperties()
                .body(param).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterTestJsonFormData() {
        String param = null;
        String param2 = null;
        api.testJsonFormData()
                .paramForm(param)
                .param2Form(param2).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}