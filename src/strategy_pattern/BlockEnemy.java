package strategy_pattern;

/**
 * @author tianqi
 * @date 2018/12/24
 */
public class BlockEnemy implements IsStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
