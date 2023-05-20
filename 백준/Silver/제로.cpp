#include "iostream"
#include "stack"

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int k, num, total = 0;
    cin >> k;
    stack<int> st;
    while (k--) {
        cin >> num;
        if (num == 0) {
            if (st.size() > 0) {
                st.pop();
            }
        } else {
            st.push(num);
        }
    }
    while (!st.empty()) {
        total += st.top();
        st.pop();
    }
    cout << total;
    return 0;
}