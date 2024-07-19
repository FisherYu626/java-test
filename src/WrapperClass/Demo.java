package WrapperClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author JiaheYu
 * @data 2024/6/2 22:05
 */
public class Demo {
    public static void main(String[] args) {
        byte aByte;
        short aShort;
        int aInt;
        long aLong;
        float aFloat;
        double aDouble;
        char aChar;
        boolean aBoolean;

        //集合类型要求元素必须是引用类型
        List<Byte> list = new ArrayList<>();
        Set<Short> set = new HashSet<>();

        Byte b;
        Short s;
        Integer i;
        Long l;
        Float f;
        Double d;
        Character c;
        Boolean boo;

        //提供基本数据类型的常用属性
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //提供基本数据类型的常用方法
        System.out.println(Integer.valueOf("100"));

    }

}
