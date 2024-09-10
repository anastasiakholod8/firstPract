public class Description {

    private String name;
    private int calories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Description(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }


    public String checkCalories() {
        String cal = "";
        if (calories < 100) {
            cal = name + " низькокалорійний продукт.";
        } else if (calories >= 100 && calories <= 200) {
            cal = name + " має середню кількість калорій.";
        } else {
            cal = name + " висококалорійний продукт.";
        }
        return cal;
    }
}




