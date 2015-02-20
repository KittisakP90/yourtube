/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ssthai.tong55;
import java.util.Scanner;

/**
 *
 * @author tong
 */
public class typecasting  
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float number = scan.nextFloat();
        System.out.println("number : "+scan.nextFloat());
      
        if(number-(int)number == 0) {
          System.out.println("number : "+(int)number) ;
        }
        else {
            System.out.println("number "+number);
        }
    }
    
}
