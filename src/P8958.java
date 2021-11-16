import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P8958 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		char[] ans;
		int count=0;
		int sum=0;
		
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine();
		}
		
		for(int i=0; i<n; i++) {
			count=0;
			sum=0;
			
			ans=arr[i].toCharArray();
			
			for(int j=0; j<n; j++) {
				if(ans[j]=='O') {
					sum+=(count+=1);
				}
				else {
					count=0;
				}
			}
			bw.write(sum+ "\n");
		}

		
		br.close();
		bw.flush();
		bw.close();

	}

}