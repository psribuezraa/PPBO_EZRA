import java.text.SimpleDateFormat;
import java.util.*;

public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getname(){
        return name;
    }

    public String getEmail(){
        return email;
    }
}