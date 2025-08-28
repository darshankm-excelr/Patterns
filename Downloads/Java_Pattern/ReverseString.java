#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    void reverseString(vector<char>& s) {
        stack<char> s1, s2;

        // push all chars into s1
        for (int i = 0; i < s.size(); i++) {
            s1.push(s[i]);
        }

        // move all from s1 -> s2 (this keeps them reversed)
        while (!s1.empty()) {
            s2.push(s1.top());
            s1.pop();
        }

        // refill vector with reversed order from s2
        for (int i = 0; i < s.size(); i++) {
            s[i] = s2.top();
            s2.pop();
        }
    }
};

int main() {
    Solution sol;

    vector<char> s = {'h','e','l','l','o'};
    sol.reverseString(s);

    for (char c : s) cout << c;
    cout << endl;

    return 0;
}
