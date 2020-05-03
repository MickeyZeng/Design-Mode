package simpleFactory;

public class WeiXinSendMsg implements  ISendMsg {
    @Override
    public boolean sendMsg(String msg) {
        System.out.println(msg);
        return true;
    }
}
