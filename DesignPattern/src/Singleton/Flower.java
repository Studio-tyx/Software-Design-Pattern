package Singleton;

/**
 * @author TYX
 * @name Flower
 * @description 世界上唯一的花.mp3
 * @createTime 2021/4/29 9:08
 **/
public class Flower {
    private static Flower flower;
    public static Flower getFlower(){
        if(flower ==null)
            flower =new Flower();
        return flower;
    }
    private Flower() {
    }
}
