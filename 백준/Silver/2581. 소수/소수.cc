#include "iostream"

using namespace std;

int main() {
    int s, e, err;
    cin >> s >> e;
    int sum = 0;
    int min = e+1;
    for (int i = s; i <= e; i++) {
        err = 0;
        if (i > 1) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    err++;
                }
            }
            if (err == 0) {
                if (i < min) {
                    min = i;
                }
                sum += i;
            }
        }
    }
    if (sum == 0) {
        cout << -1 << endl;
    } else {
        cout << sum << endl;
        cout << min << endl;
    }
    return 0;
}