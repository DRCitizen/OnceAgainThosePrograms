import java.util.Scanner;

public class WhatTimeIsIt {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Моля въведете число: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " Това число е четно");
        else
            System.out.println(num + " Това число е нечетно");


    }

}
