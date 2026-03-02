import java.io.IOException;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            list.add(i);
        }
        for (int i = 1; i <= 10000; i++) {
            int selfNumber = self(i);
            if (list.contains(selfNumber)) {
                list.remove(Integer.valueOf(selfNumber));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    static int self(int a) {
        int res = a;
        String str = Integer.toString(a);
        for (int i = 0; i < str.length(); i++) {
            res += str.charAt(i) - '0';
        }
        return res;
    }
}
