public class Solution {
    public bool IsIsomorphic(string s, string t) {
        if(s.Length != t.Length) return false;
        Dictionary<char, char> d1 = new Dictionary<char, char>();
        Dictionary<char, char> d2 = new Dictionary<char, char>();
        for(int i = 0; i < s.Length; i++){
            char a = s[i];
            char b = t[i];

            if(!d1.ContainsKey(a)) d1[a] = b;
            else if(d1[a] != b) return false;

            if(!d2.ContainsKey(b)) d2[b] = a;
            else if (d2[b] != a) return false;
        }

        return true;
    }
}
