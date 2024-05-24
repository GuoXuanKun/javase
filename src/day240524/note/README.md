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
      - 0
      - ![img_3.png](img_3.png)
    - 可以自己指定吗?怎么指定?
      - 通过 构造器 public ArrayList(Collection<? extends E> c) 
        - ![img_4.png](img_4.png)
        - ![img_5.png](img_5.png)
    - add 的时候超过数组长度，它是怎么处理的?
      - ![img_6.png](img_6.png)