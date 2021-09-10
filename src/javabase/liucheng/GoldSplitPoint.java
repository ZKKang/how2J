package javabase.liucheng;

/**
 * 寻找某两个数相除，其结果 离黄金分割点 0.618最近
 *
 * 分母和分子不能同时为偶数
 * 分母和分子 取值范围在[1-20]
 */
public class GoldSplitPoint {
    public static void main(String[] args) {
        double limit = 1;
        double a = 0;
        double b = 0;
        for(double i=1;i<=20;i++) {
            for(double j=1; j<i;j++) {
                System.out.println(j/i);
                double tempLimit = Math.abs(j/i - 0.618);
                if(tempLimit <limit) {
                    limit = tempLimit;
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println("最接近的是："+b+"/"+a+"，值为："+b/a);
    }
}
