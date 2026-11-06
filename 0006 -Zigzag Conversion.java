class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i] = new StringBuilder();
        }
        int currRow = 0;
        int dir = 1;
        for(int i=0;i<s.length();i++){
            rows[currRow].append(s.charAt(i));
            if(currRow == 0)
            dir = 1;
            else if(currRow == numRows-1)
            dir = -1;
            currRow += dir;
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<numRows;i++)
        result.append(rows[i]);
        return result.toString();
    }
}
