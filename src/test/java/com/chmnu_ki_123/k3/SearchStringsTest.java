package com.chmnu_ki_123.k3;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchStringsTest {

    @Test
    void testRunnable() throws InterruptedException {
        String text = "abcabcabc";
        String substring = "abc";

        SearchStrings searchTask = new SearchStrings(text, substring);
        Thread thread = new Thread(searchTask);
        thread.start();
        thread.join();

        List<Integer> result = searchTask.getResult();
        assertEquals(List.of(0, 3, 6), result);
    }
}
