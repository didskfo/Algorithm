#include "iostream"

using namespace std;

int main() {
    int n, k;
    int cnt = 0;
    bool b = false;
    cin >> n >> k;
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            cnt++;
        }
        if (cnt == k) {
            cout << i;
            b = true;
            break;
        }
    }
    if (b == false) {
        cout << 0;
    }
    return 0;
}