#include "iostream"
#include "string"

using namespace std;

int main() {
    string alp;
    cin >> alp;
    int idx;
    string arr[8] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    for (int i = 0; i < 8; i++) {
        while (true) {
            idx = alp.find(arr[i]);
            if (idx == string::npos) {
                break;
            }
            alp.replace(idx, arr[i].length(), "!");
        }
    }
    cout << alp.length() << endl;
    return 0;
}