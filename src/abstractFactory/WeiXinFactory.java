package abstractFactory;

public class WeiXinFactory implements Provider {
    @Override
    public ISendMsg create() {
        return new WeiXinSendMsg();
    }
}
