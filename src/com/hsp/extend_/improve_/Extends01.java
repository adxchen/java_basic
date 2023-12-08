package com.hsp.extend_.improve_;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "xiaoming";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(90);
        pupil.getInfo();

        Graduate graduate = new Graduate();
        graduate.name = "chen";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(92);
        graduate.getInfo();
    }
}
