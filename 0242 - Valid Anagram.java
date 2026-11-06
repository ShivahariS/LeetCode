class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char ch:s.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            map2.put(ch, map2.getOrDefault(ch,0)+1);
        }
        for(char ch: map1.keySet()){
            if(!map1.get(ch).equals(map2.get(ch)))
            return false;
        }
        return true; 
    }
}
// class Solution {
//     static {
//         for (int i = 0; i < 444; i++) {
//             isAnagram("a", "");
//         }
//     }
//     public static boolean isAnagram(String s, String t) {                                    Better Approach, applicable only if all characters are Lowercase
//         if(s.length()!=t.length()) return false;                                                                     and there are no symbols.
//         int freq[] = new int[26];
//         for(int i=0;i<s.length();i++){
//             freq[s.charAt(i)-'a']++;
//             freq[t.charAt(i)-'a']--;
//         }
//         for(int count: freq){
//             if(count!=0) return false;
//         }
//         return true;
//     }
// }
