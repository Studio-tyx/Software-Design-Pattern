package Templete.practice_20210414;

/**
 * @author TYX
 * @name Array
 * @description 数组封装数据结构
 * @createTime 2021/4/14 14:11
 **/
public class Array implements Sequence{
    private int[] data;
    private int length;
    public Array(int[] data) {
        this.data=data;
        this.length=data.length;
    }

    @Override
    public int getSize() {
        return length;
    }

    @Override
    public int get(int i) {
        return data[i];
    }

    @Override
    public void set(int i,int value) {
        data[i]=value;
    }
}
