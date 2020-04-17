package design.create.factory;

/**
 * User: 20160301301
 * Date: 2017/9/12 16:42
 * Comment:
 */
public class SendFactory {

    /**普通工厂方法
     * 建立一个工厂类，对实现了同一接口的一些类进行实例的创建*/
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }

    /**多工厂方法
     * 多个工厂方法模式是提供多个工厂方法，分别创建对象*/
//    public MailSender produceMail(){
//        return new MailSender();
//    }
//
//    public SmsSender produceSms() {
//        return new SmsSender();
//    }

    /**静态工厂方法
     * 将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可*/
    public static MailSender produceMail(){
        return new MailSender();
    }

    public static SmsSender produceSms(){
        return new SmsSender();
    }
}