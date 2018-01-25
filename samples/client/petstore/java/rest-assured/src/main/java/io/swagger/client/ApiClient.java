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


package io.swagger.client;

import io.restassured.builder.RequestSpecBuilder;
import io.swagger.client.api.AnotherFakeApi;
import io.swagger.client.api.FakeApi;
import io.swagger.client.api.FakeClassnameTags123Api;
import io.swagger.client.api.PetApi;
import io.swagger.client.api.StoreApi;
import io.swagger.client.api.UserApi;

import java.util.function.Supplier;

public class ApiClient {

    private final Config config;

    private ApiClient(Config config) {
        this.config = config;
    }

    public static ApiClient api(Config config) {
        return new ApiClient(config);
    }

    public AnotherFakeApi anotherFake() {
        return AnotherFakeApi.anotherFake(config.baseReqSpec.get());
    }
    public FakeApi fake() {
        return FakeApi.fake(config.baseReqSpec.get());
    }
    public FakeClassnameTags123Api fakeClassnameTags123() {
        return FakeClassnameTags123Api.fakeClassnameTags123(config.baseReqSpec.get());
    }
    public PetApi pet() {
        return PetApi.pet(config.baseReqSpec.get());
    }
    public StoreApi store() {
        return StoreApi.store(config.baseReqSpec.get());
    }
    public UserApi user() {
        return UserApi.user(config.baseReqSpec.get());
    }

    public static class Config {
        private Supplier<RequestSpecBuilder> baseReqSpec;

        /**
         * Use common specification for all operations
         */
        public Config reqSpecSupplier(Supplier<RequestSpecBuilder> supplier) {
            this.baseReqSpec = supplier;
            return this;
        }

        public static Config apiConfig() {
            return new Config();
        }
    }
}