# 模板方法
定义：

定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改变一个算法的结构既可重定义该算法的某些特定步骤。


优点：

1. 封装不变部分，扩展可变部分
2. 提取公共部分代码，容易为何不
3. 行为由父类控制，子类实现