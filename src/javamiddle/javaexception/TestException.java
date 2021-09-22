package javamiddle.javaexception;

/**
 * Throwable 异常父类
 * Exception  Error  都继承 Throwable
 * Exception 分为运行时异常（RuntimeException） 和 可查异常（比如 io异常 必须要处理的异常,否则编译器不通过）
 * Error  有：VirtualMachineError(OutOfMemoryError  StackOverflowError) AWTError 等
 * 运行时异常与非运行时异常的区别：
 * 运行时异常是不可查异常，不需要进行显式的捕捉
 * 非运行时异常是可查异常，必须进行显式的捕捉，或者抛出
 *
 */
public class TestException {
}
