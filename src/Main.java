import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int elements = 100000;
        long time_start = 0;
        long time_end = 0;

        // declaring structure
        List array_list = new ArrayList();
        Set<Integer> hash_set = new HashSet<Integer>();
        Map<Integer, Integer> hash_map =new HashMap<>();

        // calculating time to add elements Array List
        time_start = System.currentTimeMillis();
        for (int i=0; i<elements; i++){
            array_list.add(i);
        }
        time_end = System.currentTimeMillis();
        System.out.println("Runtime Insertion Array List : " + (time_end-time_start) + " ms");

        // calculating time to add elements Hash Set
        time_start = System.currentTimeMillis();
        for (int i=0; i<elements; i++){
            hash_set.add(i);
        }
        time_end = System.currentTimeMillis();
        System.out.println("Runtime Insertion Hash Set : " + (time_end-time_start) + " ms");

        // calculating time to add elements Hash Map
        time_start = System.currentTimeMillis();
        for (int i=0; i<elements; i++){
            hash_map.put(i,i*-1);
        }
        time_end = System.currentTimeMillis();
        System.out.println("Runtime Insertion Hash Map : " + (time_end-time_start) + " ms");
        System.out.println();

        // calculating time to get elements Array list
        time_start = System.currentTimeMillis();
        for (int i=0; i<elements; i++){
            array_list.contains(i);
        }
        time_end = System.currentTimeMillis();
        System.out.println("Runtime Search Array List : " + (time_end-time_start) + " ms");

        // calculating time to get elements Hash Set
        time_start = System.currentTimeMillis();
        for (int i=0; i<elements; i++){
            hash_set.contains(i);
        }
        time_end = System.currentTimeMillis();
        System.out.println("Runtime Search Hash Set : " + (time_end-time_start) + " ms");

        // calculating time to get elements Hash Set
        time_start = System.currentTimeMillis();
        for (int i=0; i<elements; i++){
            hash_map.containsKey(i);
        }
        time_end = System.currentTimeMillis();
        System.out.println("Runtime Search Hash Map : " + (time_end-time_start) + " ms");
    }
}