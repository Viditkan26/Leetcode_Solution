class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int currentAlt = 0;
        for ( final int g : gain){
            currentAlt += g;
            ans = Math.max(ans, currentAlt);
        }
        
    return ans;
    }
}