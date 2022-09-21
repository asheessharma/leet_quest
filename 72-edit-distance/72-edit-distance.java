class Solution {
    public int minDistance(String word1, String word2) {
        char arr1[]=word1.toCharArray();
        char arr2[]=word2.toCharArray();
        int temp[][]=new int[arr1.length+1][arr2.length+1];
        for(int i=0;i<temp[0].length;i++){
            temp[0][i]=i;
        }
        for(int i=0;i<temp.length;i++){
            temp[i][0]=i;
        }
        for(int i=1;i<=arr1.length;i++){
            for(int j=1;j<=arr2.length;j++){
                
                if(arr1[i-1]==arr2[j-1]){
                    temp[i][j]=temp[i-1][j-1];
                }
                else{
                    temp[i][j]=1+min(temp[i-1][j-1],temp[i-1][j],temp[i][j-1]);
                }
            }
        }
        return temp[arr1.length][arr2.length];
        
    }
     int min(int a,int b,int c){
        int l=Math.min(a,b);
        return Math.min(l,c);
    }
}