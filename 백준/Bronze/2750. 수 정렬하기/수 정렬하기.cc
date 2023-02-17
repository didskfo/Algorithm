#include "iostream"
#include "algorithm"

using namespace std;

int main() {
    int n;
    cin >> n;
    int arr[n];
    int num;
    for (int i = 0; i < n; i++) {
        cin >> num;
        arr[i] = num;
    }
    sort(arr, arr+n);
    for (int i = 0; i < n; i++) {
        cout << arr[i] << endl;
    }
    return 0;
}