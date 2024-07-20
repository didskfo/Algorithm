import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class User {
    int age; 
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<User> lst = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            lst.add(new User(Integer.parseInt(input[0]), input[1]));
        }
        
        lst.sort(new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return Integer.compare(u1.age, u2.age);
            }
        });

        for (User user : lst) {
            System.out.println(user.age + " " + user.name);
        }
    }
}
