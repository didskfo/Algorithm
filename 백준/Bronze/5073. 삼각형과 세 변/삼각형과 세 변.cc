#include "iostream"
#include "algorithm"

using namespace std;

int main() {
    int arr[3];
    while (true) {
        cin >> arr[0] >> arr[1] >> arr[2];
        if (arr[0] == 0) {
            break;
        }
        sort(arr, arr+3);
        if (arr[2] >= arr[0] + arr[1]) {
            cout << "Invalid" << endl;
        } else if (arr[0] == arr[1] && arr[1] == arr[2]) {
            cout << "Equilateral" << endl;
        } else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0]) {
            cout << "Isosceles" << endl;
        } else {
            cout << "Scalene" << endl;
        }
    }
    return 0;
}