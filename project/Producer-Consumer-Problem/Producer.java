class Producer extends  Thread{
    private Company c ;
    //contructor 
    public Producer(Company c){
        this.c=c;
    }
    public void run(){
        //here we try to call the produce_item() so we call the obj of class companay
        int i=1;
        while(true){
                    //here we try to call the produce_item() so we call  the  class companay

            this.c.produce_item(i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
               e.printStackTrace();
            }
            i++;
        }
    }
}


