package com.dev.hurricanes.demo4_backend_project1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // If any class called with browser or client apps then that class will be tagged as annonted called @RestController.
public class MyFirstAPI {

    @RequestMapping("/hello") // endpints.
    public String sayHello() {
        return "Hello Hurricanes";
    }

    // http://url-of-server/hello/hurricanes
    @RequestMapping("hello/{nameOfPerson}")
    public String sayHelloToPerson(@PathVariable("nameOfPerson") String name) {

        return "Hello " + name;
    }
}
