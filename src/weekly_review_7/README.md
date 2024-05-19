# Weekly Review 7

## day240513
- 远程代码回到某一时刻
  - git push -u origin xxx:main --force
- git 临时保存 commit
  - git stash
    - 临时保存 commit
  - git stash save '要保存的文件名'
    - 临时保存 commit 并且给个文件值
  - git stash list
    - 查看 stash 有没有东西
  - git stash pop
    - 出栈 commit
  - git stash apply stash{xxx}
    - 取特定的 commit
- interface 接口
  - 类要实现接口
      - 通过 implements
  - 类实现接口 要重写 接口的方法
  - 一个类 可以 实现多个接口
  - 接口里面 所有的抽象方法 都可以不用写 `public abstract`
### Link
- https://gitee.com/strong-wind-blowing/javase/tree/main/src/day240513/note

## day240514
### JDK 新功能查看
- https://openjdk.org/jeps/375

### 想要哪里稳定和可扩展
- 对哪里进行抽象

### SOLID
- ### 是面向对象设计和编程（OOP）中的五大设计原则
    - ### 单一职责原则（Single Responsibility Principle, SRP）：
        - 一个类只负责一项职责。
    - ### 开闭原则（Open-Closed Principle, OCP）：
        - 软件实体应当对扩展开放，对修改关闭。
    - ### 里氏替换原则（Liskov Substitution Principle, LSP）：
        - 子类型必须能够替换掉它们的基类型。
    - ### 接口隔离原则（Interface Segregation Principle, ISP）：
        - 使用多个专门的接口，而不使用单一的总接口，即客户端不应该依赖那些它不需要的接口。
    - ### 依赖倒置原则（Dependency Inversion Principle, DIP）：
        - 一种特定的解耦（通过抽象来引入间接层）形式，使得上层不依赖于下层，使它们都依赖于抽象层。
- 这些原则可以提高程序的可维护性、可读性和可复用性，降低代码之间的耦合程度。

### WIP
- "WIP" 是 "Work In Progress" 的缩写，中文意思是“进行中的工作”或“在制品”。
- 在项目管理和制造业中，"Work In Progress" (WIP) 通常用来描述尚未完成但已开始的工作或任务。这包括所有已经投入生产但还未成为最终产物的资源，也可能是在某个生产阶段停滞下来的部分生产品。对于正在进行的长期项目，或者需要跟踪任务进度，成品比例和剩余工作量的场景，"Work In Progress" 是一个非常重要的概念。

### Link
- https://gitee.com/strong-wind-blowing/javase/tree/main/src/day240514/note

## day240515
### 字符串 + 任何东西都是字符串
### 打印引用数据类型 打印出来的是地址
- 要打印出值,那就重写 toString()
### 包装类
- 包装类的拆箱与装箱 int -> Integer
### 注解
- @Deprecated
  - 在 Java 中，@Deprecated 是一个标记注解，用于指示某个程序元素（类，方法等）已经过时。这是一种提示给其他开发人员的信息，表示这个元素不再被推荐使用，可能在将来的版本中被删除或者不再维护。
- @SuppressWarnings
  - 在 Java 中 @SuppressWarnings 是一个注解，它告诉编译器忽略指定的警告。它只有一个字段“value”，可以接受一组待抑制的警告名称。
### 泛型 (Generics)
- Link -> https://docs.oracle.com/javase/tutorial/java/generics/why.html
- 泛型使类型（类和接口）在定义类、接口和方法时成为参数。
- 形式参数的输入是值，而类型参数的输入是类型。
### Link
- https://gitee.com/strong-wind-blowing/javase/tree/main/src/day240515/note