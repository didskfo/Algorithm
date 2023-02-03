#include "iostream"

using namespace std;

int main() {
    string a, b;
    cin >> a >> b;
    string rev_a = "";
    string rev_b = "";
    for (int i = 2; i >= 0; i--) {
        rev_a += a[i];
        rev_b += b[i];
    }
    if (stoi(rev_a) > stoi(rev_b)) {
        cout << rev_a << endl;
    } else {
        cout << rev_b << endl;
    }
    return 0;
}