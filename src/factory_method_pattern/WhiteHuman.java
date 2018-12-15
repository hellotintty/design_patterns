package factory_method_pattern;

/**
 * @author tianqi
 * @date 2018/12/15
 * 白种人
 */
public class WhiteHuman implements Human{
    @Override
    public void laugh() {
        System.out.println("白种人会笑，白白白白白白笑笑笑笑笑");
    }

    @Override
    public void cry() {
        System.out.println("白种人会哭，白白白白白哭哭哭哭哭");
    }

    @Override
    public void talk() {
        System.out.println("白种人会聊天，白白白白白说说说说说");
    }
}
