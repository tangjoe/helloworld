package helloworld;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@EnableAutoConfiguration
public class Application {

int a=0,b=1000000,c;
float x,y,z;

    @RequestMapping("/")
    String home() {
        return "Hello world from spring boot !\n";
    }

    @RequestMapping("/health")
    String health() {
        return "Status OK.\n";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
        System.out.println("End of code here ...");
    }
}
