#include "iostream"

using namespace std;

int gcd(int a, int b) {
    int c;
    while (b != 0)
    {
        c = a % b;
        a = b;
        b = c;
    }
    return a;
}

int main() {
    int a, b, c, d;
    cin >> a >> b >> c >> d;
    int moe = b * d;
    int ja = a*d + b*c;
    int num = gcd(moe, ja);
    cout << ja / num << " " << moe / num;
    return 0;
}