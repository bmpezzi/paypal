package com.org.paypal;

import com.org.paypal.service.FindN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

import java.util.logging.Logger;

@EnableFeignClients
@SpringBootApplication
public class PaypalApplication {
	private static String result = "";

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PaypalApplication.class, args);
		result = FindN.find("2");
		Logger.getLogger(PaypalApplication.class.getName()).info("Result: " + result);
		System.exit(SpringApplication.exit(ctx, () -> 0));
	}
}
