public class Person {
    private String name;
    private Mobile mobile;

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeACall (String message){
        mobile.call(message);
    }
}
