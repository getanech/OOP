public class Tablet {
    private String name;

    private String kind;
     private char system;
     private double size;
    private double price;

    public Tablet(String name2, String kind, char system2, double size2, double price2) {
        this.name = name2;
        this.kind = kind;
        this.system = system2;
        this.size = size2;
        this.price = price2;
    }

    public boolean isSame (Tablet other){
        if (this.name.equals(other.name) && this.kind.equals(other.kind) && this.size == other.size){
            return true;
        }else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSystem() {
        return system;
    }

    public void setSystem(char system) {
        this.system = system;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

