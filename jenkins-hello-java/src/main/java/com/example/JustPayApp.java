package com.example;


/*Justpaneアプリ本体 */
public class JustPayApp {
    /*現在表示中の画面 */
    private Pane pane;

    public JustPayApp() {
        // 初期状態
        setPane(HomePane.class);
    }

    /*下内の画面名(クラス名)を返す */
    public String gerPaneName() {
        return pane.getClass().getSimpleName();
    }

    /*画面を設定する */
    void setPane(Class<? extends Pane> clazz){
        try {
            pane = (Pane)clazz.getConstructors()[0].newInstance(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*ユーザーからの操作を実行する */
    public void doAction(String command) {
        pane.doAction(command);
    }

}
