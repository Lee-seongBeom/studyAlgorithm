class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        // if(arr1.length)
        
        System.out.print(arr1.length);
        
        if(arr1.length == arr2.length){
            int a = 0;
            int b = 0;
            for(int a1 : arr1){
                a += a1;
            }
            
            for(int b1 : arr2){
                b += b1;
            }
            
            if(a>b){
                answer = 1;
            }else if(a<b){
                answer = -1;
            }else{
                answer = 0;
            }
            
            
        }else if(arr1.length > arr2.length){
            answer = 1;
        }else{
            answer = -1;
        }
        
        for(int a : arr1){
            
        }
        
        
        
        return answer;
    }
}