public class WolfTest {
    public static void main(String [] args) {
        
        Wolf wolfOne = new Wolf();
        
        wolfOne.gender = "male";
        wolfOne.name = "Ghost";
        wolfOne.colour = "white";
        wolfOne.age = 5;
        wolfOne.weight = 92.8f;
        
        System.out.println("Wolf's gender is " + wolfOne.gender);
        System.out.println("Wolf's name is " + wolfOne.name);
        System.out.println("Wolf is " + wolfOne.colour);
        System.out.println("Wolf is " + wolfOne.age + " years old.");
        System.out.println("Wolf's weight is " + wolfOne.weight + " kg");
        
        wolfOne.howl();
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.hunt();
    }
}