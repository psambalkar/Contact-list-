package com.Parth;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static mobilephone m = new mobilephone("8983693276");

    public static void main(String[] args) {
        // write your code here
        boolean quit = false;
        startphone();
        printactions();

        while (!quit) {
            System.out.println("\nEnter Action:(6 to show  available actions)");
            int action=sc.nextInt();
            sc.nextLine();
            switch (action)
            {
                case 0:
                    System.out.println("\n shutting down...");
                    quit=true;
                    break ;
                case 1:
                    m.printcontacts();
                    break;
                case 2:
                    addnewcontact();
                    break;
                case 3:
                    updatecontact();
                    break;
                case 4:
                    removecontact();
                    break;
                case 5:
                    queryconytact();
                    break;
                case 6:
                    printactions();
                    break;
            }
        }


    }



    private static void addnewcontact()
    {
        System.out.println("enter contact name");
        String name=sc.nextLine();
        System.out.println("enter phoneno");
        String phoneno=sc.nextLine();
        contact c=contact.createcontact(name,phoneno);
        if(m.addnewcontact(c))
        {
            System.out.println("new contact added "+name+"phone no added "+phoneno);
        }
        else
        {
            System.out.println("contact already exist in file");
        }
    }
    private static void updatecontact()
    {
        System.out.println("enter existing contact");
        String name = sc.nextLine();
        contact c=m.querycontact(name);
        if(c==null)
        {  System.out.println("contact not found");}
        System.out.println("enter new contact name");
        String newname=sc.nextLine();
        System.out.println("enter new phoneno");
        String newno=sc.nextLine();
        contact co=contact.createcontact(newname,newno);
        if(m.updatecontact(c,co))
        {
            System.out.println("secussfully updated record");
        }
        else
        {
            System.out.println("error updating record");
        }



    }
    private static void removecontact()
    {
        System.out.println("enter existing contact");
        String name = sc.nextLine();
        contact c=m.querycontact(name);
        if(c==null)
        {  System.out.println("contact not found");}
        if(m.removecontact(c))
        {
            System.out.println("sucessfully deleted record");
        }else
        {
            System.out.println("error deleting record");
        }

    }
    private static void queryconytact()
    {   System.out.println("enter existing contact");
        String name = sc.nextLine();
        contact c=m.querycontact(name);
        if(c==null)
        {  System.out.println("contact not found");}
        System.out.println("name"+c.getName()+"phone no"+c.getPhoneno());

    }
    private static void printactions() {
    System.out.println("\n available actions:\n press");
    System.out.println("0--> to shutdowwn\n" +
                           "1--->to print contacts\n"+
                        "2-->to add new contact\n"+
                        "3-->to update existing contact\n"+
                        "4---> to remove contact from mobilephone\n" +
            "5-->query if an existing contact\n"+
            "6-->to print a list of available contacts.");
    System.out.println("coose your actions");

    }

    private static void startphone() {
    System.out.println("phone is starting....");

    }

}