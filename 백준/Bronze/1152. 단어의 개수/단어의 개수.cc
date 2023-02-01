#include <iostream>
#include <stdio.h>

using namespace std;

int main() {
    string str;
    getline(cin, str);
    int bla = 0;
    if (str.length() == 1) {
        if (isspace(str[0]) != 0) {
            cout << 0 << endl;
            return 0;
        }
    }
    for (int i = 0; i < str.length(); i++) {
        if (i == 0 || i == str.length()-1) {
            continue;
        }
        if (isspace(str[i]) != 0) {
            bla++;
        }
    }
    cout << bla+1 << endl;
    return 0;
}