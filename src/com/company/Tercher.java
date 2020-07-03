package com.company;

import java.util.Random;

public class Tercher {
    public int callName(){
        Random r= new Random();
        int rad=r.nextInt(3);//在1.2.3数中随机选择一个
        System.out.println(rad);
        return rad;

    }
}
