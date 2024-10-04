import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static int L, C;
    static char[] alph, encode;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        alph = new char[C];
        encode = new char[L];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < C; i++) {
            alph[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(alph);

        combination(0, 0);

        System.out.println(sb.toString());
    }

    static void combination(int idx, int cnt) {
        if (cnt == L) {
            if (isValid()) {
                sb.append(new String(encode) + "\n");
            }
            return;
        }

        for (int i = idx; i < C; i++) {
            encode[cnt] = alph[i];
            combination(i+1, cnt+1);
        }
    }

    static boolean isValid() {
        int cnt1 = 0;
        int cnt2 = 0;

        for (char e : encode) {
            if (e=='a' || e=='e' || e=='i' || e=='o' || e=='u') cnt1++;
            else cnt2++;
        }

        if (cnt1 >= 1 && cnt2 >= 2) return true;
        return false;
    }
}
