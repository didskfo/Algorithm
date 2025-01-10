import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for (int i = 1; i < N; i++) {
            int cur = arr[i];
            if (ans.get(ans.size()-1) < cur) ans.add(cur);
            else {
                int left = 0;
                int right = ans.size()-1;
                while (left < right) {
                    int mid = (left + right) / 2;
                    if (ans.get(mid) >= cur) right = mid;
                    else left = mid + 1;
                }
                ans.set(right, cur);
            }
        }
        System.out.println(ans.size());
    }
}
