/**
 * 自动数据类型转换
 * 必须满足前置类型位数低于后置数据类型位数
 * a+b结果为int类型
 */
public class ZiDongLeiZhuan {
    public static void main(String[] args){
        String d = "a";//65
        char b = 'B';
//        a+=1;
        d=d+b;
        System.out.println(b);
        System.out.println(d);
    }
}
