public class Encapsulation {
    private String password,username;

    public Encapsulation(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public String getPassword(){
        return password;
    }
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


