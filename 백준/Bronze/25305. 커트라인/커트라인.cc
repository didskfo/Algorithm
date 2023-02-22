#include "iostream"
#include "algorithm"

using namespace std;

bool desc(int a, int b) {
    return a > b;
}

int main() {
    int n, k;
    cin >> n >> k;
    int arr[n];
    int num;
    for (int i = 0; i < n; i++) {
        cin >> num;
        arr[i] = num;
    }
    sort(arr, arr+n, desc);
    cout << arr[k-1];
    return 0;
}