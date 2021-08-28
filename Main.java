package com.example.oopsection1;

public class Main {
    public static void main(String[] args) {
        Phone iphone = new Phone("Iphone 11",5,8,8);
//        iphone.setName("iphone 11");
        System.out.println(iphone.getName());

        iphone.setMemoryRam(8);

        iphone.playMusic("Our wings are burning");
        iphone.playMusic("Lamenting Kiss");

        Phone pixel = new Phone("Pixel3",16);
    }
}
//private methods/variables can be accesed inside our class only
//public field accessible from other classes as well
//protected
//if you dont use any access modifier it is treated as public
