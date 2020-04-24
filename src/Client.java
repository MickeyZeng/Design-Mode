public class Client {
    public static void main(String[] args) {

        //创建一个 大哥
        ConcreteSubject concreteSubject = new ConcreteSubject();

        //创建看着大哥的小弟们
        ConcreteObserver observer = new ConcreteObserver();
        ConcreteObserver observer1 = new ConcreteObserver();
        observer.setName("小弟1号");
        observer1.setName("小弟2号");

        //把他拉到大哥的怀里
        concreteSubject.addObserver(observer);

        //收多一个小弟
        concreteSubject.addObserver(observer1);

        //把小弟一号踢出去
        concreteSubject.deleteObserver(observer);

        //出去收保护费
        concreteSubject.broadcast();

    }
}
