#include "iostream"

using namespace std;

int main() {
    int a, b, c, d;
    cin >> a >> b >> c >> d;
    if (a*d+b <= c*d && c >= a) {
        cout << 1;
    } else {
        cout << 0;
    }
    return 0;
}