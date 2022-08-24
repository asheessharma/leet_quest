class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        //if i index of string does not have space then count++;
        //return count if its not a empty string
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            else if(count>0){
                return count;
            }
        }
        return count;
    }
}