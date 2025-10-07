package com.laioffer.twitch.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {


    @GetMapping("/hello")
    public Person sayHello(@RequestParam(required = false) String name) {
        if (name == null) {
            name = "Guest";
        }
        return new Person(
                name,
                "Laioffer",
                new Address("123 Main St", "San Francisco", null, null),
                new Book("The Hobbit", "J.R.R. Tolkien")
        );
    }
}

