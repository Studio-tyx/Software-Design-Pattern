package Facade;

/**
 * @author TYX
 * @name 一键三连
 * @description
 * @createTime 2021/5/1 18:45
 **/
public class 一键三连 {
    点赞 dz;
    投币 tb;
    收藏 sc;

    public 一键三连(点赞 dz, 投币 tb, 收藏 sc) {
        this.dz = dz;
        this.tb = tb;
        this.sc = sc;
    }

    public void press(){
        dz.press();
        tb.press();
        sc.press();
    }
}
