package com.hsp.extend_;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 9;
        pupil.testing();
        pupil.setScore(99);
        pupil.getInfo();

        Graduate graduate = new Graduate();
        graduate.name = "小城";
        graduate.age = 25;
        graduate.testing();
        graduate.setScore(89);
        graduate.getInfo();

    }
}


