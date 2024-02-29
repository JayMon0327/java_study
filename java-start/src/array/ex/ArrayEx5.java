package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수를 입력해주세요.");

        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        double average = 0;

        System.out.println(count + " 개의 정수를 입력해주세요");


        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / count;

        System.out.println("정수의 합계는 = " + sum + "\n" + "평균은 = " + average );
    }
}
