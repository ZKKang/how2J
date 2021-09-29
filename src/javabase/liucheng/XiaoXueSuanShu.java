package javabase.liucheng;

/**
 * 小学算术题
 *
 * a + b=8
 * c + d=6
 * 14 10
 */
public class XiaoXueSuanShu {
    public static void main(String[] args) {
        for(int a=0;a<=100;a++) {
            for(int c=0;c<=100;c++) {
                if(c+a==14 && 8-a+c-6 == 10) {
                    System.out.println("a="+a+",c="+c+",b="+(8-a)+",d="+(6-c));
                }
            }
        }
    }
}
