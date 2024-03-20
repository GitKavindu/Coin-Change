/*
* Because CoinsDemo is for only testing,Its code is commented!!
* coinArr contains the coin set.
* coinTotal represents the value we want to get
* Permutation with the lowest possible coin count and number of permutations are output to the console.
*  Ex1:-    1 - 0 , 2 - 0 , 5 - 2 ,
            num of permutations 10
*  Ex2:-    1 - 0 , 2 - 1 , 4 - 0 , 10 - 1 ,
            num of permutations 18
* */
public class Main {
    public static void main(String[] args) {

     
      /*  int coinArr[]={1,2,5};
        int coinTotal=10;
        CoinsDemo d1=new CoinsDemo();
        d1.setMincoins(coinArr,coinTotal);

         System.out.println("\n\n------------------------------------");
         int coinArr1[]={1,2,4,10};
         coinTotal=12;
         d1=new CoinsDemo();
         d1.setMincoins(coinArr1,coinTotal);*/

        /*
        * Try using both 2 blocks below by uncommenting and commenting.
        * Both of them contain two different test cases.
        * */
       /*int coinArr[]={1,2,5};
        int coinTotal=10;
        CoinDemo2 d1=new CoinDemo2();
        d1.setMincoins(coinArr,coinTotal);*/

        int coinArr1[]={1,2,4,10};
        int coinTotal2=12;
        CoinDemo2 d2=new CoinDemo2();
        d2.setMincoins(coinArr1,coinTotal2);

    }
}