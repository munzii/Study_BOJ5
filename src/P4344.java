import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P4344 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(br.readLine());
		double[] t = new double[n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int p = Integer.parseInt(st.nextToken());
			double[] s = new double[p];
			int sum =0;
			
			for(int j=0; j<p; j++) {
				s[j] = Double.parseDouble(st.nextToken());
				sum+= s[j];
			}
			int count =0;
			double avg = (double)sum/(double)p;
			
			for(int k=0; k<n; k++) {
				if(avg<s[k]) {
					count++;
				}
			}
			t[i] = (double)count/(double)p*100;
		}
		
		for(int i=0; i<t.length; i++) {
			bw.write(String.format("%.3f%%\n", t[i]));
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}