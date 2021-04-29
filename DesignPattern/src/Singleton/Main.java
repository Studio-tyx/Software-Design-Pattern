package Singleton;

/**
 * @author TYX
 * @name Main
 * @description
 * @createTime 2021/4/29 9:11
 **/
public class Main {
    public static void main(String[] args) {
        Flower flower = Flower.getFlower();
        System.out.println(flower);

        Flower flower1 = Flower.getFlower();
        System.out.println(flower1);
    }
}
