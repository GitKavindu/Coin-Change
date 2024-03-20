public class CoinDemo2
{
    int WantedCoinTotal;
    int coins[];
    int coincount[];
    //
    int currTotal=0;

    //
    int suitcount;
    int mincoincount;
    int mincoins[];

    public void setMincoins(int coins[],int WantedCoinTotal)
    {
        ///initialize local variables
        int index=0;
        boolean isAdded=false,isOver=false;
        int rounds=0,totalRounds=0;

        ///initialize global variables
        this.coins=coins;
        this.WantedCoinTotal=WantedCoinTotal;
        this.coincount=new int[coins.length];
        this.mincoins=new int[coins.length];

        while(isOver==false)
        {
            isAdded=false;
            index=coins.length-1;
            rounds=0;
            while(isOver==false && isAdded==false)
           {

               rounds++;
               //try to add 1 to the index if possible -------
               int sendval=coincount[index]+1;
               setPosVal(index,sendval);
               if(this.currTotal<=this.WantedCoinTotal)
               {
                   //set boolean variable to true
                   isAdded=true;

                   //check whether total equals to WantedCoinTotal
                   if(this.currTotal==this.WantedCoinTotal)
                   {
                       //
                       suitcount++;
                       //
                       int coinscountTotal=0;
                       for(int i=0;i<this.coincount.length;i++)
                       {
                           coinscountTotal=coinscountTotal+coincount[i];
                       }
                       if(this.mincoincount==0 || this.mincoincount>coinscountTotal)
                       {

                           this.mincoincount=coinscountTotal;
                           //this.mincoins=coincount;
                           for(int i=0;i<this.coincount.length;i++)
                           {
                               this.mincoins[i]=coincount[i];
                           }
                       }
                       printarr(this.coincount);
                   }
                   // ---------------------------------------------------
               }
               else
               {
                   //else fix the value to default,

                   setPosVal(index,0);
                   //push index to the left
                   index--;

                   /*sendval=coincount[index]+1;
                   setPosVal(index,sendval);*/


                   //System.out.println(index);
               }

               //check index equals to -1
               if(index==-1)
               {
                  isOver=true;
               }


            }
            totalRounds+=rounds;
            System.out.println("Total rounds is "+totalRounds);
            System.out.println("currTotal is "+currTotal);
            System.out.println("index is "+index);
            System.out.println();
        }

        //print results
        System.out.println();
        System.out.println("---------------------------------------------------------------");
        printarr(this.mincoins);
        //System.out.println(rounds);
        System.out.println("num of permutations "+this.suitcount);
        System.out.println();
        System.out.println("---------------------------------------------------------------");

    }


    public void setPosVal(int position,int value)
    {
        // value--;
        this.currTotal=this.currTotal-(coincount[position]*coins[position]);
        coincount[position]=value;
        this.currTotal=this.currTotal+(coincount[position]*coins[position]);

    }

    public void printarr(int arr[])

    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(coins[i]+" - "+arr[i]+" , ");
        }
        System.out.println();

    }
}
