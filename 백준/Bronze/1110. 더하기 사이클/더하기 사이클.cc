#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    int tmp, num;
    num = n;
    int cnt = 0;
    while (1) {
        tmp = (n%10) * 10 + (n/10 + n%10)%10;
        cnt++;
        n = tmp;
        if (num == tmp) {
            break;
        }
    }
    cout << cnt << endl;
    return 0;
}