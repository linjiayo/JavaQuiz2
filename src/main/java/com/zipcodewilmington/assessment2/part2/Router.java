package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Router {
    Map<String, String> map;
    Map<String, String> duplicateMap;

    public Router() {
        map = new LinkedHashMap<>();
        duplicateMap = new LinkedHashMap<>();
    }
    public void add(String path, String controller) {
        if (map.containsKey(path)) {
            duplicateMap.put(path, controller);
        } else {
            map.put(path, controller);
        }
    }

    public Integer size() {
        return map.size();
    }

    public String getController(String path) {
        return map.get(path);
    }

    public void update(String path, String studentController) {
        map.put(path, studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            res.append(entry.getKey() + entry.getValue() + "\n");
        }

        for (Map.Entry<String, String> entry : duplicateMap.entrySet()) {
            res.append(entry.getKey() + entry.getValue() + "\n");
        }
        return res.toString();
    }
}
