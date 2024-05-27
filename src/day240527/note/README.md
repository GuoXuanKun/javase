# Note 240527
## Review

## AM
### 查看 API 的能力很重要

### 增强 for 循环
- ![img.png](img.png)

### IDEA 文件夹 设置 ( 文件夹的路径就不会压缩 )
- ![img_1.png](img_1.png)

### Java 中带 名字带 s 的一般是工具类

### Collections 工具类
- Collections.shuffle()
  - 乱序 "洗牌"

### The List Interface
- A List is an ordered Collection(sometimes called a sequence).
  - 列表是有序的集合(有时称为序列)
- Lists may contain duplicate elements.
  - 列表可能包含重复的元素。
- more reading https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html

### Collection
- addAll
  - 按照指定集合的迭代器返回的顺序，将指定集合中的所有元素追加到该列表的末尾(可选操作)。
- containsAll
  - 如果此列表包含指定集合的所有元素，则返回true。
- removeAll
  - 从此列表中删除指定集合中包含的所有元素(可选操作)。
- reversed()
  - 返回此集合的反向顺序视图。返回视图中元素的相遇顺序与此集合中元素的相遇顺序相反。
- sort()
  - 根据指定比较器诱导的顺序对此列表进行排序。排序是稳定的:此方法不能对相等的元素重新排序。
- ### Collections 工具类
  - Collections.shuffle()
    - 使用默认的随机源随机排列指定的列表。所有排列发生的可能性大致相等。
- 代码截图
  - ![img_2.png](img_2.png)
  - ![img_3.png](img_3.png)