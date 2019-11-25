package com.company;

import com.company.Caser.Analisator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println(Analisator.analyse(scanner.nextLine()));
        }
    }
}
