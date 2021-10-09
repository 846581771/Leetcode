class Solution {
    public String removeDuplicateLetters(String s) {
        StringBuilder sb = new StringBuilder(); 
        int [] count = new int [26];
        boolean [] used = new boolean [26];
        char [] c = s.toCharArray();
        for(char ch: c)
        {
            count[ch-'a']++;
        }
        for(int i = 0; i < s.length(); i++)
        {
            int d = s.charAt(i) - 'a';
            count[d]--;
            if(used[d])
            {
                continue; 
            }
            while(sb.length() > 0 && sb.charAt(sb.length() - 1)-'a' > d && count[sb.charAt(sb.length() - 1)- 'a'] > 0)
            {
                used[sb.charAt(sb.length() -1) - 'a'] = false;
                sb.deleteCharAt(sb.length() -1);
            }
            sb.append(s.charAt(i));
            used[d] = true;
        }
        return sb.toString(); 
    }
}
