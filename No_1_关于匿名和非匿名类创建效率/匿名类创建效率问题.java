import java.util.HashMap;

/**
 * 描述信息：<br/>
 *
 * @author Xavier
 * @version 1.0
 * @date 2017.12.20
 * @since Jdk 1.8
 */
public class 匿名类创建效率问题 {

    private long count = 10000000;

    public void 匿名方式() {
        for (long i = 0; i < count; i++) {
            HashMap temp = new HashMap() {{
                put("姓名", "张三");
                put("年龄", "22");
            }};
        }
    }

    public void 非匿名方式() {
        for (long i = 0; i < count; i++) {
            HashMap temp = new HashMap();
            temp.put("姓名", "张三");
            temp.put("年龄", "22");
        }
    }

    public static void main(String[] args) {
        /*效率无明显差别*/

        匿名类创建效率问题 内容 = new 匿名类创建效率问题();
        Timer t1 = new Timer();
        内容.匿名方式();
        System.out.println("匿名方式" + t1.result(Timer.Precision.MSEC));
        Timer t2 = new Timer();
        内容.非匿名方式();
        System.out.println("非匿名方式" + t2.result(Timer.Precision.MSEC));
    }

}
