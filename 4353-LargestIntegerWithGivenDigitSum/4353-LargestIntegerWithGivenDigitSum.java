// Last updated: 8/13/2026, 3:59:01 PM
class Solution {
    public int largestInteger(int n, int s) {
        if(s>9*n){
            return-1;
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<n;i++){
            for(int digit=9;digit>=0;digit--){
                int rd=n-1-i;
                if(s-digit>=0&&s-digit<=9*rd){
                    result.append(digit);
                    s-=digit;
                    break;
                }
            }
        }
        return 
        Integer.parseInt(result.toString());
    }
}