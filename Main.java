import java.util.Collections;
import java.util.Iterator;
import java.io.*;
import java.util.Scanner;

class Main
{
    public static void main(String [] args) throws IOException
    {

        List ships=new List();

        Scanner scanner = new Scanner(System.in);
        int choice=1;


        do {
            System.out.println("\nMenu:");
            System.out.println("1. Read from file");
            System.out.println("2. Read from console");
            System.out.println("3. Write in file");
            System.out.println("4. Write in console");
            System.out.println("5. Remove element");
            System.out.println("6. Output using iterators");
            System.out.println("7. Sort by name");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine(); 
                continue; 
            }

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
                    break;
                }
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
                {
                    BufferedReader br2= new BufferedReader(new InputStreamReader(System.in));
                    String id=" ";

                    System.out.print("Enter id of element: ");
                    id=br2.readLine();
                    if(ships.containsID(id))
                    {
                        ships.remove(ships.indexOf_ID(id));
                    }
                    else
                    {
                        System.out.println("No such element");
                    }
                }
                    break;
                case 6:
                {
                    Iterator<Vehicle> begin= ships.iterator();

                    System.out.println("Ships: \n");
                    while(begin.hasNext())
                    {
                        System.out.println(begin.next());
                    }
                }
                case 7:
                {
                    Collections.sort(ships,(o1,o2)->o1.Get_Name().compareTo(o2.Get_Name()));
                    System.out.println("Success!");
                }

                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);


        scanner.close();

    }
}
