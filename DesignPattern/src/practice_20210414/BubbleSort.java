package practice_20210414;

/**
 * @author TYX
 * @name BubbleSort
 * @description 冒泡排序模版算法
 * @createTime 2021/4/14 13:58
 **/
/*
第二次上机练习题：用模板方法模式实现冒泡算法，具体算法类包括数组和ArrayList类型两种，请用代码实现。
 */
public abstract class BubbleSort {
    protected Sequence data;//数据结构（数组和ArrayList的封装）
    final void sort(){
        for(int i=0;i<data.getSize()-1;i++){
            for(int j=0;j<data.getSize()-i-1;j++){
                if(data.get(j)>data.get(j+1))   data=swap(data,j,j+1);
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
    abstract Sequence swap(Sequence data,int i,int j);
}
