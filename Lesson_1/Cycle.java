public class Cycle {   
    public static void main(String[] args) {
        System.out.print("Result of the for cycle: ");
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.print("Result of the while cycle: ");
        int j = 6;
        while (j >= -6) {
            System.out.print(j + " ");
            j -= 2;
        }
        System.out.println();
        
        int sum = 0;
        int k = 10;
        do { 
            if (k % 2 != 0) {
            sum = sum + k;
            }
           k++;
        } while (k <= 20);
        System.out.println("Result of the do while cycle: " + sum);
    }
}