# Note 240508

## Review

## AM
### static 是 类 级别的
  - 扫描到了 就有内存分配了 
  - static 的方法 想访问 还没分配内存的 是访问不了的
  - 访问变量 或者 方法的时候 要确保他已经存在了

### abstract 
- 方法是 abstract 那么 类也得声明 abstract
- 类是 abstract 是 不能被 new 的(不能被实例化)
- 父类是 abstract 子类 也是 abstract 那么 父类的 abstract 的方法可以不在abstract的子类 override
- 不是 abstract 的子类 要 继承 abstract 父类 必须要重写 父类的 abstract 方法

### final
- 被 final 修饰,不能被改变,不管是 方法 还是 变量  

### 关于 计算 算法的操作时间 的反思
- 为啥第一次 没做出来 卡在哪里 ? 对于 多态 以及 abstract 用法的理解
- 多态三要素:
  1. 必须要有继承
  2. 必须要有Override
  3. 要有父类引用指向子类对象
  - 子类对象 是可以赋值给 父类对象的 但是 子类 比 父类多的那些方法赋值不过去
  - abstract 是必须 让你重新写父类方法 ,同时 父类的 abstract 的方法是没有方法体的
- 最后 在总结知识点的时候 发现 其实包装算法的那个类 是可以不用 abstract 的
### 思维 
- 可以猜测一个东西他大概有什么功能,根据猜测去寻找
  - 这感觉就像小时候玩手机 没有操作手册 去摸索一样
