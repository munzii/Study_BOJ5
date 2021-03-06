import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1546 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		float[] arr = new float[n];
		float max = 0;
		float sum = 0;
		float avg = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i] = Float.parseFloat(st.nextToken());
			
			if(max<arr[i])
				max=arr[i];
		}
		
		for(int i=0; i<n; i++) {
			arr[i] = arr[i]/max*100;
			sum += arr[i];
		}
		
		avg=sum/n;
		
		bw.write(avg + "\n");
		
		br.close();
		bw.flush();
		bw.close();
		
	}

}