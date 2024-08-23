package Generics.src;

public class printArrayUsingGeneric {
    public static <E> void toPrint(E[] inputArray){
        for(E ele : inputArray){
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
