public class BPlusElement<T extends Comparable> {
    private T value;
    private BPlusElement previous;
    private BPlusElement next;

    public BPlusElement(T value) {
        this.value = value;
    }

    public BPlusElement(T value, BPlusElement previous, BPlusElement next) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public BPlusElement getPrevious() {
        return previous;
    }

    public void setPrevious(BPlusElement previous) {
        this.previous = previous;
    }

    public BPlusElement getNext() {
        return next;
    }

    public void setNext(BPlusElement next) {
        this.next = next;
    }
}
