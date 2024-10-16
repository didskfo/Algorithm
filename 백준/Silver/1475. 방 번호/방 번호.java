import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int[] arr = new int[10];
        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            char a = n.charAt(i);
            if (a == '6' || a == '9') {
                if (arr[6] > arr[9]) arr[9] += 1;
                else arr[6] += 1;
                max = Math.max(Math.max(arr[6], arr[9]), max);
            } else {
                arr[a-'0'] += 1;
                max = Math.max(max, arr[a-'0']);
            }
        }
        System.out.println(max);
    }
}
