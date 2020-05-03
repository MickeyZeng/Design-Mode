package simpleFactory;

public class SendMsgFactory {
    public static ISendMsg sendMsg(String type, String msg){
        if("AppleMessage".equals(type)){
            SmsSendMsg smsSendMsg = new SmsSendMsg();
            smsSendMsg.sendMsg(msg);
            return smsSendMsg;
        }

        if("Wechat".equals(type)){
            WeiXinSendMsg weiXinSendMsg = new WeiXinSendMsg();
            weiXinSendMsg.sendMsg(msg);
            return weiXinSendMsg;
        }

        WeiXinSendMsg weiXinSendMsg1 = new WeiXinSendMsg();

        return weiXinSendMsg1;
    }

    public static void main(String[] args) {
        ISendMsg iSendMsg = SendMsgFactory.sendMsg("AppleMessage", "Come on man");

        ISendMsg iSendMsg1 = SendMsgFactory.sendMsg("Wechat", "I send you by wechat");

    }
}
