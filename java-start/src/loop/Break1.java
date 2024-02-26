package loop;

public class Break1 {

    public static void main(String[] args) {
        // 1 부터 하나씩 숫자를 더해갈때 합계가 10보다 커지는 숫자를 구해라.
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료 sum = " + sum + ", i = " + i);
                break;
            }
            i++;
        }
    }
}
