class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digit="123456789";
        List <Integer> list=new ArrayList<>();
        for(int i=1;i<=9;i++){
            for(int j=0;i+j<=digit.length();j++){
                String substr=digit.substring(j,i+j);
                int value=Integer.parseInt(substr);
                if(value>=low && value<=high){
                    list.add(value);
                }
            }
        }
        return list;
    }
}