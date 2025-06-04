package AbhinavSirLabWork.InterviewCoding.GuideWire.CoinProblem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public enum Coin {
    PENNY(1),NICKEL(5),DIME(10),QUARTER(25),HALF_DOLLAR(50);
    final int value;
    Coin(int value){
        this.value=value;
    }
}
class CoinPurse{
    HashMap<Coin,Integer> hm=new HashMap<>();
    public void addCoin(Coin c){
        hm.put(c,hm.get(c)+1);
    }
    public int getValueInCents(){
         int total=0;
         int prod=1;
         for (Map.Entry<Coin,Integer> map: hm.entrySet()){
             //prod=map.getValue()*Coin.values();;

             //total=total+
         }
         return total;
    }
    public int reduceCoinage(){
        int totalCoin=getValueInCents();
        for (Map.Entry<Coin,Integer> map: hm.entrySet()){
            if (map.getKey().equals(Coin.PENNY)){
                totalCoin=totalCoin- map.getValue();
            }
            if (map.getKey().equals(Coin.NICKEL)){
                totalCoin=totalCoin- map.getValue();
            }
            if (map.getKey().equals(Coin.DIME)){
                totalCoin=totalCoin- map.getValue();
            }
            if (map.getKey().equals(Coin.QUARTER)){
                totalCoin=totalCoin- map.getValue();
            }
            if (map.getKey().equals(Coin.HALF_DOLLAR)){
                totalCoin=totalCoin- map.getValue();
            }
        }
        return totalCoin;
    }
//    public void removeCoin(Coin c){
//      hm.remove(hm.get(c));
//    }
//    public int getCoinCount(){
//
//    }
//    public List<Integer> generateAllUniqueExactChangeAmountsPossible(){
//
//    }
//    public Iterator<Coin> iterator(){
//
//    }
}
