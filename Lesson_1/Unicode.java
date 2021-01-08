public class Unicode {   
    public static void main(String[] args) {
        /* 
        Выводятся символы кодировки Unicode в диапазоне [33...126]. 
        Диапазон [9398...10178] адекватно не выводился.
        */
        System.out.println("Below is a list of the Unicode symbols in range of [33...126]: ");
        for (byte i = 33; i <= 126; i++) {
            char symbol = (char) i;
            System.out.print (symbol + " ");
            } 
    }
}