package com.shaka.lichcity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author 袁振
 * @date 2020/1/7 19:03
 */
@EnableJpaAuditing
@EnableEurekaClient
@SpringBootApplication
public class AlbumApplication {

	public static void main(String[] args) {

		SpringApplication.run(AlbumApplication.class,args);
	}
}
