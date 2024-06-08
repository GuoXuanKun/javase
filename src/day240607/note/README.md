# Note 240607
## Review


### 多线程
- 如何启动多线程
  - ![img.png](img.png)
  - 方式 1 : 
    - ![img_1.png](img_1.png)
    - ![img_2.png](img_2.png)
  - 方式 2 :
    - ![img_3.png](img_3.png)
    - ![img_4.png](img_4.png)
  - 要执行的代码放到 run() 的方法体里面
  - 开辟新线程 : 调用方法 start()
  - 获取名称
    - ![img_5.png](img_5.png)
    - ![img_6.png](img_6.png)
  - ![img_7.png](img_7.png)
- 方法
  - Thread.sleep()
    - 睡眠 
  - join()
    - 是用来让当前执行线程等待 join() 方法所属的线程完成，然后再继续执行。
  - Thread.yield()
    - 主动让出处理机资源
  - setPriority()
  - ![img_10.png](img_10.png)
    - Thread.NORM_PRIORITY
      - 优先级权限 
  - isAlive()
  - ![img_11.png](img_11.png)
    - 用来检查一个线程是否还在运行 返回类型 Boolean
### lambda
  - ![img_8.png](img_8.png)
  - ![img_9.png](img_9.png)
### 截图寄存处
