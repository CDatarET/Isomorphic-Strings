class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return(false);
        }
        HashMap<Character,Character> kv = new HashMap<Character,Character>();
        HashMap<Character,Character> vk = new HashMap<Character,Character>();

        for(int i = 0; i < s.length(); i++){
            if(kv.containsKey(s.charAt(i))){
                if(kv.get(s.charAt(i)) != t.charAt(i)){
                    return(false);
                }
            }
            if(vk.containsKey(t.charAt(i))){
                if(vk.get(t.charAt(i)) != s.charAt(i)){
                    return(false);
                }
            }
            kv.putIfAbsent(s.charAt(i),t.charAt(i));
            vk.putIfAbsent(t.charAt(i),s.charAt(i));
        }
        return(true);
    }
}
