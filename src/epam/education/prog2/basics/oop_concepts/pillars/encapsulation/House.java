package epam.education.prog2.basics.oop_concepts.pillars.encapsulation;

/**
 * TODO docme.
 */
public class House {

    private String address;
    private long height;
    private long width;
    private long depth;
    private boolean hasGarden;
    private Long price;
    private final Long size;

    public House(String address, long height, long width, long depth, boolean hasGarden, Long price) {
        this.address = address;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.hasGarden = hasGarden;
        this.price = price;
        this.size = height * width * depth;
    }

    public House() {
        size = 0L;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public long getDepth() {
        return depth;
    }

    public void setDepth(long depth) {
        this.depth = depth;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getSize() {
        return size;
    }
}
