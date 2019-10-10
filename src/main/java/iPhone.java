public class iPhone extends Mobile {

    public iPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call (String message){
        if (message.length() < 15){
            System.out.println("<iPhone>Message : " + message);
        }

        else{
            System.out.println("<iPhone> Message cannot be sent");
        }
    }


}
