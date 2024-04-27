package com.dev.hurricanes.demo4_backend_project1;

public class LoginService {
    DataBase db = new DataBase();

    void doSomething() {
        db.createQuery("Select * from products");
    }
}
