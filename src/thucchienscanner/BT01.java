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
public class BT01 {
    static boolean checkPerfect(int n){
        int s=0;
        for (int i = 1; i <n; i++) {
            if(n%i==0) s=s+i;
        }
        if (s==n) return true;
        
        
        return false;
        
        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1st number");
        int st=Integer.parseInt(sc.nextLine());
        System.out.println("2nd number");
        int nd=Integer.parseInt(sc.nextLine());
        if(checkPerfect(st)==true) System.out.println("1st is true");
        else System.out.println("1st is false");
        if(checkPerfect(nd)==true) System.out.println("2nd is true");
        else System.out.println("2nd is false");
    }
}

