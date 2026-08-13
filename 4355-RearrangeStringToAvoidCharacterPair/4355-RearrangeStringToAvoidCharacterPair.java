// Last updated: 8/13/2026, 3:58:53 PM
class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder other=new StringBuilder();
        StringBuilder ys=new StringBuilder();
        StringBuilder xs=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch==y){
                ys.append(ch);
            }else if(ch==x){
                xs.append(ch);
            }else{
                other.append(ch);
            }
        }
        return other.toString()+ys.toString()+xs.toString();
    }
}