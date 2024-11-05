import java.io.*;

class FReader
{

    private String _filePath;

    private FReader()
    {
        _filePath=" ";        
    }
    private FReader(String filePath)
    {
        try(BufferedReader bReadF=new bReadF(new FileReader(filePath);
        {
            
        }
        catch(IOException e)
        {
            System.out.println(e);    
        }
    }
}
