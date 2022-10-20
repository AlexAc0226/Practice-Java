public class Coche {
    String modelName;
    String color;

    Coche(){}
    Coche(String model, String colorName)  {
        this.modelName = model;
        this.color = colorName;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
