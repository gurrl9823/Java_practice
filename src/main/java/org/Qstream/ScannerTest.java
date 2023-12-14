package org.Qstream;

import java.util.Scanner;

public class ScannerTest {

    // 2

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine(); // 한 줄 읽기
        int num = scanner.nextInt(); // 정수 읽기

        System.out.println(name);
        System.out.println(num);

    }

}
