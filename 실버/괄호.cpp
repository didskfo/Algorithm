#include "iostream"
#include "stack"

using namespace std;

int main() {
    int n;
    string str;
    cin >> n;
    while (n--) {
        stack<char> st;
        cin >> str;
        bool check = true;
        for (int i = 0; i < str.length(); i++) {
            if (str[i] == '(') {
                st.push('(');
            } else if (str[i] == ')') {
                if (!st.empty()) {
                    st.pop();
                } else {
                    check = false;
                }
            }
        }
        if (!st.empty()) {
            check = false;
        }
        if (!check) {
            cout << "NO" << "\n";
        } else {
            cout << "YES" << "\n";
        }
    }
    return 0;
}