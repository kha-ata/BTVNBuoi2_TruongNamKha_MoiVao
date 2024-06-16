/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoscanner;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Demo {
    public static void main(String[] args) {
        int tuoi;
        String sdt,ten,adr,maj;
        Scanner sc= new Scanner(System.in);
        System.out.println("ten:");
        ten=sc.nextLine();
        System.out.println("tuoi:");
        tuoi=sc.nextInt();
        sc.nextLine();
        System.out.println("dia chi:");
        adr=sc.nextLine();
        System.out.println("sdt:");
        sdt=sc.nextLine();
        System.out.println("ten:"+ten+"|tuoi:"+tuoi+"|diachi:"+adr+"|sdt:"+sdt);
    }
    
}
