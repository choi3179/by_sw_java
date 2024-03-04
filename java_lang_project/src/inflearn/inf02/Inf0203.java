package inflearn.inf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf0203 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];

        String[] input = br.readLine().split(" ");
        for(int i=0;i<N;i++)
            A[i] = Integer.parseInt(input[i]);

        input = br.readLine().split(" ");
        for(int i=0;i<N;i++)
            B[i] = Integer.parseInt(input[i]);

        for(int i=0;i<N;i++){
            if(A[i] == B[i])
                System.out.println("D");
            else{
                if((A[i] == 1 && B[i] == 3)
                        || (A[i] == 2 && B[i] == 1)
                        || (A[i] == 3 && B[i] == 2)) {
                    System.out.println("A");
                }
                else
                    System.out.println("B");

            }
        }
    }
}
