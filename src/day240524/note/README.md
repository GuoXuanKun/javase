# Note 240524
## Review

## AM
### 集合
- ![img.png](img.png)
- ### ArrayList
  - ### 源码
    - ![img_1.png](img_1.png)
  - ### Questions
    - ArrayList 的底层用什么存储的?
      - Object[]
      - ![img_2.png](img_2.png)
    - 初始数组长度是多少?
      - 如果 new() ,是 0 ; 如果 不是调用空参构造器 是 10
      - ![img_8.png](img_8.png)
    - 可以自己指定吗?怎么指定?
      - 通过 构造器 public ArrayList(Collection<? extends E> c) 
        - ![img_4.png](img_4.png)
        - ![img_5.png](img_5.png)
    - add 的时候超过数组长度，它是怎么处理的?
      - ![img_7.png](img_7.png)
### 在线查看 JDk API
- https://docs.oracle.com/en/java/javase/21/docs/api/index.html