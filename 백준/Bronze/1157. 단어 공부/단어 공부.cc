#include <iostream>

using namespace std;

int main() {
    string str;
    int arr[26] = {0};
    int cnt = 0;
    cin >> str;
    for (int i = 0; i < str.length(); i++) {
        if (str[i] < 97) {
            arr[str[i] - 65]++;
        } else {
            arr[str[i] - 97]++;
        }
    }
    int max = 0, max_idx = 0;
    for (int i = 0; i < 26; i++) {
        if (max <= arr[i]) {
            max = arr[i];
            max_idx = i;
        }
    }
    for (int i = 0; i < 26; i++) {
        if (max == arr[i]) {
            cnt++;
        }
    }
    if (cnt > 1) {
        cout << "?" << endl;
    } else {
        cout << (char)(max_idx+65) << endl;
    }
    return 0;
}