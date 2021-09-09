package javabase.variable;

/**
 * 字面值
 */
public class ZiMianZhi {
    public static void main(String[] args) {
        // 整数字面值
        long val = 26L;  // 以L结尾的字面值表示long型
        int decVal = 26;  //默认就是int型
        int hexVal = 0x1a; // 16进制 包含从0-9的数字，和从A-F的字母
        int oxVal = 032; // 8进制
        int binValue = 0b11010; //2进制
        System.out.println(oxVal);

        // 浮点数字面值
        float f1 = 123.4F;// 以F结尾的字面值表示float类型
        double d1 = 123.4;// 默认就是double类型
        double d2 = 1.234e2;// 科学计数法表示double


        // 字符和字符串字面值
        String name = "盖伦";
        char a= 'c';
        char tab = '\t'; //制表符
        char carriageReturn = '\r'; //回车
        char newLine = '\n'; //换行
        char doubleQuote = '\"'; //双引号
        char singleQuote = '\''; //单引号
        char backslash = '\\'; //反斜杠
    }
}
