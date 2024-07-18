package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ24060 {

    int[] A;                //입력받은 배열
    static int[] tmp;       //정렬 후 저장하는 배열
    static int result = -1; //결과 저장 (실패시 -1)
    static int cnt = 0;     //저장 횟수 누적 저장
    static int K;           // 저장 횟수


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        tmp = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(A, 0, N-1);

        System.out.println(result);

    }

    public static void merge_sort(int[] A, int p, int r) {
        if(p < r) {
            int q = (p + r) / 2;
            merge_sort(A, p ,q);
            merge_sort(A,q+1, r);
            merge(A,p,q,r);
        }
    }

    public static void merge(int[] array, int p, int q, int r) {

        int i = p;
        int j = q+1;
        int t = 0;

        while(i <= q &&  j <= r) {
            if(array[i] <= array[j])
                tmp[t++] = array[i++];

            else
                tmp[t++] = array[j++];
        }

        while(i <= q){
            tmp[t++] = array[i++];
        }
        while(j <= r){
            tmp[t++] = array[j++];
        }

        i=p;
        t=0;
        while(i<=r){
            cnt++;

            if(cnt == K)
                result = tmp[t];

            array[i++] = tmp[t++];

        }

    }
}
