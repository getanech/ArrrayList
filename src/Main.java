import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i+1;
        }

        for (int num: arr) {
            System.out.println("hii is this is num "+num);
        }
        for (int i = 0; i < arr.length; i++) {

        }



        System.out.println(Arrays.toString(arr));
        ArrayFlexible arrayFlexible = new ArrayFlexible();
        for (int i = 0; i < 10; i++) {
            arrayFlexible.add(i);
        }
        arrayFlexible.add(2);
        System.out.println(arrayFlexible);
        // מבני נתונים
       // "--------------------------------------------------"
        ArrayList <Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        arrayList.remove(1);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(3));
        System.out.println( arrayList.contains(4));
        System.out.println(arrayList);

    }
}