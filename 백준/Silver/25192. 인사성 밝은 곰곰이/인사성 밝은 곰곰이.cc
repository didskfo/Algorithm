#include "iostream"
#include "set"
#include "string"

using namespace std;

int main() {
    set<string> gom;
    int n;
    string name;
    int cnt = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> name;
        if (name == "ENTER") {
            cnt += gom.size();
            gom.clear();
        } else {
            gom.insert(name);
        }
    }
    cnt += gom.size();
    cout << cnt << endl;
    return 0;
}