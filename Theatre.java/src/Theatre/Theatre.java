
import java.util.Arrays;
import java.util.Scanner;

public class Theatre {
    public static Scanner input = new Scanner(System.in);

    //Create 3 arrays to keep track of sold and free seats
    public static int[] seatsRow1 = new int[]{};
    public static int[] seatsRow2 = new int[]{};
    public static int[] seatsRow3 = new int[]{};

    public static void main(String[]args){
        System.out.println();
        System.out.println("Welcome to the New Theatre");
        //Display menu and prompt for user input
        while (true) {
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("\nPlease enter your option: ");
            System.out.println("1) Buy a ticket");
            System.out.println("2) Print seating area");
            System.out.println("3) Cancel ticket");
            System.out.println("4) List available seats");
            System.out.println("5) Save to file");
            System.out.println("6) Load from file");
            System.out.println("7) Print ticket information and total price");
            System.out.println("8) Sort tickets by price");
            System.out.println("    0)Quit");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Enter option: ");
            int option = input.nextInt();

            //Handle user input
            switch (option) {
                case 0:
                    System.out.println("Thank you for using the Theatre program!");
                    break;
                case 1:
                    buy_ticket();
                    break;
                case 2:
                    print_seating_area();
                    break;
                case 3:
                    cancel_ticket();
                    break;
                case 4:
                    show_available();
                    break;
                case 5:
                    //save();
                    break;
                case 6:
                    //load();
                    break;
                case 7:
                    //show_tickets_info();
                    break;
                case 8:
                    //sort_tickets();
                    break;
                default:
                    System.out.println("Invalid enter please try again. ");
                    break;
            }
        }
    }

    static void buy_ticket() {
        System.out.print("Enter the row number: ");
        int numRow = input.nextInt();
        if (numRow > 0 && numRow < 4) {
            switch (numRow) {
                case 1 -> {
                    System.out.print("There are 12 seats.Please enter seat number: ");
                    int Row1Seat = input.nextInt();
                    if (Row1Seat > 0 && Row1Seat < 13) {
                        System.out.println("This seat is already booked");
                    } else seatsRow1[Row1Seat] = 1;
                    System.out.println();
                    System.out.println("You booked your seat");
                    System.out.println();
                    System.out.println(Arrays.toString(seatsRow1));

                }
                case 2 -> {
                    System.out.println("There are 16 seats.Please enter seat number: ");
                    int Row2Seat = input.nextInt();
                    if (Row2Seat > 0 && Row2Seat < 17) {
                        System.out.println("This seat is already booked");
                    } else seatsRow2[Row2Seat] = 1;
                    System.out.println();
                    System.out.println("You booked your seat");
                    System.out.println();
                }

                case 3 -> {
                    System.out.println("There are 20 seats.Please enter seat number: ");
                    int Row3seat = input.nextInt();
                    if (Row3seat > 0 && Row3seat < 21) {
                        System.out.println("This seat is already booked");
                    } else seatsRow3[Row3seat] = 1;
                    System.out.println();
                    System.out.println("You booked your seat");
                    System.out.println();
                }
                default -> System.out.println("Entered row number is incorrect");
            }
        } else {
            System.out.println("Number you entered is wrong.");
        }
    }
    static void print_seating_area() {
        System.out.print(" ");
        System.out.println("***********");
        System.out.print(" ");
        System.out.println("*  STAGE  *");
        System.out.print(" ");
        System.out.println("***********");
        System.out.print(" ");

        for (int i = 0; i < seatsRow1.length; i++) {
            if (seatsRow1 [i]== 0) {
                System.out.print("O");
            }else System.out.print("X");
            if(i==5){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.print(" ");
        for(int i = 0; i < seatsRow2.length; i++){
            if (seatsRow2[i]==0) {
                System.out.print("O");
            }else System.out.print("X");
            if (i==7){
                System.out.print(" ");

            }
        }
        System.out.println();
        for (int i = 0; i < seatsRow3.length; i++){
            if (seatsRow3[i]==0){
                System.out.print("O");
            }else System.out.print("X");
            if (i==9){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println();
    }

    static void cancel_ticket() {
        System.out.println();
        System.out.println("Cancellation");
        System.out.println();
        System.out.print("Enter your row number: ");
        int RowNum = input.nextInt();
        if (RowNum > 0 && RowNum < 4) {
            switch (RowNum) {
                case 1 -> {
                    System.out.print("Enter the seat number: ");
                    int Row1Seat = input.nextInt();
                    if (Row1Seat > 0 && Row1Seat < 13) {
                        if (seatsRow1[Row1Seat - 1] == 1) {
                            seatsRow1[Row1Seat - 1] = 0;
                            System.out.println();
                            System.out.print("Cancellation is successful");
                        } else {
                            System.out.println();
                            System.out.println("This seat is not booked");
                        }
                    } else System.out.println("Entered number is incorrect");
                }
                case 2 -> {
                    System.out.print("Enter the seat number: ");
                    int Row2Seat = input.nextInt();
                    if (Row2Seat > 0 && Row2Seat < 17) {
                        if (seatsRow2[Row2Seat - 1] == 1) {
                            seatsRow2[Row2Seat - 1] = 0;
                            System.out.println();
                            System.out.println("Cancellation is successful");
                        } else {
                            System.out.println();
                            System.out.println("This seat is not booked");
                        }
                    } else System.out.println("Entered number is incorrect");
                }
                case 3 -> {
                    System.out.print("Enter the seat number: ");
                    int Row3Seat = input.nextInt();
                    if (Row3Seat > 0 && Row3Seat < 21) {
                        if (seatsRow3[Row3Seat - 1] == 1) {
                            seatsRow3[Row3Seat - 1] = 0;
                            System.out.println();
                            System.out.println("Cancellation is successful");
                        } else {
                            System.out.println();
                            System.out.println("This seat is not booked");
                        }
                    } else System.out.println("Entered number is incorrect");
                }
                default -> {
                    System.out.println();
                    System.out.println("Entered number is incorrect");
                }
            }
        } else System.out.println("Entered number is incorrect");
        System.out.println();
    }
    private static void show_available() {
        System.out.println("Seats available in row 1: ");
        int ROW1 = input.nextInt();
        for (int i = 0; i < ROW1; i++) {
            if (i==0) {
                System.out.print(i + 1);
            }
        }
        System.out.println("Seats available in row 2:");
        int ROW2 = input.nextInt();
        for (int i = 0; i < ROW2; i++) {
            if (i==0) {
                System.out.print(i + 1);
            }
        }
        System.out.println("Seats available in row 3: ");
        int ROW3 = input.nextInt();
        for (int i = 0; i < ROW3; i++) {
            if (i==0) {
                System.out.print(i + 1);
            }
        }
    }
}















































