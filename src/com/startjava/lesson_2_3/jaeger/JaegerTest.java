package com.startjava.lesson_2_3.jaeger;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger сhernoAlpha = new Jaeger();
        сhernoAlpha.setModelName("Cherno Alpha");
        сhernoAlpha.setMark("Mark-1");
        сhernoAlpha.setOrigin("Russia");
        сhernoAlpha.setHeight(85.34f);
        сhernoAlpha.setWeight(2.412f);
        сhernoAlpha.setSpeed(3);
        сhernoAlpha.setStrength(10);
        сhernoAlpha.setArmor(10);
        
        Jaeger strikerEureka = new Jaeger();
        strikerEureka.setModelName("Striker Eureka");
        strikerEureka.setMark("Mark-5");
        strikerEureka.setOrigin("Australia");
        strikerEureka.setHeight(76.2f);
        strikerEureka.setWeight(1.85f);
        strikerEureka.setSpeed(10);
        strikerEureka.setStrength(10);
        strikerEureka.setArmor(9);

        сhernoAlpha.jaegerDescription();
        System.out.println();
        strikerEureka.jaegerDescription();
    }
}