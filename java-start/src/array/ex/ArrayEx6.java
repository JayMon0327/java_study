package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        //정수를 입력받고, 가장 큰 정수와 가장 작은 정수를 출력하라.
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 정수의 개수를 적어주세요.");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int minNumber, maxNumber = 0;

        System.out.println(n + "개의 정수를 입력해주세요.");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNumber = maxNumber = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        System.out.println("가장 작은 정수는 = " + minNumber);
        System.out.println("가장 큰 정수는 = " + maxNumber);
    }
}
