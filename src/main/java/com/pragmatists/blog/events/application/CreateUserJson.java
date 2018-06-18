package com.pragmatists.blog.events.application;

import com.pragmatists.blog.events.domain.User;
import com.pragmatists.blog.events.domain.UserId;

public class CreateUserJson {
    String login;
    String email;

    public User asUser() {
        return new User(new UserId(), login, email);
    }
}
