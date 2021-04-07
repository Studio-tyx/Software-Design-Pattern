package practice_20210407;

import java.util.ArrayList;
import java.util.List;
/*
第一次上机题：某学校考试系统的用户包括教师、学生、家长、教务管理员等。
一门考试结束自动评分，分数发布出来后，
教务管理员会收到全年级统计数据（最高/低分，均分，分数段统计）；
教师会收到自己班级所有学生的分数及相关统计数据（包括年级均分和最高/最低分、班级均分和最高最低分、班级分数段统计）；
家长会收到自己孩子分数及班级分数段统计；
孩子会收到自己的分数。
 */
/**
 * @author TYX
 * @name Main
 * @description 主函数
 * @createTime 2021/4/7 14:38
 **/
public class Main {
    public static void main(String[] args) {
        ExamSystem examSystem=new ExamSystem();
        Administrator administrator=new Administrator();
        Teacher teacher=new Teacher("1");
        Parent parent=new Parent("1","101");
        Student student=new Student("101");

        examSystem.registerObserver(administrator);
        examSystem.registerObserver(teacher);
        examSystem.registerObserver(parent);
        examSystem.registerObserver(student);

        List<Score> scores=new ArrayList<>();
        Score score=new Score("101",75.0);
        scores.add(score);
        score=new Score("102",95.0);
        scores.add(score);
        score=new Score("201",85.0);
        scores.add(score);
        examSystem.setScores(scores);
        examSystem.notifyObservers();
    }
}
