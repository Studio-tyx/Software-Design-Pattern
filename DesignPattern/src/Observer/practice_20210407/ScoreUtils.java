package Observer.practice_20210407;

import java.util.List;

/**
 * @author TYX
 * @name ScoreUtils
 * @description 工具类 方便计算各项成绩
 * @createTime 2021/4/7 14:19
 **/
public final class ScoreUtils {
    public static void getGradeMax(List<Score> gradeScores){
        double max=0.0;
        for(Score score:gradeScores){
            if(score.score>max){
                max= score.score;
            }
        }
        System.out.println("年级最高分为:"+max);
    }
    public static void getGradeMin(List<Score> gradeScores){
        double min=101.0;
        for(Score score:gradeScores){
            if(score.score<min){
                min= score.score;
            }
        }
        System.out.println("年级最低分为:"+min);
    }
    public static void getGradeMean(List<Score> gradeScores){
        double total=0.0;
        for(Score score:gradeScores){
            total+=score.score;
        }
        System.out.println("年级均分为:"+total/(double)gradeScores.size());
    }
    public static void getGradeSection(List<Score> gradeScores){
        int A=0,B=0,C=0,D=0,F=0;
        for(Score score:gradeScores){
            if(score.score>=90.0) A++;
            else if(score.score>=80.0) B++;
            else if(score.score>=70.0) C++;
            else if(score.score>=60.0) D++;
            else F++;
        }
        System.out.println("年级分数段为:");
        System.out.println("优秀人数:"+A);
        System.out.println("良好人数:"+B);
        System.out.println("中等人数:"+C);
        System.out.println("及格人数:"+D);
        System.out.println("不及格人数:"+F);
    }
    public static void getClassMax(List<Score> gradeScores,String className){
        double max=0.0;
        for(Score score:gradeScores){
            if(score.id.startsWith(className)&&score.score>max){
                max= score.score;
            }
        }
        System.out.println("班级最高分为:"+max);
    }
    public static void getClassMin(List<Score> gradeScores,String className){
        double min=101.0;
        for(Score score:gradeScores){
            if(score.id.startsWith(className)&&score.score<min){
                min= score.score;
            }
        }
        System.out.println("班级最低分为:"+min);
    }
    public static void getClassMean(List<Score> gradeScores,String className){
        double total=0.0;
        int count=0;
        for(Score score:gradeScores){
            if(score.id.startsWith(className)){
                total+=score.score;
                count++;
            }
        }
        System.out.println("班级均分为:"+total/(double)count);
    }
    public static void getClassSection(List<Score> gradeScores,String className){
        int A=0,B=0,C=0,D=0,F=0;
        for(Score score:gradeScores){
            if(score.id.startsWith(className)) {
                if (score.score >= 90.0) A++;
                else if (score.score >= 80.0) B++;
                else if (score.score >= 70.0) C++;
                else if (score.score >= 60.0) D++;
                else F++;
            }
        }
        System.out.println("班级分数段为:");
        System.out.println("优秀人数:"+A);
        System.out.println("良好人数:"+B);
        System.out.println("中等人数:"+C);
        System.out.println("及格人数:"+D);
        System.out.println("不及格人数:"+F);
    }
    public static void getStudent(List<Score> gradeScores,String id){
        for(Score score:gradeScores){
            if(score.id.equals(id)){
                System.out.println("孩子的分数为:"+score.score);
            }
        }
    }
}