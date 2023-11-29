package day06.array;

public class Ex02 {
    public static void main(String[] args) {
        int  [][] score = { { 98, 98, 90, 92, 99 },
                            { 81, 82, 83, 84, 85 },
                            { 71, 73, 75, 77, 79 },
                            { 60, 65, 60, 65, 69 },
                            { 77, 74, 79, 78, 72}
                          };

        for(int i=0;i<score.length;i++){
            int sum = 0;
            for(int j=0;j<score[i].length;j++){
                sum += score[i][j];
            }
            double avg = (double)sum / score.length;
            System.out.printf(i + "번째 학생 => 총점 : %d / 평균 : %.2f\n", sum, avg);
        }
    }
}
