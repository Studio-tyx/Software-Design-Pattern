package Command.practice_20210421;

/**
 * @author TYX
 * @name Switch
 * @description 开关
 * @createTime 2021/4/21 13:57
 **/
public class Switch {
    private String name;

    public Switch(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(name+" is on!");
    }

    public void off(){
        System.out.println(name+" is off!");
    }
}
