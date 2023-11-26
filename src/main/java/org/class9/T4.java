package org.class9;
/*
Create 2D array of cars : american, german, korean, italian.
 Then retrieve all values from that array using 2 different loops
 */
public class T4 {
    public static void main(String[] args) {

        String[][] carsArray = {
                {"Chevrolet", "Ford", "Dodge"},
                {"Volkswagen", "BMW", "Mercedes"},
                {"Hyundai", "Kia", "Genesis"},
                {"Fiat", "Ferrari", "Lamborghini"}
        };

       for(int i=0;i<carsArray.length;i++){
           for (int j = 0; j < carsArray[i].length; j++) {
               System.out.print(carsArray[i][j]+" ");
           }
           System.out.println();
       }
        System.out.println();
        System.out.println("Using Enhanced for loop");
        System.out.println();
        String [] name={"fkdf","bnfjdf","djfnbjdf"};

     for(String[] arr:carsArray){
         for (String car:arr){
             System.out.print(car+" ");
         }
         System.out.println();
     }

    }
}
