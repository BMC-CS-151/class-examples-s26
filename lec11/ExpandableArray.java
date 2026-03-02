import java.util.List;

//TODO 1: implements..
public class ExpandableArray<E> implements Iterable<E> {

    private E[] data;
    private int numElems;

    public ExpandableArray(int size) {
        this.data = (E[]) new Object[size];
    }

    public ExpandableArray() {
        this.data = (E[]) new Object[10];
    }

    public Iterator<E> iterator () {
        return new ExpandableArrayIterator();
    }

    //TODO 2: implement the required interface 
    // we might need a nested class...

    class ExpandableArrayIterator implements Iterator {
        private int itr;

        public ExpandableArrayIterator() {
            itr = 0;
        }

        public boolean hasNext() {
            return itr < size();
        }

        public E next() {
            E elem = data[itr];
            itr++;
            return elem;
        }

    }

    private void expand() {
        //expand
        E[] newData = (E[]) new Object[numElems*2];
        for (int i=0; i < this.data.length; i++) {
            newData[i] = this.data[i];
        }

        this.data = newData;
    }

    public int size() {
        return numElems;
    }

    public void insert(E item) {
        if (numElems >= data.length) {
            expand();
            System.out.println("expanding");
        }

        //insert
        numElems += 1;
    }

    public void insert(E item, int index) {
        if (index > numElems) {
            throw new ArrayIndexOutOfBoundsException(); 
        }

        if (numElems >= data.length) {
            expand();
        }

        for (int i=size()-1; i>=0; i--) {
            this.data[i+1] = this.data[i];
        }

        this.data[0] = item;

        numElems += 1;
    }

    public E remove(int index) {
        //remove... 

        return null;
    }


    public void set(E elem, int index) {
        this.data[index] = elem;
    }

    public String toString() {
        String s = "";
        for (int i=0; i<numElems; i++) {
            s += this.data[i] + ", ";
        } 
        return s;
    }

    public E get(int index) {
        return this.data[index];
    } 

    //TODO: test it!
    public static void main(String[] args) {
        ExpandableArray<Integer> e = new ExpandableArray<Integer>(10);
        e.insert(1, 0);
        e.insert(7, 1);
        e.insert(100, 2);

        Iterator<Integer> itr = e.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }



}
