package com.rest.demo.sum;

public class Login {
    public boolean login(String name, String pwd) {
        if (name.equals(name.equals("admin")) && pwd.equals("123456")) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Login login =new Login();

    }
}
