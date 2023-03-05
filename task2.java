/*
 * 2. Пусть дан произвольный список целых чисел, удалить из него четные числа.
 */

import java.util.Iterator;
import java.util.ArrayList;

public class task2 {
    public static void main (String[] arg) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(6);
        numbers.add(9);
        numbers.add(15);
        numbers.add(20);

        System.out.println(numbers.toString());

        Iterator<Integer> it = numbers.iterator();
     
        while (it.hasNext()) {
            if (it.next() % 2 == 0) { 
                it.remove();
            }
        }
        System.out.println(numbers.toString());
    }
}
       



   
     

