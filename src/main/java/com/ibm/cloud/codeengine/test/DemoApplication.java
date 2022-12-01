package com.ibm.cloud.codeengine.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.nio.charset.Charset;
import org.apache.commons.io.IOUtils;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		IOUtils.write("[INFO] : Accepting connections at http://localhost:8080", System.out, Charset.forName("UTF-8"));
		SpringApplication.run(DemoApplication.class, args);
	}
}
