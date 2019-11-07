import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyNode {

    private String value;
    private ArrayList <MyNode> child;
    private ArrayList <MyNode> parent;

    public MyNode(String value) {
        this.value = value;
        this.child = new ArrayList<>();
        this.parent = new ArrayList<>();
    }

    public void addChild(MyNode child) {
        this.child.add(child);
    }

    public List<MyNode> getChild() {
        return child;
    }

    public void addParent(MyNode parent) {
        this.parent.add(parent);
    }

    public List<MyNode> getParent() {
        return parent;
    }

    public List<MyNode> getAllChildren() {

        //this is the logic
//        ArrayList<MyNode> children = new ArrayList<>();
//        for (MyNode currentChild: child) {
//            children.add(currentChild);
//        }
//        return children;

        //but the code can be simplified to this
        return new ArrayList<>(child);
    }

    public Set<MyNode> getAllDescendants() {
        Set<MyNode> children = new HashSet<>();

        for (MyNode currentChild: child) {
            children.add(currentChild);
            children.addAll(currentChild.getAllDescendants());
        }
        return children;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "value='" + value + '\'' +
                ", child=" + child +
                ", parent=" + parent +
                '}';
    }
}
