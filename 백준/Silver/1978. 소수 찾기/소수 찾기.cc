#include "iostream"

using namespace std;

int main() {
    int n;
    cin >> n;
    int num;
    int cnt = 0;
    int err;
    for (int t = 0; t < n; t++) {
        cin >> num;
        err = 0;
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    err++;
                }
            }
            if (err == 0) {
                cnt++;
            }
        }
    }
    cout << cnt << endl;
    return 0;
}