package factory_method_pattern;

/**
 * @author tianqi
 * @date 2018/12/15
 * 黑人
 */
public class BlackHuman implements Human{
    @Override
    public void laugh() {
        System.out.println("黑种人会笑，黑黑黑黑黑笑笑笑笑笑");
    }

    @Override
    public void cry() {
        System.out.println("黑种人会哭，黑黑黑黑黑哭哭哭哭哭");
    }

    @Override
    public void talk() {
        System.out.println("黑种人会聊天，黑黑黑黑黑说说说说说");
    }
}
