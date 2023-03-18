#include "iostream"

using namespace std;

int main() {
    int n, target;
    cin >> n >> target;
    int arr[n];
    int total;
    int max = 0;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    for (int i = 0; i < n-2; i++) {
        for (int j = i+1; j < n-1; j++) {
            for (int k = j+1; k < n; k++) {
                total = arr[i] + arr[j] + arr[k];
                if (total > target) {
                    continue;
                }
                if (max < total) {
                    max = total;
                }
            }
        }
    }
    cout << max;
    return 0;
}