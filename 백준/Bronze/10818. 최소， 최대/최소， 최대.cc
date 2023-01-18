#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    int min = 1000000;
    int max = -1000000;
    if (n == 1) {
        int a;
        cin >> a;
        cout << a << " " << a << endl;
    } else {
        for (int i = 0; i < n; i++) {
        int a;
        cin >> a;
        if (a >= max) {
            max = a;
        }
        if (a <= min) {
            min = a;
        }
    }
    cout << min << " " << max << endl;
    }
    return 0;
}