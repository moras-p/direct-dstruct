package pmoras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests
 */
public class AppTest 
{
    /**
     * Test the example product/attribute structure
     */
    @Test
    public void shouldReturnProperProductAttributesStructure()
    {
        final String expected =
            "[[Attribute1: Value1, Attribute2: Value2], Attribute3: Value3, [[Attribute4: Value4], Attribute5: Value5]]";

        Product product = new Product("ProductName");
        AttributeCollection attrGroup1 = new AttributeCollection();
        attrGroup1.addAttribute(new Attribute("Attribute1", "Value1"));
        attrGroup1.addAttribute(new Attribute("Attribute2", "Value2"));

        product.addAttribute(attrGroup1);
        product.addAttribute(new Attribute("Attribute3", "Value3"));

        AttributeCollection attrGroup2 = new AttributeCollection();
        AttributeCollection attrGroup3 = new AttributeCollection();

        attrGroup3.addAttribute(new Attribute("Attribute4", "Value4"));
        attrGroup2.addAttribute(attrGroup3);
        attrGroup2.addAttribute(new Attribute("Attribute5", "Value5"));

        product.addAttribute(attrGroup2);

        assertEquals(expected, product.toString());
    }
}
