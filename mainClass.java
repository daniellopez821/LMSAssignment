
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) throws IOException {

        /* This is the arraylist that will store all the data for the records list*/
        ArrayList<RecordList> records = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int option;
        String iD;
        String name;
        String address;
        String overdueBalance;

        /*Here is the starting point for the user menu in the console*/
        System.out.println("Menu:\n1.Enter your file\n2.Enter user info\n3.Delete a record\n4.Print record List\n5.Quit");
        option = sc.nextInt();
        sc.nextLine();

        /*Here is a loop that will continue to run until the user enters 5 to quit the program*/
        while(option != 5){
            switch(option){

                /*Case 1 is the option to enter a file and add its contents to the record list. Had to research how
                * to read files and find example code to assist me in coding portion. After I was successful, I had
                * to research how to use delimiters properly, so I do not run into errors on my original code
                * Had to complete multiple coding attempts at using delimiter to ensure it did exactly what it should.*/
                case 1:
                    System.out.println("Enter your file:");
                    String fileName = sc.nextLine();

                    File file = new File(fileName);

                    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                        String line;

                        while ((line = br.readLine()) != null) {
                            String[] words = line.split("-");
                            records.add(new RecordList(words[0], words[1], words[2], words[3]));
                        }
                    }
                    break;
                case 2:

                    /*In case 2 this is the option to manually enter a record into the LMS. This part was not difficult
                    * since I had to do this a lot in other classes*/
                    System.out.println("Enter the ID:");
                    iD = sc.nextLine();

                    System.out.println("Enter the name:");
                    name = sc.nextLine();

                    System.out.println("Enter the address:");
                    address = sc.nextLine();

                    System.out.println("Enter the overdue balance:");
                    overdueBalance = sc.nextLine();

                    records.add(new RecordList(iD, name, address, overdueBalance));
                    break;
                case 3:

                    /*Case 3 is the option to delete a record by the ID. Ran into the most problems here because
                    * The system would receive the input from the user but never actually delete the record from
                    * the record list at first. Had to research different examples of deleting elements from
                    * an arraylist to finally find the right code that would delete the element once the ID is
                    * found
                    * */
                    String userInput;
                    System.out.println("Enter the ID you want to delete:");
                    userInput = sc.next();

                    for (int i = 0; i < records.size(); i++){
                        if (records.get(i).getiD().equals(userInput)){
                            records.remove(i);
                        }
                    }
                    break;
                case 4:

                    /*Case 4 is just the option to print the record list. This portion was fairly simple
                    * since I had to run this code a lot during testing.*/
                    for (RecordList record : records){
                        System.out.println(record.toString());
                    }
                    break;
                default:
                    break;
            }

            /*At the end of the code, I added the menu prompt again so the user can keep running the code until
            * they enter 5 and choose to terminate the program*/
            System.out.println("Menu:\n1.Enter your file\n2.Enter user info\n3.Delete a record\n4.Print record List\n5.Quit");
            option = sc.nextInt();
            sc.nextLine();
        }
    }
}
