package kh.nodam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "kh.nodam.mapper")
public class TripZoneTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripZoneTestApplication.class, args);
	}

}
