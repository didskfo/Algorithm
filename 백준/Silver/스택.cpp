#include "iostream"
#include "stack"

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n, num;
    cin >> n;
    string str;
    stack<int> st;
    while (n--) {
        cin >> str;
        if (str == "push") {
            cin >> num;
            st.push(num);
            continue;
        } else if (str == "pop") {
            if (st.size() > 0) {
                cout << st.top() << "\n";
                st.pop();
            } else {
                cout << -1 << "\n";
            }
            continue;
        } else if (str == "size") {
            cout << st.size() << "\n";
            continue;
        } else if (str == "empty") {
            if (st.size() == 0) {
                cout << 1 << "\n";
            } else {
                cout << 0 << "\n";
            }
            continue;
        } else {
            if (st.size() > 0) {
                cout << st.top() << "\n";
            } else {
                cout << -1 << "\n";
            }
            continue;
        }
    }
    return 0;
}