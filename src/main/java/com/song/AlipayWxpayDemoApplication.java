package com.song;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication
@MapperScan("com.song.dao")
@EnableTransactionManagement//开启事务注解
public class AlipayWxpayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlipayWxpayDemoApplication.class, args);
	}



	/**
	 * 将json改用FastJson
	 *
	 * @return
	 */
	@Bean
	public HttpMessageConverters fastJasonHttpMessageConverters() {
		FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
		HttpMessageConverter<?> converter = fastJsonHttpMessageConverter;
		return new HttpMessageConverters(converter);
	}

	/**
	 * 上传设置
	 * @return
	 */
	@Bean
	public MultipartConfigElement getMultipartConfigElement() {
		MultipartConfigFactory multipartConfigFactory = new MultipartConfigFactory();
		multipartConfigFactory.setMaxFileSize("5MB");//KB,MB
		//multipartConfigFactory.setMaxRequestSize("5MB");
		return multipartConfigFactory.createMultipartConfig();
	}
}
