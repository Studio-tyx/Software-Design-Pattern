package Templete.ComparableDuck;

import java.util.Arrays;

/*
因为不太懂模版方法模式和策略模式的区别（感觉上次上机写的非常像策略模式）
    因为策略模式使用对象组合，我们这里用数组对象来排序
    但是在策略模式中，组合的类实现整个算法。数组实现的排序算法并不完整，需要一个类来填补空缺的compareTo() 方法. 所以，它是模板方法模式
实际上并不是策略模式 我觉得上次上机写的确实是模版方法
 */
/**
 * @author TYX
 * @name Main
 * @description 主函数类
 * @createTime 2021/4/18 9:47
 **/
public class Main {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2) };
        for(Duck duck:ducks){
            System.out.println(duck);
        }
        System.out.println();
        Arrays.sort(ducks);
        for(Duck duck:ducks){
            System.out.println(duck);
        }
        System.out.println();
    }
}
