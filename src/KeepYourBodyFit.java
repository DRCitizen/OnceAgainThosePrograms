import java.util.Scanner;

public class KeepYourBodyFit {
    public static void main(String[] args){

        Scanner input =new Scanner(System.in);

        float weight;
        float height;
        float BMI;

        System.out.println("Моля въведете теглото си в килограми:");
        weight= input.nextFloat();

        System.out.println("Моля въведете ръста си в сантиметри:");

        height=input.nextFloat();

        BMI=weight/(height*height);

        System.out.println("Вашият индекс на телесна маса е :"  +  BMI);

        if(BMI <= 18.5) {

            System.out.println("Вашето тегло, е под нормата!");
        }
        else if(BMI > 18.5 && BMI <= 24.9){

            System.out.println("Вие имате нормално тегло");
        }
        else if(BMI > 25 && BMI <= 29.9){

            System.out.println("Вие сте с наднормено тегло!");
        }


    }
}
