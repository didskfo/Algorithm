#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int num[10];
    int arr[10];
    int cnt = 1;
    for (int i = 0; i < 10; i++) {
        int n;
        cin >> n;
        num[i] = n;
    }
    for (int i = 0; i < 10; i++) {
        arr[i] = num[i] % 42;
    }
    sort(arr, arr+10);
    for (int i = 0; i < 9; i++) {
        if (arr[i] != arr[i+1]) {
            cnt++;
        }
    }
    cout << cnt << endl;
    return 0;
}