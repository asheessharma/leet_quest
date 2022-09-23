class Solution {

    /**
     * @param String $text1
     * @param String $text2
     * @return Integer
     */
    function longestCommonSubsequence($text1, $text2) {
        $arr1=str_split($text1);
        $arr2=str_split($text2);
        $temp[sizeof($arr2)+1][sizeof($arr1)+1];
        $max=0;
        for($i=1;$i<=sizeof($arr2);$i++){
            for($j=1;$j<=sizeof($arr1);$j++){
                if($arr2[$i-1]==$arr1[$j-1]){
                    $temp[$i][$j]=$temp[$i-1][$j-1]+1;
                }
                else{
                    $temp[$i][$j]=max($temp[$i-1][$j],$temp[$i][$j-1]);
                }
                if($temp[$i][$j]>$max){
                    $max=$temp[$i][$j];
                }
            }
        }
        return $max;
    }
}