package com.company;

import java.util.Scanner;

public class boatAcrossArches {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("第一条水路桥洞高度：");
        String road1 = scan1.nextLine();
        int a = Integer.parseInt(road1);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("第二条水路桥洞高度：");
        String road2 = scan2.nextLine();
        int b = Integer.parseInt(road2);
        Scanner scan3 = new Scanner(System.in);
        System.out.println("第三条水路桥洞高度：");
        String road3 = scan3.nextLine();
        int c = Integer.parseInt(road3);
        if (a<50&&b<50&&c<50){
            System.out.println("IMPASSABLE");
        }
        if (a>=50||b>=50||c>=50){
            System.out.println("PASS");
        }
    }
}
