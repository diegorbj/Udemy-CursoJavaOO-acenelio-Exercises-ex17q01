package br.com.domum.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> students = new HashSet<>();

        for (int i = 65; i <= 67; i++) {
            System.out.print("How many students for course " + (char) i + "? ");
            int number = sc.nextInt();
            for (int n = 0; n < number; n++) {
                int id = sc.nextInt();
                students.add(id);
            }
        }

        System.out.println("Total students: " + students.size());

        sc.close();
    }
}