class Solution {
    public int romanToInt(String s) {
        HashMap <Character,Integer> romval = new HashMap<>();
        romval.put('I',1);
        romval.put('V',5);
        romval.put('X',10);
        romval.put('L',50);
        romval.put('C',100);
        romval.put('D',500);
        romval.put('M',1000);
        int value=0;
        for(int i=0;i<s.length();i++){
            if((i<s.length()-1)&&(romval.get(s.charAt(i))<romval.get(s.charAt(i+1)))){
                value -= romval.get(s.charAt(i));
            }
            else{
                value+=romval.get(s.charAt(i));
            }
        }
        return value;
    }
}
//Without Hashmap using Switch case
class Solution {
    public static int romanToInt(String s) {
                int res = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M': {
                    if (i > 0 && s.charAt(i-1) == 'C') res += 800;
                    else res += 1000;
                    break;
                }
                case 'D': {
                    if (i > 0 && s.charAt(i-1) == 'C') res += 300;
                    else res += 500;
                    break;
                }
                case 'C': {
                    if (i > 0 && s.charAt(i-1) == 'X') res += 80;
                    else res += 100;
                    break;
                }
                case 'L': {
                    if (i > 0 && s.charAt(i-1) == 'X') res += 30;
                    else res += 50;
                    break;
                }
                case 'X': {
                    if (i > 0 && s.charAt(i-1) == 'I') res += 8;
                    else res += 10;
                    break;
                }
                case 'V': {
                    if (i > 0 && s.charAt(i-1) == 'I') res += 3;
                    else res += 5;
                    break;
                }
                case 'I': {
                    res += 1;
                    break;
                }
                default: return 0;
            }
        }
        return res;
       
    }
}
