public class iPhoneRobot {

        private Mobile mobile;

        public void setMobile(Mobile mobile) {
            this.mobile = mobile;
        }

        public void checkMobile(){
            if (mobile instanceof iPhone){
                System.out.println("This is an iPhone.");
            }

           else{
                System.out.println("This is not an iPhone.");
            }
        }

}



