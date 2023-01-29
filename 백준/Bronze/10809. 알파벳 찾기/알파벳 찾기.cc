#include <iostream>
#include <string>

using namespace std;

int main() {
    string str;
    cin >> str;
    string alphabet = "abcdefghijklmnopqrstuvwxyz";
    for (int i = 0; i < alphabet.length(); i++) {
        cout << (int)str.find(alphabet[i]) << " ";
    }
    return 0;
}