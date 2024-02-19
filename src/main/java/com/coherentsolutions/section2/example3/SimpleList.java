package com.coherentsolutions.section2.example3;

import java.util.ArrayList;
import java.util.List;

public class SimpleList {
    private final List<Integer> items = new ArrayList<>();

    public void addItem(int item) {
        items.add(item);
    }

    public int getSize() {
        return items.size();
    }
}
