import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distanceKm,age;
        int travelType;
     Scanner input = new Scanner(System.in);
        System.out.print("How many kilometers will you travel : ");
        distanceKm = input.nextInt();
        System.out.println();
        System.out.print("How old are you ? ");
        age = input.nextInt();
        System.out.println();
        System.out.print("What is your travelling type ?" + "\n" + "For example; " +
                "one way(press 1) or  round trip(press 2). " + "\n");
        travelType = input.nextInt();
        input.close();
        
        double pricePerKm = 0.10 * distanceKm;
        double ageDiscount;
        double travelDiscount;
        double discountedPr = 0;
        if(distanceKm <= 0 || age <= 0 || !((1 == travelType) || (2 == travelType))){
            System.out.println("You've entered wrong information !");
        }else if( age < 12){
            ageDiscount = pricePerKm / 2;
            discountedPr = pricePerKm - ageDiscount;
            System.out.println("Total amount of price : " + " => " + discountedPr);
        }else if(12 <= age && 24 >= age){
            ageDiscount = pricePerKm * 0.10;
            discountedPr = pricePerKm - ageDiscount;
            System.out.println("Total amount of price : " + " => " + discountedPr);
        }else if(age > 65){
            ageDiscount = pricePerKm * 0.30;
            discountedPr = pricePerKm - ageDiscount;
            System.out.println("Total amount of price : " + " => " + discountedPr);
        }else if(travelType == 2){
            travelDiscount = pricePerKm * 0.20;
            discountedPr = pricePerKm -travelDiscount;
            System.out.println("Total amount of price : " + " => " + discountedPr);
        }
        else{
            System.out.println("No discount. Price that you'll pay : " + pricePerKm);
        }

    }
}