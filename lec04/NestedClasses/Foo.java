public class Foo {
    Bar b;

    public Foo(int x, int y) {
        b = new Bar(x, y);
    }

    public class Bar {
        int x;
        int y;

        public Bar(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public String toString() {
        return b.x + " " + b.y;
    }

}
