package one;
public class Contact
{
    String name;
    String email;
    long phoneNo;
    enum gender { male , female};
    gender gen;
    
    public Contact(String name, String email, gender gen) {
        super();
        this.name = name;
        this.email = email;
        this.gen = gen;
    }



   @Override
    public String toString() {
        return "Contact [name=" + name + ", email=" + email + ", gen=" + gen + "]";
   }
}

