# Note

## Review

## AM

### IDEA 跳出 add file to Git 窗口
- ![img.png](img.png)

### 字符串 + 任何东西都是字符串

### 打印引用数据类型 打印出来的是地址.
- 要打印出值,那就重写 toString() 

### 包装类
- ### Byte
- ### Short
- ### Integer
  - int 对应的`包装类`
  - int 会自动转成 Integer (自动装箱 就是自动 new Integer(1))
    - ![img_1.png](img_1.png)
    - ![img_2.png](img_2.png)
    - ![img_4.png](img_4.png)
- ### Long
- ### Float
- ### Double
- ### Character
- ### Boolean

### String
- 为什么 String 不用 new
  - 自动 new 了 
    - ![img_6.png](img_6.png)

### 注解
- @Deprecated
- 在 Java 中，@Deprecated 是一个标记注解，用于指示某个程序元素（类，方法等）已经过时。这是一种提示给其他开发人员的信息，表示这个元素不再被推荐使用，可能在将来的版本中被删除或者不再维护。
  - ![img_3.png](img_3.png)
- @SuppressWarnings
  - 在 Java 中 @SuppressWarnings 是一个注解，它告诉编译器忽略指定的警告。它只有一个字段“value”，可以接受一组待抑制的警告名称。
  - ![img_11.png](img_11.png)

### 包装类的拆箱与装箱
- int ( 总结 )
  - ![img_5.png](img_5.png)

## PM

### 泛型 (Generics)
- Link -> https://docs.oracle.com/javase/tutorial/java/generics/why.html
- 泛型使类型（类和接口）在定义类、接口和方法时成为参数。
- 形式参数的输入是值，而类型参数的输入是类型。
- ![img_10.png](img_10.png)
- ![img_8.png](img_8.png)
- ![img_7.png](img_7.png)
- ![img_9.png](img_9.png)

### 快捷键
- ctrl + r -> 替换