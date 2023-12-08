package com.hsp.extend_;

public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println("大学生正在考试");
    }

    public void getInfo() {
        System.out.println("大学生名:" + name + " 年龄:" + age + " 成绩:" + score);
    }
}
