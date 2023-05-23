#include "iostream"
#include "stack"
#include "queue"

using namespace std;

int main() {
    int n, target, num = 1;
    stack<int> st;
    queue<string> ans;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> target;
        while (num <= target) {
            st.push(num);
            ans.push("+");
            num++;
        }
        if (st.top() == target) {
            st.pop();
            ans.push("-");
        } else {
            cout << "NO" << "\n";
            return 0;
        }
    }
    while (!ans.empty()) {
        cout << ans.front() << "\n";
        ans.pop();
    }
    return 0;
}