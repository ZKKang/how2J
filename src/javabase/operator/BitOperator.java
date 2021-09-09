package javabase.operator;

/**
 * 位操作符
 */
public class BitOperator {

    public static void main(String[] args) {
        // 一个整数的二进制表达
        System.out.println(Integer.toBinaryString(23));

        // 位或 5|6  按位进行或运算
        System.out.println(5|6);

        // 位与 5&6  按位进行与运算
        System.out.println(5&6);

        // 取非 ~5
        System.out.println(~5);

        // 左移<< 根据一个整数的二进制表达，将其每一位都向左移动，最右边一位补0
        // 右移>> 根据一个整数的二进制表达，将其每一位都向右移动，最左边一位补0
        System.out.println();
        byte i  =6;
        //6的二进制是110
        System.out.println(Integer.toBinaryString(i));
        //6向左移1位后，变成1100，对应的10进制是12
        System.out.println(i<<1);
        //6向右移1位后，变成11，对应的10进制是3
        System.out.println(i>>1);

        // 带符号右移>> 与 无符号右移>>>
        // 对于正数， 带符号右移 >> 会把所有的位右移，并在最前面补0
        // 对于负数， 带符号右移 >> 会把所有的位右移，并在最前面补1

        // 如果是一个负数，那么对应的二进制的第一位是1
        // 无符号右移>>>会把第一位的1也向右移动，导致移动后，第一位变成0

        i  =-10;

        //-10的二进制是11111111111111111111111111110110
        //第一位是1，即符号位，代表这是一个负数
        System.out.println(Integer.toBinaryString(i));

        //对于正数， 带符号右移 >> 会把所有的位右移，并在最前面补0
        //对于负数， 带符号右移 >> 会把所有的位右移，并在最前面补1

        //-10带符号右移1位，移动后前面补齐1
        //得到11111111111111111111111111111011
        //因为第一位是1，所以依然是一个负数，对应的十进制是-5
        int j = i>>1;
        System.out.println(Integer.toBinaryString(j));
        System.out.println(j);

        //-10无符号向右移1位，符号位也会向右移，第一位就变成了0
        //得到01111111111111111111111111111011，对应的十进制是2147483643
        int k = i>>>1;
        System.out.println(Integer.toBinaryString(k));

        System.out.println(k);
    }


}
