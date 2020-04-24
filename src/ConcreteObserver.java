public class ConcreteObserver implements Observer{

    //小弟们的名字
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("收到了大哥! 大哥我是" + this.getName());
    }
}
