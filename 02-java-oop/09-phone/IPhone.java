public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    //@Override
    public String ring() {
        return this.ringTone;
    }
    //@Override
    public String unlock() {
        return "Unlocked with fingerprint scanner";
    }
    //@Override
    public void displayInfo() {
        System.out.println("Version Number: " + this.versionNumber);  
        System.out.println("Battery Percentage: " + this.batteryPercentage);
        System.out.println("Carrier: " + this.carrier);
        System.out.println("Ringtone: " + this.ringTone);         
    }
}