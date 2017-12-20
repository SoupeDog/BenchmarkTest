import java.util.ArrayList;
import java.util.Random;

/**
 * 描述信息：<br/>
 *
 * @author Xavier
 * @version 1.0
 * @date 2017.12.20
 * @since Jdk 1.8
 */
public class 判断null和false效率 {
    private int count = 50000000;

    ArrayList<Boolean> 分析结果 = new ArrayList();
    ArrayList<Boolean> 分析结果2 = new ArrayList();


    public 判断null和false效率() {
        init();
    }

    public void init() {
        Random random = new Random();
        long falseCount = 0;
        for (long i = 0; i < count; i++) {
            Boolean temp = random.nextBoolean();
            if (!temp) {
                falseCount += 1;
            }
            分析结果.add(temp);
        }
        System.out.println(falseCount);
        for (int i = 0; i < 分析结果.size(); i++) {
            Boolean temp = 分析结果.get(i);
            if (temp) {
                分析结果2.add(temp);
            } else {
                分析结果2.add(null);
            }
        }
    }

    public void 判断null() {
        int c = 0;
        for (int i = 0; i < count; i++) {
            Boolean temp = 分析结果2.get(i);
            if (temp == null) {
                c++;
            }
        }
        System.out.println(c);
    }

    public void 判断false() {
        int c = 0;
        for (int i = 0; i < count; i++) {
            Boolean temp = 分析结果.get(i);
            if (!temp) {
                c++;
            }
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        /*无明显差别*/
        判断null和false效率 内容 = new 判断null和false效率();
        Timer t1 = new Timer();
        内容.判断null();
        System.out.println("判断 null" + t1.result(Timer.Precision.MSEC));
        Timer t2 = new Timer();
        内容.判断false();
        System.out.println("判断 false" + t2.result(Timer.Precision.MSEC));


    }

}
