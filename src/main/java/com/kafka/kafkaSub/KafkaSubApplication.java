package com.kafka.kafkaSub;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kafka.kafkaSub.model.Book;

import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class KafkaSubApplication {

	private static final Logger log = LoggerFactory.getLogger(KafkaSubApplication.class);

	// //consume-in-0
	// @Bean
	// public Consumer<String> consume() {
	// 	return value -> log.info("value is {} " , value);
	// }


	//consume-in-0
	@Bean
	public Consumer<Book> consume() {
		return book -> log.info("value is {} " , book);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(KafkaSubApplication.class, args);
	}

}
