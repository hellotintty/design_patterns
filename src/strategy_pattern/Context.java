package strategy_pattern;

/**
 * @author tianqi
 * @date 2018/12/24
 */
public class Context {
    private IsStrategy isStrategy;
    public Context(IsStrategy isStrategy){
        this.isStrategy = isStrategy;
    }
    public void operate(){
        this.isStrategy.operate();
    }
}
