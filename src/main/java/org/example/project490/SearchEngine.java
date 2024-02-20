package org.example.project490;

public class SearchEngine extends Thread{
    /**
     * universal variables that will be used as the values to search through the database
     */
    static int idNumber;

    /**
     * @param firstName
     * @param lastName
     * @return
     */
    public static int customerSearch(String firstName, String lastName) {
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
    public static int customerSearch(String address){
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
    public static int customerSearch(String phoneNumber){
        String pNumber="";
        idNumber=0;
        while(phoneNumber!=pNumber){
            pNumber="";
            idNumber=0;
        }
        return idNumber;
    }

    /**
     * this turns strings into char arrays
     * this makes it possible to search letter by letter
     * @param item
     * @return
     */
    public char[] characterByCharacter(String item){
        int x=item.length();
        char letter[]=new char[x];
        for(int i=0;i<item.length();i++){
            letter[i]=item.charAt(i);
        }
        return letter;
    }

    /**
     * this compares two different char[] by which one is longer
     * this will return how many have matched betweent the two char[]
     * this will be used to search for the matches
     * @param searchQuery
     * @param databaseEntry
     * @return
     */
    public int compareStrings(char[] searchQuery, char[] databaseEntry){
        int compareLength=0;
        int similarityCount=0;
        if(searchQuery.length>databaseEntry.length){
            compareLength=searchQuery.length;
        }
        else if(databaseEntry.length>searchQuery.length){
            compareLength=databaseEntry.length;
        }
        else{
            System.out.printf("Error has occured at SearchEngine.compareString() \n");
        }
        for(int i=0;i<compareLength;i++){
            if(searchQuery[i]==databaseEntry[i]){
                similarityCount++;
            }
        }
        return similarityCount;
    }
}
