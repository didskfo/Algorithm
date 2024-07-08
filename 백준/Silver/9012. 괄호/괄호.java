import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int t = 0; t < n; t++) {
            String str = sc.nextLine();
            Stack<Character> st = new Stack<>();
            boolean check = true;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    st.add(str.charAt(i));
                } else {
                    if (st.isEmpty()) {
                        System.out.println("NO");
                        check = false;
                        break;
                    } else st.pop();
                }
            }
            if (check) {
                if (!st.isEmpty()) System.out.println("NO");
                else System.out.println("YES");
            }
        }
    }
}
