package com.hsp.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Dog xiaohuang = new Dog("xiaohuang");
        Bone bone = new Bone("big bone");
        Cat red = new Cat("red");
        Fish fish = new Fish("fish");

        tom.feed(xiaohuang, bone);
        System.out.println("____________________");
        tom.feed(red, fish);
    }
}
