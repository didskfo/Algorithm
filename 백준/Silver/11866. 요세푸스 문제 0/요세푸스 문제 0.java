import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            que.add(i);
        }
        int cnt = 1;
        while (!que.isEmpty()) {
            int a = que.poll();
            if (cnt % k == 0) {
                sb.append(a);
                sb.append(", ");
            } else {
                que.add(a);
            }
            cnt++;
        } 
        sb.append(">");
        String ans = sb.toString();
        ans = ans.replace(", >", ">");
        System.out.println(ans);       
    }
}
