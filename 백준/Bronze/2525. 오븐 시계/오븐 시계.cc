#include <iostream>

using namespace std;

int main() {
    int a, b, c;
    cin >> a;
    cin >> b;
    cin >> c;
    int h = c / 60;
    int m = c % 60;
    if (a + h < 24) {
        a += h;
        if (b + m >= 60) {
            b = b + m - 60;
            a++;
            if (a > 23) {
                a -= 24;
            }
        } else {
            b += m;
        }
    } else {
        a = a + h - 24;
        if (b + m >= 60) {
            b = b + m - 60;
            a++;
            if (a > 23) {
                a -= 24;
            }
        } else {
            b += m;
        }
    }
    cout << a << " " << b << endl;
    return 0;
}
