package com.example.testgit;



import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

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
         *
         * user1:git stash A
         *
         * 研究github和gitlab同时使用
         *
         * 1
         */
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("a","a");
        map.put("a","b");
        map.put("a","c");
        map.put("a","d");
        map.put("b","e");
        System.out.println(map.get(null));
        map.put(null,"test");
        map.put(null,"testtt");
        System.out.println(map.get(null));
        System.out.println(map);

//        System.out.println(System.currentTimeMillis());
//        System.out.println(new Date());
//        System.out.println(TestEnum.B.toString());
//        System.out.println(TestEnum1.B.toString());

//        test(String.valueOf(TestEnum1.B));
//        test(String.valueOf(TestEnum.B));

//        System.out.println("\u8BF7\u9009\u62E9");
//        System.out.println(" dealno in ('1','2') ");
//        List<Integer> a = new LinkedList<>();
//        a.add(1);a.add(2);a.add(3);a.add(4);
//        Iterator<Integer> iterator = a.iterator();
//        while (iterator.hasNext()){
//            Integer aa = iterator.next();
//            iterator.forEachRemaining();
//            System.out.println(aa);
//        }
//        HashMap<String,Object> aaa = new HashMap<>();
        Double aa = BigDecimal.valueOf(1).
//                divide(new BigDecimal(3)).
                divide(BigDecimal.valueOf(3),2, RoundingMode.HALF_DOWN).doubleValue();
        System.out.println(aa);

        BigDecimal aaa = new BigDecimal(2.455);
        BigDecimal bbb = new BigDecimal(2.454);
        
        System.out.println(aaa.divide(BigDecimal.ONE,2,RoundingMode.HALF_DOWN));
        System.out.println(bbb.divide(BigDecimal.ONE,2,RoundingMode.HALF_DOWN));

        System.out.println(new BigDecimal(1.01).compareTo(new BigDecimal(1.01)));
        System.out.println(new BigDecimal(1.02).compareTo(new BigDecimal(1.01)));
        System.out.println(new BigDecimal(1.00).compareTo(new BigDecimal(1.01)));
        System.out.println(new BigDecimal(1.04).setScale(4,RoundingMode.HALF_DOWN));

        System.out.println(aaa.add(BigDecimal.valueOf(5)).doubleValue());
        System.out.println(aaa);

    }

    public static void test(String str){
        System.out.println(str);


    }
}