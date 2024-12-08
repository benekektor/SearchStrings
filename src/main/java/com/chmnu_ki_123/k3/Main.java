package com.chmnu_ki_123.k3;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        String text = "hello world, hello universe";
        String substring = "hello";

        SearchStrings searchTask = new SearchStrings(text, substring);

        Thread thread = new Thread(searchTask);
        thread.start();

        thread.join();

        List<Integer> result = searchTask.getResult();
        System.out.println("Found indexes: " + result);
    }
}
