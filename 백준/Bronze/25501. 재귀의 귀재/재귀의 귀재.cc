#include "iostream"
#include "cstring"

using namespace std;

int cnt;

int recursion(const char *s, int l, int r){
    cnt++;
    if(l >= r) return 1;
    else if(s[l] != s[r]) return 0;
    else return recursion(s, l+1, r-1);
}

int isPalindrome(const char *s){
    return recursion(s, 0, strlen(s)-1);
}

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
//    printf("ABBA: %d\n", isPalindrome("ABBA")); // 1
//    printf("ABC: %d\n", isPalindrome("ABC"));   // 0
    char str[1001];
    int t;
    cin >> t;
    while (t--) {
        cin >> str;
        cout << isPalindrome(str) << " ";
        cout << cnt << "\n";
        cnt = 0;
    }
}