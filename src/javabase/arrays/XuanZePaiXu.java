package javabase.arrays;

/**
 * 选择排序法
 * 把第一位和其他所有的进行比较，只要比第一位小的，就换到第一个位置来
 * 比较完后，第一位就是最小的
 * 然后再从第二位和剩余的其他所有进行比较，只要比第二位小，就换到第二个位置来
 * 比较完后，第二位就是第二小的
 */
public class XuanZePaiXu {

    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("开始：");
        for(int i=0;i<10;i++){
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i]+",");
        }

        for(int i=0;i<arr.length;i++) {
            int temp = arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(temp>arr[j]) {
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("");
        System.out.println("排序后：");

        for(int i=0;i<10;i++){
            System.out.print(arr[i]+",");
        }
    }
}
