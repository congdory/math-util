/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heaven.test;

import com.heaven.mathutil.Main;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ponyo Dory
 */
public class MathUtilityTest {

    @Test //bien ham  nay thanh main() , shift + f6
    //goi ham getF() nhu thuong le, hay hon la tu dong so sanh gium
    // xanh - do || expected = actual
    public void testFactorialRighArgumentRunsWell() {
        long expected = 120;
        int n = 5;
        long actual = Main.getFactorial(n);
        assertEquals(expected, actual);

        assertEquals(720, Main.getFactorial(6));
        assertEquals(24, Main.getFactorial(4));
        assertEquals(6, Main.getFactorial(3));
        assertEquals(2, Main.getFactorial(2));
        assertEquals(1, Main.getFactorial(1));
        assertEquals(1, Main.getFactorial(0));

        //phan vung tuong duong, khong check tat ca , check vung tuong duong. 
        // equivalent partitionning        
    }

    //test ngoai le - exception
    // Exception la tinh huong bat thuong xay ra trong code khi thuc thi
    //app chay, no khong phai la 1 value de so sanh
    //loi SQL, sai khoa ngoai, null trong code yeu cau khac null
    //deu la loi lien qua SQL nhung khong the noi thang nao bang thang nao?
    //doi voi exception, chi co the do no = cau hoi may co xuat hien khong
    //khong the dung assertEquals() - so-sanh-co-bang-nhau-hay-khong
    //trong thiet ke cua ham getFac() thi neu dua vao n < 0 or n > 20
    //thi ham se nem ra, new 1 ngoai le
    //cu dua n vi pham. mhan ve ngoai le
    //neu co ngoai le xay ra khi n dua vao ca chon <0 >20
    //co nghia rang ham chay dung, thay ngoai le ma mung, vi chay mhu thiet e -> co ngoai le ma ra mau xanh
    //dung ngoai le ta can xuat hien -> mau xanh
    //se co TEST CASE xem ngoai le co xuat hien khong
    //co - > xanh
    //khong -> do
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumetThrowsException() {
        Main.getFactorial(-1);      //phai xuat hien exception
        Main.getFactorial(-10);
        Main.getFactorial(21);
        Main.getFactorial(40);
        //neu xuat hien Excep nhu ky vong, thi phai xanh
        //vi mau xanh ham y chay dung nhu thiet ke
        
        //ta can ky thuat de bat ngoai le, dung ngoai le can bat xuat hien
        //ta co xanh
        
    }

}
