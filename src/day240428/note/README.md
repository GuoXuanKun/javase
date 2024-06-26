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

## PM
### controlled experiment of override (重写的对照实验) 实验报告
- 重写要起作用 要有以下因素
  - 方法名 ( 形参列表 types )
    - 父类被重写的方法与子类重写的方法的方法名和形参列表 types 必须相同
  - 访问权限修饰符
    - 子类重写的方法权限修饰符不小于父类被重写的方法的权限修饰符
    - 子类不能重写父类中声明为 private 权限修饰的方法
    - ![img_9.png](img_9.png)
  - 返回值类型
    - void
      - 父类被重写的方法的返回值类型是void，则子类重写的方法的返回值类型必须是void
    - 非 void 
      - 父类被重写的方法的返回值类型是基本数据类型，则子类重写的方法的返回值类型必须与被重写的方法的返回值类型相同
      - 父类被重写的方法的返回值类型是引用数据类型(比如类)，则子类重写的方法的返回值类型可以与被重写的方法的返回值类型相同 或 是被重写的方法的返回值类型的子类
    - ![img_10.png](img_10.png)
  - 异常
    - 子类重写的方法抛出的异常类型可以与父类被重写的方法抛出的异常类型相同，或是父类被重写的方法抛出的异常类型的子类
      - ![img_11.png](img_11.png)
  - 方法体
    - 没有硬性要求
    - 但是子类重写的方法的方法体理应与父类被重写的方法的不同，否则没有重写的必要
      - ![img_12.png](img_12.png)

## 技巧 (还是得多注意 细节 ) 
- 从 commit 要写上 关键点 (最好中英文都写) 方便后期查找 
  - 记得今天的 this 
- 可以 多面试 几家公司 为真正想去的公司的面试打基础 
  

## 思维
- 换位思考 也可以用到编程 
  - 引用到别人的类 可以猜一下 如果是你会大概提供什么样的方法
- 类比学习法
  - 通过已有的 , 类比 看看会不会存在同样方式 创造的不一样的 类型
- **清空** 的学习状态
  - 类似于 今天老师提问 并且引出的 super.
  - 碰到陌生的,可以用已知的,用类比的方法,推出有可能的方法,再去验证它
  - 如果会了,可以类比,什么东西跟这个相似,比如说 this 与 super