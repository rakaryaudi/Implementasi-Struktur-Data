package com.company;

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nilai infix : ");
        String input = scan.next();
        String output;
        InToPost theTrans = new InToPost(input);
        System.out.print("Postfix adalah : ");
        output = theTrans.doTrans();
    }
}