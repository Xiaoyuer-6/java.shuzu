import java.util.Arrays;
public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {12, 22, 32, 42, 52, 62};
        System.out.println(binarySearch(arr, 32));
    }

    public static int binarySearch(int[] arr, int toFind) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (toFind < arr[mid]) {
                // 去左侧区间找
                right = mid - 1;

            } else if (toFind > arr[mid]) {
                // 去右侧区间找
                left = mid + 1;
            } else {
                // 相等, 说明找到了
                return mid;
            }
        }// 循环结束, 说明没找到
                return -1;
            }
        }


    /*
    查找数组中的指定元素(顺序查找)
    public static void main(String[] args) {
        int[] array = {12, 14, 16, 18, 20, 28};
        System.out.println(find(array,16));
    }

    public static int find(int[] arr, int toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                return i;
            }
        }
        return -1; // 表示没有找到 }
    }

     */


    /*
    1.找数组中的最大元素
     */
    /*
    public static void main(String[] args) {
        int[] array = {2, 52, 9, 10, 12, 26};
        int max = array[0];//假设第一个元素是最大值
        //for循环遍历数组中元素，每次循环 max跟数组索引为i的元素比较大小
        for (int i = 0; i < array.length; i++){
            if (max < array[i]){//数组中的元素跟max比较，比max大就把它赋值给max作为新的比较值
                max = array[i];
            }
        }
        System.out.println(max);//输出数组中的最大值
    }
}
    /*
    public static void main(String[] args) {
        int[] array1 = {2, 8, 9, 10, 12, 26};
        int[] array2 = {2, 8, 9, 10, 12, 26, 30,35};
        System.out.println(Arrays.equals(array1, array2));
    }
    /*
    public static void main(String[] args) {
        int[] array1 =new int[10];
        Arrays.fill(array1,2,6,8);
        System.out.println(Arrays.toString(array1));
    }
    /*
    public static void main(String[] args) {
        int[] array1 = {2, 8, 9, 10, 12, 26};
        int[] array2 = {2, 8, 9, 10, 12, 26, 30,35};
        System.out.println(Arrays.equals(array1, array2));
    }
    /*
    public static void main(String[] args) {
        int[] array1 = {2, 8, 9, 10, 12, 26};
        int[] ret = Arrays.copyOfRange(array1,2,5);
        System.out.println(Arrays.toString(ret));
    }
    /*
    //4. 引用.clone
         克隆  这个引用所指向的对象
         这个引用所指向的对象就会被克隆(生成一个副本)
     *//*
    public static void main(String[] args# 一级标题) {
        int[] array1 = {1, 8, 9, 4, 13, 26};
        System.out.println(Arrays.toString(array1));
        //array2 指向了刚刚生成的副本
        int [] array2 = array1.clone();
        System.out.println("==============");
        array2[0] = 99;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
    /*
    //深拷贝3.System.arraycopy方法
     */
    /*
    public static void main4(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = new int[array1.length];
        System.out.println(Arrays.toString(array1));
        System.arraycopy(array1, 0, array2, 0, array1.length);
        System.out.println("==============");
        array2[0] = 99;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.arraycopy();
    }
     */
    /*
    //深拷贝 2.copyof
     */
    /*
    public static void main3(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(array1));
        int[] array2 = Arrays.copyOf(array1,array1.length);
        System.out.println("==============");
        array2[0]=99;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
    /*
    数组拷贝1.for循环
     */
    /*
    public static void main2(String[] args) {
        int[] array1 ={1,2,3,4,5,6};
        int[] array2 =new int [array1.length];
        for (int i = 0; i <array1.length ; i++) {
            array2[i] = array1[i];
        }
        System.out.println("==============");
        array2[0]=99;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

     */