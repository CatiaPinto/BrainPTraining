import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MyNodeTest {

    @Test
    public void addChild() {
        //given
        String value = "Football";
        String childValue = "Championship";
        MyNode node = new MyNode(value);
        MyNode child = new MyNode(childValue);

        //when
        node.addChild(child);

        //then
        assertEquals(child, node.getChild().get(0));
    }

    @Test
    public void addParent() {
        //given
        String value = "Championship";
        String parentValue = "Football";
        MyNode node = new MyNode(value);
        MyNode parent = new MyNode(parentValue);

        //when
        node.addParent(parent);

        //then
        assertEquals(parent, node.getParent().get(0));
    }

    @Test
    public void getAllChildren() {

        //given
        String value = "Football";
        String childValue = "Championship";
        String child2Value = "League";
        MyNode node = new MyNode(value);
        MyNode child = new MyNode(childValue);
        MyNode child2 = new MyNode(child2Value);
        ArrayList<MyNode> expectedChildren = new ArrayList<>();

        expectedChildren.add(child);
        expectedChildren.add(child2);


        node.addChild(child);
        node.addChild(child2);

        //when
        List<MyNode> allChildren = node.getAllChildren();

        //then
        assertEquals(expectedChildren, allChildren);
    }

    @Test
    public void getAllDescendants() {
        //given
        String value = "Football";
        String childValue = "Championship";
        String child2Value = "League";
        String child3Value = "ManUnited";
        String child4Value = "ManUCity";
        MyNode node = new MyNode(value);
        MyNode child = new MyNode(childValue);
        MyNode child2 = new MyNode(child2Value);
        MyNode child3 = new MyNode(child3Value);
        MyNode child4 = new MyNode(child4Value);
        ArrayList<MyNode> expectedDescendants = new ArrayList<>();

        expectedDescendants.add(child);
        expectedDescendants.add(child3);
        expectedDescendants.add(child4);
        expectedDescendants.add(child2);


        node.addChild(child);
        node.addChild(child2);
        child.addChild(child3);
        child.addChild(child4);
        child2.addChild(child4);

        Set<MyNode> expectedDescendantsSet = new HashSet<>((expectedDescendants));

        //when
       Set<MyNode> allDescendants = node.getAllDescendants();

        //then
        assertEquals(expectedDescendantsSet, allDescendants);
    }
}