//SSID, name, and phone number (should start with +2010, +2011, or +2012).
package vodafone;
public final class Customer {
    private String name ,SSID , PhoneNumber ;

    public Customer(String name, String SSID, String PhoneNumber) {
        this.name = name;
        setSSID(SSID);
        setPhoneNumber(PhoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        if(SSID.length()==14){this.SSID = SSID;}
        else{
        throw new IllegalStateException("Invalid SSID, length must be 14");
        }
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        if(PhoneNumber.startsWith("+2010")||PhoneNumber.startsWith("+2011")||PhoneNumber.startsWith("+2012")){
        this.PhoneNumber = PhoneNumber;
        }else{
        throw new IllegalStateException("Invalid Phone number, must start with (+2010) or (+2011) or (+2012)");
        }
        
    }
    
}
