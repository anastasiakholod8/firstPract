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


        public void checkCalories() {
            if (calories < 100) {
                System.out.println(name + " низькокалорійний продукт.");
            } else if (calories >= 100 && calories <= 200) {
                System.out.println(name + " має середню кількість калорій.");
            } else {
                System.out.println(name + " висококалорійний продукт.");
            }
        }
}


