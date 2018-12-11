import  java.io.*;

public class Main {

    public static void main(String[] args) {
        byte a = 68;
        char b = 'A';
        Puppy myPuppy =new Puppy("张三");
        Puppy youPuppy =new Puppy();
        System.out.println("main Hello World!"+a);
        myPuppy.setage(16);
        youPuppy.setage(19);
        myPuppy.getDogAge();
        youPuppy.getDogAge();

    }
}
