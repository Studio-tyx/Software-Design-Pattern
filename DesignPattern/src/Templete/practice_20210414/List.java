package Templete.practice_20210414;

import java.util.ArrayList;

/**
 * @author TYX
 * @name List
 * @description ArrayList数据结构封装
 * @createTime 2021/4/14 14:17
 **/
public class List implements Sequence{
    private ArrayList<Integer> data;
    private int length;
    public List(ArrayList<Integer> data) {
        this.data=data;
        this.length=data.size();
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public int get(int i) {
        return data.get(i);
    }

    @Override
    public void set(int i, int value) {
        data.set(i,value);
    }
}
