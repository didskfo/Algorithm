#include "iostream"
#include "algorithm"

using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    int arr[n];
    int a, b;
    for (int i = 0; i < n; i++) {
        arr[i] = i+1;
    }
    for (int i = 0; i < m; i++) {
        cin >> a >> b;
        reverse(arr+a-1, arr+b);
    }
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    return 0;
}