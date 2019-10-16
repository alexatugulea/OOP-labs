package Java_Lab2.ex1;

public class Main {
    public static void main(String[] args) {

        Box box_1 = new Box();
        Box box_2 = new Box(25);
        Box box_3 = new Box(5, 25, 33);

        System.out.println( "area " + box_2.calculateA()+ " volume"+ box_11.calculateV());
        System.out.println( "area " + box_2.calculateA() +" volume"+ box_2.calculateV());
        System.out.println( "area " + box_3.calculateA() +" volume"+ box_3.calculateV());
    }


}
