#include "iostream"

using namespace std;

int main() {
    int n;
    cin >> n;
    string str;
    int cnt = 0;
    for (int t = 0; t < n; t++) {
        cin >> str;
        bool flag = true;
        int arr[26] = {0};
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (str[i] != str[i-1] && str[i] == str[j]) {
                    flag = false;
                }
            }
        }
        if (flag) {
            cnt++;
        }
    }
    cout << cnt << endl;
    return 0;
}