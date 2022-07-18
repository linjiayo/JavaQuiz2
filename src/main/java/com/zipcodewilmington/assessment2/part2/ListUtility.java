package com.zipcodewilmington.assessment2.part2;

import java.util.*;

import com.zipcodewilmington.assessment2.part2.ArrayUtility;

public class ListUtility {
    List<Integer> list;

    public ListUtility() {
        list = new ArrayList<>();
    }
    public Boolean add(Integer i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> unique = new HashSet<>(list);
        return new ArrayList<>(unique);
    }

    public String join() {
        StringBuilder builder = new StringBuilder(list.size());
        for (int i = 0; i < list.size() - 1; i++) {
            builder.append(list.get(i) + ", ");
        }
        builder.append(list.get(list.size() - 1));
        return builder.toString();
    }

    public Integer mostCommon() {
        return ArrayUtility.mostCommon(list.toArray(new Integer[0]));
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
