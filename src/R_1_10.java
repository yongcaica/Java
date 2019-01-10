class Flower {
    private String name;
    private int petals;
    private float price;

    public Flower(String nm, int ptl, float pri){          //constructor with 3 instance variables
        name = nm;
        petals = ptl;
        price = pri;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setPetals(int petals){
        this.petals = petals;
    }
    public int getPetals(){
        return this.petals;
    }
     public void setPrice(float price){
        this.price = price;
     }
     public float getPrice(){
        return this.price;
     }
}

/*
public static void main(String[] args) {
        Flower[] flower = new Flower[3];
        flower[0] = new Flower("rose", 3, 99);
        flower[1] = new Flower("Orchid", 5, 88);
        flower[2] = new Flower("tian", 8, 66);
}
*/