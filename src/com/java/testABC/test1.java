package com.java.testABC;

class Parent {

    public Parent ()    {
        System.out.println("From Base");
    }
}
class Child extends Parent  {
    Child() {
        this("Hello! ");
        System.out.println("Welcome");
    }
    Child(String str){
        System.out.println(str);
    }
}
public class test1 {
    public static void main(String[] args) {
        Parent p = new Child();
    }
}