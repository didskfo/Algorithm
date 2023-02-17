#include "iostream"
#include "algorithm"

using namespace std;

int main() {
    int arr[5];
    int num;
    int avg = 0;
    int cen;
    int sum = 0;
    for (int i = 0; i < 5; i++) {
        cin >> num;
        arr[i] = num;
        sum += num;
    }
    avg = sum / 5;
    sort(arr, arr+5);
    cen = arr[2];
    cout << avg << endl << cen;
    return 0;
}