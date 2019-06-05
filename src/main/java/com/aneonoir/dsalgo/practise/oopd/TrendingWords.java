package com.aneonoir.dsalgo.practise.oopd;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class TrendingWords {


    @Test
    public void test() {
        String text[] = new String[]

                {
                        "kavin spacy rocks", "kavin is amazin in baby driver"
                };
        Trending t = new Trending();
        t.feed(text[0]);
        assertEquals("kavin", t.getTrendingText());
    }

}

class Trending {
    int max = 0;
    Map<String, Integer> map = new HashMap<>();
    private String trendingText;

    String getTrendingText() {
        return trendingText;
    }

    String[] feed(String input) {
        String[] split = input.split("\\s+");
        Stream.of(split).forEach(s -> {
                    if (map.containsKey(s)) {
                        int value = map.get(s) + 1;
                        if (value > max) {
                            max = value;
                            trendingText = s;
                        }
                        map.put(s, map.get(s) + 1);
                    } else {
                        int value = 1;
                        if (value > max) {
                            max = value;
                            trendingText = s;
                        }
                        map.put(s, 1);
                    }
                }
        );

        return split;

    }


}

