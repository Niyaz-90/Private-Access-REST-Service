package ru.inno.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void doTransaction() {
        System.out.println("Проведение платежа...");
    }
}
