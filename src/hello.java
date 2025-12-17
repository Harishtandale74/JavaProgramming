class Robot {
    String name;
    String os;
    int price;

    void move() {
        System.out.println("Optimized for running and performing home tasks");
    }

    void display() {
        System.out.println("Robot Name: " + name);
        System.out.println("Operating System: " + os);
        System.out.println("Price: " + price);
    }
}

class Robot1{
    String name;
    String operatingSystem;
    int prize;
    String tools;


    void operations(){
        System.out.println("designed for defence");
    }
    void info(){
        System.out.println(name);
        System.out.println(operatingSystem);
        System.out.println(prize);
        System.out.println(tools);
    }

}


public class hello {
    public static void main(String[] args) {

        Robot r1 = new Robot();   // Object creation

        r1.name = "Kungfu";
        r1.os = "Kernel";
        r1.price = 10101010;

        r1.display();
        r1.move();

        Robot1 r2 = new Robot1();
        r2.name="chinki";
        r2.prize=101101;
        r2.operatingSystem="android";
        r2.tools="Andriod Studio, jupyterLab";

        System.out.println(r2.name);

        r2.operations();
        r2.info();

    }
}
