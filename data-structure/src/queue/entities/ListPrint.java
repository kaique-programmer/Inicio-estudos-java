package queue.entities;

public class ListPrint {
    private String name;
    private int numSheet;

    public ListPrint() {}

    public ListPrint(String name, int numSheet) {
        this.name = name;
        this.numSheet = numSheet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumSheet() {
        return numSheet;
    }

    public void setNumSheet(int numSheet) {
        this.numSheet = numSheet;
    }
}
