package com.song.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Song on 2017/11/7.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
//                .consumes(Collections.singleton(MediaType.APPLICATION_JSON_UTF8_VALUE))
//                .produces(Collections.singleton(MediaType.APPLICATION_JSON_UTF8_VALUE))
//                .genericModelSubstitutes(ResponseEntity.class)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.song"))
                .paths(PathSelectors.any())
                .build();
//                .securitySchemes(apiKeys())
//                .securityContexts(Lists.newArrayList(securityContext()));
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("alipay-wxpay-demo-api")
                .description("测试demo")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }

   /* private List<ApiKey> apiKeys() {
        List<ApiKey> list = Lists.newArrayList();
        //list.add(new ApiKey("mykey2", "api_key", "header"));
        return list;
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder()
                .securityReferences(defaultAuth())
                .forPaths(PathSelectors.regex("/.*?"))
                .build();
    }

    List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[]{authorizationScope};
        return Lists.newArrayList(new SecurityReference("mykey", authorizationScopes));
    }*/


    @Bean
    UiConfiguration uiConfig() {
        return new UiConfiguration("", "none", "alpha", "schema",
                UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS, true, true);
    }
}
