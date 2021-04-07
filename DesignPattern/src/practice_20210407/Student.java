package practice_20210407;

import java.util.List;

/**
 * @author TYX
 * @name Student
 * @description 学生
 * @createTime 2021/4/7 14:37
 **/
public class Student implements Observer{
    private String id;

    public Student(String id) {
        this.id = id;
    }

    @Override
    public void update(List<Score> scores) {
        System.out.println("学生:");
        ScoreUtils.getStudent(scores,id);
        System.out.println();
    }
}
