package com.example.testgit;

import java.util.HashMap;

/**
 * @author ggz on 2023/10/9
 */
public class TestGitCommand {
    /**
     * master 10:14
     *
     * master 10:27
     *
     * user2
     */

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("a","a");
        map.put("a","b");
        map.put("a","c");
        map.put("a","d");
        map.put("b","e");
        System.out.println(map);
    }
}