import java.io.*;

class FReader
{

    Validator valid1=new Validator();
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
                if(!valid1.IS_MORE_ZERO(Integer.parseInt(fields[4])))
                {
                    throw valid1;
                }
                if(!valid1.IS_MORE_ZERO(Integer.parseInt(fields[3])))
                {
                    throw valid1;
                }
                
                shp=new Ship(fields[0],fields[1],fields[2],Double.parseDouble(fields[3]),Integer.parseInt(fields[4]));
                list.add(shp);
            }
        }
        catch(IOException e)
        {
            System.out.println(e);    
        }        
        catch(Validator v)
        {
            System.out.println("Incorrect input");    
            return;
        }
    }
    public void ReadConsole(List list)
    {
        try(BufferedReader bRead=new BufferedReader(new InputStreamReader(System.in)))
        {
            Ship shp;
            
            System.out.println("Enter the number");
            Integer size=Integer.parseInt(bRead.readLine());
            String tmpStr;
            String[] fields; 
            System.out.println("Enter characteristics(5): ");
            for(int i=0;i<size.intValue();++i)
            {
                tmpStr=bRead.readLine();      
                fields= tmpStr.split(" ");
                if(!valid1.IS_MORE_ZERO(Integer.parseInt(fields[4])))
                {
                    throw valid1;
                }
                if(!valid1.IS_MORE_ZERO(Integer.parseInt(fields[3])))
                {
                    throw valid1;
                }
                shp=new Ship(fields[0],fields[1],fields[2],Double.parseDouble(fields[3]),Integer.parseInt(fields[4]));
                list.add(shp);
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        catch(Validator e)
        {
            System.out.println("Incorrect input");
        }



    }

}







