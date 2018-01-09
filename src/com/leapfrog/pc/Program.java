/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.pc;

import com.leapfrog.pc.util.Calculator;
import com.leapfrog.pc.view.CalculatorView;
import java.util.Scanner;

/**
 *
 * @author pradiph31
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        CalculatorView cv = new CalculatorView(new Calculator(), input);
        while (true) {
            cv.menu();
            cv.entry();
            cv.process();
        }
    }

}
