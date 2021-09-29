package javabase.arrays;

/**
 * 冒泡法排序的思路：
 * 第一步：从第一位开始，把相邻两位进行比较
 * 如果发现前面的比后面的大，就把大的数据交换在后面，循环比较完毕后，最后一位就是最大的
 * 第二步： 再来一次，只不过不用比较最后一位
 */
public class MaoPaoPaiXu {

    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("开始：");
        for(int i=0;i<10;i++){
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i]+",");
        }

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
