package abstractFactory;

public class SmsSendMsg implements ISendMsg {
    @Override
    public boolean sendMsg(String msg) {
        System.out.println("发送:" + msg);
        return true;
    }
}
