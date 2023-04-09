#include "iostream"

using namespace std;

long long int gcd(long long int a, long long int b)
{
    long long int c;
    while (b != 0)
    {
        c = a % b;
        a = b;
        b = c;
    }
    return a;
}

int main() {
    long long int a, b;
    cin >> a >> b;
    cout << a*b/gcd(a, b) << endl;
    return 0;
}