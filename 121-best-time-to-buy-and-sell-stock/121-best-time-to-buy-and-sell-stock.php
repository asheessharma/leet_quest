class Solution {

    /**
     * @param Integer[] $prices
     * @return Integer
     */
    function maxProfit($prices) {
        $size=sizeof($prices);
        $profit=0;
        $minprice=PHP_INT_MAX;
        for($i=0;$i < $size;$i++){
            if($prices[$i]<$minprice){
                $minprice=$prices[$i];
            }
            $profit=max($prices[$i]-$minprice,$profit);
        }
        return $profit;
    }
}