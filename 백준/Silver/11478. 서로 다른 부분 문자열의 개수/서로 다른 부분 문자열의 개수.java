import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i <= input.length(); i++) {
            for (int j = 0; j < i; j++) {
                String str = input.substring(j, i);
                set.add(str);
            }
        }
        System.out.println(set.size());
    }
}
