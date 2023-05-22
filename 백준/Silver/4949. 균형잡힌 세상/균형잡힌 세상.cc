#include "iostream"
#include "stack"
#include "string"

using namespace std;

int main() {
    while (true) {
        string str;
        getline(cin, str);
        if (str == ".") {
            break;
        }
        stack<char> st;
        bool check = true;
        for (int i = 0; i < str.length(); i++) {
            char c = str[i];
            if (c == '(' || c == '[') {
                st.push(c);
            } else if (c == ')') {
                if (!st.empty() && st.top() == '(') {
                    st.pop();
                } else {
                    check = false;
                    break;
                }
            } else if (c == ']') {
                if (!st.empty() && st.top() == '[') {
                    st.pop();
                } else {
                    check = false;
                    break;
                }
            }
        }
        if (check && st.empty()) {
            cout << "yes" << "\n";
        } else {
            cout << "no" << "\n";
        }
    }
    return 0;
}