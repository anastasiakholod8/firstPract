public class Food {
   public int appetizer;
   public int hotmeals;
   public int dessert;

    public int getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(int appetizer) {
        this.appetizer = appetizer;
    }

    public int getHotmeals() {
        return hotmeals;
    }

    public void setHotmeals(int hotmeals) {
        this.hotmeals = hotmeals;
    }

    public int getDessert() {
        return dessert;
    }

    public void setDessert(int dessert) {
        this.dessert = dessert;
    }

    public Food (int appetizer, int hotmeals, int dessert){
        this.appetizer=appetizer;
        this.hotmeals=hotmeals;
        this.dessert=dessert;

    }
    void getAmount(){
        System.out.println("Кількість страв :" +(appetizer+hotmeals+dessert));

    }
}
