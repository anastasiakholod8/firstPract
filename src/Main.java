public class Main {
    public static void main(String[] args) {
        Food obj =new Food (30,25,15);

        obj.getAmount();

        Description apple = new Description("Яблуко", 80);
        Description cheesburger = new Description("Чізбургер", 250);
        Description grapes = new Description("Виноград", 120);

        apple.checkCalories();
        cheesburger.checkCalories();
        grapes.checkCalories();




    }
}