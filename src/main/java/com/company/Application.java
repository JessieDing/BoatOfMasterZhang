package com.company;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Created by Woody on 2016/10/10.
 */
public class Application {
    public static void main(String[] args){
        Reader reader = new Reader();
        String inputHeight1 = reader.readInput();
        String inputHeight2 = reader.readInput();
        String inputHeight3 = reader.readInput();
        int archHeight1 = parseInt(inputHeight1);
        int archHeight2 = parseInt(inputHeight2);
        int archHeight3 = parseInt(inputHeight3);

        Arch arch1 = new Arch();
        arch1.setHeight(archHeight1);
        Arch arch2 = new Arch();
        arch2.setHeight(archHeight2);
        Arch arch3 = new Arch();
        arch3.setHeight(archHeight3);

        ArchDetector archDetector = new ArchDetector();
        List<Arch> arches = new ArrayList<>();
        arches.add(arch1);
        arches.add(arch2);
        arches.add(arch3);
        String result = archDetector.detect(arches);

        Printer printer = new Printer();
        printer.print(result);
    }
}
//面向对象