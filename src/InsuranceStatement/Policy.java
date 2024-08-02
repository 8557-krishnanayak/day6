package InsuranceStatement;

public class Policy {

    private final String policyNumber;
    private String policyHolderName;
    private double premiumAmount;

    public Policy(String policyNumber, String policyHolderName, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.premiumAmount = premiumAmount;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyHolderName='" + policyHolderName + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}
