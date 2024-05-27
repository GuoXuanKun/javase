package day240527.practice.me;

import java.util.ArrayList;
import java.util.List;

public class CollectionCommonMethod3 {
    public static void main(String[] args) {
        List<Integer> is1 = new ArrayList<>();
        is1.add(1);
        is1.add(2);
        is1.add(3);

        List<Integer> is2 = new ArrayList<>();
        is2.add(1);
        is2.add(3);
        is2.add(8);

        // addAll
        is1.addAll(is2);
        System.out.println(is1);

//        // containsAll 包含
//        System.out.println(is1.containsAll(is2));
//
//        // removeAll 从 1 里面 删除 2 里面有的
//        is1.removeAll(is2);
//        System.out.println(is1);


        // reversed() 逆序输出
        // Returns a reverse-ordered view of this collection.  The encounter order of elements in the returned view is the inverse of the encounter order of elements in this collection.  The reverse ordering affects all order-sensitive operations, including those on the view collections of the returned view.  If the collection implementation permits modifications to this view, the modifications "write through" to the underlying collection.  Changes to the underlying collection might or might not be visible in this reversed view, depending upon the implementation
        // 返回此集合的反向顺序视图。返回视图中元素的相遇顺序与此集合中元素的相遇顺序相反。反向排序影响所有顺序敏感的操作，包括对返回视图的视图集合的操作。如果集合实现允许对该视图进行修改，则修改将“透写”到底层集合。对底层集合的更改在这个反向视图中可能是可见的，也可能是不可见的，这取决于实现
        List<Integer> reversed = is1.reversed();
        System.out.println(reversed);
    }
}
