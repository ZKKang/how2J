package javabase.variable;

/**
 * Final变量
 */
public class FinalVariable {
    // 当一个变量被final修饰的时候，该变量只有一次赋值的机会
    final int i = 5;

//    i = 10; //i在第4行已经被赋值过了，所以这里会出现编译错误

    public static void main(String[] args) {
        final int j;

        j = 10; //只是被声明，但是没有被赋值，所以在这里可以进行第一次赋值

//        j = 11; //已经被赋值过了，所以这里会出现编译错误
    }

}
