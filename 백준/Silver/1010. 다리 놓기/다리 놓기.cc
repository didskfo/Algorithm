#include "iostream"

using namespace std;

long long int fac(int a) {
    long long int num = 1;
    for (int i = 1; i <= a; i++) {
        num *= i;
    }
    return num;
}

int main(){
    int t;
    int answer, tmp;
    cin >> t;
    while (t--) {
        int n, k;
        cin >> n >> k;
        answer = 1;
        tmp = 1;
        for(int i = k; i > k - n; i--) {
            answer *= i;
            answer /= tmp++;
        }
        cout << answer << endl;
    }
    return 0;
}