public class User{


  public String name ;
  public int phone_number ;
  protected String email ;
  protected int pass ;
   protected int Id ;



    public User(String name , int phone_number ,String email,int pass,int Id) {
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
        this.pass =pass ;
        this.Id =Id ;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
