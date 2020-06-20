package hu.botondudvardi;

public class LongSubstring {

    public static void main(String[] args){

       String str= "abcabgabgabgd";
       System.out.println(str);

       System.out.println(lengthOfLongestSubstring(str));

       int[] index = new int[128];

        index[str.charAt(3)] = 2 + 1;
       System.out.println(index[str.charAt(0)]);

    }

    public static int lengthOfLongestSubstring(String s){
        int n = s.length(), ans = 0;
        int[] index = new int[128];

        for(int j = 0, i = 0; j < n; j++){
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
