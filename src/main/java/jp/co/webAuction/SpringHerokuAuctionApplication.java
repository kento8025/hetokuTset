package jp.co.webAuction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class SpringHerokuAuctionApplication {

	@RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringHerokuAuctionApplication.class, args);
	}

}