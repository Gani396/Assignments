package one;
import java.util.*;
import one.Contact.gender;

public class ContactTest {



 
public static void main(String[] args)
    {
        Map<Long,Contact> map = new HashMap<>();
        Contact c1 = new Contact("Ganesh","ganesh@gmail.com",gender.male);
        Contact c4 = new Contact("thilak","th@gmail.com",gender.male);
        map.put((long) 12345678l, c1);
        map.put((long) 1234560778l, c4);
        
        
        System.out.println("Keys");
        Set<Long> keys=map.keySet();
        for(long key:keys) {
            System.out.println(key);
        }
        
        System.out.println("");
        System.out.println("Values");
        Collection<Contact> values= map.values();
        for(Contact value:values) {
            System.out.println(value);
        }
        
        System.out.println(" ");
        System.out.println("Key and values");
        for(Map.Entry m : map.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue().toString());    
           }  
        
    }


}