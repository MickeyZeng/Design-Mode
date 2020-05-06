package abstractFactory;

public class SmsFactory implements Provider {
    @Override
    public ISendMsg create() {
        return new SmsSendMsg();
    }
}
