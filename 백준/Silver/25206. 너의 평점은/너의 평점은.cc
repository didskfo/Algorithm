#include "iostream"

using namespace std;

int main() {
    string name;
    float a;
    string b;
    float css = 0;
    float sum = 0;
    for (int i = 0; i < 20; i++) {
        cin >> name >> a >> b;
        if (b.compare("P") == 0) {
            continue;
        }
        if (b.compare("A+") == 0) {
            sum += a * 4.5;
            css += a;
        } else if (b.compare("A0") == 0) {
            sum += a * 4.0;
            css += a;
        } else if (b.compare("B+") == 0) {
            sum += a * 3.5;
            css += a;
        } else if (b.compare("B0") == 0) {
            sum += a * 3.0;
            css += a;
        } else if (b.compare("C+") == 0) {
            sum += a * 2.5;
            css += a;
        } else if (b.compare("C0") == 0) {
            sum += a * 2.0;
            css += a;
        } else if (b.compare("D+") == 0) {
            sum += a * 1.5;
            css += a;
        } else if (b.compare("D0") == 0) {
            sum += a * 1.0;
            css += a;
        } else if (b.compare("F") == 0) {
            sum += a * 0;
            css += a;
        }
    }
    cout << sum/css;
    return 0;
}