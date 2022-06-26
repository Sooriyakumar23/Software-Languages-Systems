public class Student {
    // byte -> 8 bits -> -2**7 <---> 2**7-1
    // short -> 16 bits
    // int -> 32 bits
    // long -> 64 bits

    // float
    // double

    // char

    // boolean
    int id;

    void compute(){
        id -= 50;
        System.out.println(id);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.compute();
    }
}
