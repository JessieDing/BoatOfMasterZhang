package com.company;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ArchDetector_old {
    public String getInputHeight(){
        Scanner scan = new Scanner(System.in);  //只需要一个扫描器，获得三次输入
        System.out.println("桥洞高度：");
        return scan.nextLine();
    }

    public Integer parseHeight(String heightString){
        return parseInt(heightString);
    }

    public String getCheckResult(int archHeight1, int archHeight2, int archHeight3){
        String result = "";
        if (archHeight1 < 50 && archHeight2 < 50 && archHeight3 < 50) {
            result = "IMPASSABLE";
        }
        int arr[] = {archHeight1, archHeight2, archHeight3};
        for (int i = 0; i < 3; i++) {
            if (arr[i] >= 50) {
                // System.out.println("PASS " + "首条可过船水路的桥洞高度：" + arr[i]) 属于print方法
                result = "PASS " + "首条可过船水路的桥洞高度：" + arr[i];
                break;  //??break放在哪里
            }
        }
        return result;
    }

    public void print(String result){
        System.out.println(result);
    }

    public static void main(String[] args) {
        ArchDetector_old archDetector = new ArchDetector_old();
        String inputHeight1 = archDetector.getInputHeight();
        String inputHeight2 = archDetector.getInputHeight();
        String inputHeight3 = archDetector.getInputHeight();

        int archHeight1 = archDetector.parseHeight(inputHeight1);
        int archHeight2 = archDetector.parseHeight(inputHeight2);
        int archHeight3 = archDetector.parseHeight(inputHeight3);

        String result = archDetector.getCheckResult(archHeight1, archHeight2, archHeight3);

        archDetector.print(result);
    }
}
//  面向过程：
//        Scanner scan = new Scanner(System.in);  //只需要一个扫描器，获得三次输入
//        System.out.println("a路桥洞高度：");
//        String inputHeight1 = scan.nextLine();  //nextLine获取下一行的输入数据
//        int archHeight1 = parseInt(inputHeight1);
//
//        System.out.println("b路桥洞高度：");
//        String inputHeight2 = scan.nextLine();
//        int archHeight2 = parseInt(inputHeight2);
//
//        System.out.println("c路桥洞高度：");
//        String inputHeight3 = scan.nextLine();
//
//        int archHeight3 = parseInt(inputHeight3);
//        if (archHeight1 < 50 && archHeight2 < 50 && archHeight3 < 50) {
//            System.out.println("IMPASSABLE");
//        }
//        int arr[] = {archHeight1, archHeight2, archHeight3};
//        for (int i = 0; i < 3; i++) {
//            if (arr[i] >= 50) {
//                System.out.println("PASS " + "首条可过船水路的桥洞高度：" + arr[i]);
//                break;//??break放在哪里
//            }
//        }