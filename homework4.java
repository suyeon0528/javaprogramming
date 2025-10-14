package java_6week;

import java.util.Scanner;

class GCD{
    int gcd(int m, int n) {
        if (n == 0) return m;
        else
            return gcd(n, m % n);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GCD g = new GCD();

        System.out.print("두 수를 입력하세요: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int resultGCD = g.gcd(num1, num2);

        System.out.printf("두 수의 최대공약수는 %d입니다.\n", resultGCD);

        scanner.close();
    }
}


