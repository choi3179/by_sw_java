package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[][] stars = new String[N][N];

        for(int i = 0; i < N; i++) {
            Arrays.fill(stars[i]," ");
        }
        draw(stars, 0,0,N);

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                sb.append(stars[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void draw(String[][] stars, int x, int y, int size) {
        if(size == 1) {
            stars[x][y] = "*";
            return;
        }

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(!(i==1 && j==1)) {       // 가운데 영역 비우기
                    draw(stars, x+i *(size/3),y+j * (size/3),size/3);
                }
            }
        }
    }
}
