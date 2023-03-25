#include "iostream"

using namespace std;

int main() {
    int n;
    cin >> n;
    string str;
    for (int i = 0; i < n; i++) {
        cin >> str;
        cout << str.front() << str.back() << endl;
    }
    return 0;
}