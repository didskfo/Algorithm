#include "iostream"
#include "string"
#include "set"

using namespace std;

int main() {
    set<string> rainbow;
    string a, b;
    int n;
    cin >> n;
    for (int t = 0; t < n; t++) {
        cin >> a >> b;
        if (a == "ChongChong") {
            rainbow.insert(b);
        } else if (b == "ChongChong") {
            rainbow.insert(a);
        } else {
            if (rainbow.find(a) != rainbow.end()) {
                rainbow.insert(b);
            } else if (rainbow.find(b) != rainbow.end()) {
                rainbow.insert(a);
            }
        }
    }
    cout << rainbow.size()+1 << endl;
    return 0;
}