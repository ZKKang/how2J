package javabase.variable;

public class VariableNameRule {



    public static void main(String[] args) {

        //1、命名规则
        // 变量命名只能使用字母 数字 $ _
        // 变量第一个字符 只能使用 字母 $ _ 不能使用数字
        int a= 5;
        int a_12= 5;
        int $a43= 5;
        int a434= 5;
//第一个是数字，是不行的
//        int 34a= 5;

        //2、使用完整单词命名，易于理解
        String name;

        float hp;

        float armor;

        int moveSpeed;

        //3、不能只使用关键字，但是可以包含关键字

        //4、中文可以命名，但是最好不要
        String 名字  = "";
    }
}
