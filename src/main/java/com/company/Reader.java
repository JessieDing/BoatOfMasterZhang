package com.company;

import java.util.Scanner;

public class Reader {
    public String readInput(){
        Scanner scan = new Scanner(System.in);  //只需要一个扫描器，获得三次输入
        System.out.println("桥洞高度：");
        return scan.nextLine();
    }
}
//该类将scanner封装