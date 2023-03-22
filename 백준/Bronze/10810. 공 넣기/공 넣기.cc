#include "iostream"

using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    int arr[101];
    for (int q = 0; q < 101; q++) {
        arr[q] = 0;
    }
    int i, j, k;
    for (int q = 0; q < m; q++) {
        cin >> i >> j >> k;
        for (int w = i; w <= j; w++) {
            arr[w] = k;
        }
    }
    for (int q = 1; q < n+1; q++) {
        cout << arr[q] << " ";
    }
    return 0;
}