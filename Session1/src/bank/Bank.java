package bank;

public class Bank {

    float rateOfInterest;
    int numberOfCustomers;
    int numberOfBranches;
    public Bank(float rateOfInterest,int numberOfCustomers,int numberOfBranches)
    {
        this.rateOfInterest=rateOfInterest;
        this.numberOfCustomers=numberOfCustomers;
        this.numberOfBranches=numberOfBranches;
    }
    void getDetails()
    {
        System.out.println("Interest rate: "+rateOfInterest+"Number Of Customers: "+numberOfCustomers+"Number Of Branches"+numberOfBranches);
    }
}

