class Solution:
    def isIsomorphic(self, s, t):
        if len(s) != len(t) : return False
        d1 = {}
        d2 = {}
        for i in range(len(s)):
            if d1.get(s[i]) is None : d1[s[i]] = t[i]
            elif d1[s[i]] != t[i] : return False

            if d2.get(t[i]) is None : d2[t[i]] = s[i]
            elif d2[t[i]] != s[i] : return False

        return True
