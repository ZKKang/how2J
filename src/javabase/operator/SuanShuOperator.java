package javabase.operator;

/**
 * 算数操作符
 */
public class SuanShuOperator {
    // 基本的算数操作符 + - * / %
    // 自增 自减++ --



    public static void main(String[] args) {
        // 如果有任何运算单元的长度超过int,那么运算结果就按照最长的长度计算
        int a = 5;
        long b = 6;
        int c = (int) (a+b); //a+b的运算结果是long型，所以要进行强制转换
        long d = a+b;


    }
    public static void test(){
        // 如果任何运算单元的长度都不超过int,那么运算结果就按照int来计算
        byte a = 1;
        byte b= 2;
        byte c = (byte) (a+b); //虽然a b都是byte类型，但是运算结果是int类型，需要进行强制转换
        int d = a+b;
    }

    public static void test2(){
        // % 取余数，又叫取模
        // 5除以2，余1
        int i = 5;
        int j = 2;
        System.out.println(i%j); //输出为1
    }

    public static void test3() {
        // 自增 自减操作符置前以及置后的区别\
        // i++; 先取值，再运算
        //++i; 先运算，再取值
    }
}
