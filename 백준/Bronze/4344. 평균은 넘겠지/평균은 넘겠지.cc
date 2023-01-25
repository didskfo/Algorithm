#include <iostream>

using namespace std;

int main() {
    int t;
    cin >> t;
    for (int i = 0; i < t; i++) {
        int n;
        float sum = 0;
        float ave;
        float cnt = 0;
        cin >> n;
        int stu[n];
        for (int j = 0; j < n; j++) {
            int a;
            cin >> a;
            stu[j] = a;
            sum += a;
        }
        ave = sum / n;
        for (int j = 0; j < n; j++) {
            if (stu[j] > ave) {
                cnt++;
            }
        }
        cout << fixed;
        cout.precision(3);
        cout << cnt / n * 100 << "%" << endl;
    }
    return 0;
}