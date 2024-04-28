# Note 240428

## Review


## AM

### native 
- 底层是调用类库的代码 (这个代码有可能不是 Java)

### 链式调用
- ![img.png](img.png)
- ![img_1.png](img_1.png)
- 返回值可以自己改 从而实现连续set
  - ![img_2.png](img_2.png)
- getFields() 只返回 public 的变量 其余的 返回 0
  - ![img_3.png](img_3.png)
- getDeclareFields() 可以获取 所有的 访问权限修饰符 的变量
  - ![img_5.png](img_5.png)

### 怎么判断是不是同名
- 打印出来就知道了

### foreach
- ![img_4.png](img_4.png)

### Unified Modeling Language
- ![img_7.png](img_7.png)
- ![img_8.png](img_8.png)
- 

## 思维
- 换位思考 也可以用到编程 
  - 引用到别人的类 可以猜一下 如果是你会大概提供什么样的方法
- 类比学习法
  - 通过已有的 , 类比 看看会不会存在同样方式 创造的不一样的 类型