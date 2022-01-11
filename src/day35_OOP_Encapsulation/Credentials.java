package day35_OOP_Encapsulation;

public class Credentials {
    private String username,password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }
    public boolean isStrongPassWord(String password){
        boolean result=false,letter=false,digit=false,special=false,cont=false;
        if(password.length()>7&&!password.contains(" ")){
            cont=true;
       }
        char pas[]=password.toCharArray();
        for (char each : pas) {
            if (Character.isLetter(each)){
                letter=true;
            }else if (!Character.isLetterOrDigit(each)){
                special=true;
            }else if (Character.isDigit(each)){
                digit=true;
            }
        }
        if(cont==true&&letter==true&&special==true&&digit==true){
            result=true;
        }return result;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(isStrongPassWord(password)==false){
            System.err.println("password is not strong please create again ");
            return;
        }
        this.password = password;
    }
    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
/*
create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

 */