package adapter.scenario;

/**
 * @author neilz
 * @create 2020/5/27 17:38
 */
public class EnumerationIterator implements Iterator{

    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElements();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
