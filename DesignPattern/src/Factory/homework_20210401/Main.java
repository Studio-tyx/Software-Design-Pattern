package Factory.homework_20210401;

/*
创建在不同操作系统的视窗环境下都能够运行的系统
-两种操作系统：windows和unix
-windows操作系统下，使用具有windows风格的视窗构件（这里设为windowsButton对象和WindowsText对象）
-Unix操作系统下，使用具有Unix风格的视窗构件UnixButton对象和UnixText对象
-如何进行设计，使得：
    1，当需要增加对新操作系统的支持时（如系统还需要支持 Solaris），现有代码不必修改（符合“开-闭原则”）
    2，在系统的设计中约束用户使用的各种构件一定属于同一操作系统（不会出现将WindowsButton和UnixText一起使用这种情况）
选择合适的设计模式建模，画出类图，并给出关键代码。
 */
/**
 * @author TYX
 * @name Main
 * @description
 * @createTime 2021/4/1 20:43
 **/
public class Main {
    public static void main(String[] args) {
        OSFactory windows=new WindowsFactory();
        windows.createButton().click();
        windows.createText().print();

        OSFactory unix=new UnixFactory();
        unix.createButton().click();
        unix.createText().print();
    }
}
