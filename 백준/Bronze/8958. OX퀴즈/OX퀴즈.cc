#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int score = 0;
        int cnt = 0;
        string ox;
        cin >> ox;
        for (char &c : ox) {
            if (c == 'O') {
                cnt++;
                score += cnt;
            } else {
                cnt = 0;
            }
        }
        cout << score << endl;
    }
    return 0;
}