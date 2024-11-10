import java.io.*;

class FWriter
{
        
        String filePath_string;
        
        FWriter(String filePath)
        {
            filePath_string=filePath;
        }

        public void Write(Vehicle obj1)
        {
            try(BufferedWriter bWr= new BufferedWriter(new FileWriter(filePath_string)))
            {
                 bWr.write("Id: "+obj1.id_str+'\n'+"Name: "+obj1.name_str+'\n'+"Type: "+obj1.type_str+'\n'+"Max speed: "+obj1.max_speed_d+'\n'+"Crew size: "+obj1.crew_size_i+'\n');
            }
            catch(IOException e)
            {
                 System.out.println(e);
            }

        }
        

}
