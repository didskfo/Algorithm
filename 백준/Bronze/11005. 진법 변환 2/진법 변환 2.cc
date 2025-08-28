#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int main() {
    int N, B;
    string answer;

    cin >> N >> B;
    while (N > 0) {
        int tmp = N % B;
        if (tmp >= 0 && tmp <= 9) {
            answer += tmp + '0';
        } else {
            answer += (tmp-10) + 'A';
        }
        N /= B;
    }
    reverse(answer.begin(), answer.end());
    cout << answer;
    return 0;
}