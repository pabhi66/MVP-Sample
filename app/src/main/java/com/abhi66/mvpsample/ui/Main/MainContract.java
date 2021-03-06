package com.abhi66.mvpsample.ui.Main;

import com.abhi66.mvpsample.ui.Base.BaseMvpPresenter;
import com.abhi66.mvpsample.ui.Base.BaseView;

/**
 * @author Abhishek Prajapati
 * @version 1.0.0
 * @since 9/16/17.
 *
 * This is the signature of our feature. We group methods under two domains.
 * 1) Presenter interface includes all user actions. (click, swipe, delete etc.)
 * 2) View interface includes all callbacks and UI changes (show loading, populate a list,
 *      show connection error etc.)
 */

public interface MainContract {

    // User actions. Presenter will implement
    interface Presenter extends BaseMvpPresenter<View> {
        void loadHelloText();
    }

    // Action callbacks. Activity/Fragment will implement
    interface View extends BaseView {
        void onTextLoaded(String text);
    }
}
