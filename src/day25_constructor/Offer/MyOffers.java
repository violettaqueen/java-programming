package day25_constructor.Offer;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {


        // 2.1 Create 7 objects of Offer

        Offer offer1 = new Offer("Local", "Facebook", "Java Developer", 120000, true, true, true, true);
        Offer offer2 = new Offer("Dubai", "Google", "Senior Java Developer", 200000, false, true, false, true);
        Offer offer3 = new Offer("Tokyo", "Amazon", "Java Developer", 210000, true, false, true, false);
        Offer offer4 = new Offer("Wellington", "Apple", "Software Engineer", 89000, true, true, false, true);
        Offer offer5 = new Offer("Singapore", "Microsoft", "Java Developer", 250000, true, false, false, true);
        Offer offer6 = new Offer("Local", "Tesla", "Java developer", 150000, true, true, true, false);
        Offer offer7 = new Offer("Local", "Samsung", "Java SDET", 95000, true, true, true, false);

        //2.2 Create an array of Offers named myOffers and store all 7 objects of offers

        Offer[] offers = {offer1, offer2, offer3, offer4, offer5, offer6, offer7};

        //2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.

        ArrayList<Offer> fullTimeOffers = new ArrayList<>();

        fullTimeOffers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        // 2.3.1 Write a program that can remove the offer objects that are not full-time

        fullTimeOffers.removeIf(p -> !p.isFullTime);

       // 2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

       // 2.4.1 Write a program that can remove all the offers that are not from local

        localOffers.removeIf(p -> p.location.equals("Local"));

        //2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.

       ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        //2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO

        offersWithBenefits.removeIf(p -> !p.hasBenefit && !p.hasPTO);

       ArrayList<Offer> devOffers = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

       // 2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle

        devOffers. removeIf(p -> !p.jobTitle.equals("Java Developer"));

      // 2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.

        ArrayList<Offer> with100K = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        //  2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

        with100K.removeIf(p -> p.salary < 100000);

        System.out.println(with100K);

    }
}
/*
 Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle

            2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

 */