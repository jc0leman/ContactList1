/**
 * A class that stores subclasses of Person as a contact list.
 * The user is presented with a menu of options and may add, sort,
 * search, or list the contacts.
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick
 * @version: 2022-2023
 */

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;



/**
 * Jackson Coleman 1/19
 * Written for MR Blick E Block
 */
public class ContactList {

    // TODO: Create your array contacts
    //arraylist of people to solve
    private ArrayList<Person> Humans = new ArrayList<Person>();
    Scanner s = new Scanner(System.in);

    // TODO: Write a Constructor
    //empty constructor
    public ContactList() {
    }

    //prints out game instructions
    public void printMenuOptions() {


        System.out.println("Menu: ");
        System.out.println("1. Add Contact");
        System.out.println("2. List All Contacts By First Name");
        System.out.println("3. List All Contacts By Last Name");
        System.out.println("4. List All Contacts By Phone Number");
        System.out.println("5. List All Students");
        System.out.println("6. Search By First Name");
        System.out.println("7. Search By Last Name");
        System.out.println("8. Search by Phone Number");
        System.out.println("0. Exit");


    }

    /**
     * Asks user for input to create and add a new Person
     * to the contact list
     */

    public void addContact() {
        // add contact method
        //asks what type of contact you want to create

        System.out.println("Select a type of Contact to add");
        System.out.println("1. Student");
        System.out.println("2. Grandparent");
        int i = s.nextInt();
        System.out.println("Please fill out the following information");
        System.out.println("First name:");
        String firstName = s.next();
        System.out.println("Last Name:");
        String lastName = s.next();
        System.out.println("Phone Number: ");
        String phoneNumber = s.next();
        //if select 1 create student curstudent and use that for student constructor
        if (i == 1) {
            System.out.println("Grade: ");
            int grade = s.nextInt();
            Person curStudent = new Student(firstName, lastName, phoneNumber, grade);
            Humans.add(curStudent);

        }
        if (i == 2) {
            // //if select 2 create student curgrandparent and use that for student constructor
            System.out.println("Age: ");
            int age = s.nextInt();
            Person curGrandparent = new Grandparent(firstName, lastName, phoneNumber, age);

            Humans.add(curGrandparent);
        }

    }

    /**
     * Loops through and prints all contacts
     */
    public void printContacts() {
        //prints all people in the array
        for (int i = 0; i < Humans.size(); i++) {
            System.out.println(Humans.get(i));
        }
        // TODO: Complete the printContacts method
    }

    /**
     * Bubble sorts the contacts in the list by firstName,
     * lastName, or phoneNumber
     *
     * @param sortBy: 0=firstName, 1=lastName, 2=phoneNumber
     */
    public void sort(int sortBy) {
        // TODO: Complete the sort method

        //if you select sort by first name
        if (sortBy == 0) {

            //starts out of order
            //greater than one so we dont have compile issues
            if (Humans.size() > 1) {
                for (int i = 0; i < (Humans.size() - 1); i++) {
                //go through array, and if 2 out of order
                for (int j = 0; j < (Humans.size() - 1); j++) {
                    String p1 = Humans.get(j).getFirstName();
                    String p2 = Humans.get(j + 1).getFirstName();
                    //swaps index if the current I is greater than the previous I
                    if (p1.compareTo(p2) > 0) {
                        //this makes sure the two get swapped
                        Humans.add(j + 2, Humans.get(j));
                        Humans.remove(j);
                    }
                    //more efficent solution methods

                }}
            }
        printContacts();
            if (Humans.size() == 1) {
                printContacts();}


        }


        if (sortBy == 1) {

            //starts out of order
            //greater than one so we dont have compile issues
            if (Humans.size() > 1) {
                for (int i = 0; i < (Humans.size() - 1); i++) {
                    //go through array, and if 2 out of order
                    for (int j = 0; j < (Humans.size() - 1); j++) {
                        String p1 = Humans.get(j).getLastName();
                        String p2 = Humans.get(j + 1).getLastName();
                        //swaps index if the current I is greater than the previous I
                        if (p1.compareTo(p2) > 0) {
                            //this makes sure the two get swapped
                            Humans.add(j + 2, Humans.get(j));
                            Humans.remove(j);
                        }
                        //more efficent solution methods

                    }}
            }
            printContacts();
            if (Humans.size() == 1) {
                printContacts();}


        } if (sortBy == 2) {

            //starts out of order
            //greater than one so we dont have compile issues
            if (Humans.size() > 1) {
                for (int i = 0; i < (Humans.size() - 1); i++) {
                    //go through array, and if 2 out of order
                    for (int j = 0; j < (Humans.size() - 1); j++) {
                        String p1 = Humans.get(j).getPhoneNumber();
                        String p2 = Humans.get(j + 1).getPhoneNumber();
                        //swaps index if the current I is greater than the previous I
                        if (p1.compareTo(p2) > 0) {
                            //this makes sure the two get swapped
                            Humans.add(j + 2, Humans.get(j));
                            Humans.remove(j);
                        }
                        //more efficent solution methods but I used bubble sort

                    }}
            }
            printContacts();
            if (Humans.size() == 1) {
                printContacts();}


        }

    }


