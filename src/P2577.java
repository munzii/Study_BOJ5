import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2577 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		int x = a*b*c;
		
		while(0<x) {
			arr[x%10]++;
			x/=10;
		}
		
		for(int i=0; i<10; i++) {
			bw.write(arr[i]+ "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}

}