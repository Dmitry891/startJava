public class Wolf {

    private String gender;
    private String name;
    private String colour;
    private byte age;
    private float weight;

    void setGender(String gender) {
        this.gender = gender;
    }

    void setName(String name) {
        this.name = name;
    }

    void setColour(String colour) {
        this.colour = colour;
    }

    void setAge(byte age) {
        this.age = age;
        if (age > 8) {
            System.out.println("Age is incorrect!");
        }
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    public String getGender() {
        System.out.println("Wolf's gender is " + gender);
        return gender;
    }

    public String getName() {
        System.out.println("Wolf's name is " + name);
        return name;
    }

    public String getColour() {
        System.out.println("Wolf's colour is " + colour);
        return colour;
    }

    public int getAge() {
        System.out.println("Wolf's age is " + age + " years");
        return age;
    }

    public void go() {

    }

    public void sit() {

    }

    public void run() {

    }

    public void howl() {
        System.out.println("Woo-ooo-oooo-ooooo...");
    }

    public void hunt() {

    }

}