#include "iostream"

using namespace std;

int main() {
    int max = -1;
    int r = -1;
    int c = -1;
    int num;
    int arr[9][9];
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            cin >> num;
            arr[i][j] = num;
            if (num > max) {
                max = num;
                r = j + 1;
                c = i + 1;
            }
        }
    }
    cout << max << endl;
    cout << c << " " << r;
    return 0;
}