    /**
     * Lists just the Student objects in the Contact List
     */
    public void listStudents() {
        //checks for students and prints them
        for(int i = 0; i < Humans.size(); i++)
        {
            if(Humans.get(i) instanceof Student)
            {
                System.out.println(Humans.get(i));
            }
        }
        // TODO: Complete the listStudents method
    }

    /**
     * Loops providing menu options to the user
     * until the user exits
     */
    public void run() {


        System.out.println("Welcome to your Contacts List");
        System.out.println("Please pick from the following menu options");
        printMenuOptions();
        int dirNum = s.nextInt();
       //until user decides to end the program the thing will continously prompt the user

        while(dirNum!= 0){


        if(dirNum == 1)
        {
            addContact();

        }
        if(dirNum == 2) {
            sort(0);
        }
        if(dirNum == 3)
        {
            sort(1);
        }
        if(dirNum == 4)
            sort(2);
        if(dirNum == 5)
        {
            listStudents();
        }
        if(dirNum == 6)
        {
            System.out.println("Enter your first name you seek to find: ");
            String first = s.next();
            System.out.println(searchByFirstName(first));
        }
        if(dirNum == 7)
        {
            System.out.println("Enter your last name you seek to find: ");
            String last = s.next();
            System.out.println(searchByLastName(last));
        }
        if(dirNum == 8)
        {
            System.out.println("Enter the Phone number you seek to find");
            String phone = s.next();
            System.out.println(searchByPhoneNumber(phone));
        }
            printMenuOptions();
        dirNum = s.nextInt();





        // TODO: Complete the run method
        }
    }
    public Person searchByFirstName(String firstName)
    {
        //checks to see if string is equal to any first name
        for(int i = 0; i < Humans.size(); i++)
        {
            if(Humans.get(i).getFirstName().equals(firstName))
            {
                return Humans.get(i);
            }
        }
        return null;
    }
    public Person searchByLastName(String lastName)
    {
        //checks to see if string is equal to any last name
        for(int i = 0; i < Humans.size(); i++)
        {
            if(Humans.get(i).getLastName().equals(lastName))
            {
                return Humans.get(i);
            }
        }
        return null;
    }
    public Person searchByPhoneNumber(String phoneNumber)
    {
        //checks to see if string is equal to any phone number
        for(int i = 0; i < Humans.size(); i++)
        {
            if(Humans.get(i).getPhoneNumber().equals(phoneNumber))
            {
                return Humans.get(i);
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        //calls run is the main function
        ContactList cl = new ContactList();
        cl.run();
    }
}

