package lambdas;

import java.util.*;

public class ComparatorTest implements car{

    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        numbers.forEach(x -> System.out.println()); 
    }

}
