package Observer.practice_20210407;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TYX
 * @name ExamSystem
 * @description
 * @createTime 2021/4/7 14:02
 **/
public class ExamSystem implements Subject {
    private List<Observer> observers;
    private List<Score> scores;

    public ExamSystem() {
        observers=new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(scores);
        }
    }
}
