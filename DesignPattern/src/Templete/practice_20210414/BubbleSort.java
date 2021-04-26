package Templete.practice_20210414;

/**
 * @author TYX
 * @name BubbleSort
 * @description 冒泡排序模版算法
 * @createTime 2021/4/14 13:58
 **/
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
