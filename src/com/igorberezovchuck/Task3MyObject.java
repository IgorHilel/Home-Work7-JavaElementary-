package com.igorberezovchuck;

import java.util.Random;

public class Task3MyObject {

    public int nums = 0;
    public String str = new String("objectString");

    public String getStr() {
        return str;
    }

    public int getNums() {
        return nums;
    }

    public void setRandomNums(int boundOfRandomNums) {
        Random rand = new Random();
        this.nums = rand.nextInt(boundOfRandomNums);
    }

    @Override
    public String toString() {
        return "Task3MyObject{" +
                "nums=" + nums +
                ", str='" + str + '\'' +
                '}';
    }
}
