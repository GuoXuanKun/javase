# Note 240605

## Review

### 正则表达式
- 关注 Pattern 类 
  - Pattern.compile()
  - Pattern.matcher
- 详细的正则表达式规则，不用死记硬背，可以自己阅读 Pattern 源码的文档注释

### 网页解析是这么抓取信息的
- ![img_1.png](img_1.png)

### 一切 皆对象
- ![img_2.png](img_2.png)

### DateTime 时间相关的类
- now() 方法展示如何获取当前的日期、时间和日期时间。
  - LocalDate.now() 获取当前日期。
  - LocalTime.now() 获取当前时间。
  - LocalDateTime.now() 获取当前的日期和时间。
   
- of() 方法
  - 展示如何创建特定的日期、时间和日期时间。
  - LocalDate.of(year, month, day) 创建一个特定的日期。 
  - LocalTime.of(hour, minute, second) 创建一个特定的时间。
  - LocalDateTime.of(year, month, day, hour, minute, second) 创建一个特定的日期时间。

- getXxx() 方法
  - 展示如何从LocalDateTime对象获取年中的第几天、月中的第几天、星期几、月份、月份值和小时。
  - getDayOfYear() 获取年中的第几天。 - getDayOfMonth() 获取月中的第几天。
  - getDayOfWeek() 获取星期几。
  - getMonth() 获取月份。
  - getMonthValue() 获取月份的数值。
  - getHour() 获取小时数。
  
- withXxx() 方法
  - 展示如何修改LocalDateTime对象的特定部分。
  - withHour(hour) 设置小时数。

- plusXxx() 方法
  - 展示如何对LocalDateTime对象进行日期时间的加减操作。
  - plusDays(daysToAdd) 在当前日期上加上指定的天数。

-  minusXxx() 方法
  - 类似于plusXxx()，但用于减去时间。
  - minusMonths(monthsToSubtract) 从当前日期减去指定的月数。

- instant() 方法
  - 展示如何处理Instant和时区。
  - Instant.now() 获取当前的瞬时时间点。
  - ZoneId.getAvailableZoneIds() 获取所有可用的时区ID。
  - instant.atZone(ZoneId) 将Instant转换为特定时区(ZoneId.of("Asia/Shanghai"))的ZonedDateTime。
    - ZoneId.of(ZoneId.SHORT_IDS.get("CTT"))
  -  toLocalDateTime() 将ZonedDateTime转换为LocalDateTime。

- format() 方法
  - 展示如何格式化和解析日期时间字符串。
  - 使用DateTimeFormatter定义日期时间的格式。
  - LocalDateTime.parse(CharSequence, DateTimeFormatter) 解析符合特定格式的字符串为LocalDateTime。
  - Duration.between(start, end) 计算两个时间点之间的持续时间。
  - between.toHours()
  - 比较两个LocalDateTime对象（是否相等、前后关系等）。
    - localDateTime1.isAfter(localDateTime)
    - localDateTime1.isBefore(localDateTime)
    - localDateTime1.isEqual(localDateTime)
    - (localDateTime.getNano() >= localDateTime1.getNano()
    - localDateTime.compareTo(localDateTime1)
  - toString() 和 formatter.format() 将LocalDateTime转换为字符串。
### 反射
- ![img_5.png](img_5.png)
- Class<?> downloaderClass = Class.forName(clazzName); 这行代码使用Class.forName方法根据类名字符串加载类。downloaderClass是一个Class对象，代表了加载的类。
Constructor<?> declaredConstructor = downloaderClass.getDeclaredConstructor(); 这行代码获取downloaderClass的无参构造函数。getDeclaredConstructor方法返回一个Constructor对象，表示找到的构造函数。
  instance = (T) declaredConstructor.newInstance(); 这行代码调用构造函数的newInstance方法来创建类的实例。由于newInstance方法返回的是Object类型，所以这里进行了类型转换。


### 虚拟机
- ![img_3.png](img_3.png)
- -verbose:class
- ![img_4.png](img_4.png)


### 截图寄存处
![img.png](img.png)