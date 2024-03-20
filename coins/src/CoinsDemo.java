/*
 * This class does not contain the exact solution
 * Refer CoinDemo2 class
 * */
public class CoinsDemo
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
        int index=0;
        //initial valuues
        this.coins=coins;///
        this.WantedCoinTotal=WantedCoinTotal;
        this.coincount=new int[coins.length];
        this.mincoins=new int[coins.length];

        this.coincount[coincount.length-1]=this.WantedCoinTotal/coins[coincount.length-1];
        this.currTotal=this.currTotal+(coincount[coincount.length-1]*coins[coincount.length-1]);
        System.out.println("fdsfsd  "+this.coincount[coincount.length-1]);
         //System.out.println(sendval+" "+(coincount.length-1));

        index= coincount.length-1;
        int sendval=0;
        int rounds=0;
        boolean adder=true;
        while(index>-1)
        {
            //change position
            //setPosVal();

            rounds++;
            System.out.println("round is "+rounds);
            if(rounds>2000)
            {
                System.out.println("return");
                return;
            }

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
                //print values

                printarr(this.coincount);


                //increase value by 1
                sendval=coincount[index]+1;
                setPosVal(index,sendval);
                index= coincount.length-1;

            }
            else if(this.currTotal<this.WantedCoinTotal)
            {

                //
                //increase value by 1
                sendval=coincount[index]+1;
                setPosVal(index,sendval);
                index= coincount.length-1;

            }
            else
            {
                this.currTotal=this.currTotal-(coincount[index]*coins[index]);
                coincount[index]=0;
                index--;
                if(index!=-1) {
                    if (this.currTotal > this.WantedCoinTotal) {
                        //send index to left
                        this.currTotal = this.currTotal - (coincount[index] * coins[index]);
                        coincount[index] = 0;
                        index--;

                    } else {

                        //call add 1 function
                        //addOne(index);
                       //increase value by 1
                        sendval = coincount[index] + 1;
                        setPosVal(index, sendval);
                        index = coincount.length - 1;
                    }
                }



            }

            System.out.println("currTotal is "+currTotal);
            System.out.println("index is "+index);
            System.out.println();
        }

        //print results
        System.out.println();
        System.out.println("---------------------------------------------------------------");
        printarr(this.mincoins);
        System.out.println(rounds);
    }

    public void setPosVal(int position,int value)
    {


       // value--;

        this.currTotal=this.currTotal-(coincount[position]*coins[position]);
        coincount[position]=value;
        System.out.println(currTotal);
        this.currTotal=this.currTotal+(coincount[position]*coins[position]);
        System.out.println(currTotal);
    }

    public void printarr(int arr[])

    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(coins[i]+" - "+arr[i]+" , ");
        }
        System.out.println();

    }

    public void addOne(int index)
    {
        //increase value by 1
        int sendval = coincount[index] + 1;
        setPosVal(index, sendval);
        index = coincount.length - 1;
    }


}
