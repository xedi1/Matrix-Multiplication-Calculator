import java.util.Scanner;

public class Main {
    private double balance=1000;

    private Scanner Input;
    boolean loop = true;

    public Main(){
        Input = new Scanner(System.in);
    }


    public void Menu(){
        byte choose;
        do {
            System.out.println("\n\n======= ATM =======");
            System.out.println("1|View Balance \n2|Deposite \n3|Withdraw \n4|Exit \n|Choose:");
            choose = Input.nextByte();

            switch (choose){
                case 1:
                    System.out.printf("Balance:%.2f$",balance);
                    break;
                case 2:
                    float Deposit;
                    System.out.println("Enter Value of Depo:");
                    Deposit = Input.nextFloat();
                    balance += Deposit;
                    break;
                case 3:
                    float withdraw;
                    System.out.println("Enter Value of Withdraw:");
                    withdraw = Input.nextFloat();
                    if (withdraw<=balance){
                        balance -= withdraw;
                    }
                    else {System.err.println("Not Enough Money");}
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.err.println("Pls Enetr True Value");
            }
        }while (loop!=false);
    }

    public static void main(String[] args){
        Main Start = new Main();
        Start.Menu();
    }
}
