package practice_20210414;

/**
 * @author TYX
 * @name ListBubbleSort
 * @description ArrayList冒泡排序
 * @createTime 2021/4/14 14:19
 **/
public class ListBubbleSort extends BubbleSort{
    public ListBubbleSort(List data) {
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
