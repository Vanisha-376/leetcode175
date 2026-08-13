// Last updated: 8/13/2026, 3:58:48 PM
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[]s=startTime.split(":");
String[]e=endTime.split(":");
int ssec=Integer.parseInt(s[0])*3600+Integer.parseInt(s[1])*60+Integer.parseInt(s[2]);
int esec=Integer.parseInt(e[0])*3600+Integer.parseInt(e[1])*60+Integer.parseInt(e[2]);
return esec-ssec;
    
        
    }
}