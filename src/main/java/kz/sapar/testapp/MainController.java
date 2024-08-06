package kz.sapar.testapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/api/v1/{name}")
    public String sayHello(@PathVariable(name = "name") String name) {
        return "Hello " + name;
    }
}
