// Last updated: 8/13/2026, 3:58:58 PM
class Solution{
    public int maxDigitRange(int [] nums){
       int n=nums.length;
        int[] arr= new int[n];
        int maxRange=0;
        int sum=0;
        for(int i=0;i<n;i++){
            int b=Math.abs(nums[i]);
            if(b==0){
                arr[i]=0;
            }else{
                int high =0;
                int low=9;
                while(b!=0){
                    int e=b%10;
                    if(e>high)
                        high=e;
                    if(e<low)
                        low=e;
                    b/=10;
                }
                arr[i]=high-low;
            }
            if(arr[i]>maxRange)
                maxRange=arr[i];
        }
        for(int i=0;i<n;i++){
            if(arr[i]==maxRange){
                sum+=nums[i];
            }
        }
        return sum;
    }
}