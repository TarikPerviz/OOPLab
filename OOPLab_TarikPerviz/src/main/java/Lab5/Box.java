package Lab5;

import java.util.ArrayList;
import java.util.List;
public class Box {
    private double maximumWeight;
    private List<ToBeStored> items;

    public Box(double maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void add(ToBeStored item) {
        // Check if adding the item exceeds the maximum weight
        if (getTotalWeight() + item.weight() <= maximumWeight) {
            items.add(item);
        }
    }

    private double getTotalWeight() {
        double totalWeight = 0;
        for (ToBeStored item : items) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " things, total weight " + getTotalWeight() + " kg";
    }
}
