interface FuncIF {
    void print(String msg);
}

public class FunctionalInterface {
    public static void main(String[] args) { 
        FuncIF fi = (msg) -> System.out.println(msg);
        fi.print("This is a functional interface with lambda.....");
    }
}