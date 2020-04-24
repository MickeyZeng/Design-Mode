import java.util.Vector;

public class Subject {
    //Vector 用来保存观察者
    private Vector<Observer> oVector = new Vector<>();

    //增加一个观察者
    public void addObserver(Observer observer){
        this.oVector.add(observer);
    }

    //删除一个观察者
    public void deleteObserver(Observer observer){
        this.oVector.remove(observer);
    }

    //通知所有的观察者
    public void notifyObserver(){
        for(Observer observer : oVector ){
            observer.update();
        }
    }
}
