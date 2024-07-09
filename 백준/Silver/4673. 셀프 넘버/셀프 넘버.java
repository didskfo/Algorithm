import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            lst.add(i);
        }
        for (int i = 1; i <= 10000; i++) {
            int self = selfNumber(i);
            if (lst.contains(self)) {
                lst.remove(Integer.valueOf(self));
            }
        }
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }

    public static int selfNumber(int a) {
        int res = a;
        String str = Integer.toString(a);
        for (int i = 0; i < str.length(); i++) {
            res += str.charAt(i) - '0';
        }
        return res;
    }
}