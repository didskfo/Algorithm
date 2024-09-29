import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            switch(input[0]) {
                case "add": set.add(input[1]);
                break;
                case "remove": set.remove(input[1]);
                break;
                case "check": 
                if (set.contains(input[1])) sb.append(1 + "\n");
                else sb.append(0 + "\n");
                break;
                case "toggle": 
                if (set.contains(input[1])) set.remove(input[1]);
                else set.add(input[1]);
                break;
                case "all": set = new HashSet<>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"));
                break;
                case "empty": set = new HashSet<>();
                break;
            }
        }
        System.out.println(sb.toString());
    }
}
