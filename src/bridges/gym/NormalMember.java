package bridges.gym;

public class NormalMember extends Member {

    public NormalMember(){
        System.out.println("Child Constructor with no parameters");
    }
    // super to call parent class for constructor WITH parameters
    public NormalMember(String pName, int pMemberID, int pMemberSince){
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child Constructor with 3 parameters.");
    }

    // overriding the parent class method for Annual Fee Calculation (Polymorphism)
    @Override
    public void calculateAnnualFee() {
        annualFee = (1-0.01 * getDiscount()) * (100 + 12*30);
    }
}
