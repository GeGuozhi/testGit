package com.example.testgit;

import java.util.HashMap;

/**
 * @author ggz on 2023/10/9
 */
public class TestGitCommand {
    public static void main(String[] args) {
        /**
         * user2
         *
         * user2 2024-07-17 08:48
         *
         * user2 2024-07-17 09:36
         *
         * user1 2024-07-17 09:59
         *
         * user2 2024-07-17 11:31
         *
         * user2 2024-07-17 14:32 测试pull前代码已被修改的情况,remote仓库的代码
         *
         * user1 2024-07-17 14:33 测试pull前代码已被修改的情况,自己的代码
         */
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("a","a");
        map.put("a","b");
        map.put("a","c");
        map.put("a","d");
        map.put("b","e");
        System.out.println(map);
    }
}