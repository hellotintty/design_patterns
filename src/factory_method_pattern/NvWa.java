package factory_method_pattern;

/**
 * @author tianqi
 * @date 2018/12/15
 * 女娲
 */
public class NvWa {
    public static void main(String[] arge){
        System.out.println("白人");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.cry();
    }
}
