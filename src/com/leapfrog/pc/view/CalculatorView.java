/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.pc.view;

import com.leapfrog.pc.util.Calculator;
import java.util.Scanner;

/**
 *
 * @author pradiph31
 */
public class CalculatorView {
    
    private Scanner input;
    private Calculator calc;
    private double x, y;
    private int ch;
    
    public CalculatorView(Calculator calc, Scanner input) {
        this.calc = calc;
        this.input = input;
    }
    
    public void entry() {
        System.out.println("Enter the value of x:");
        x = input.nextDouble();
        System.out.println("Enter the value of y:");
        y = input.nextDouble();
    }
    
    public void menu() {
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Power");
        System.out.println("6. Exit");
        System.out.println("Enter your choice:");
        ch = input.nextInt();
        if (ch == 6) {
            System.exit(0);
        }
    }
    
    public void process() {
        if (ch == 1) {
            System.out.println(calc.add(x, y));
        } else if (ch == 2) {
            System.out.println(calc.sub(x, y));
        } else if (ch == 3) {
            System.out.println(calc.mul(x, y));
        } else if (ch == 4) {
            System.out.println(calc.div(x, y));
        }else if(ch ==5){
            System.out.println(calc.power(x, y));
        }else if (ch == 6) {
            System.exit(0);
        }//end if
    }
}
