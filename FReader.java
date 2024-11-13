import java.util.Scanner;
import java.io.*;
import java.lang.NumberFormatException;

class FReader
{

    private String _filePath;

    FReader()
    {
        _filePath=" ";        
    }

    FReader(String filePath)
    {
        _filePath=filePath;   
    }

    public void ReadFile(List list)
    {
        try(BufferedReader bReadF=new BufferedReader(new FileReader(_filePath)))
        {
            Ship shp;
            Integer size=Integer.parseInt(bReadF.readLine());
            String tmpStr;
            String[] fields; 
            for(int i=0;i<size.intValue();++i)
            {
                tmpStr=bReadF.readLine();      
                fields= tmpStr.split(" ");
                Integer crew_size;
                try
                {
                    crew_size=Integer.parseInt(fields[4]);
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Incorrect input");
                    crew_size=0;
                }

                Double max_speed;
                try
                {
                    max_speed=Double.parseDouble(fields[3]);
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Incorrect input");
                    max_speed=Double.valueOf(0);
                }

                shp=new Ship(fields[0],fields[1],fields[2],max_speed,crew_size);
                list.add(shp);
            }
        }
        catch(IOException e)
        {
            System.out.println(e);    
        }        
    }
    public void ReadConsole(List list,Scanner scanner)
    {
        try
        {
            Ship shp;
            
            System.out.println("Enter the number");
            Integer size=Integer.parseInt(scanner.nextLine());
            String tmpStr;
            String[] fields; 
            System.out.println("Enter characteristics(5): ");
            for(int i=0;i<size.intValue();++i)
            {
                tmpStr=scanner.nextLine();      
                fields= tmpStr.split(" ");
                Integer crew_size;
                try
                {
                    crew_size=Integer.parseInt(fields[4]);
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Incorrect input");
                    crew_size=0;
                }

                Double max_speed;
                try
                {
                    max_speed=Double.parseDouble(fields[3]);
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Incorrect input");
                    max_speed=Double.valueOf(0);
                }

                shp=new Ship(fields[0],fields[1],fields[2],Double.parseDouble(fields[3]),Integer.parseInt(fields[4]));
                list.add(shp);
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
 
    }

}







