package org.example.project490;

public class SearchEngine extends Thread{
    /**
     * universal variables that will be used as the values to search through the database
     */
    int idNumber;

    /**
     * @param firstName
     * @param lastName
     * @return
     */
    public int customerSearch(String firstName, String lastName) {
        String fName="";
        String lName="";
        idNumber=0;
        while(firstName!=fName&&lastName!=lName){
            fName="";
            lName="";
            idNumber=0;
        }
        return idNumber;
    }

    /**
     * @param address
     * @return
     */
    public int customerSearch(String address){
        String placeOfLiving="";
        idNumber=0;
        while(address!=placeOfLiving){
            placeOfLiving="";
            idNumber=0;
        }
        return idNumber;
    }

    /**
     * @param phoneNumber
     * @return
     */
    public int customerSearch(String phoneNumber){
        String pNumber="";
        idNumber=0;
        while(phoneNumber!=pNumber){
            pNumber="";
            idNumber=0;
        }
        return idNumber;
    }
}
