package day36_InheritanceIntro.cryptoToken;

import java.util.ArrayList;

public class MyWallet {
    public static void main(String[] args) {

        Bitcoin bitcoin= new Bitcoin();
        bitcoin.setInfo(4260.9, 12,811.661,29.13, 18.90000000,true);

        Ethereum ethereum= new Ethereum();
        ethereum.setInfo(3349.25,11,404.154,22.04, 119.054000,true);

        Cardano cardano= new Cardano();
        cardano.setInfo(1.26, 101,40.308,1.357,32.0660000,false);

        Doge doge=new Doge();
        doge.setInfo(0.16,45,20.963, 702.367, 132.67,true);


        XRP xrp= new XRP();
        xrp.setInfo(0.77, 243,10.00000000, 18.71, 47.577,false);

       CryptoToken []myWallets={bitcoin,ethereum,cardano,doge,xrp};
       int total=0;
        for (CryptoToken myWallet : myWallets) {
              total+=(myWallet.price*myWallet.quantity);
        }
        System.out.println("may total asset: "+total);

    }
}
