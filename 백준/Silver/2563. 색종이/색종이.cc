#include "iostream"

using namespace std;

int main() {
    int n, x, y;
    int arr[100][100] = {{0}};
    cin >> n;
    for (int t = 0; t < n; t++) {
        cin >> x >> y;
        for (int i = 100-y-10; i < 100-y; i++) {
            for (int j = x; j < x+10; j++) {
                arr[i][j]++;
            }
        }
    }
    int s = 0;
    for (int i = 0; i < 100; i++) {
        for (int j = 0; j < 100; j++) {
            if (arr[i][j] != 0) {
                s++;
            }
        }
    }
    cout << s;
    return 0;
}