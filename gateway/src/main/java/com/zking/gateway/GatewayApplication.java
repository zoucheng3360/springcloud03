package com.zking.gateway;

import com.zking.gateway.filters.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class GatewayApplication {

	@Bean
	public TokenFilter tokenFilter() {
		return new TokenFilter();
	}


	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
