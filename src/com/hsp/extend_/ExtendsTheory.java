package com.hsp.extend_;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        //按照查找关系来返回信息。
        //1.查找Son类中有无name属性，有则直接返回
        //2.如果无，则在父类寻找，依此类推
        //3.如果父类也没有就报错
        System.out.println(son.name);// 为什么返回大头儿子？
        System.out.println(son.age);
        System.out.println(son.hobby);
    }
}

class GrandPa {
    String name = "大头爷爷";
    String hobby = "旅游";
}
class Father extends GrandPa {
    String name = "大头爸爸";
    int age = 30;
}
class Son extends Father {
    String name = "大头儿子";
}