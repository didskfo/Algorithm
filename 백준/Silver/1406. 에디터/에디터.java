import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Character> que1 = new LinkedList<>();
        Deque<Character> que2 = new LinkedList<>();
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            que1.add(str.charAt(i));
        }
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine(), " ");
            String input = st.nextToken();
            if (input.equals("L")) {
                if (que1.isEmpty()) continue;
                que2.addFirst(que1.pollLast());
            } else if (input.equals("D")) {
                if (que2.isEmpty()) continue;
                que1.add(que2.pollFirst());
            } else if (input.equals("B")) {
                if (que1.isEmpty()) continue;
                que1.pollLast();
            } else {
                que1.add(st.nextToken().charAt(0));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!que1.isEmpty()) {
            sb.append(que1.poll());
        }
        while (!que2.isEmpty()) {
            sb.append(que2.poll());
        }
        System.out.println(sb.toString());
    }
}
