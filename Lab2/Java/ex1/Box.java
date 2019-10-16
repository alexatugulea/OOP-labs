package Java_Lab2.ex1;

public class Box {
    int height;
    int width;
    int depth;

    Box() {
        this.height = 1;
        this.width = 1;
        this.depth = 1;
        System.out.println("Box has " + this.height + " height " + this.depth + " depth " + this.width + " width ");
    }

    Box(int a) {
        this.height = a;
        this.depth = a;
        this.width = a;
        System.out.println("Box has " + this.height + " height " + this.depth + " depth " + this.width + " width ");
    }

    Box(int height, int depth, int width) {
        this.height = height;
        this.depth = depth;
        this.width = width;
        System.out.println("Box has " + this.height + " height " + this.depth + " depth " + this.width + " width ");
    }

    public float calculateV() {
        float volume = height * width * depth;
        return volume;
    }

    public float calculateA() {
        float area = 2 * (height * width + height * depth + width * depth);
        return area;
    }
}