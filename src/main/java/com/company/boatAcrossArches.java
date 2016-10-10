package com.company;

import java.util.Scanner;

public class boatAcrossArches {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //只需要一个扫描器，获得三次输入
        System.out.println("a路桥洞高度：");
        String inputHeight1 = scan.nextLine();  //nextLine获取下一行的输入数据
        int archHeight1 = Integer.parseInt(inputHeight1);

        System.out.println("b路桥洞高度：");
        String inputHeight2 = scan.nextLine();
        int archHeight2 = Integer.parseInt(inputHeight2);

        System.out.println("c路桥洞高度：");
        String inputHeight3 = scan.nextLine();

        int archHeight3 = Integer.parseInt(inputHeight3);
        if (archHeight1 < 50 && archHeight2 < 50 && archHeight3 < 50) {
            System.out.println("IMPASSABLE");
        }
        int arr[] = {archHeight1, archHeight2, archHeight3};
        for (int i = 0; i < 3; i++) {
            if (arr[i] >= 50) {
                System.out.println("PASS " + "首条可过船水路的桥洞高度：" + arr[i]);
                break;//??break放在哪里
            }
        }
    }
}
