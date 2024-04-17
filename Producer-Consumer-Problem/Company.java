class Company {
    //Encapsulated n and f by making them private. This ensures that these variables can only be accessed and modified within the Company class, adhering to encapsulation principles.
    private int n;
    private boolean f = false;
        // here synchronized is used because when we call the method consume_item() it
      // will be called by two threads at a time so it will not work
  
  
    synchronized void produce_item(int n) {
        // If consumer is active, wait until consumer consumes
        while (f) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        this.n = n;
        System.out.println("Produced: " + this.n);
        f = true;
        notify(); // Notify the consumer that an item is available
    }
  
    synchronized int consume_item() {
        // If producer is active, wait until producer produces
        while (!f) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Consumed: " + this.n);
        f = false;
        notify(); // Notify the producer that consumption is done
        return this.n;
    }
  }
  