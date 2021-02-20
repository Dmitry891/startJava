package com.startjava.lesson_2_3.jaeger;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    void setMark(String mark) {
        this.mark = mark;
    }

    void setOrigin(String origin) {
        this.origin = origin;
    }

    void setHeight(float height) {
        this.height = height;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setStrength(int strength) {
        this.strength = strength;
    }

    void setArmor(int armor) {
        this.armor = armor;
    }

    public String getModelName() {
        System.out.println(modelName);
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
    }

    public void jaegerDescription() {
        System.out.println("Jaeger's name is " + modelName);
        System.out.println("Jaeger's origin is " + origin);
        System.out.println("Jaeger's height is " + height);
        System.out.println("Jaeger's weight is " + weight);
        System.out.println("Jaeger's speed is " + speed);
        System.out.println("Jaeger's strength is " + strength);
        System.out.println("Jaeger's armor is " + armor);
    }

    void drift() {
    }
    
    void move() {
    }

    void scanKaiju() {
    }

    void useVortexCannon() {
    }

}
