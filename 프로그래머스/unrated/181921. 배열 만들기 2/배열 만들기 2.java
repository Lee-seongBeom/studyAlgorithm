import java.util.*;

class Solution {
    public ArrayList solution(int l, int r) {
        int[] answer = new int[0];
        int cnt = 0;
        boolean flag = true;
        ArrayList<Integer> arrList = new ArrayList<>();
        while(l <= r){
            int num = l;
            String numStr = ""+l;
            numStr = numStr.replaceAll("0","");
            numStr = numStr.replaceAll("5","");
            if(numStr.length() == 0){
                arrList.add(num);
                cnt ++;
                flag = false;
            }
            l++;
        }
        
        if(flag){
           arrList.add(-1);
        }
        return arrList;
    }
}