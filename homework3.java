package java_4week;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        scanner.nextLine();

        System.out.print("수를 입력하세요: ");
        String inputLine = scanner.nextLine();

        String[] numStrings = inputLine.split(" ");

        for (int i = 0; i < count; i++) {
            if (i < numStrings.length) {
                try {
                    numbers[i] = Integer.parseInt(numStrings[i]);
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ 오류: 유효하지 않은 정수 입력입니다. 프로그램이 종료됩니다.");
                    scanner.close();
                    return;
                }
            } else {
                System.out.println("⚠️ 오류: 예상보다 적은 수(" + numStrings.length + "개)가 입력되었습니다. 프로그램이 종료됩니다.");
                scanner.close();
                return;
            }
        }

        scanner.close();

        if (count == 0) {
            System.out.println("입력된 수가 없습니다.");
            return;
        }


        int max = numbers[0];
        int min = numbers[0]; 


        for (int i = 1; i < numbers.length; i++) {
            // 최대값 갱신
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}