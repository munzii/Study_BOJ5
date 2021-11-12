import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10818 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int[] ar = new int[n];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			ar[i] = Integer.parseInt(st.nextToken());
			
			if(max<ar[i])
				max = ar[i];
			if(ar[i]<min)
				min = ar[i];
		}
		bw.write(min + " " + max);
		
		br.close();
		bw.flush();
		bw.close();

	}

}