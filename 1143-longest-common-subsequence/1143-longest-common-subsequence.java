class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char []a1=text1.toCharArray();
        char []a2=text2.toCharArray();
        int temp[][]=new int[a2.length+1][a1.length+1];
        for(int i=1;i<=a2.length;i++){
            for(int j=1;j<=a1.length;j++){
                if(a2[i-1]==a1[j-1]){
                    temp[i][j]=temp[i-1][j-1]+1;
                }
                else{
                    temp[i][j]=Math.max(temp[i][j-1],temp[i-1][j]);
                }
            }
        }
        return temp[a2.length][a1.length];
    }
}