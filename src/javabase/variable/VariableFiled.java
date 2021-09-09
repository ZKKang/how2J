package javabase.variable;

/**
 * 作用域
 */
public class VariableFiled {
    int i = 1;
    int j = i;  //其他的属性可以访问i
    public void method1(){
        System.out.println(i); //方法1里可以访问i
    }
    public void method2(){
        System.out.println(i); //方法2里可以访问i
    }

    public static void main(String[] args) {
        // 变量被声明在类下面 叫 字段、属性、成员变量、Field

        // 变量被声明在方法上，叫 参数

        // 声明在方法内的变量，叫做局部变量  声明的地方到块结束
    }
}
