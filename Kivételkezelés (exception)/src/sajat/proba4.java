package sajat;

import java.io.*;


public class proba4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
       
        // 5 elem� int t�mb
        int size = 5;
        int [] egeszTomb = new int [size];
       
        //input streamreader oszt�ly
        InputStreamReader inputStream = new InputStreamReader(System.in); //system.in szabv�nyos bemenet
        //bufferedreader
        BufferedReader read = new BufferedReader(inputStream);
       
        // IO Exception-t k�telez� lekezelni
       
        //t�mb�t ciklusba szervezz�k �gy t�ltj�k fel
       
        for (int i = 0; i < egeszTomb.length; i++){
            //kiv�telkezel�s
        try{
            boolean wrongData = true;
           
            do {
                System.out.println("K�rem adja meg " + ( i + 1 ) + ". eg�sz sz�mot!\n");
                System.out.println("Szam:");
           
                try {
                    String sztring = read.readLine();
                    egeszTomb[i] = Integer.parseInt(sztring);
                    wrongData = false;
                } catch (NumberFormatException e) {
                    System.out.println("Nem eg�sz sz�mot adt�l dilo.");
                    System.out.println("Adj �jjat");
                }
               
            } while (wrongData);
           
        }catch (IOException kivetelObj){
            kivetelObj.printStackTrace();
        }
       
        }
        // ki�rat�s
        System.out.println("A tomb elemei:");
        for (int i : egeszTomb) {
            System.out.println(i);
       
    }
       
}

}
