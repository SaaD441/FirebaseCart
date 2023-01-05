package edmt.dev.androidcartfirebase.listener;

import java.util.List;

import edmt.dev.androidcartfirebase.model.DrinkModel;

public interface IDrinkLoadListener {
    void onDrinkLoadSuccess(List<DrinkModel> drinkModelList);
    void onDrinkLoadFailed(String message);

}
