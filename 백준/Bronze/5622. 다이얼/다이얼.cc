#include "iostream"

using namespace std;

int main() {
    string alp;
    cin >> alp;
    int cnt = 0;
    for (int i = 0; i < alp.length(); i++) {
        int num = alp[i];
        if (num >= 65 && num <= 67) {
            cnt += 3;
        } else if (num >= 68 && num <= 70) {
            cnt += 4;
        } else if (num >= 71 && num <= 73) {
            cnt += 5;
        } else if (num >= 74 && num <= 76) {
            cnt += 6;
        } else if (num >= 77 && num <= 79) {
            cnt += 7;
        } else if (num >= 80 && num <= 83) {
            cnt += 8;
        } else if (num >= 84 && num <= 86) {
            cnt += 9;
        } else {
            cnt += 10;
        }
    }
    cout << cnt << endl;
    return 0;
}