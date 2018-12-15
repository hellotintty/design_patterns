package factory_method_pattern;

/**
 * @author tianqi
 * @date 2018/12/15
 * 黄种人
 */
public class YellowHuman implements Human{
    @Override
    public void laugh() {
        System.out.println("黄种人会笑，黄黄黄黄黄笑笑笑笑笑");
    }

    @Override
    public void cry() {
        System.out.println("黄种人会哭，黄黄黄黄黄哭哭哭哭哭");
    }

    @Override
    public void talk() {
        System.out.println("黄种人会聊天，黄黄黄黄黄说说说说说");
    }
}
