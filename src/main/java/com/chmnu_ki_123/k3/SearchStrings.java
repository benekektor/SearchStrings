package com.chmnu_ki_123.k3;

import java.util.ArrayList;
import java.util.List;

public class SearchStrings implements Runnable {
    private final String text;
    private final String substring;
    private List<Integer> result;

    public SearchStrings(String text, String substring) {
        this.text = text;
        this.substring = substring;
        this.result = new ArrayList<>();
    }

    @Override
    public void run() {
        result = findSubstringIndexes(text, substring);
    }

    private List<Integer> findSubstringIndexes(String text, String substring) {
        List<Integer> indexes = new ArrayList<>();
        if (text == null || substring == null || substring.isEmpty() || text.isEmpty()) {
            return indexes;
        }

        int index = text.indexOf(substring);
        while (index != -1) {
            indexes.add(index);
            index = text.indexOf(substring, index + 1);
        }
        return indexes;
    }

    public List<Integer> getResult() {
        return result;
    }
}

