public class Cycle {   
    public static void main(String[] args) {
        System.out.println("Result of the for cycle:");
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Result of the while cycle:");
        int j = 6;
        while (j >= -6) {
            System.out.print(j + " ");
            j = j - 2;
        }
        System.out.println();
        System.out.println("Result of the do while cycle:");
        int k = 10;
        do {
           System.out.print(k + " ");
           k = k + 2;
        } while (k <= 20);
    }
}