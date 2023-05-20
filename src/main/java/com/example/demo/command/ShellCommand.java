package com.example.demo.command;

import com.example.demo.http.clients.ApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class ShellCommand {


    @Autowired
    ApiClient client;

    @ShellMethod(value = "get users list", key = "users")
    public String get(@ShellOption(value = "id",defaultValue = "-1") Integer id) throws Throwable {

        if(id == -1) {
            return client.users();
        } else{
            return client.userById(id);
        }
//        return "hello";
    }

    @ShellMethod(value = "health/ ping pong", key = "ping")
    public String pong() throws Throwable {
        return "hello";
    }
}
