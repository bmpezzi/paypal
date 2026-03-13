package com.org.paypal;

import com.org.paypal.service.FindN;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

import java.util.logging.Logger;

@EnableFeignClients
@SpringBootApplication
public class PaypalApplication {
	public static void main(String[] args) {
  		String result;
		ApplicationContext ctx = SpringApplication.run(PaypalApplication.class, args);
		result = FindN.find(5);
		Logger.getLogger(PaypalApplication.class.getName()).info("Result: " + result);
		System.exit(SpringApplication.exit(ctx, () -> 0));
	}
}
