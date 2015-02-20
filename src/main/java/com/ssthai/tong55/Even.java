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
public class Even {
    public static void main(String[] args) {
    System.out.println("input number :");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    
    for(int i=0;i<=number ; i++) {
        if(i%2 ==0) {
            System.out.println("result :"+ i);
        }
    }
    }
}

