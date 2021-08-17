package com.blz.addressbook;

import java.util.Scanner;

public class AddressBookUC01 {
	
    public static int row=1,column=7;
    public static String [][] addBook= new String[row][column];
    public static String[] index={"First Name","Last Name","Address","City","State","Zip Code","Mobile Number"};
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        UserInput();
        System.out.println("Your Data Successfully saved\nTo Display Press Y or N to Exit : ");
        char yn=scanner.next().charAt(0);
        if (Character.toLowerCase(yn)=='y') {
            Display();
        }
        else {

        }
    }

    public static void UserInput(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter your " + index[j] + " : ");
                addBook[i][j]=scanner.nextLine();
            }
            System.out.println();

        }

    }
    public static void Display(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(addBook[i][j]+" |");
            }
            System.out.println();

        }
    }
}
