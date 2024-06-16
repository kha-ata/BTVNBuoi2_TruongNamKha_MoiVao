/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucchienscanner;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BT02 {
    static void hinhvuong(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
            
        }
    }
    static void tamgiac(int n){
        int a=(n-1)/2;
        for (int i = 1; i <= (n/2+1); i++) {
            
            for (int j = 0; j < a; j++) {
                System.out.print("   ");
            }
            for (int t = 0; t < (n-2*a); t++) {
                System.out.print(" * ");
            }
            System.out.println("");
            a=a-1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number");
        int n=Integer.parseInt(sc.nextLine());
        if(n%2==0)hinhvuong(n);
        else tamgiac(n);
    }
}
