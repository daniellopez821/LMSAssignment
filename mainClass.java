
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

        System.out.println("Menu:\n1.Enter your file\n2.Enter user info\n3.Delete a record\n4.Print record List\n5.Quit");
        option = sc.nextInt();
        sc.nextLine();

        while(option != 5){
            switch(option){
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
                    for (RecordList record : records){
                        System.out.println(record.toString());
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Menu:\n1.Enter your file\n2.Enter user info\n3.Delete a record\n4.Print record List\n5.Quit");
            option = sc.nextInt();
            sc.nextLine();
        }
    }
}
