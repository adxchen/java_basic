package com.use;

import com.xiaoming.Dog;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog); // com.xiaoming.Dog@10f87f48
        com.xiaoqiang.Dog dog1 = new com.xiaoqiang.Dog();
        System.out.println(dog1); // com.xiaoqiang.Dog@2f4d3709


    }
}
