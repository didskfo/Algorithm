import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character,Integer> score = new HashMap<>();
        for (char c : new char[]{'R','T','C','F','J','M','A','N'}) {
            score.put(c, 0);
        }
        for (int i = 0; i < survey.length; i++) {
            String s = survey[i];
            int c = choices[i];
            if (c < 4) {
                char key = s.charAt(0);
                score.put(key, score.get(key)+4-c);
            } else if (c > 4) {
                char key = s.charAt(1);
                score.put(key, score.get(key)+c-4);
            }
        }
        Character[][] pairs = {
            {'R','T'},
            {'C','F'},
            {'J','M'},
            {'A','N'}
        };

        StringBuilder sb = new StringBuilder();
        for (Character[] p : pairs) {
            char a = p[0], b = p[1];
            sb.append(score.get(a) >= score.get(b) ? a : b);
        }

        String answer = sb.toString();
        return answer;
    }
}