/**
 * A subclass of Person that represents a Student
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick
 * @version: 2022-2023
 */

public class Student extends Person {
    private int grade;
    //student has a first name a last name and grade  and get methods it also has a to string method that overides person

    public Student(String firstName, String lastName, String phoneNumber, int grade)
    {
        super(firstName, lastName, phoneNumber);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String getFirstName() {
        return super.getFirstName();

    }
    public String getLastName() {
        return super.getLastName();
    }



    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }
@Override
    public String toString()
    {
        return super.toString() + " Grade:" + grade;
    }

// TODO: Modify and complete this class
}

