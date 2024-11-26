
    public class Cart {
      public static final int MAX_NUMBERS_ORDERED = 20;
      private DigitalVideoDisc itemsOdered[] =  new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
      private int qtyOrdered = 0;
      public void addDigitalVideoDisc(DigitalVideoDisc disc) {
       
          if(qtyOrdered <MAX_NUMBERS_ORDERED) {
            itemsOdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
            return;
          }
          System.out.println("The cart is almost full");
        }
  
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
      for(DigitalVideoDisc dvd : dvdList){
        this.addDigitalVideoDisc(dvd);}
      }
        public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
          this.addDigitalVideoDisc(new DigitalVideoDisc[]{dvd1, dvd2});     
      }

    public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
      for(int i  = 0; i < MAX_NUMBERS_ORDERED; i++) {
        if(itemsOdered[i] == disc) {
          itemsOdered[i] = null;
          System.out.println("The disc has been removed");
          break;
        }
      }
    }
  
    public float totalCost() {
      float totalCost = 0;
      for(int i  = 0; i < MAX_NUMBERS_ORDERED; i++) {
          if (itemsOdered[i] != null) {
              totalCost += itemsOdered[i].getCost();
          }
      }
      return totalCost;
    }

    public void printCart() {
      System.out.println("***********************CART***********************");
      System.out.println("Ordered Items:");
      for (int i = 0; i < qtyOrdered; i++) {
        System.out.println((i + 1) + ". " + itemsOdered[i].toString());
      }
      System.out.println("Total cost: " + totalCost());
      System.out.println("***************************************************");
    }
  }
  