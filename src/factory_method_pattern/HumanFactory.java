package factory_method_pattern;

/**
 * @author tianqi
 * @date 2018/12/15
 * 八卦炉，造人工厂
 */
public class HumanFactory {
    public static Human createHuman(Class c){
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误");
        } catch (InstantiationException e) {
            System.out.println("必须指定颜色啊");
        } catch (ClassNotFoundException e) {
            System.out.println("你指定的人类找不到");
        }
        return human;
    }
}
