package info.pauek.shoppinglist;

public class ShoppingItem {
    private String name;
    private  boolean selected = false;

    public ShoppingItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSelected(boolean isSelected){selected = isSelected;}

    public boolean isSelected() {return selected;}
}
