import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 描述信息：<br/>
 *
 * @author Xavier
 * @version 1.0
 * @date 2018.1.09
 * @since Jdk 1.8
 */
public class 大于与大于等于 {

    private int count = 100000000;
    private int cout_大于;
    private int cout_大于等于;

    private ArrayList<Integer> list;

    {
        list = new ArrayList();
        for (int i = 0; i < count; i++) {
            list.add(20);
        }
    }


    public void 大于() {
        for (int i = 0; i < count; i++) {
            if (list.get(i) > 19) {
                cout_大于 += 1;
            }
        }
        System.out.println(cout_大于);
    }

    public void 大于等于() {
        for (int i = 0; i < count; i++) {
            if (list.get(i) >= 20) {
                cout_大于等于 += 1;
            }
        }
        System.out.println(cout_大于等于);
    }

    public static void main(String[] args) {
        // 无明显差别
        大于与大于等于 内容 = new 大于与大于等于();
        Timer t1 = new Timer();
        内容.大于();
        System.out.println(t1.result(Timer.Precision.MSEC));
        Timer t2 = new Timer();
        内容.大于等于();
        System.out.println(t2.result(Timer.Precision.MSEC));
    }
}
