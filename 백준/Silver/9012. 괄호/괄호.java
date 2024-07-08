import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int t = 0; t < n; t++) {
            String str = sc.nextLine();
            int check = 0;
            boolean bool = true;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') check++;
                else {
                    if (check == 0) {
                        System.out.println("NO");
                        bool = false;
                        break;
                    }
                    else check--;
                }
            }
            if (bool && check != 0) System.out.println("NO");
            else if (bool && check == 0) System.out.println("YES");
        }
    }
}
