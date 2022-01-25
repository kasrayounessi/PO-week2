public class PinValidator {

    public boolean validatePin(String pin){
        if(pin.matches("\\d+") && (pin.length()==4 || pin.length() == 6))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        PinValidator pv = new PinValidator();
        System.out.println(pv.validatePin("121317"));
        System.out.println(pv.validatePin("1234"));
        System.out.println(pv.validatePin("45135"));
        System.out.println(pv.validatePin("89abc1"));
        System.out.println(pv.validatePin("900876"));
        System.out.println(pv.validatePin(" 4938"));
    }
}
