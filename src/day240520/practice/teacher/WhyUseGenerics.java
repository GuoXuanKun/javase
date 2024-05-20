package day240520.practice.teacher;

/**
 * <a href="https://docs.oracle.com/javase/tutorial/java/generics/why.html">Why Use Generics</a>
 * <br>
 * In a nutshell, generics enable types (classes and interfaces) to be parameters when defining classes, interfaces and methods. Much like the more familiar formal parameters used in method declarations, type parameters provide a way for you to re-use the same code with different inputs. The difference is that the inputs to formal parameters are values, while the inputs to type parameters are types.
 * 简而言之，泛型使类型（类和接口）在定义类、接口和方法时成为参数。与方法声明中使用的更熟悉的形式参数非常相似，类型参数提供了一种在不同输入中重用相同代码的方法。区别在于，形式参数的输入是值，而类型参数的输入是类型。
 * <br>
 * <ul>
 *     Code that uses generics has many benefits over non-generic code:
 *     与非泛型代码相比，使用泛型的代码具有许多优点：
 *     <li>
 *         Stronger type checks at compile time.
 *         在编译时进行更强的类型检查。
 *         A Java compiler applies strong type checking to generic code and issues errors if the code violates type safety. Fixing compile-time errors is easier than fixing runtime errors, which can be difficult to find.
 *         Java 编译器对泛型代码应用强类型检查，如果代码违反类型安全，则会发出错误。修复编译时错误比修复运行时错误更容易，后者可能难以找到。
 *     </li>
 *
 *     <li>
 *         Elimination of casts. 消除...
 *         without generics requires casting:
 *         不带泛型的代码片段需要强制转换：
 *             ... （见之前的代码）
 *         When re-written to use generics, the code does not require casting:
 *         重新编写为使用泛型时，代码不需要强制转换：
 *             ... // no cast （见之前的代码）
 *     </li>
 *
 *     <li>
 *         Enabling programmers to implement generic algorithms.
 *         使程序员能够实现通用算法。
 *         By using generics, programmers can implement generic algorithms that work on collections of different types, can be customized, and are type safe and easier to read.
 *         通过使用泛型，程序员可以实现适用于不同类型的集合的泛型算法，这些算法可以自定义，并且是类型安全且更易于阅读的。
 *     </li>
 * </ul>
 *
 */
public class WhyUseGenerics {
    public static void main(String[] args) {
        withoutGenerics();
        withGenerics();
    }

    private static void withoutGenerics() {
        //  note/img_12.png
    }

    private static void withGenerics() {
        // no cast
        //  note/img_13.png
    }
}
