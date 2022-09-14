class Solution {
    int count=0;
    int[] freq;
    public int pseudoPalindromicPaths (TreeNode root) {
        freq=new int[10];
        dfs(root);
        return count;
    }
    void dfs(TreeNode root){
       if(root==null)
            return;
       
        freq[root.val]++;
       
        if(root.left==null && root.right==null){ 
            if(palindrome()){
                count++;
                }
         }
        else{
                dfs(root.left);
                dfs(root.right);
          }
        freq[root.val]--;
    
    }
    boolean palindrome(){
    int odd=0;
    for(int i=0;i<=9;i++){
        if(freq[i]%2!=0)
            odd++;
       }
    if(odd>1)
        return false;
    return true;
    }
}
