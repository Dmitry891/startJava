public class Variable {   
    public static void main(String[] args) {
        //Ниже приведены характеристики моего текущего персонального компьютера
        byte numberOfСpuCores = 2;
        short сpuFrequency = 3200;
        int sizeOfRam = 800000000;
        long ramFrequency = 160000000000L; 
        float totalStorageCapacity = 476.94f;
        double freeStorageCapacity = 268.96;
        boolean windowsSystеm = true;
        char finish = '\u0021';

        System.out.printf("%28s\n", "Specifications");
        System.out.printf("Number of CPU Cores: %21s\n", numberOfСpuCores);
        System.out.printf("CPU Frequency, MHz: %22s\n", сpuFrequency);
        System.out.printf("Size of RAM, Byte: %23s\n", sizeOfRam);
        System.out.printf("RAM Frequency, Hz: %23s\n", ramFrequency);
        System.out.printf("Total Storage Capacity, GB: %14s\n", totalStorageCapacity);
        System.out.printf("Free Storage Capacity, GB: %15s\n", freeStorageCapacity);
        System.out.printf("Is Windows operation system?: %12s\n", windowsSystеm);
        System.out.println("Home work is done" + finish);
    }
}