package Java_Lab1;

public class Monitor {
    public String clr;
    public int width;
    public int height;
    public String rls;

    public Monitor(String clr, int width, int height, String rls) {
        this.clr = clr;
        this.width = width;
        this.height = height;
        this.rls= rls;
    }

    public void printCompareSize(Monitor monitor2) {
        if (this.height * this.height > monitor2.height * monitor2.width) {
            System.out.println("1st monitor bigger");
        } else {
            System.out.println("2nd monitor bigger");
        }
    }

    public void showMonitor() {
        System.out.println("Monitor with clr " + this.clr +
                " width: " + this.width + " height: " + this.height +
                " rls:" + this.rls);
    }

}
