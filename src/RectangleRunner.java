public class RectangleRunner {
    public static void main(String[]args){
        Rectangle plot1 = new Rectangle(150,200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        plot1.setWidth(75);
        plot2.setWidth(75);
        plot3.setWidth(75);
        plot1.setLength(75);

        int seedRequired = plot1.calculateArea() + plot2.calculateArea() + plot3.calculateArea();

        System.out.println("These three plots requires " + seedRequired + " square feet of seed");

        /*System.out.println("Plot 1 width: " + plot1.getLength());
        System.out.println("Plot 1 length: " + plot1.getWidth());
        System.out.println("Plot 1 area:" +plot1.calculateArea());


        System.out.println("Plot 2 width: " + plot2.getLength());
        System.out.println("Plot 2 length: " + plot2.getWidth());
        System.out.println("Plot 2 area:" +plot2.calculateArea());

        System.out.println("Plot 3 width: " + plot3.getLength());
        System.out.println("Plot 3 length: " + plot3.getWidth());
        System.out.println("Plot 3 area:" +plot3.calculateArea());*/


    }
}
