#include <iostream>

using namespace std;

int main() {
    int t;
    cin >> t;
    for (int i = 0; i < t; i++) {
        int n;
        string str;
        string ans = "";
        cin >> n >> str;
        for (int j = 0; j < str.length(); j++) {
            for (int k = 0; k < n; k++) {
                ans += str[j];
            }
        }
        cout << ans << endl;
    }
    return 0;
}