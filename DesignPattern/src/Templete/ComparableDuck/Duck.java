package Templete.ComparableDuck;

/**
 * @author TYX
 * @name Duck
 * @description ppt例子
 * @createTime 2021/4/18 9:45
 **/
public class Duck implements Comparable{
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Object o) {
        Duck other=(Duck)o;
        if(this.weight<other.weight)    return -1;
        else if(this.weight==other.weight)  return 0;
        else return 1;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
