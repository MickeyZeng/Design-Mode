package simpleFactory;

public class SmsSendMsg implements ISendMsg {

    @Override
    public boolean sendMsg(String msg) {
        System.out.println(msg);
        return true;
    }
}
