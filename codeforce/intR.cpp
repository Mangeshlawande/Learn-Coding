#include <iostream>
#include <unordered_map>
#include <string>
using namespace std;

class Solution {
public:
    int romanToInt(string s) {
        unordered_map<char, int> m;
        
        m['I'] = 1;
        m['V'] = 5;
        m['X'] = 10;
        m['L'] = 50;
        m['C'] = 100;
        m['D'] = 500;
        m['M'] = 1000;
        
        int ans = 0;
        
        for(int i = 0; i < s.length(); i++) {
            // Check if the next character exists before accessing it
            if (i < s.length() - 1 && m[s[i]] < m[s[i + 1]]) {
                ans -= m[s[i]];
            } else {
                ans += m[s[i]];
            }
        }
        
        return ans;
    }
};

int main() {
    Solution solution;

    // Example Roman numeral inputs
    string romanNumeral1 = "XI";
    string romanNumeral2 = "LVIII";
    string romanNumeral3 = "MCMXCIV";

    // Converting and printing results
    cout << "Roman numeral: " << romanNumeral1 << " => Integer: " << solution.romanToInt(romanNumeral1) << endl;
    cout << "Roman numeral: " << romanNumeral2 << " => Integer: " << solution.romanToInt(romanNumeral2) << endl;
    cout << "Roman numeral: " << romanNumeral3 << " => Integer: " << solution.romanToInt(romanNumeral3) << endl;

    return 0;
}
