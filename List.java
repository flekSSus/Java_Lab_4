import java.util.ArrayList;
import java.util.AbstractList;

class List extends AbstractList<Vehicle>
{
    ArrayList<Vehicle> arr_vehicle= new ArrayList<Vehicle>();

    @Override
    public int size()
    {
        return arr_vehicle.size();  
    }

    @Override
    public Vehicle set(int index,Vehicle obj)
    {
        return arr_vehicle.set(index,obj);   
    }

    @Override
    public boolean add(Vehicle obj1)
    {
        return arr_vehicle.add(obj1);   
    }
    @Override
    public void clear()
    {
        arr_vehicle.clear();  
    }
    boolean contains(Vehicle obj1)
    {
        return arr_vehicle.contains(obj1);  
    }
    @Override
    public Vehicle get(int i)
    {
        return arr_vehicle.get(i); 
    }
    @Override
    public Vehicle remove(int i)
    {
        return arr_vehicle.remove(i);  
    }
   
}
