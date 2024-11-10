import java.io.*;

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
                shp=new Ship(fields[0],fields[1],fields[2],Double.parseDouble(fields[3]),Integer.parseInt(fields[4]));
                list.add(shp);
            }
        }

        catch(IOException e)
        {
            System.out.println(e);    
        }        
    }

}
