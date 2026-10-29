package solid.isp;

import java.util.Arrays;
import java.util.List;

// Class for vegetarian menu
public class VegetarianMenu implements IVegetarianMenu {
    public List<String> getVegetarianItems() {
        return Arrays.asList("Vegetable Curry", "Paneer Tikka", "Salad");
    }
}
