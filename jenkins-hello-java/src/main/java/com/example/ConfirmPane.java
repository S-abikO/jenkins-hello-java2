package com.example;

public class ConfirmPane extends Pane{

    public ConfirmPane(JustPayApp app) {
        super(app);
    }

    @Override
    public void doAction(String command) {
        switch(command) {
            // 金額確認画面・決済成功：決済結果表示
            case "SETTLEMENT_BUTTON_OK":
            app.setPane(ResultPane.class);
            break;
            // 金額確認画面・決済失敗：決済結果表示
            case "SETTLEMENT_BUTTON_FAIL":
            app.setPane(ResultPaneFail.class);
            break;
            // キャンセルボタンを押す：ホーム画面に遷移
            case "CANCEL_BUTTON":
            app.setPane(HomePane.class);
            break;
        }
    }
}
