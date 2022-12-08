package task4;

public enum Vehicles { FORD(8000, "RED"), BMW(14000, "BLACK"), MERCEDES(16000, "WHITE");
    public String color;
    public int price;
    Vehicles(int price, String color){
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Марка: " + super.toString() + " Цвет: " + getColor() + " Цена: " + price + "$";
    }
}
