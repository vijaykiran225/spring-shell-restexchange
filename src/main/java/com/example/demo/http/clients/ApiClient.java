package com.example.demo.http.clients;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

public interface ApiClient {
//https://jsonplaceholder.typicode.com/users
    @GetExchange("/users")
    String users();

    @GetExchange("/users/{id}")
    String userById(@PathVariable Integer id);
}
