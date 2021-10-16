package jyad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TailwindSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TailwindSpringBootApplication.class, args);
    }

}


@Controller
class MainController {

    @GetMapping
    public String index() {
        return "index";
    }
}