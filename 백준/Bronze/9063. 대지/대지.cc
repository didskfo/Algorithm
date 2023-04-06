#include "iostream"
#include "climits"

using namespace std;

int main() {
    int n;
    cin >> n;
    int min_x = INT_MAX;
    int max_x = INT_MIN;
    int min_y = INT_MAX;
    int max_y = INT_MIN;
    int a, b;
    int res = 0;
    for (int i = 0; i < n; i++) {
        cin >> a >> b;
        if (a < min_x) {
            min_x = a;
        }
        if (a > max_x) {
            max_x = a;
        }
        if (b < min_y) {
            min_y = b;
        }
        if (b > max_y) {
            max_y = b;
        }
    }
    res = (max_x - min_x) * (max_y - min_y);
    cout << res << endl;
    return 0;
}