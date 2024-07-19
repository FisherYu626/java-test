package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author JiaheYu
 * @data 2024/7/19 15:19
 */
public class re {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //forName是一个静态方法，其作用：通过调用来获取类名对应的Class对象，同时将Class对象加载进来。
        Class<?> cls = Class.forName("reflect.Caculate");

        //将对象实例化。返回类型为Object。与new的区别在于，new可以带参，
        // 而newInstance（）不可以，一边初始化无参类。通常与forName()配合使用。
        //newInstance方法返回无参数的构造函数
        Object o = cls.newInstance();

        //getMethod方法与getField方法类似，getField方法根据表示域名的字符串，
        // 返回一个Field对象。而getMethod方法则根据方法名称和相关参数，来定位需要查找的Method对象并返回。
        Method method = cls.getMethod("add", int.class, int.class);

        //invoke方法调用包装在当前Method对象中的方法。
        int res = (int) method.invoke(o, 3, 4);
        System.out.println(res);

        //该方法返回一个 Feild对象，它反映当前 Class对象所表示的类或接口的指定名称的 公共成员字段。name 用于指定所需字段的名称。
        Field field = cls.getField("name");

        //set方法将指定对象obj中成员变量的值设置为value
        field.set(o, "My Calculator!");

        //get(Object obj) 得指定对象obj中成员变量的值，返回值为Object型
        System.out.println(field.get(o));

        Constructor<?> constructor = cls.getConstructor(String.class);
        //cls.getConstructor()返回有参数的构造函数
        //将构造函数对象输出
        Object new_o = constructor.newInstance("New Calculator!");
        System.out.println(new_o);
    }
}
