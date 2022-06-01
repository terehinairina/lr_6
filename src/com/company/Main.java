package com.company;
import java.util.Scanner;

 class Formula {
    float x;
    float y;
    float z;
    public Formula(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void displayFormula() {
        double vector = Math. sqrt( Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2) );
        System.out.println(vector);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x ");
        int x = scanner.nextInt();
        System.out.print("Введите y ");
        int y = scanner.nextInt();
        System.out.print("Введите z ");
        int z = scanner.nextInt();
        Formula did = new Formula(x,y,z);
        did.displayFormula();
    }
}