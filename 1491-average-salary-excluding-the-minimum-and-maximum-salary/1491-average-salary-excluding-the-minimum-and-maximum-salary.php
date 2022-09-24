class Solution {

    /**
     * @param Integer[] $salary
     * @return Float
     */
    function average($salary) {
       $min=PHP_INT_MAX;
       $max=PHP_INT_MIN;
       $sum=0;
       for($i=0;$i<sizeof($salary);$i++){
               $min=min($min,$salary[$i]);
               $max=max($max,$salary[$i]);   
       }
        for($i=0;$i<sizeof($salary);$i++){
            if($salary[$i]!=$min && $salary[$i]!=$max){
                $sum+=$salary[$i];
            }
        }
        return $sum/(sizeof($salary)-2);
        
    }
}