package com.slatte.vaibhav.slatte.mvpinterface;

public interface MainContract {

    interface MainView{

    }

    interface MainPresenter{

        void onButtonClick();
        void onDestroy();
    }
}
