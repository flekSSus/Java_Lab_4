import java.io.*;

class Main
{
    public static void main(String [] args)
    {

        String filePath="input.txt";
        FReader fr = new FReader(filePath);
        
        List ships=new List();

        fr.ReadFile(ships);

//        try(FileWriter fw=new FileWriter("output.txt"))
//        {
        OutputStreamWriter ostr=new OutputStreamWriter(System.out);
             ships.get(0).GetInfo(ostr);
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
    }
}
