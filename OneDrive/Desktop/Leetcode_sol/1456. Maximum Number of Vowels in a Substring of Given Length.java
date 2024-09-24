class Solution {
    public int maxVowels(String s, int k) {
        int counter = 0;
        for(int i=0; i<k; ++i){
            if(isVowel(s.charAt(i))){
                ++counter;
            }
        }
        int ans = counter;
        for( int i=k; i<s.length(); ++i){
            if(isVowel(s.charAt(i))){
                ++counter;
            }
            if(isVowel(s.charAt(i-k))){
                --counter;
            }
            ans = Math.max(ans,counter);
        }
        return ans;
    }

    private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}