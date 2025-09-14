import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 4; i++){
            System.out.printf("정수를 입력하세요: ");
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            sum += s;
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다.", sum);
            System.out.printf("\n");
        }
    }
}
