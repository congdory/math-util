/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heaven;

/**
 *
 * @author Ponyo Dory
 */
public class MathUtil {

    //at here, it is class version-copy of Math, it has all function help for math
    public static final double PI = 3.1415;

    public static long getFactorial(int n) {
        long result = 1;
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        for (int i = 2; i < n; i++) {
            result *= i;
        }
        return result;
    }
}
