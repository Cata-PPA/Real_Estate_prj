package model;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String args[]) throws ParseException {

        CollectionManager manager=new CollectionManager();


        boolean available=true;
        boolean unavailable=false;
        boolean hasParking=true;
        boolean noParking=false;

        SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
        ////            construction date and offer placement formatting
        String offerPlacementForm="01/01/2000";
        Date offerPlaced=sdf1.parse(offerPlacementForm);
        String offerPlmtEndForm="02/01/2000";
        Date offerEnding=sdf1.parse(offerPlmtEndForm);



        String buildDateForm="01/01/2000";
        Date buildDate=sdf1.parse(buildDateForm);

        Land land1=new Land(200,"teren Frunzisoara", "aleea Castanilor", 180.25,
                250000, offerPlaced, offerEnding, available);
        Land land2=new Land(201,"teren Tulpinita", "aleea Castelelor", 180.25,
                150000, offerPlaced, offerEnding, available);
        Land land3=new Land(202,"teren Coroana", "strada Castorilor", 180.25,
                180500, offerPlaced, offerEnding, available);
        Land land4=new Land(210,"teren Lupului", "strada Lupilor", 220,
                50000, offerPlaced, offerEnding, available);
        Land land5=new Land(211,"teren Vanatorului", "strada Vanatorilor", 3000,
                20000, offerPlaced, offerEnding, available);

        House house1=new House(100,"Frunzisoara", "aleea Castanilor",253.25,
                buildDate,250000,offerPlaced, offerEnding,available,4,2,land1);
        House house2=new House(100,"Tulpinita", "aleea Arinilor",143.25,
                buildDate,150000,offerPlaced, offerEnding,available,5,3,land2);
        House house3=new House(100,"Coroana", "strada Lalelelor",151.50,
                buildDate,180500,offerPlaced, offerEnding,available,4,1,land3);

        Apartment aprt1=new Apartment(400,"Marul", "strada General Magheru",
                60.5,buildDate,110000, offerPlaced, offerEnding, unavailable,3,1,8, hasParking,1);
        Apartment aprt2=new Apartment(403,"Parul", "strada 21 Decembrie",
                80.5,buildDate,130000, offerPlaced, offerEnding, available,3,1,8, hasParking,1);
        Apartment aprt3=new Apartment(405,"Nucul", "strada Observatorului",
                75.5,buildDate,127800, offerPlaced, offerEnding, unavailable,4,1,6, noParking,0);
        Apartment aprt4=new Apartment(407,"Portocalul", "strada Replubicii",
                90.5,buildDate,141000, offerPlaced, offerEnding, unavailable,5,1,2, hasParking,2);

        List<RealEstate> realEstateList= new ArrayList();
        realEstateList.add(house1);
        realEstateList.add(house2);
        realEstateList.add(house3);
        realEstateList.add(aprt1);
        realEstateList.add(aprt2);
        realEstateList.add(aprt3);
        realEstateList.add(aprt4);

        List<Land> landList=new ArrayList();
        landList.add(land1);
        landList.add(land2);
        landList.add(land3);
        landList.add(land4);
        landList.add(land5);

        List<House> houseList=new ArrayList();
        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);

        List<Apartment> apartmentList=new ArrayList();
        apartmentList.add(aprt1);
        apartmentList.add(aprt2);
        apartmentList.add(aprt3);
        apartmentList.add(aprt4);

/////  testare metode metode metode

        System.out.println("findREListByPrice = tipareste lista de RealEstate sub un anumit pret\n");
        List<RealEstate> rezultat2=manager.findREListByPrice(realEstateList, 150000);
        System.out.println(rezultat2);
        System.out.println("\n\n");
        System.out.println("_____________________________________________________________________________");

        System.out.println("extractHouslessLandList = extrage din lista de land, land-urile care nu au case\n");
        List<Land> rezultat=manager.extractHouslessLandList(houseList, landList);
        System.out.println(rezultat);
        System.out.println("\n\n");
        System.out.println("_____________________________________________________________________________");

        System.out.println("findREMapByPrice = tipareste map de RealEstate sub un anumit pret, titlu RealEstate si pret\n");
        Map<String, Double> rezultat1=manager.findREMapByPrice(realEstateList, 300000);
        System.out.println(rezultat1);
        System.out.println("\n\n");
        System.out.println("_____________________________________________________________________________");

        System.out.println("findLandByName = parcurge lista de land, cauta titlu valid in lista\n");
        System.out.println("Lista este" + landList);
        boolean rezultat3=manager.findLandByName(landList, "teren Vanatorului");
        System.out.println(rezultat3);
        System.out.println("\n\n");
        System.out.println("_____________________________________________________________________________");

        System.out.println("findREByName = parcurge lista de RealEstate, cauta titlu valid in lista\n");
        System.out.println("Lista de imobile este" + realEstateList);
        boolean rezultat4=manager.findREByName(realEstateList, "Frunzisoara");
        System.out.println(rezultat4);
        System.out.println("\n\n");
        System.out.println("_____________________________________________________________________________");

        System.out.println("modifyAvailabilityByEstateTitle = modificare valabilitate casa dupa estateTitle\n");
        System.out.println("Modificare valabilitatea in functie de titlul imobilului");
        manager.modifyAvailabilityByEstateTitle(houseList, unavailable, "Frunzisoara");
        System.out.println(house1);
        System.out.println("\n\n");
        System.out.println("_____________________________________________________________________________");


        System.out.println("modifyPriceByAddress = modificare pret imobil dupa adresa\n");
        System.out.println("Modificare pret imobil in functie de adresa");
        manager.modifyPriceByAddress(realEstateList, 3500, "aleea Castanilor");
        System.out.println(house1);
        System.out.println("\n\n");
        System.out.println("_____________________________________________________________________________");


        System.out.println("\n\n");
        manager.fileWorks();







    }
}
