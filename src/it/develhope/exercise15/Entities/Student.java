package it.develhope.exercise15.Entities;

import java.util.Random;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void guessingAge(){
        Random randomNumber = new Random();
        int randNumber = randomNumber.nextInt(35);

        System.out.println(randNumber);
        if(randNumber > this.age){
            System.out.println(randNumber + " Is great than student's age");
        }else if(randNumber < this.age){
            System.out.println(randNumber + " Is small than student's age");
        }else{
            System.out.println(randNumber + " U guess the age!");
        }
    }
}
