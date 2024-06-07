import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = null;
        
        st = new StringTokenizer(in.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N + 1];
        
        for(int i = 0; i < K; i++) {
        	st = new StringTokenizer(in.readLine());
        	int A = Integer.parseInt(st.nextToken());
        	int B = Integer.parseInt(st.nextToken());
        	
         	for(int j = A; j <= B; j++) {
         		arr[j]++;
         	}
        }
        
        Arrays.sort(arr);
        
        System.out.println(arr[(N / 2) +1]);
    }
}