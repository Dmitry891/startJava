
public class JaegerTest {
    public static void main(String[] args) {
        String modelName = "Cherno Alpha";
        String mark = "Mark-1";
        String origin = "Russia";
        float height = 85.34f;
        float weight = 2.412f;
        int speed = 3;
        int strength = 10;
        int armor = 10;

        // String modelName = "Striker Eureka";
        // String mark = "Mark-5";
        // String origin = "Australia";
        // float height = 76.2f;
        // float weight = 1,850f;
        // int speed = 10;
        // int strength = 10;
        // int armor = 9;

        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName(modelName);
        jaegerOne.setMark(mark);
        jaegerOne.setOrigin(origin);
        jaegerOne.setHeight(height);
        jaegerOne.setWeight(weight);
        jaegerOne.setSpeed(speed);
        jaegerOne.setStrength(strength);
        jaegerOne.setArmor(armor);
        jaegerOne.getModelName();
        jaegerOne.getMark();
        jaegerOne.getOrigin();
        jaegerOne.getHeight();
        jaegerOne.getWeight();
        jaegerOne.getSpeed();
        jaegerOne.getStrength();
        jaegerOne.getArmor();

        // Jaeger jaegerTwo = new Jaeger();
        // jaegerTwo.setModelName(modelName);
        // jaegerTwo.setMark(mark);
        // jaegerTwo.setOrigin(origin);
        // jaegerTwo.setHeight(height);
        // jaegerTwo.setWeight(weight);
        // jaegerTwo.setSpeed(speed);
        // jaegerTwo.setStrength(strength);
        // jaegerTwo.setArmor(armor);
        
        // jaegerTwo.getModelName();
        // jaegerTwo.getMark();
        // jaegerTwo.getOrigin();
        // jaegerTwo.getHeight();
        // jaegerTwo.getWeight();
        // jaegerTwo.getSpeed();
        // jaegerTwo.getStrength();
        // jaegerTwo.getArmor();
    }
}