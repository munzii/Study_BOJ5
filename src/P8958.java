import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P8958 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		String[] arr = new String[n];
		int sum =0;
		int count =0;
		
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine();
			sum=0;
			count =0;

			for(int j=0; j<arr[i].length(); j++) {
				
				if(arr[i].charAt(j)=='o') {
					count++;
				}
				else {
					count=0;
				}
			}
			sum = sum + count;
		}
		
		bw.write(sum + "\n");
		
		br.close();
		bw.flush();
		bw.close();

	}

}