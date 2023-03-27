#include "iostream"

using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    int i, j, k;
    int arr[n];
    for (int q = 0; q < n; q++) {
        arr[q] = q+1;
    }
    for (int q = 0; q < m; q++) {
        cin >> i >> j >> k;
        int tmp[k-i];
        int pos_1 = 0;
        int pos_2 = i-1;
        int pos_3 = i+j-k;
        for (int w = i-1; w < k-1; w++) {
            tmp[pos_1] = arr[w];
            pos_1++;
        }
//        for (int w = 0; w < k-i; w++) {
//            cout << tmp[w] << "\n";
//        }
        for (int w = k-1; w < j; w++) {
            arr[pos_2] = arr[w];
            pos_2++;
        }
//        for (int w = 0; w < n; w++) {
//            cout << arr[w] << "\n";
//        }
        for (int w = 0; w < k-i; w++) {
            arr[pos_3] = tmp[w];
            pos_3++;
        }
//        for (int w = 0; w < n; w++) {
//            cout << arr[w] << " ";
//        }
//        cout << "\n";
    }
    for (int q = 0; q < n; q++) {
        cout << arr[q] << " ";
    }
    return 0;
}