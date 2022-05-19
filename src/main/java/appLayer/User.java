package appLayer;

public class User {
    private String rusernameORemail;
    private String rpassword;
    private String rrepeatpassword;
    private String rname;
    private String rsurname;
    private String rproffesion;
    public boolean isValidUserCredentials(String susername, String spassword) {
        if (susername.equals("Vituka123") && spassword.equals("vito123")) {
            return true;
        }
        return false;
    }
    public boolean isRightPassword(String password, String repeatpassword){
        if (password.equals(repeatpassword)) {
            return true;
        }
        return false;
    }

    public String getRusernameORemail() {
        return rusernameORemail;
    }

    public void setRusernameORemail(String rusernameORemail) {
        this.rusernameORemail = rusernameORemail;
    }

    public String getRpassword() {
        return rpassword;
    }

    public void setRpassword(String rpassword) {
        this.rpassword = rpassword;
    }

    public String getRrepeatpassword() {
        return rrepeatpassword;
    }

    public void setRrepeatpassword(String rrepeatpassword) {
        this.rrepeatpassword = rrepeatpassword;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRsurname() {
        return rsurname;
    }

    public void setRsurname(String rsurname) {
        this.rsurname = rsurname;
    }

    public String getRproffesion() {
        return rproffesion;
    }

    public void setRproffesion(String rproffesion) {
        this.rproffesion = rproffesion;
    }
}
