package Templete.practice_20210414;

/**
 * @author TYX
 * @name BubbleSort
 * @description 冒泡排序模版算法
 * @createTime 2021/4/14 13:58
 **/
/*
第二次上机练习题：用模板方法模式实现冒泡算法，具体算法类包括数组和ArrayList类型两种，请用代码实现。
2021.04.18 修改了sort方法体两层循环内的内容
感觉这样更简洁一些 而且确实是模版方法（定义了算法骨架 运行时具体实现）
 */
public class BubbleSort {
    protected Sequence data;//数据结构（数组和ArrayList的封装）

    public BubbleSort(Sequence data) {
        this.data = data;
    }

    final void sort(){
        for(int i=0;i<data.getSize();i++){
            for(int j=0;j<data.getSize()-i-1;j++){
                if(data.get(j)>data.get(j+1)){
                    int former=data.get(j);
                    int latter=data.get(j+1);
                    data.set(j,latter);
                    data.set(j+1,former);
                }
            }
        }
        show(data);
    }

    final void show(Sequence data){
        for(int i=0;i<data.getSize();i++){
            System.out.print(data.get(i)+"\t");
        }
        System.out.println();
    }
}
