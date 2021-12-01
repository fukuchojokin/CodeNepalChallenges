package Problem1;

import java.util.*;

public class Problem1Solution {
    List<List<Integer>> list = new ArrayList<>();

    void solution(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < i; ++j) {
                for (int k = 0; k < j; ++k) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> thisArr = new ArrayList<>();
                        thisArr.add(arr[i]);
                        thisArr.add(arr[j]);
                        thisArr.add(arr[k]);
                        Collections.sort(thisArr);
                        list.add(thisArr);
                    }
                }
            }
        }
    }

    public <T> List<T> removeDuplicates(List<T> list) {
        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    void printList() {
        list = removeDuplicates(list);
        list.sort(new Comparator<>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });
        System.out.println(list);
    }
}
