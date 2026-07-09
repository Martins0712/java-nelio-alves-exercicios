package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date birthDate;


    public Client( String name, String email, Date birtDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birtDate;
    }

    public Date getBirtDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return   name + " " +
                sdf.format(birthDate) +  " - " +
                 email;
    }
}
