package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer ofer1 =new Offer();
        ofer1.setInfo("ankara","sonmezer","sdet",120000,true,true,true,true);

        Offer ofer2 =new Offer();
        ofer2.setInfo("mus","lcw","seller",150000,false,false,false,true);

        Offer ofer3 =new Offer();
        ofer3.setInfo("colorado","kiremit","restorant",110000,false,true,false,false);

        Offer ofer4 =new Offer();
        ofer4.setInfo("colorado","cdeo","sdet",160000,true,true,true,true);

        Offer ofer5 =new Offer();
        ofer5.setInfo("florida","autodealer","cardealer",180000,true,false,false,true);

        Offer ofer6 =new Offer();
        ofer6.setInfo("colorado","tireCare","mecanik",20000,false,true,false,true);

        Offer ofer7 =new Offer();
        ofer7.setInfo("istanbul","reina","sdet",60000,false,false,false,false);

        Offer myOffers []={ofer1,ofer2,ofer3,ofer4,ofer5,ofer6,ofer7};

        ArrayList<Offer>fullTimeOffers=new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffers.removeIf(p->!p.isFullTime);//remove if its not fulltime
        System.out.println(fullTimeOffers);

        ArrayList<Offer>localOffers=new ArrayList<>(Arrays.asList(myOffers));

        localOffers.removeIf(p->!p.location.equals("colorado"));
        System.out.println(localOffers);
        System.out.println(localOffers.size());

        ArrayList<Offer>offersWithBenefits=new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p-> (p.hasBenefit==false|| p.hasPTO==false));
        System.out.println(offersWithBenefits);

        ArrayList<Offer>sdetOffers=new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p-> p.jobTitle.equals("sdet"));


        ArrayList<Offer>lessOffer=new ArrayList<>(Arrays.asList(myOffers));
        lessOffer.removeIf(p-> p.salary<100000);
        System.out.println(lessOffer);






    }
}
