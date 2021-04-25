package Observer.practice_20210407;

import java.util.List;

/**
 * @author TYX
 * @name Parent
 * @description 家长
 * @createTime 2021/4/7 14:35
 **/
public class Parent implements Observer{
    private String className;
    private String childID;

    public Parent(String className, String childID) {
        this.className = className;
        this.childID = childID;
    }

    @Override
    public void update(List<Score> scores) {
        System.out.println("家长:");
        ScoreUtils.getClassSection(scores,className);
        ScoreUtils.getStudent(scores,childID);
        System.out.println();
    }
}

