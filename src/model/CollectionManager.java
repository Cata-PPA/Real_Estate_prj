package model;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class CollectionManager {

    public boolean findREByName(List<RealEstate> realEstateList, String estateTitle){
        //parcurge lista de realestate, cautam titlu valid in lista
        for(RealEstate realEstate1:realEstateList){
            if(realEstate1.getEstateTitle().equals(estateTitle)){
                System.out.println("Exista imobil cu numele cautat.");
                return true;
            }
        }
        System.out.println("Nu exista imobil cu numele cautat.");
        return false;
    }

    public boolean findLandByName(List<Land> landList, String landTitle){
        //parcurge lista de land, cautam titlu valid in lista
        for(Land land1:landList){
            if(land1.getLandTitle().equals(landTitle)){
                System.out.println("Exista teren cu numele cautat.");
                return true;
            }
        }
        System.out.println("Nu exista teren cu acest nume.");
        return false;
    }
    //extrage din lista cu toate land-urile, land-urile care nu au case
    public List<Land> extractHouslessLandList(List<House>houseList, List<Land>landList){
        List<Land> resultListLand=landList;
        List<Land> housesLand= new ArrayList<>();
        for (House h1:houseList){
            Land land = h1.getLand();
            if (land!=null)
            {
                housesLand.add(land);
            }
        }
        System.out.println("The following lands have no house built on it:");
        resultListLand.removeAll(housesLand);
        return resultListLand;
    }

    //tipareste lista de RealEstate sub un anumit pret
    public List<RealEstate> findREListByPrice(List<RealEstate>realEstateList, double price){
        List<RealEstate> resultPriceListRealEstate=new ArrayList();
        for (RealEstate re1:realEstateList){
                if(re1.getPrice()<(price)){
                    resultPriceListRealEstate.add(re1);
                }
        }
        System.out.println("The following items are under " +price+":");
        return resultPriceListRealEstate;
    }

    //tipareste map de RealEstate sub un anumit pret, titlu imobil si pret
    public Map<String, Double> findREMapByPrice(List<RealEstate>realEstateList, double price){
        Map<String, Double> resultPriceMapRealEstate=new HashMap<>();
        for (RealEstate re1:realEstateList){
            if(re1.getPrice()<(price)){
                resultPriceMapRealEstate.put(re1.getEstateTitle(),re1.getPrice());
            }

        }
        if (resultPriceMapRealEstate.isEmpty()){
            System.out.println("There are no items under the selected price!");
            return null;
        }
        else
            System.out.println("The following items are under " + price + ":");
            return resultPriceMapRealEstate;

    }

    //modificare pret imobil dupa adresa
    public void modifyPriceByAddress(List<RealEstate>realEstateList, double price, String address){
        for(RealEstate p1:realEstateList){
            if(p1.getAddress().equals(address)){
                p1.setPrice(price);
            }
        }
    }

    //modificare valabilitate casa dupa estateTitle
    public void modifyAvailabilityByEstateTitle(List<House>houseList, boolean availability, String estateTitle){
        for(House h1:houseList){
            if(h1.getEstateTitle().equals(estateTitle)){
                h1.setAvailability(availability);
            }
        }
    }


    public void fileWorks(){
        try {
            FileWriter myWriter = new FileWriter("D:\\Docs\\AV java\\AgentieImobiliara\\resources\\filename.txt");
            myWriter.write("MUltumesc pentru prezentare!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }





















}
