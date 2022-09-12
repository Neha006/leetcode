class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0,maxScore=0;
        Arrays.sort(tokens);
        int l=0;
        int r=tokens.length-1;
        while(l<=r){
            if(power>=tokens[l]){
                power-=tokens[l];
                l++;
                score++;
                maxScore=Math.max(score,maxScore);
            }
            else if(score>0){
                power+=tokens[r];
                score--;
                r--;
            }
            else
                break;
        }
        return maxScore;
    }
}
