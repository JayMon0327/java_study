package loop;

public class Continue1 {

    public static void main(String[] args) {
        // 1부터 5까지 출력하는데 3은 빼고 출력하라.
        int i = 1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println("i는 = " + i);
            i++;
        }
    }
}
