import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import org.w3c.dom.*;

class XML_Reader
{
    
    String xml_name;

    XML_Reader()
    {
        xml_name=" ";
    }
    XML_Reader(String xml)
    {
        xml_name=xml;
    }

    public void ReadXML()
    {
        try
        {
            DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
            DocumentBuilder builder= factory.newDocumentBuilder(); 
            Document doc= builder.parse(new File(xml_name));
            
            NodeList nodes_list=doc.getElementsByTagName("ship");
            
            for(int i=0;i<nodes_list.getLength();++i)
            {
                Element el=(Element)nodes_list.item(i);
                String id=el.getElementsByTagName("id").item(0).getTextContent();
                String name=el.getElementsByTagName("name").item(0).getTextContent();
                String type=el.getElementsByTagName("name").item(0).getTextContent();
                String max_speed=el.getElementsByTagName("name").item(0).getTextContent();
                String crew_size=el.getElementsByTagName("name").item(0).getTextContent();
                System.out.printf("Id: %s, Name: %s, Type: %s, Max size: %s, Crew size: %s\n", id,name,type,max_speed,crew_size);
                
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }


      

    }

}
