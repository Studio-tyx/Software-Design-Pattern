package practice_20210407;

import java.util.List;

/**
 * @author TYX
 * @name Administrator
 * @description 教务管理员
 * @createTime 2021/4/7 14:11
 **/
public class Administrator implements Observer{
    @Override
    public void update(List<Score> scores) {
        System.out.println("教务管理员:");
        ScoreUtils.getGradeMax(scores);
        ScoreUtils.getGradeMin(scores);
        ScoreUtils.getGradeMean(scores);
        ScoreUtils.getGradeSection(scores);
        System.out.println();
    }
}
