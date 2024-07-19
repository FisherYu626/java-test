package Containers;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author JiaheYu
 * @data 2024/7/19 14:44
 */
public class set {
    public static void main(String[] args) throws IOException {
        //自动插箱 自动装箱
        // 自动装箱
        Integer num1 = 10; // 将 int 赋给 Integer 对象

        // 自动拆箱
        int num2 = num1; // 将 Integer 对象赋给 int 变量

        System.out.println("num1: " + num1); // 输出：num1: 10
        System.out.println("num2: " + num2); // 输出：num2: 10


        HashSet<Integer> s = new HashSet<>();
        for(int i = 0;i<10;i++){
            s.add(i);
        }

        for(int i = 0;i<10;i++){
            System.out.println(i);
        }

        HashMap<String,Integer> h = new HashMap<>();
        h.put("hell",3);
        System.out.println(h);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Hello World\n");
        bw.flush();  // 需要手动刷新缓冲区
    }
}
