package homework_20210401;

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
