package Factory.homework_20210401;

/**
 * @author TYX
 * @name WindowsFactory
 * @description
 * @createTime 2021/4/1 20:36
 **/
public class WindowsFactory extends OSFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Text createText() {
        return new WindowsText();
    }
}
