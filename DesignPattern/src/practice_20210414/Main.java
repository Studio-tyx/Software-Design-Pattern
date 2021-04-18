package practice_20210414;

import java.util.ArrayList;

/**
 * @author TYX
 * @name Main
 * @description 主测试类
 * @createTime 2021/4/14 14:20
 **/
public class Main {
    public static void main(String[] args) {
        int[] arrayData=new int[]{5,4,3,2,1};
        Array data1=new Array(arrayData);
        ArrayList<Integer> listData=new ArrayList<>();
        listData.add(5);
        listData.add(4);
        listData.add(3);
        listData.add(2);
        listData.add(1);
        List data2=new List(listData);

        BubbleSort arraySort=new BubbleSort(data1);
        arraySort.sort();
        BubbleSort listSort=new BubbleSort(data2);
        listSort.sort();
    }
}
