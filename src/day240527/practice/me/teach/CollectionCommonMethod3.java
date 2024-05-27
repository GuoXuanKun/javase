package day240527.practice.me.teach;

import java.util.ArrayList;
import java.util.List;

public class CollectionCommonMethod3 {
    public static void main(String[] args) {
        List<Integer> is1 = new ArrayList<>();
        is1.add(1);
        is1.add(2);
        is1.add(3);
        is1.add(4);
        is1.add(5);

        List<Integer> is2 = new ArrayList<>();
        is2.add(1);
        is2.add(3);
        is2.add(8);

        // addAll
        // 按照指定集合的迭代器返回的顺序，将指定集合中的所有元素追加到该列表的末尾(可选操作)。
        is1.addAll(is2);
        System.out.println(is1);

        // containsAll
        // 如果此列表包含指定集合的所有元素，则返回true。
        System.out.println(is1.containsAll(is2));

        // removeAll
        // 从此列表中删除指定集合中包含的所有元素(可选操作)。
        is1.removeAll(is2);
        System.out.println(is1);

        // reversed()
        // 返回此集合的反向顺序视图。返回视图中元素的相遇顺序与此集合中元素的相遇顺序相反。
        List<Integer> reversed = is1.reversed();
        System.out.println(reversed);
    }
}
