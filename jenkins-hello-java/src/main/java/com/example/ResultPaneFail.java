package com.example;

public class ResultPaneFail extends Pane {

    public ResultPaneFail(JustPayApp app) {
        super(app);
    }

    @Override
    public void doAction(String command) {
        switch(command) {
            // 金額確認画面・決済成功：決済結果表示
            case "OK_BUTTON":
            app.setPane(HomePane.class);
            break;
            case "REREAD_BUTTON":
            app.setPane(BarcodeReaderPane.class);
            break;
        }
    }
    
}
