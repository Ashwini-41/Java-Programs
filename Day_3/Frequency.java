package Day_3;
import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,1,2,5,6};
        elementFreq(arr);
    }
    
    static void elementFreq(int arr[]){
        Map<Integer,Integer> freq = new HashMap<>();
        for(int ele : arr){
            if(freq.containsKey(ele)){
                freq.put(ele, freq.get(ele)+1);
            }else{
                freq.put(ele, 1);
            }
        }
        //System.out.println("Elemet with freq : " + freq);
        System.out.println("Element : Frequency ");
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
