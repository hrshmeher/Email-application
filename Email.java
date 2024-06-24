import java.util.Scanner;


public class Email {

    // encapsulated variables defined below...
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity =100;
    private String alternativeEmail;
    private String companySuffix = "sleep.com";


    //Constructor to recieve first name and lastname..

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: "+ this.firstName + " "+this.lastName);

        //call a method asking for the department return the department
        this.department = setDepartment();
        System.out.println("Department : " + this.department);

        //call a method that returns a random password
        this.password =randomPassword(10);
        System.out.println("your password is " + this.password);

        //combine the elements to generate the email
        email = firstName.toLowerCase()+ " " +lastName.toLowerCase() + "@" + department +"."+ companySuffix;
        System.out.println(" YOUR EMAIL IS :" + email);
    }


    // ask for the department 
    private String setDepartment(){
        System.out.println("Enter the department\n1 for sales \n2 for development\n3 for accounting \n0 for none");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if (depChoice == 1){  return "sales"; }
        else if (depChoice == 2){   return "development";}
        else if (depChoice == 3){return "Accounting";}
        else if(depChoice == 0){return "none";}
        else{ return "please enter valid detail";}
    }
    
    // generate a random password.. 
    private String randomPassword(int length){
        String passwordSet =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$";
        char[] password = new char[length];
        for(int i = 0; i< length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
   
    //set mail box capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //set alternate email
    public void setalternateEmail(String altemail){
        this.alternativeEmail = altemail;
    }

    // change the password 
    public void changePassword(String password){
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public String getDepartment() {
        return department;
    }
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    public String getAlternativeEmail() {
        return alternativeEmail;
    }
    public String ShowInfo(){
        return "Display Name :" + firstName + " "+ lastName+
                "Company Email : "+ email +
                "Mailbox Capacity: "+ mailboxCapacity + "mb";

    }

    
    
}