import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        List<String> lst = new ArrayList<>(set);
        Collections.sort(lst);
        Comparator<String> c = new Comparator<String>() {
            public int compare(String a, String b) {
                return Integer.compare(a.length(), b.length());
            }
        };
        Collections.sort(lst, c);
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }
}