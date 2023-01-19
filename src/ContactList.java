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

/**CONTACT LIST NEEDS A COMPARE TO
 * a.compareTo(b) < 0 a comes before b
 * works for length to dog before doggie
 */

public class ContactList
{

    // TODO: Create your array contacts
    private ArrayList<Person> Humans = new ArrayList<Person>();
    Scanner s = new Scanner(System.in);
    // TODO: Write a Constructor
    public ContactList(){}

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
        //changed this from void addContact
        // TODO: Complete the addContact method

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

        if(i == 1)
        {
            System.out.println("Grade: ");
            int grade = s.nextInt();
            Person curStudent = new Student(firstName,lastName, phoneNumber, grade);
            Humans.add(curStudent);

        } if(i == 2)
        {
            System.out.println("Age: ");
            int age = s.nextInt();
            Person curGrandparent = new Grandparent(firstName,lastName, phoneNumber, age);

            Humans.add(curGrandparent);
        }

    }

    /**
     * Loops through and prints all contacts
     */
    public void printContacts() {
        for(int i = 0; i < Humans.size(); i++)
        {
            System.out.println(Humans.get(i));
        }
        // TODO: Complete the printContacts method
    }

    /**
     * Bubble sorts the contacts in the list by firstName,
     * lastName, or phoneNumber
     * @param sortBy: 0=firstName, 1=lastName, 2=phoneNumber
     */
    public void sort(int sortBy) {
        // TODO: Complete the sort method
        if (sortBy == 0) {
            boolean inOrder = false;
            if (Humans.size() != 0)
                while (!inOrder) {
                    for (int i = 0; i < (Humans.size() - 1); i++) {
                        String p1 = Humans.get(i).getFirstName();
                        String p2 = Humans.get(i + 1).getFirstName();
                        //swaps index if the current I is greater than the previous I
                        if (p1.compareTo(p2) > 0) {
                            Humans.add(i + 2, Humans.get(i));
                            Humans.remove(i);
                        } else {
                            inOrder = true;
                        }
                    }
                }
       }
        if (sortBy == 1) {
            boolean inOrder = false;
            if (Humans.size() != 0)
                while (!inOrder) {
                    for (int i = 0; i < (Humans.size() - 1); i++) {
                        String p1 = Humans.get(i).getLastName();
                        String p2 = Humans.get(i + 1).getLastName();
                        //swaps index if the current I is greater than the previous I
                        if (p1.compareTo(p2) > 0) {
                            Humans.add(i + 2, Humans.get(i));
                            Humans.remove(i);
                        } else {
                            inOrder = true;
                        }
                    }
                }
            }
        if (sortBy == 2) {
            boolean inOrder = false;
            if (Humans.size() != 0)
                while (!inOrder) {
                    for (int i = 0; i < (Humans.size() - 1); i++) {
                        String p1 = Humans.get(i).getPhoneNumber();
                        String p2 = Humans.get(i + 1).getPhoneNumber();
                        //swaps index if the current I is greater than the previous I
                        if (p1.compareTo(p2) > 0) {
                            Humans.add(i + 2, Humans.get(i));
                            Humans.remove(i);
                        } else {
                            printContacts();
                            inOrder = true;
                        }
                    }
                }
            }

    }

    // TODO: Write searchByFirstName

    // TODO: Write searchByLastName

    // TODO: Write searchByPhoneNumber

    /**
     * Lists just the Student objects in the Contact List
     */
    public void listStudents() {
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
        // scan = new Scanner(System.in);

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
            printMenuOptions();
        dirNum = s.nextInt();





        // TODO: Complete the run method
        }
    }


    public static void main(String[] args)
    {
        ContactList cl = new ContactList();
        cl.run();
    }
}

