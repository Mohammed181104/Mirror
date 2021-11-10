package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Integer> mirror = new ArrayList();

    private static void arrayMaker() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want");
        int limit = input.nextInt();
        for (int i = 0; i < limit; i++) {
            mirror.add(input.nextInt());
        }
    }

    public static void main(String[] args) {
        arrayMaker();

    }


}
