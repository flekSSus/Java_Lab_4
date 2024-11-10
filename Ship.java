import java.io.*;

class Ship extends Vehicle
{
    protected String id_str;
    protected String name_str;
    protected String type_str;
    protected double max_speed_d;
    protected int crew_size_i;
    
    Ship(String id, String name, String type, double max_speed, int crew)
    {
        id_str=id;       
        name_str=name;
        type_str=type;
        max_speed_d=max_speed;
        crew_size_i=crew;
    }
    
    @Override
    public void GetInfo(Writer obj)
    {
        try(BufferedWriter bw= new BufferedWriter(obj))
        {
            bw.write("Ship info: "+toString());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

    @Override
    public String toString()
    {
       return "\nID: "+id_str+"\nName: "+name_str+"\nType: "+type_str+"\nMax speed: "+max_speed_d+"\nCrew size: "+crew_size_i+"\n"; 
    }
        
    @Override
    public String Get_Id()
    {
        return id_str;
    }

    @Override
    public String Get_Name()
    {
        return name_str;
    }
    
    @Override
    public String Get_Type()
    {
        return type_str;  
    }

    @Override
    public double Get_Speed()
    {
        return max_speed_d;  
    }

    @Override
    public int Get_Crew_Size()
    {
        return crew_size_i;
    }

    @Override
    public void Set_Id(String id)
    {
        id_str=id;   
    }

    @Override
    public void Set_Name(String name)
    {
        name_str=name;  
    }

    @Override
    public void Set_Type(String type)
    {
        type_str=type;  
    }

    @Override
    public void Set_Speed(double max_speed)
    {
        max_speed_d=max_speed; 
    }

    @Override
    public void Set_Crew_Size(int crew_size)
    {
        crew_size_i=crew_size;   
    }



}
