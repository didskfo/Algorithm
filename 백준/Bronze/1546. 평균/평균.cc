#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    float arr_1[n];
    float max = 0;
    float sum = 0;
    for (int i = 0; i < n; i++) {
        int a;
        cin >> a;
        arr_1[i] = a;
        if (max <= a) {
            max = a;
        }
    }
    for (int i = 0; i < n; i++) {
        arr_1[i] = arr_1[i] / max * 100;
        sum += arr_1[i];
    }
    cout << sum / n << endl;
    return 0;
}
