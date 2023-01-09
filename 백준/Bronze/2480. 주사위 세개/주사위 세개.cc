#include <iostream>

using namespace std;

int main() {
    int a ,b, c;
    cin >> a;
    cin >> b;
    cin >> c;
    if (a == b && b == c) {
        cout << 10000 + a * 1000 << endl;
    } else if (a != b && b != c && c != a) {
        int m = max(a, b);
        int mx = max(m, c);
        cout << mx * 100 << endl;
    } else {
        int sm = 0;
        if (a == b || a == c) {
            sm = a;
        } else {
            sm = b;
        }
        cout << 1000 + sm * 100 << endl;
    }
    return 0;
}