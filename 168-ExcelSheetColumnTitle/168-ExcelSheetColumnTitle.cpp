// Last updated: 16/10/2025, 04:28:30
class Solution {
public:
    string convertToTitle(int columnNumber) {
        
        string str =  "";
        while (columnNumber > 0) {
            str = char('A' + (columnNumber - 1) % 26) + str;
            columnNumber = (columnNumber - 1) / 26;
        }
        return str;
    }
};