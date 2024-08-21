interface Bicycle{
    int a=45; //final
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    // interface method are public by default
    void blowHornK3g();
    void blowHornmhn();
}
class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("Pee pee Poo poo");
    }


    // interface ka method jab hmm define karege class tabh hmm usee public rakhna hota hai
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public  void speedUp(int increment){
        System.out.println("applying speedUp");
    }

    public void blowHornK3g(){
        System.out.println("tum ho na..");
    }
    public void blowHornmhn(){
        System.out.println("bad boy....");
    }

}
public class inter_face {
    public static void main(String[] args) {
        AvonCycle cycleHarry=new AvonCycle();
        cycleHarry.applyBrake(2);

        //you can create a reference of interface but not a object
        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();
        // you can create properties in interface
        System.out.println(cycleHarry.a);
        // you cannot modify the properties in interface as they as final
        // cycleHarry.a=34;
        // System.out.println(cycleHarry.a);
    }
}
 