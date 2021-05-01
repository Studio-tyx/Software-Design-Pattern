package Facade;

/**
 * @author TYX
 * @name Main
 * @description
 * @createTime 2021/5/1 18:47
 **/
public class Main {
    public static void main(String[] args) {
        点赞 dz=new 点赞();
        投币 tb=new 投币();
        收藏 sc=new 收藏();
        一键三连 thankGod=new 一键三连(dz,tb,sc);
        thankGod.press();
    }
}
