public class Cart {
    public int qtyOrdered;
    public static final int Max_numbers_ordered = 20;
    private DigitalVideoDisc itemOrdered[] = 
        new DigitalVideoDisc[Max_numbers_ordered];
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int idx=-1;
        for(int i =0; i < qtyOrdered; i++){
            if(itemOrdered[i]==disc){
                idx = i;
                break;
            }
        }
        if(idx != -1){
            for(int i = idx; i < qtyOrdered-1; i++){
                itemOrdered[i] = itemOrdered[i+1];
            }
            itemOrdered[qtyOrdered-1] = null;
            qtyOrdered--;
            System.out.println( disc.getTitle() + "has been removed");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered < Max_numbers_ordered){
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
        else{
            System.out.println("The cart is almost full");
        }
    }
    public float totalCost(){
        float sum = 0;
        for(int i =0; i < qtyOrdered; i++){
            sum += itemOrdered[i].getCost();
        }
        return sum;
    }
    
}
