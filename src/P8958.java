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
		
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine();
			int count=0;
			int sum=0;
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j)=='O')
					sum+= ++count;
				else
					count=0;
			}
			bw.write(String.valueOf(sum)+ "\n");
			sum=0;
			count=0;
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}