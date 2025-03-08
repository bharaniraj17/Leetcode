class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left=0;
        int right=k;
        int wc=0;
        for(int i=0;i<k;i++) if(blocks.charAt(i)=='W') wc++;
        int min=wc;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i)=='W')wc++;
            if(blocks.charAt(i-k)=='W')wc--;
            min=Math.min(min,wc);
        }
        return min;
    }
}