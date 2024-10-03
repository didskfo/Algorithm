import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double score = 0;
        double count = 0;
        HashMap<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            if (input[2].equals("P")) continue;
            double level = Double.parseDouble(input[1]);
            count += level;
            score += map.get(input[2]) * level;
        }
        System.out.println(score / count);
    }
}
