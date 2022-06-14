import java.util.Scanner;
class atm {
    public static void main(String args[])
    {
        int pinNo = 4170;
        boolean bool = true;
        int option;
        int balanceRem = 100000;
        int withdrawAmt= 0;
        int depositAmt = 0;
        int transferAmt = 0;
        int temp; 
        System.out.println("                                 WELCOME TO OIB ATM SYSTEM\n \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the ATM Card");
        System.out.println("Enter correct credentials");
        System.out.print("Enter 4 Digit Pin Code: ");
  
        int code = sc.nextInt();
        if(pinNo == code)
        {
            while(bool)
            {
            System.out.println("Select a option");
            System.out.println(" 1.Transaction Data\n 2.Withdraw\n 3.Deposit\n 4.Transfer\n 5.EXIT");
            option = sc.nextInt();
            switch(option)
            {
                case 1: 
                System.out.println(" HISTORY ");
                System.out.println(" Available Balance: " + balanceRem);
                break;

                case 2:
                System.out.print("Enter the withdrawl amount:");
                temp = sc.nextInt();
                if(temp>balanceRem)
                {
                    System.out.println("Cannot withdraw the amount");
                }
                else{
                    withdrawAmt += temp; 
                    balanceRem -= temp;
                    System.out.println(" ----- COLLECT YOUR CASH ----- ");
                    System.out.println(balanceRem + " is remanining balance in your account ");

                }
                break;

                case 3:
                System.out.print("Enter the Deposit Amount:");
                temp = sc.nextInt();
                System.out.println("PLACE YOUR CASH CAREFULLY IN THE CASH DEPOSIT SLOT");
                depositAmt += temp;
                balanceRem += temp;
                System.out.println("Current Balance: " + balanceRem);
                break;

                case 4:
                while(true)
                {
                System.out.println("Enter the account number of the beneficiary");
                int accNo = sc.nextInt(); 
                System.out.println("Enter the IFSC code of the bank of the beneficiary"); 
                String ifscCode = sc.next(); 
                System.out.println(accNo);
                System.out.println("Please confirm the account number of the beneficiary");
                System.out.println("1. Yes\n 2. No");  
                int select= sc.nextInt(); 
                if(select == 1)
                {
                    System.out.println("Fund Transfer:");
                    temp = sc.nextInt();
                    transferAmt += temp;
                    balanceRem -= temp;
                    System.out.println("Fund transferred successfully");
                    break;
                }
                else{
                    System.out.println("Invalid account number");
                }
                }       
                break;

                case 5:
                System.out.println(" -----THANK YOU FOR BANKING WITH US----- ");
                bool = false;
                break;
            }
        }
        }
        else
        {
            System.out.println("Oops, you have entered the wrong pin");
        }
    }
}