package strategy_pattern;

/**
 * @author tianqi
 * @date 2018/12/24
 */
public class GivenGreenLight implements IsStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行");
    }
}
