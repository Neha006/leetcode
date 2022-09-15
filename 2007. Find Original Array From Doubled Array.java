class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n=changed.length;
        // base case one when length of changed is odd
        if(n%2!=0) return new int[0];
        // find max of changed so that helt to make array of freqCount
        int max=Integer.MIN_VALUE;
        for(int num:changed)
            max=Math.max(max,num);
        // check max value is even or odd to check its half can be present or an decimal value like 9 whose half is not 
        if(max%2!=0) return new int[0];
        
        // make a freqCount array of size max
        int [] freqCount=new int[max+1];
        // iterate count the freq
        for(int num:changed)
            freqCount[num]++;
       // make ans array 
        int [] ans= new  int[n/2];
        // base case for 0 occurence 0 finding double that is also zero 
        // handling zero's here
        if(freqCount[0]%2!=0) return new int[0];
        int index=freqCount[0]/2;
        // iterate count from 1 to freqCount length
        for(int i=1;i<freqCount.length;i++){
            if(freqCount[i]==0) continue;
            // like 1 has freqCount 5 and 2 has 4. one 4 has no double for it
            if(i*2>max || freqCount[i]>freqCount[i+i]) return new int[0];
                int Count=freqCount[i];
            freqCount[i+i]-=Count;
            while(Count-->0)
                ans[index++]=i;
        }
        return ans;
        
        
    }
}
