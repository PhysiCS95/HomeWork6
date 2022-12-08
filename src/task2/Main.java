package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите животное (dog, cat, tiger)");
        Scanner input = new Scanner(System.in);
        String animal = input.next();

        Animals cat = Animals.CAT;
        Animals dog = Animals.DOG;
        Animals tiger = Animals.TIGER;

        if (animal.equalsIgnoreCase("cat")){
            System.out.println(cat.toString());
        } else if (animal.equalsIgnoreCase("dog")) {
            System.out.println(dog.toString());
        } else if (animal.equalsIgnoreCase("tiger")) {
            System.out.println(tiger.toString());
        }
        else System.out.println("Такого животного нет");
    }
}
