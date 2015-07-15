package pl.btbw;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public abstract class ShopDecorator implements Shop {

    @Inject
    @Delegate
    @Any
    private Shop shop;

    public String name(int id) {
        return "decorator: {" + shop.name(id) + "}";
    }
}
