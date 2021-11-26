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
		
		for(int i=0; i<n; i++) {
			st= new StringTokenizer(br.readLine(), " ");
			int p = Integer.parseInt(br.readLine());
			int count =0;
			double t =0;
			double[] s = new double[p];
			for(int j=0; j<p; j++) {
				s[j] = Integer.parseInt(st.nextToken());
				t += s[j];
			}
			double avg = (double)t/(double)p;
			for(int j=0; j<p; j++) {
				if(s[j]>avg) {
					count++;
				}
			}
			double r = ((double)count/(double)p)*100;
			bw.write(String.format("%.3f%%", r));
			
		}
		br.close();
		bw.flush();
		bw.close();

	}

}