import java.util.*;

class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
        int ans = 0;
        if (a % 5 == 0) System.out.println(a/5);
        else {
            while (a > 0) {
                ans += 1;
                a -= 3;
                if (a % 5 == 0) {
                    ans += a/5;
                    System.out.println(ans);
                    break;
                }
                if (a == 1 || a == 2) {
                    System.out.println(-1);
                    break;
                }
                if (a == 0) {
                    System.out.println(ans);
                    break;
                }
            }
        }
	}
}
