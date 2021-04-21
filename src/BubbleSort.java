
/*
1）冒泡排序

  重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。时间复杂度 O（n²），为稳定算法。

  将数依次进行比较，并将大（或小）的，网后放，如下：
 */

public class BubbleSort {
    public static void bubbleSort(int[] input) {

    }

    public static void main(String[] str) {
        int[] input = { 5,2,4,6,7,3,1,8,9,10};
        BubbleSort.bubbleSort(input);
        System.out.println(input.toString());
    }
}
