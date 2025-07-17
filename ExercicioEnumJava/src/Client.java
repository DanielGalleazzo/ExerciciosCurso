import java.util.Date;
import java.util.Locale;

public class Client {
    protected String name;
    protected String email;
    protected Date birthDate;

    public Client (String name, String email, Date birthDate){
        this.birthDate = birthDate;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}

