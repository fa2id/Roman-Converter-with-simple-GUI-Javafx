package com.fa2id.convertors.romanConvertor;

/**
 * Created by Farid on 2017-07-30.
 */
public class Convertor {
    public int romanToInt(String s) {
        int counter = 0;
        int iterator = 0;
        int checker_I = 0;
        int checker_X = 0;
        int checker_L = 0;
        int checker_C = 0;
        int checker_D = 0;
        char[] chars = s.toCharArray();

        while (iterator!=chars.length){


            if (checker_I >1)
                checker_I =0;
            if (checker_X >1)
                checker_X =0;
            if (checker_L >1)
                checker_L =0;
            if (checker_C >1)
                checker_C =0;
            if (checker_D >1)
                checker_D =0;

            //===================================
            switch (chars[iterator]) {
                case 'I':
                    counter++;
                    checker_I++;
                    break;
                case 'V':
                    if (checker_I == 0)
                        counter += 5;
                    else counter += 3;
                    break;
                case 'X':
                    if (checker_I == 0) {
                        counter += 10;
                        checker_X++;
                    } else counter += 8;
                    break;
                case 'L':
                    if (checker_X == 0) {
                        counter += 50;
                        checker_L++;
                    } else counter += 30;
                    break;
                case 'C':
                    if (checker_X == 0){
                        counter += 100;
                        checker_C++;
                    } else counter += 80;
                    break;
                case 'D':
                    if (checker_C == 0){
                        counter += 500;
                        checker_D++;
                    } else counter += 300;
                    break;
                case 'M':
                    if (checker_C == 0){
                        counter += 1000;
                    } else counter += 800;
                    break;
            }

            iterator++;

        }

        return counter;
    }
}
