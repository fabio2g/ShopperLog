package org.example;

import org.example.model.User;
import org.example.repository.UserRepository;

public class App {
    public static void main(String[] args) {
        User user = new User("Jane", 18, "067.872.827.89", "45 99735287");

        UserRepository.insertUser(user);
    }
}

