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

