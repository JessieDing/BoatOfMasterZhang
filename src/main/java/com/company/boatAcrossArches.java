package com.company;

import java.util.Scanner;

public class boatAcrossArches {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("a路桥洞高度：");
        String road1 = scan1.nextLine();
        int a = Integer.parseInt(road1);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("b路桥洞高度：");
        String road2 = scan2.nextLine();
        int b = Integer.parseInt(road2);
        Scanner scan3 = new Scanner(System.in);
        System.out.println("c路桥洞高度：");
        String road3 = scan3.nextLine();
        int c = Integer.parseInt(road3);
        if (a < 50 && b < 50 && c < 50) {
            System.out.println("IMPASSABLE");
        }
        int arr[] = {a, b, c};
        for (int i = 0; i < 3; i++) {
            if (arr[i] >= 50) {
                System.out.println("PASS " + "首条可通过水路的桥洞高度：" + arr[i]);
                break;//??break放在哪里
            }
        }
    }
}
