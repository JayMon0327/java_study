package array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] student = {90, 80, 70, 60, 50};

        int total = 0;
        for (int count : student) {
            total += count;
        }
        double average = (double) total / student.length;
        System.out.println("점수의 총합은" + total + "평균은" + average);
    }
}