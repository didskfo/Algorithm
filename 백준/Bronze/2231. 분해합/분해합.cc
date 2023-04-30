#include "iostream"

using namespace std;

int main() {
    int n;
    cin >> n;
    int con;
    string num;
    bool check = true;
    for (int i = 1; i <= n; i++) {
        con = i;
        num = to_string(i);
        for (int j = 0; j < num.length(); j++) {
            con += num[j] - '0';
        }
        if (con == n) {
            cout << i << "\n";
            check = false;
            break;
        }
    }
    if (check) {
        cout << 0 << "\n";
    }
    return 0;
}