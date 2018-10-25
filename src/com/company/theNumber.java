package com.company;

/**
 * Created by rd568 on 10/22/18.
 */
public class theNumber {
    public int favNum;

    public theNumber(int fv){
        favNum = fv;
    }

    public int ranNum(){
        favNum = (int)(favNum + Math.random() * 6);
        return favNum;
    }




}
