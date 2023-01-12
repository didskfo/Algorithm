#include <iostream>

using namespace std;

int main() {
    int x, n, sum;
    cin >> x;
    cin >> n;
    sum = 0;
    for (int i = 0; i < n; i++) {
        int a, b;
        cin >> a;
        cin >> b;
        sum += a * b;
    }
    if (sum == x) {
        cout << "Yes" << endl;
    } else cout << "No" << endl;
    return 0;
}