import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 描述信息：<br/>
 *
 * @author Xavier
 * @version 1.0
 * @date 2018.03.16
 * @since Jdk 1.8
 */
public class No_6_字符截取耗时 {
    private Integer countAPI = 10;
    private Integer countUser = 1;
    private Integer countOrder = 6;

    private ArrayList<String> pathList = new ArrayList();
    private ArrayList<String> userList = new ArrayList();
    private ArrayList<String> orderList = new ArrayList();

    private ArrayList<String> targetList = new ArrayList();
    private ArrayList<String> resultList = new ArrayList();

    public ArrayList<String> getResultList() {
        return resultList;
    }

    public void setResultList(ArrayList<String> resultList) {
        this.resultList = resultList;
    }

    public void initData() {
        for (int i = 0; i < countAPI; i++) {
            pathList.add(UUID.randomUUID().toString().replace("-", "").substring(0, 16));
        }
        for (int i = 0; i < countUser; i++) {
            userList.add(UUID.randomUUID().toString().replace("-", ""));
        }
        for (int i = 0; i < countOrder; i++) {
            orderList.add(UUID.randomUUID().toString().replace("-", "").substring(0, 4));
        }
    }

    public void initKey() {
        for (int i = 0; i < countAPI; i++) {
            Integer random = ThreadLocalRandom.current().nextInt(orderList.size());
            targetList.add(createKey(pathList.get(i), orderList.get(random)));
        }
    }

    public String createKey(String customer, String customer2) {
        final StringJoiner joiner = new StringJoiner(":");
        joiner.add(userList.get(0));
        joiner.add(customer);
        joiner.add(customer2);
        return joiner.toString();
    }

    public void resolvePath(Integer target) {
        for (String temp : targetList) {
            String[] array = temp.split(":");// 拆分 {Path}:策略Id
            if (array[1].equals(pathList.get(target))) {
                resultList.add(temp.substring(50));// 取 策略 Id
            }
        }
    }

    public static void main(String[] args) {
        No_6_字符截取耗时 内容 = new No_6_字符截取耗时();
        内容.initData();
        内容.initKey();
        Timer t1 = new Timer();
        for (int i = 0; i < 100000; i++) {
            内容.resolvePath(i % 10);
        }
        System.out.println(t1.result(Timer.Precision.MSEC));
        ArrayList list = 内容.getResultList();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
