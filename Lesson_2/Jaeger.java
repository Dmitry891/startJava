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
        System.out.println("Jaeger's model is " + modelName);
        return modelName;
    }

    public String getMark() {
        System.out.println("Jaeger's mark is " + mark);
        return mark;
    }

    public String getOrigin() {
        System.out.println("Jaeger's origin is " + origin);
        return origin;
    }

    public float getHeight() {
        System.out.println("Jaeger's height is " + height);
        return height;
    }

    public float getWeight() {
        System.out.println("Jaeger's weight is " + weight);
        return weight;
    }

    public int getSpeed() {
        System.out.println("Jaeger's speed is " + speed);
        return speed;
    }

    public int getStrength() {
        System.out.println("Jaeger's strength is " + strength);
        return strength;
    }

    public int getArmor() {
        System.out.println("Jaeger's armor is " + armor);
        return armor;
    }

    // void boolean drift() {

    // }
    
    // void move () {

    // }

    // void scanKaiju() {

    // }

    // void useVortexCannon() {

    // }

}
