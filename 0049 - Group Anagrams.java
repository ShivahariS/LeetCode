class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> grp = new HashMap<>();
        int[] count = new int[26];
        for(String s:strs){
            Arrays.fill(count,0);
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            for(int i=0; i<26; i++){
                sb.append("#");
                sb.append(count[i]);
            }
            String key = sb.toString();
            if(!grp.containsKey(key)){
                grp.put(key, new ArrayList());
            }
            grp.get(key).add(s);
        }
        return new ArrayList(grp.values());
    }
}
