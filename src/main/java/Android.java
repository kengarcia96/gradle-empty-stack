public class Android extends Mobile {

    public Android(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call (String message){

        if (message.length() <10){
            System.out.println("<Android>Message : " + message);
        }

        else{
            System.out.println("<Android> Message cannot be sent");
        }
    }

}
