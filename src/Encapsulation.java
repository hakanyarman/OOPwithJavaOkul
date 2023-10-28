public class Encapsulation {
    private String password,username;


    /**
     * this method is a two parameterized constructor which has password and username parameters
     * @param password
     * @param username
     */
    public Encapsulation(String password, String username) {
        this.password = password;
        this.username = username;
    }


    // public String getPassword(){
    //     return password;
    // }
    // now password is write-only. it's value can not getted.

    // read-only => if there is only get method and not set method
    // write-only => if there is only set method and not get method

    /** this method sets the password value.
     */

    // descriptions are written top of the code(class/method/attribute...)
    public void setPassword(String newPassword){
        this.password = newPassword;
    }


    public String getUsername(){
        return username;
    }

    public void setUsername(String newUsername){
        this.username = newUsername;
    }
}


