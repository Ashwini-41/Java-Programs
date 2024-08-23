package Generics.src;

public class printArray {

    public static void toPrint(Integer[] inputArray){
        for(int ele : inputArray){
            System.out.printf( "%s ",ele);
        }
        System.out.println();
    }

    public static void toPrint(Double[] inputArray){
        for(double ele : inputArray){
            System.out.printf( "%s ",ele);
        }
        System.out.println();
    }
   
    public static void toPrint(Character[] inputArray){
        for(char ele : inputArray){
            System.out.printf( "%s ",ele);
        }
        System.out.println();
    }




    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7};
        Double[] doubleArray = {1.1,2.2,3.1,4.5,5.5};
        Character[] charArray = {'a','b','c','d','e'};

        toPrint(intArray);
        toPrint(doubleArray);
        toPrint(charArray);
    }
}
