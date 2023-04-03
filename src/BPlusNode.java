import java.util.ArrayList;
import java.util.List;

public class BPlusNode<T extends Comparable> {
    private final int MIN_SIZE;
    private final int MAX_SIZE;
    private List<T> values;
    private List<BPlusNode> childNodes;
    private BPlusNode parentNode;

    public BPlusNode(int k) {
        this.MIN_SIZE = k;
        this.MAX_SIZE = 2 * k;
        this.values = new ArrayList<>();
        this.childNodes = new ArrayList<>();
    }

    private BPlusNode(int k, BPlusNode parentNode, List<T> values) {
        this.MIN_SIZE = k;
        this.MAX_SIZE = 2 * k;
        this.parentNode = parentNode;
        this.childNodes = new ArrayList<>();
        if (values.size() >= MIN_SIZE && values.size() <= MAX_SIZE) {
            this.values = values;
        } else {
            throw new IllegalArgumentException("The parameter 'values' of the constructor has an illegal length.");
        }
    }

    public void insert(T value) {
        // TODO
    }

    public void delete(T value) {
        for (int i = 0; i < values.size(); i++) {
            int compareValue = value.compareTo(values.get(i));
            if(compareValue < 0) {
                if(i < childNodes.size()) {
                    childNodes.get(i).delete(value);
                }
                else{
                    return;
                }
            }
            else if (compareValue == 0) {
                // TODO: Handling if List is too small
                values.remove(i);
                return;
            }
        }
        childNodes.get(childNodes.size() - 1).delete(value);
    }

    public T find(T value) {
        for (int i = 0; i < values.size(); i++) {
            int compareValue = value.compareTo(values.get(i));
            if(compareValue < 0) {
                if(i < childNodes.size()) {
                    return (T) childNodes.get(i).find(value);
                }
                else{
                    return null;
                }
            }
            else if (compareValue == 0) {
                return values.get(i);
            }
        }
        return (T) childNodes.get(childNodes.size() - 1);
    }

    @Override
    public String toString() {
        // TODO
        return "";
    }

    public String toPrintTree() {
        // TODO
        return "";
    }

    private boolean isRoot() {
        return parentNode == null;
    }

    public List<T> getValues() {
        return values;
    }

    public List<BPlusNode> getChildNodes() {
        return childNodes;
    }

    public BPlusNode getParentNode() {
        return parentNode;
    }
}
