import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            lst.add(input.charAt(i)-'0');
        }
        Collections.sort(lst);
        for (int i = lst.size()-1; i >= 0; i--) {
            System.out.print(lst.get(i));
        }
    }
}