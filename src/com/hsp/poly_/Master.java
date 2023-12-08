package com.hsp.poly_;

public class Master {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master(String name) {
        this.name = name;
    }

    public void feed(Dog dog, Bone bone) {
        System.out.println("主人 "+ name + "给" + dog.getName() + "喂了一个" + bone.getName());
    }
    public void feed(Cat cat, Fish fish) {
        System.out.println("主人 "+ name + "给" + cat.getName() + "喂了一个" + fish.getName());
    }
}
