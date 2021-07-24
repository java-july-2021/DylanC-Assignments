public class Galaxy extends Phone implements Ringable {

    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    //@Override
    public String ring() {
        return this.ringTone;
    }
    //@Override
    public String unlock() {
        return "Unlocked using fingerprint";
    }
    //@Override
    public void displayInfo() {
        System.out.println("Verison Number: " + this.versionNumber);  
        System.out.println("Battery Percentage: " + this.batteryPercentage);
        System.out.println("Carrier: " + this.carrier);
        System.out.println("Ring Tone: " + this.ringTone);          
    }
}