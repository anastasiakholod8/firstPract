public class Main {
    public static void main(String[] args) {
        Food obj =new Food (30,25,15);

        obj.getAmount();

        Description apple = new Description("Яблуко", 80);
        Description cheesburger = new Description("Чізбургер", 250);
        Description grapes = new Description("Виноград", 120);

        System.out.println(apple.checkCalories());
        System.out.println(cheesburger.checkCalories());
        System.out.println(grapes.checkCalories());




    }
}