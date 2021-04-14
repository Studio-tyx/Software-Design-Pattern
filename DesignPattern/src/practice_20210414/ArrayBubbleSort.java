package practice_20210414;

/**
 * @author TYX
 * @name ArrayBubbleSort
 * @description 数组冒泡排序
 * @createTime 2021/4/14 14:10
 **/
public class ArrayBubbleSort extends BubbleSort{
    public ArrayBubbleSort(Array data) {
        this.data=data;
    }

    @Override
    Sequence swap(Sequence data, int i, int j) {
        int former=data.get(i);
        int latter=data.get(j);
        data.set(i,latter);
        data.set(j,former);
        return data;
    }
}
