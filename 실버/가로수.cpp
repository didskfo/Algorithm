#include "iostream"
#include "climits"

using namespace std;

int gcd(int a, int b)
{
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
    int n;
    cin >> n;
    int arr[n];
    int cha[n-1];
    int min = INT_MAX;
    int cnt = 0;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    for (int i = 0; i < n-1; i++) {
        cha[i] = arr[i+1] - arr[i];
    }
    for (int i = 0; i < n-2; i++) {
        cha[i+1] = gcd(cha[i], cha[i+1]);
        min = cha[i+1];
    }
    for (int i = 0; i < n-1; i++) {
        if (arr[i] + min == arr[i+1]) {
            continue;
        } else {
            int a = arr[i];
            while(a + min != arr[i+1]) {
                cnt++;
                a = a + min;
            }
        }
    }
    cout << cnt;
    return 0;
}