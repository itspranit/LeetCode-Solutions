import java.util.*;

class Solution {
    public List<Integer> survivedRobotsHealths(int[] pos, int[] h, String d) {
        int n = pos.length;
        List<int[]> a = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            a.add(new int[]{pos[i], h[i], d.charAt(i), i});
        }
        
        a.sort((x,y)->x[0]-y[0]);
        
        Stack<int[]> st = new Stack<>();
        
        for(int[] cur : a){
            if(cur[2]=='R'){
                st.push(cur);
            }else{
                while(!st.isEmpty() && st.peek()[2]=='R' && cur[1]>0){
                    if(st.peek()[1] < cur[1]){
                        cur[1]--;
                        st.pop();
                    }
                    else if(st.peek()[1] == cur[1]){
                        st.pop();
                        cur[1]=0;
                        break;
                    }
                    else{
                        st.peek()[1]--;
                        cur[1]=0;
                        break;
                    }
                }
                if(cur[1]>0) st.push(cur);
            }
        }
        
        int[] res = new int[n];
        Arrays.fill(res, -1);
        
        for(int[] x: st){
            res[x[3]] = x[1];
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(res[i]!=-1) ans.add(res[i]);
        }
        
        return ans;
    }
}
