#include "iostream"

using namespace std;

int main() {
    int n, m;
    int a, b;
    int tmp;
    cin >> n >> m;
    int arr[n];
    for (int i = 0; i < n; i++) {
        arr[i] = i+1;
    }
    for (int i = 0; i < m; i++) {
        cin >> a >> b;
        tmp = arr[a-1];
        arr[a-1] = arr[b-1];
        arr[b-1] = tmp;
    }
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    return 0;
}