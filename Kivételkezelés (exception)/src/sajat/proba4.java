package sajat;

import java.io.*;


public class proba4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
       
        // 5 elemû int tömb
        int size = 5;
        int [] egeszTomb = new int [size];
       
        //input streamreader osztály
        InputStreamReader inputStream = new InputStreamReader(System.in); //system.in szabványos bemenet
        //bufferedreader
        BufferedReader read = new BufferedReader(inputStream);
       
        // IO Exception-t kötelezõ lekezelni
       
        //tömböt ciklusba szervezzük úgy töltjük fel
       
        for (int i = 0; i < egeszTomb.length; i++){
            //kivételkezelés
        try{
            boolean wrongData = true;
           
            do {
                System.out.println("Kérem adja meg " + ( i + 1 ) + ". egész számot!\n");
                System.out.println("Szam:");
           
                try {
                    String sztring = read.readLine();
                    egeszTomb[i] = Integer.parseInt(sztring);
                    wrongData = false;
                } catch (NumberFormatException e) {
                    System.out.println("Nem egész számot adtál dilo.");
                    System.out.println("Adj újjat");
                }
               
            } while (wrongData);
           
        }catch (IOException kivetelObj){
            kivetelObj.printStackTrace();
        }
       
        }
        // kiíratás
        System.out.println("A tomb elemei:");
        for (int i : egeszTomb) {
            System.out.println(i);
       
    }
       
}

}
