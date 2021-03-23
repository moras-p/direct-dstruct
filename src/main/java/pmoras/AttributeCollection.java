package pmoras;

import java.util.List;
import java.util.Stack;

public class AttributeCollection implements AttributeInterface {
    private List<AttributeInterface> attributeList = new Stack<>();

    @Override
    public String toString() {
        String result = "[";

        for (int i = 0; i < attributeList.size(); i++) {
            result += (i > 0 ? ", " : "") + attributeList.get(i).toString();
        }

        result += "]";

        return result;
    }

    public void addAttribute(AttributeInterface attribute) {
        attributeList.add(attribute);
    }
}
