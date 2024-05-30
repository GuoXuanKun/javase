# Note 240530

## Review 

### Filter
- ### FilenameFilter
  - FilenameFilter是一个接口，用来过滤文件名。这个接口的实例可用于 File 类的 list 方法中，以便筛选出符合条件的文件或文件夹名称。FilenameFilter只有一个方法 accept(File dir, String name)，返回一个布尔值，当返回 true 时，文件或文件夹名称被接受。
- ### FileFilter
  - FileFilter是一个接口，该接口用于过滤文件对象。它通常用于java.io.File类的listFiles()方法，这个方法返回一个文件对象数组，这些文件对象满足FileFilter接口的accept(File pathname)方法的条件。
  - 所述的FileFilter比FilenameFilter接口更强大，因为你可以检查除名称之外的其他属性，如文件大小、是否隐藏、是否可读写，等等。

### InputStream
- InputStream是所有字节输入流的超类，用于读取字节数据。它是一种抽象类，为子类提供了定义输入流的标准方法。

### InputStreamReader
- 从字节流到字符流的桥梁：它读取字节，并使用指定的字符集将其解码为字符。它的字符集可以由名称指定，也可以接受平台的默认字符集。

### OutputStream
- OutputStream 是所有类表示输出字节流的抽象类。输出字节流接收应用程序的字节，将它们传递给某种接收者，可能是文件、数组、网络连接等。接收者由所使用的具体 OutputStream 实例（也被称为流套接字）决定。

### FileInputStream
- 是用于读取文件的输入字节流。它是 InputStream 的子类，是从文件中读取数据的常用方式。
- 每一次读取的单位是 字节

### FileReader
- 是用于读取字符文件的便捷类。它的两大主要任务是创建一个 FileReader 对象以表现一个文件
- 使用 read() 方法一次读取一个字符或一次读多个字符。

### BufferedReader
- 用来读取文本，提供了缓冲读取的方法，可以提高文本读取的效率。此外，BufferedReader 还提供一种按行读取文本的方式，非常方便。

### URL
- 在Java中，URL是一个类，代表一个统一资源定位符，也就是网络资源的地址。这个类可以用于创建和解析URL，以及建立和网络资源的连接。
- 使用URL类的方法来获取URL的各个部分，例如协议、主机、端口号和资源路径等。你还可以使用URL类的方法来读取URL引用的资源。
- ### openConnection()
  - openConnection 是java.net.URL类的一个方法，它返回一个URLConnection对象，这个对象表示到URL引用的远程对象的连接。
  - 使用该方法可以建立一个到远程对象的实际连接，亦可用于读取和写入远程对象的数据。
  - 请注意，虽然openConnection方法创建了一个连接，但实际的网络连接不会通过调用openConnection就立即产生，而是在调用URLConnection对象的connect方法时才会产生。

### URI 
  - 用来标识抽象或物理资源的字符串。
  - 同URL(Uniform Resource Locator/统一资源定位符)相比，URI的使用范围更广，URL可以视作URI的一种，即URL是URI的一种特定形式，它包含了用于查找某个资源的足够的信息。
  - URI对象可以表示不完全指定的，或者相对的，URL路径信息。相较之下，URL对象必须表示完全指定的，或者绝对的，URL路径信息。因此，在处理需要解析的URL路径信息，或者在创建需要从已有的URL对象派生的URL对象时，URI类可以提供比URL类更合适的功能。



### 截图寄存器
