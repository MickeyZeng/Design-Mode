package oberver;

public class ConcreteSubject extends Subject {

    public void broadcast(){

        System.out.println("小弟们 去收保护费了！");

        super.notifyObserver();

    }
}
