class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int f=0,s=0;
        for(int i=0; i<numbers.length; i++){
            if(i == 0){
                f = numbers[i];  
            }else{
                if(numbers[i] > s){
                    if(numbers[i] > f){
                        s = f;
                        f = numbers[i];    
                    }else{
                        s = numbers[i];
                    }
                }    
            }
            
        }
        
        
        return f*s;
    }
}