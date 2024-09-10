package com.example.testgit;

/**
 * @author ggz on 2024/7/31
 */
public enum TestEnum {
    A("记账"),
    B("确认"),
    C("冲销");

    String desc;

    TestEnum(String desc){
        this.desc = desc;
    }

    @Override
    public String toString(){
        return this.desc;
    }
}