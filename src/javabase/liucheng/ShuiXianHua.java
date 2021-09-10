package javabase.liucheng;

/**
 * 水仙花数定义：
 * 1. 一定是3位数
 * 2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3
 *
 * 寻找所有的水仙花数
 */
public class ShuiXianHua {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++) {
            int a = i/100;
            int b = (i/10)%10;
            int c = i%10;
            if(a*a*a+b*b*b+c*c*c == i){
                System.out.println(i);
            }
        }
    }
}
