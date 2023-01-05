package edmt.dev.androidcartfirebase.listener;

import java.util.List;

import edmt.dev.androidcartfirebase.model.CartModel;
import edmt.dev.androidcartfirebase.model.DrinkModel;

public interface ICartLoadListener {
    void onCartLoadSuccess(List<CartModel> cartModelList);
    void onCartLoadFailed(String message);
}
