public abstract class Shape implements Cloneable {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape source) {
        if (source != null) {
            this.x = source.x;
            this.y = source.y;
            this.color = source.color;
        }
    }

    @Override
    public abstract Shape clone();
}
