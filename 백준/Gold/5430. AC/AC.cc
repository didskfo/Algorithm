#include "iostream"
#include "deque"
#include "string"
#include "algorithm"

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cin.tie(NULL);

    int t, n;
    string str, s, tmp;
    cin >> t;
    while (t--) {
        bool rev = false, err = false;
        deque<int> dq;
        tmp = "";
        cin >> str;
        cin >> n;
        cin >> s;
        for (int i = 0; i < s.length(); i++) {
            if (isdigit(s[i])) {
                tmp += s[i];
            } else {
                if (!tmp.empty()) {
                    dq.push_back(stoi(tmp));
                    tmp = "";
                }
            }
        }
        for (auto a : str) {
            if (a == 'R') {
                if (rev) {
                    rev = false;
                } else {
                    rev = true;
                }
            } else {
                if (dq.empty()) {
                    cout << "error" << "\n";
                    err = true;
                    break;
                } else {
                    if (rev) {
                        dq.pop_back();
                    } else {
                        dq.pop_front();
                    }
                }
            }
        }
        if (!err) {
            cout << "[";
        }
        if (rev && !dq.empty()) {
            for (auto a = dq.rbegin(); a != dq.rend(); a++) {
                if (a == dq.rend()-1) {
                    cout << *a;
                } else {
                    cout << *a << ",";
                }
            }
        } else if (!rev && !dq.empty()) {
            for (auto a = dq.begin(); a != dq.end(); a++) {
                if (a == dq.end()-1) {
                    cout << *a;
                } else {
                    cout << *a << ",";
                }
            }
        }
        if (!err) {
            cout << "]\n";
        }
    }
    return 0;
}