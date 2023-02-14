#include "iostream"

using namespace std;

int main() {
    int n, m;
    int num;
    cin >> n >> m;
    int arr1[n][m];
    int arr2[n][m];
    int arr3[n][m];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> num;
            arr1[i][j] = num;
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> num;
            arr2[i][j] = num;
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            arr3[i][j] = arr1[i][j] + arr2[i][j];
            cout << arr3[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}