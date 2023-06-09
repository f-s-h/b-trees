public class BTree<T extends Comparable> {
    private final int k;
    private BNode root;

    public BTree(int k) {
        this.k = k;
        this.root = null;
    }

    public void insert(T value) {
        if(root == null) {
            root = new BNode(k);
        }
        root.insert(value);
    }

    public void delete(T value) {
        if(root != null) {
            root.delete(value);
        }
    }

    public T find(T value) {
        if(root == null) {
            return null;
        }
        return (T) root.find(value);
    }

    public String toPrintTree(){
        if(root == null) {
            return "";
        }
        return root.toPrintTree();
    }
}
