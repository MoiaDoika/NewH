public class Car {
    int bak = 45;
    double BakBalance = 0;
    double consumption = 0.05;
    double roadFuel;
    double FullOil;


    public double oilbak(){
        BakBalance =- roadFuel;
        if (BakBalance == 0){
            BakBalance = 45;
            System.out.println("The tank is filled with " + 45 + "l");
        }else if(BakBalance < bak){
            BakBalance =- roadFuel;
            System.out.println("The tank is filled with " + roadFuel + "l");
        }
        return BakBalance;
    }

    public void remainder(){
        double ost = bak - roadFuel;
        System.out.println("Remaining in the tank " + ost + "l");

    }

    public void refuel(int z){
        roadFuel = z * consumption;
        System.out.println("To arrive next. point needed " + roadFuel + "l");
        FullOil=FullOil+roadFuel;

    }

    public void FinalPrice(double a){
        double total = FullOil * a;
        System.out.println("In general, spent on fuel "+ total +" hryvnia.");

    }

}
