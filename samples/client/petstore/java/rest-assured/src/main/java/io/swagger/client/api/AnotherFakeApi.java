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

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.swagger.client.model.Client;

import java.util.function.Consumer;
import java.util.function.Function;

import static io.restassured.http.Method.PATCH;
import static io.swagger.client.GsonObjectMapper.gson;

public class AnotherFakeApi {

    private RequestSpecBuilder reqSpec;

    private AnotherFakeApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static AnotherFakeApi anotherFake(RequestSpecBuilder reqSpec) {
        return new AnotherFakeApi(reqSpec);
    }


    public TestSpecialTagsOper testSpecialTags() {
        return new TestSpecialTagsOper(reqSpec);
    }

    /**
     * To test special tags
     * To test special tags
     *
     * @see #body client model (required)
     * return Client
     */
    public class TestSpecialTagsOper {

        public static final String REQ_URI = "/another-fake/dummy";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public TestSpecialTagsOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public TestSpecialTagsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PATCH /another-fake/dummy
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(PATCH, REQ_URI));
        }

        /**
         * PATCH /another-fake/dummy
         * @return Client
         */
        public Client executeAs(Function<Response, Response> handler) {
            return execute(handler).as(Client.class, gson());
        }

         /**
         * @param body client model (required)
         */
        public TestSpecialTagsOper body(Client body) {
            reqSpec.setBody(body, gson());
            return this;
        }

        /**
         * Customise request specification
         */
        public TestSpecialTagsOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public TestSpecialTagsOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}