import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int ans = 0;
        LinkedList<Integer> que = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            que.offer(i);
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            int idx = que.indexOf(target);
            int half = que.size()%2==0?que.size()/2:que.size()/2;
            if (idx <= half) {
                for(int j = 0; j < idx; j++) {
                    int temp = que.pollFirst();
                    que.offerLast(temp);
                    ans++;
                }
            } else {
                for (int j = 0; j < que.size()-idx; j++) {
                    int temp = que.pollLast();
                    que.offerFirst(temp);
                    ans++;
                }
            }
            que.pollFirst();
        }
        System.out.println(ans);
    }
}
