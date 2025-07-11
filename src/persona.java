public class persona {
    
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    
    public persona() {
    }

    public persona(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public persona(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //set
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return  String.format("Person: fullName=%s %s, email=%s, phone=%s",
                firstName, lastName, email, phoneNumber);
      
    }

    

}
