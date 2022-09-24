class Solution {

    /**
     * @param Integer[] $gas
     * @param Integer[] $cost
     * @return Integer
     */
    function canCompleteCircuit($gas, $cost) {
        $sum=0;
        $pos=-1;
        $curr=0;
        for($i=0;$i<sizeof($gas);$i++){
          $diff=$gas[$i]-$cost[$i];
          $curr+=$diff;
          $sum+=$diff;
            if($curr<0){
                $pos=$i;
                $curr=0;
            }
        }
        if($sum>=0)
            return $pos+1;
        return -1;
        
    }
}