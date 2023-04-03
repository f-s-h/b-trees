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
        // TODO
    }

    public T find(T value) {
        // TODO
        return null;
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
