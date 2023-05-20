//#include "iostream"
//#include "algorithm"
//
//using namespace std;
//
//string arr[1000001];
//int main() {
//    int n;
//    cin >> n;
//    string name;
//    int cnt = 0;
//    int idx = 0;
//    int check;
//    for (int t = 0; t < n; t++) {
//        cin >> name;
//        cout << "name : " << name << endl;
//        check = 1;
//        if (name.compare("ENTER") == 0) {
//            for (int i = 0; i < idx; i++) {
//                cout << "cin : ENTER" << endl;
//                arr[i] = "";
//            }
//            idx = 0;
//            continue;
//        }
//        for (int i = 0; i < idx; i++) {
//            if (arr[i].compare(name)) {
//                check = 0;
//            }
//        }
//        if (check == 1) {
//            arr[idx++] = name;
//            cout << "gom : " << name << endl;
//            cnt++;
//        }
//    }
//    cout << cnt << endl;
//    return 0;
//}

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