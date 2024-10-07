import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            boolean check = true;
            boolean err = false;
            char[] p = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();
            ArrayDeque<String> que = new ArrayDeque<>();
            StringTokenizer st = new StringTokenizer(input, "[],");
            for (int i = 0; i < n; i++) {
                que.add(st.nextToken());
            }
            for (char c : p) {
                if (c == 'R') check = !check;
                else {
                    if (que.size() == 0) {
                        err = true;
                        break;
                    } else {
                        if (check) que.poll();
                        else que.pollLast();
                    }
                }
            }
            if (err) System.out.println("error");
            else {
                if (que.size() == 0) System.out.println("[]");
                else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[");
                    Iterator it = que.iterator();
                    if (!check) {
                        it = que.descendingIterator();
                    }
                    while (it.hasNext()) {
                        sb.append(it.next() + ",");
                    }
                    sb.deleteCharAt(sb.length()-1);
                    sb.append("]");
                    System.out.println(sb.toString());
                }
            }
        }
    }
}
