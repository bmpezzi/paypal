package com.org.paypal;

import com.org.paypal.service.FindN;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

@Slf4j
@EnableFeignClients
@SpringBootApplication
public class PaypalApplication {
	public static void main(String[] args) {
  		String result;
		ApplicationContext ctx = SpringApplication.run(PaypalApplication.class, args);
		result = FindN.find(Integer.parseInt(args[0]));
		log.info("Result: {}", result);
		System.exit(SpringApplication.exit(ctx, () -> 0));
	}
}
