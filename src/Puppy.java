/**
 * 一个源文件只能有一个public类
 * 一个源文件可以有多个非public类
 * 源文件名必须和public类名一致
 * 如果一个类定义在某个包中，那么package语句应该放在源文件首行
 * 如果源文件包含import语句，那么应该放在package语句和类定义之间
 * import语句和package语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。
 */
//import  java.io.*;
public class Puppy{
    int dogAge;
    public Puppy(String name){
        //这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name );
    }
    public void setage(int age){
        dogAge = age;
        System.out.println("小狗的年龄是 : " + age );
    }
    public int getDogAge(){
        System.out.println("变量是"+dogAge);
        return dogAge;
    }
    public Puppy(){
        System.out.println("hollow world");
    }
//    public static void main(String []args){
//        // 下面的语句将创建一个Puppy对象
//        Puppy myPuppy = new Puppy( "tommy" );
//        Puppy youPuppy = new Puppy( );
//        myPuppy.setage(5);
//        myPuppy.getDogAge();
//        youPuppy.setage(3);
//        youPuppy.getDogAge();
//
//    }
}