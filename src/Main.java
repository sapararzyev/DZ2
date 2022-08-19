import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {

        createObjects("германия").print();
        createObjects("италия").print();
        createObjects("дубай").print();
    }

    public static Country createObjects(String className) {
        switch (className) {
            case " германия ":
                return new Germany(" германия ", " германия ", " германский ");
            case " италия ":
                return new Italy("  италия  ",  " италия ",   23);
            case "  дубай  ":
                return new Dubai("  дубай  ", "  дубай  ", " жарко  ");
            default:
                return null;
        }
    }

}

