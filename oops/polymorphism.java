interface camera{
    void takesnap();
    void recordVedio();
    private void greet(){
        System.out.println("good morning ");
    }
    default void record4Kvedio(){
        greet();
        System.out.println("Recording 4k vedio");
    }

}
interface wifi{
    String [] getNetwork();
    void connectToNetwork(String network);
}

class cellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }
    void pickcall(){
        System.out.println("connecting");
    }
}


class smartPhone extends cellPhone implements wifi,camera{
    public void takesnap(){
       System.out.println("Taking snap");
    }
    public void recordVedio(){
          System.out.println("Recording vedio");
    }

   public  String [] getNetwork(){
    System.out.println("Getting list of network");
    String [] networkList={"harry","ram","kaka"};
    return networkList;

    }

    public void sampleMeth(){
        System.out.println("meth");
    }
    public void connectToNetwork(String network){
       System.out.println("connecting "+network);
    }

    // public  void record4Kvedio(){
    //     System.out.println("Recording 4k vedio in implent class");
    // }
}






public class polymorphism {
    public static void main(String[] args) {
        camera cam=new smartPhone();//this is a samartphone ,use as a camera
        //cam.getNetwork();//not allowed
        cam.record4Kvedio();
        // cam.sampleMeth();//not allowed

        smartPhone s=new smartPhone();
        s.sampleMeth();
        s.getNetwork();
        s.record4Kvedio();
        s.takesnap();
    }

}
