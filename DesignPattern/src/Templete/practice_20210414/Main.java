package Templete.practice_20210414;

import java.util.ArrayList;

/*
第二次上机练习题：用模板方法模式实现冒泡算法，具体算法类包括数组和ArrayList类型两种，请用代码实现。
2021.04.18 修改了sort方法体两层循环内的内容
感觉这样更简洁一些 而且确实是模版方法（定义了算法骨架 运行时具体实现）
 */
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
