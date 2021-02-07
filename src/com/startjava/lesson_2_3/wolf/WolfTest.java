package com.startjava.lesson_2_3.wolf

public class WolfTest {
    public static void main(String [] args) {
        Wolf wolfOne = new Wolf();
        String gender = "male";
        String name = "Ghost";
        String colour = "white";
        byte age = 5;
        float weight = 92.8f;
        
        wolfOne.setGender(gender);
        wolfOne.setName(name);
        wolfOne.setColour(colour);
        wolfOne.setAge(age);
        wolfOne.setWeight(weight);
        wolfOne.getGender();
        wolfOne.getName();
        wolfOne.getColour();
        wolfOne.getAge();
        wolfOne.howl();

    }
}