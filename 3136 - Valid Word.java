class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for(int i = 0; i < word.length(); i++) {
            switch(word.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    hasVowel = true;
                    break;
                case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z',
                     'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z':
                    hasConsonant = true;
                    break;
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    break;
                default:
                    return false;
            }
        }
        return hasVowel && hasConsonant;
    }
}
//Another method
class Solution {
    public boolean isValid(String word) {
        int vow=0;
        int con=0;
        if(word.length()<3) return false;
        else{
            word = word.toLowerCase();
            for(char c:word.toCharArray()){
                if((Character.isLetter(c))||(Character.isDigit(c))){
                    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') vow++;
                    else if(!Character.isDigit(c)) con++;
                }
                else return false;
            }
            if(vow>0 && vow<word.length() && con>0) return true;
            else return false;
        }
    }
}

