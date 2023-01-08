#include <iostream>

using namespace std;

int main() {
    int a, b;
    cin >> a;
    cin >> b;
    if (a == 0) {
        if (b < 45) {
            a = 23;
            b += 15;
        } else {
            b -= 45;
        }
    } else {
        if (b < 45) {
            a -= 1;
            b += 15;
        } else {
            b -= 45;
        }
    }
    cout << a << " " << b << endl;
    return 0;
}