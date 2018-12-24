package strategy_pattern;

/**
 * @author tianqi
 * @date 2018/12/24
 */
public class BackDoor implements IsStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
