/**
 * java 支持的语音变量有：
 * 类变量：独立于方法之外的变量，用是static修饰
 * 实例变量：独立于方法之外的变量，不过没有用static修饰
 * 局部变量；类方法中的变量
 *
 * java局部变量
 * 局部变量声明在方法、构造方法或语句块中
 * 局部变量在方法、构造方法或语句块执行时创建、执行完后悔销毁
 * 访问修饰符不能用于局部变量
 * 局部变量只在声明它的方法、、构造方法、语句块中可见
 * 局部变量是在栈上分配的
 * 局部变量没有默认值，所以局部变量在声明后必须赋值才可使用
 *
 * java实例变量
 * 实例变量声明在一个类中，但在方法、构造方法、语句块之外；
 * 当一个对象实例化后，每个实例变量值就跟着确定了
 * 实例变量在对象创建后创建，在实例销毁后销毁
 * 实例变量的值应该至少被一个方法、构造方法、语句块引用，使得外部能够通过这些方法获取实例的值
 * 实例变量可以声明在使用前或者使用后
 * 访问修饰符可以修饰实例变量
 * 实例变量对于类中的方法、构造方法、语句块是可见的。一般情况应该把实例变量设为私有。通过访问修饰符可以使实例变量对子类可见
 * 实例变量具有默认值。数值型变量的默认值是0，布尔型变量的默认值是false，引用类型变量的默认值是null。变量的值可以在声明时指定，也可以在构造方法中指定；
 * 实例变量可以直接通过变量名访问。但在静态方法以及其他类中，就应该使用完全限定名：ObejectReference.VariableName。
 *
 */

import java.io.*;
public class Employee{
    // 这个实例变量对子类可见
    public String name;
    // 私有变量，仅在该类可见
    private double salary;
    //在构造器中对name赋值
    public Employee (String empName){
        name = empName;
    }
    //设定salary的值
    public void setSalary(double empSal){
        salary = empSal;
    }
    // 打印信息
    public void printEmp(){
        System.out.println("名字 : " + name );
        System.out.println("薪水 : " + salary);
    }

    public static void main(String[] args){
        Employee empOne = new Employee("RUNOOB");
        empOne.setSalary(1000);
        empOne.printEmp();
        System.out.println(empOne.salary);
    }
}
