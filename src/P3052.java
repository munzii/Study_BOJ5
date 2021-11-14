import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class P3052 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[10];
		HashSet<Integer> h = new HashSet<>();
		
		for(int i =0; i<10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i =0; i<10; i++) {
			h.add(arr[i]%42);
		}
		bw.write(h.size()+ "\n");
		
		br.close();
		bw.flush();
		bw.close();

	}

}