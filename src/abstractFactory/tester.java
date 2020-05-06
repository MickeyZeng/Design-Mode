package abstractFactory;

public class tester {
    public static void main(String[] args) {
        Provider smsPvdr = new SmsFactory();
        smsPvdr.create().sendMsg("短信服务...");

        Provider wxPvdr = new WeiXinFactory();
        wxPvdr.create().sendMsg("微信服务...");
    }
}
