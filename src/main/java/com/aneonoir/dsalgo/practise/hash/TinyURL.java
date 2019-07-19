package com.aneonoir.dsalgo.practise.hash;

import java.util.HashMap;

/**
 * link: https://leetcode.com/problems/encode-and-decode-tinyurl/
 * <p>
 * approach: I used
 */
public class TinyURL {

    HashMap<String, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(Integer.toHexString(longUrl.hashCode()), longUrl);
        return new String("http://tinyurl.com/" + Integer.toHexString(longUrl.hashCode()));
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        System.out.print(shortUrl);
        return map.get(shortUrl.substring(shortUrl.lastIndexOf("/") + 1));
    }
}
