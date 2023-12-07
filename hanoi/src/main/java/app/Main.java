package app;

import model.Towel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Hanoi Tower ======");
        System.out.println("Number of disks: ");

        Towel rook = new Towel(scanner.nextInt());

        System.out.println("Number of moviments = " + rook.numberMoviments());

    }
}
