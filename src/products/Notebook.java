package products;

public class Notebook extends Product {
    private static int counter = 0;
    private int pageCount;
    private boolean isHardCover;

    public Notebook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean getHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean isHardCover) {
        this.isHardCover = isHardCover;
    }

    @Override
    protected String generateId() {
        counter++;
        return "2" + String.format("%03d", counter);
    }

    @Override
    public String toString() {
        return super.toString() + ", Page Count: " + pageCount + ", Hard Cover: " + (isHardCover ? "Yes" : "No");
    }
}