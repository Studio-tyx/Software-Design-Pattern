package Observer.practice_20210407;

import java.util.List;

/**
 * @author TYX
 * @name Teacher
 * @description 老师
 * @createTime 2021/4/7 14:33
 **/
public class Teacher implements Observer{
    private String className;

    public Teacher(String className) {
        this.className = className;
    }

    @Override
    public void update(List<Score> scores) {
        System.out.println("老师:");
        ScoreUtils.getGradeMax(scores);
        ScoreUtils.getGradeMin(scores);
        ScoreUtils.getGradeMean(scores);
        ScoreUtils.getClassMax(scores,className);
        ScoreUtils.getClassMin(scores,className);
        ScoreUtils.getClassMean(scores,className);
        ScoreUtils.getClassSection(scores,className);
        System.out.println();
    }
}
