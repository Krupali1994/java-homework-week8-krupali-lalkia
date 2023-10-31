package Programme24_MethodOverriding;

/**
 * Test class to create objects and call the methods
 * Output:
 * SBI Rate of Interest: 8
 * ICICI Rate of Interest: 7
 * AXIS Rate of Interest: 9
 */
class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI rate of interest: " + s.getRateOfInterest());
        System.out.println("ICICI rate of interest: " + i.getRateOfInterest());
        System.out.println("AXIS rate of interest: " + a.getRateOfInterest());
    }
}
