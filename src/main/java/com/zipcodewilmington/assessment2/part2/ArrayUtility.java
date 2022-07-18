package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] res = Arrays.copyOf(array1, array1.length + array2.length);

        for (int i = array1.length; i < res.length; i++) {
            res[i] = array2[i - array1.length];
        }
        return res;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
//        List<Integer> res = Arrays.asList(array);
//        Collections.rotate(res, array.length - index);
//        return res.toArray(new Integer[array.length]);
        // no built-in methods
        Integer[] copy = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            int shift = (i + index + array.length) % array.length;
            array[i] = copy[shift];
        }
        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = 0;
        for (Integer i : array1) {
            count += (i == valueToEvaluate) ? 1 : 0;
        }
        for (Integer i : array2) {
            count += (i == valueToEvaluate) ? 1 : 0;
        }
        return count;
    }

    public static Integer mostCommon(Integer[] array) {
        Map<Integer, Integer> count = new HashMap<>(array.length);
        int maxCount = 0;
        Integer mostCommon = null;
        count.put(null, 0);

        for (Integer i : array) {
            if (!count.containsKey(i)) {
                count.put(i, 1);
                if (maxCount == 0) {
                    mostCommon = i;
                    maxCount++;
                }
                continue;
            }
            int intCount = count.get(i);
            count.put(i, ++intCount);
            if (++intCount > maxCount) {
                mostCommon = i;
                maxCount++;
            }
        }
        return mostCommon;
    }
}
