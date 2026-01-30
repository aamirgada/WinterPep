package collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveAdjacent {
    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 3, 5, 5, 6, 6, 6, 7, 7, 7};

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // add if list is empty OR last element is different
            if (result.isEmpty() || result.get(result.size() - 1) != arr[i]) {
                result.add(arr[i]);
            }
        }

        System.out.println(result);
    }
}



