package homework_20210401;

/**
 * @author TYX
 * @name UnixFactory
 * @description
 * @createTime 2021/4/1 20:42
 **/
public class UnixFactory extends OSFactory{
    @Override
    public Button createButton() {
        return new UnixButton();
    }

    @Override
    public Text createText() {
        return new UnixText();
    }
}
