# 学习参考

[《Head First Design Patterns》](https://learning.oreilly.com/library/view/head-first-design/0596007124/)

[极客时间《设计模式之美》](https://time.geekbang.org/column/intro/250)



# 设计模式分类

我们常把 23 种经典的设计模式分为三类：创建型、结构型、行为型。

设计模式要干的事情就是解耦，创建型模式是将创建和使用代码解耦，结构型模式是将不同功能代码解耦，行为型模式是将不同的行为代码解耦

## 创建型

创建型设计模式主要解决“对象的创建”问题。

[单例模式](https://github.com/neilz753/DesignPatterns/blob/master/src/main/java/singleton/单例模式.md)、[工厂模式](https://github.com/neilz753/DesignPatterns/blob/master/src/main/java/factory/工厂模式.md)、建造者模式、原型模式

## 结构型

结构型设计模式主要解决“类或对象的组合或组装”问题。

代理模式、桥接模式、[装饰者模式](https://github.com/neilz753/DesignPatterns/blob/master/src/main/java/decorator/装饰者模式.md)、[适配器模式](https://github.com/neilz753/DesignPatterns/blob/master/src/main/java/adapterandfacade/适配器和外观模式.md)、[门面模式](https://github.com/neilz753/DesignPatterns/blob/master/src/main/java/adapterandfacade/适配器和外观模式.md)、组合模式、享元模式

## 行为型

行为型设计模式主要解决的就是“类或对象之间的交互”问题。

[观察者模式](https://github.com/neilz753/DesignPatterns/blob/master/src/main/java/observer/观察者模式.md)、模板模式、[策略模式](https://github.com/neilz753/DesignPatterns/blob/master/src/main/java/strategy/1.设计模式入门-策略模式.md)、职责链模式、状态模式、迭代器模式、访问者模式、备忘录模式、[命令模式](https://github.com/neilz753/DesignPatterns/blob/master/src/main/java/command/命令模式.md)、解释器模式、中介模式



## 设计模式非常相似的问题

比如：命令模式跟策略模式、工厂模式非常相似。

每个设计模式都应该由两部分组成：

第一部分是**应用场景**，即这个模式可以解决哪类问题；

第二部分是**解决方案**，即这个模式的设计思路和具体的代码实现。

不过，代码实现并不是模式必须包含的。如果你单纯地只关注解决方案这一部分，甚至只关注代码实现，就会产生大部分模式看起来都很相似的错觉。

**设计模式之间的主要区别还是在于设计意图，也就是应用场景。单纯地看设计思路或者代码实现，有些模式确实很相似。**