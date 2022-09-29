//------------------------------------------mistake of when two no has same diff

 // ArrayList<Integer> ans=new ArrayList<Integer>();
        // PriorityQueue<Pair<Integer, Integer> > pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        // for(int i=0;i<arr.length;i++){
        //     pq.add(new Pair<>(arr[i],Math.abs(arr[i]-x)));
        //      if(pq.size()>k)
        //         pq.poll();
        // }
        // while(pq.size()>0){
        //     ans.add(pq.peek().getKey());
        //     pq.poll();
        // }
        // Collections.sort(ans);
        // return ans;
//------------------------------------------------------issue resolved
 //    ArrayList<Integer> ans=new ArrayList<Integer>(); 
    //     PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->(a.diff==b.diff)?b.index-a.index:b.diff-a.diff);
    //     for(int i=0;i<arr.length;i++){
    //         pq.add(new Node(i,Math.abs(arr[i]-x)));
    //         if(pq.size()>k){
    //             pq.poll();
    //         }
    //     }
    //     while(!pq.isEmpty()){
    //         ans.add(arr[pq.poll().index]);
    //     }
    //     Collections.sort(ans);
    //     return ans;
    // }
    // private class Node{
    //     private int diff;
    //     private int index;
    //     public Node(int index,int diff){
    //         this.diff= diff;
    //         this.index=index;
    //     }
