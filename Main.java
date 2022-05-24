package com.Project1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print(" Welcome || Happy Voters Day !\n Are you eligible to vote in INDIA ?\n Check Now !\n Enter Your AGE : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age == 18){
            System.out.println("Great ! You are the voter of future INDIA!");
        }else if(age >18){
            System.out.println(" Voting is your right .\n Please do vote !");
        }else{
            System.out.println(" Sorry but you can`t vote .\n You are too young.");
        }
    }
}
