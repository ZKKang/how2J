package javabase.liucheng;

/**
 * 控制流程
 */
public class LiuCheng {

    // if

    // switch可以使用byte,short,int,char,String,enum
    // 每个表达式结束，都应该有一个break;
    // String在Java1.7之前是不支持的, Java从1.7开始支持switch用String的，编译后是把String转化为hash值，其实还是整数

    // while
    public static void main(String[] args) {
        int i = 0;
        while(i>3){

        }
        // 先执行一次再判断
        do{

        } while(i<3);


    }

    // for

    // continue 继续下一次循环

    // break 结束循环

    // 控制外部循环  1、使用boolean变量结束外部循环


    //使用标签结束外部循环
    public static void test(String[] args) {

        //打印单数
        outloop: //outloop这个标示是可以自定义的比如outloop1,ol2,out5
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if(0==j%2)
                    break outloop; //如果是双数，结束外部循环
            }

        }
    }
}
