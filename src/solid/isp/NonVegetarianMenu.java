package solid.isp;

import java.util.Arrays;
import java.util.List;

// Class for non-vegetarian menu
public class NonVegetarianMenu implements INonVegetarianMenu {
    public List<String> getNonVegetarianItems() {
        return Arrays.asList("Chicken Curry", "Fish Fry", "Mutton Biryani");
    }
}
