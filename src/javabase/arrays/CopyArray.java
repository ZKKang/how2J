package javabase.arrays;

/**
 * 把一个数组的值，复制到另一个数组中
 *
 * System.arraycopy(src, srcPos, dest, destPos, length)
 *
 *
 * src: 源数组
 * srcPos: 从源数组复制数据的起始位置
 * dest: 目标数组
 * destPos: 复制到目标数组的起始位置
 * length: 复制的长度
 */
public class CopyArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("开始：");
        for(int i=0;i<10;i++){
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i]+",");
        }
        int[] arrNew = new int[20];
        System.arraycopy(arr,2,arrNew,5,2);

        System.out.println("");
        System.out.println("复制后：");

        for(int i=0;i< arrNew.length;i++){
            System.out.print(arrNew[i]+",");
        }
    }
}
