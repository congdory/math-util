
import com.heaven.mathutil.Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ponyo Dory
 */
public class main {

    public static void main(String[] args) {
        System.out.println("VO CHI CONG");

        //test classic
        long expected = 120;
        long actual;
        int input = 5;
        actual = Main.getFactorial(input);

        System.out.println("5!: expected: " + expected + "; actual: " + actual);

        expected = 1;
        input = 0;
        actual = Main.getFactorial(input);

        System.out.println("5!: expected: " + expected + "; actual: " + actual);

        expected = 2;
        input = 2;
        actual = Main.getFactorial(input);

        System.out.println("5!: expected: " + expected + "; actual: " + actual);

        input = -1;
        actual = Main.getFactorial(input);

        //test auto
        //test driven development
    }
}
