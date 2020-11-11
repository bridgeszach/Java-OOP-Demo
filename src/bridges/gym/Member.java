package bridges.gym;
import java.util.Scanner;
import java.lang.System;


abstract public class Member {

    public Member() {
        System.out.println("Parent Constructor with no parameter.");
    }

    public Member(String pName, int pMemberID, int pMemberSince){
        System.out.println("Parent Constructor with 3 parameters");

    name = pName;
    memberID = pMemberID;
    memberSince = pMemberSince;
    }

    public String welcome = "Welcome to The Press";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(){

        Scanner input = new Scanner(System.in);
        String password;
        System.out.print("Please enter the admin password: ");
        password = input.nextLine();

        if (!password.equals("admin")){
            System.out.println("Invalid password.  You do not have authority to edit this discount.");
        } else {
            System.out.print("Please enter the discount: ");
            discount = input.nextInt();

            if (discount >= 51){
                System.out.println("INVALID: Discount cannot exceed 50%");
                System.exit(1);
            }
        }
    }

    public void displayMemInfo(){

        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Since: " + memberSince);
        System.out.println("Annual Fee: $" + annualFee);
    }

    abstract public void calculateAnnualFee();
}
