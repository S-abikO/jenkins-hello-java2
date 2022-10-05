package com.example;
/*画面共通クラス */
public abstract class Pane {
    protected JustPayApp app;

    public Pane(JustPayApp app) {
        this.app = app;
    }


    /*ユーザーからの操作を実行する */
    public void doAction(String command) {
    
    }
}
