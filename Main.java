import java.io.*;
import java.util.Scanner;

class Main
{
    public static void main(String [] args)
    {

        List ships=new List();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Read from file");
            System.out.println("2. Read from console");
            System.out.println("3. Write in file");
            System.out.println("4. Write in console");
            System.out.println("5. Add element");
            System.out.println("6. Remove element");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                {
                    String fileName;
                    System.out.print("Enter file name: ");
                    fileName=scanner.nextLine();
                    FReader fr=new FReader(fileName); 
                    fr.ReadFile(ships);
                    System.out.println("Success!\n");
                }
                    break;
                case 2:
                {
                    FReader fr= new FReader();   
                    System.out.println("Please, enter: ");
                    fr.ReadConsole(ships);
                    System.out.println("Success!\n");
                }
                    break;
                case 3:
                {
                    String fileName;
                    System.out.print("Enter file name: ");
                    fileName=scanner.nextLine();
                    FWriter fw= new FWriter(fileName); 
                    fw.WriteFile(ships);
                    System.out.println("Success!\n");
                }
                    break;
                case 4:
                {
                    FWriter fw= new FWriter();   
                    System.out.println("Ships: ");
                    fw.WriteConsole(ships);
                    System.out.println("Success!\n");
                }
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();

//        try(FileWriter fw=new FileWriter("output.txt"))
//        {
//        OutputStreamWriter ostr=new OutputStreamWriter(System.out);
//             ships.get(0).GetInfo(ostr);
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
    }
}
