package javabase.variable;

/**
 * 类型转换
 */
public class TransType {

    public static void main(String[] args) {
        // 精度高的数据类型就像容量大的杯子，可以放更大的数据
        //精度低的数据类型就像容量小的杯子，只能放更小的数据
        // 杯子一样大的有的需要强制转换
        char c = 'A';
        short s = (short) c;

        // 低精度转高精度怎么都可以

        // 高精度转低精度可能溢出
    }
}
