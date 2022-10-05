package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JustPayAppTest {
    @Test
    public void testSuccess() {
        JustPayApp app = new JustPayApp();
        assertEquals("HomePane", app.gerPaneName());
        app.doAction("READ_BUTTON");
        assertEquals("BarcodeReaderPane", app.gerPaneName());
        app.doAction("READ_BARCODE");
        assertEquals("ConfirmPane", app.gerPaneName());
        app.doAction("SETTLEMENT_BUTTON_OK");
        assertEquals("ResultPane", app.gerPaneName());
        app.doAction("OK_BUTTON");
        assertEquals("HomePane", app.gerPaneName());
    }

    /*決済失敗→再読取ボタン→キャンセルボタン */
    @Test
    public void testSettlemwntNG_Reread_Cancel() {
        JustPayApp app = new JustPayApp();
        assertEquals("HomePane", app.gerPaneName());
        app.doAction("READ_BUTTON");
        assertEquals("BarcodeReaderPane", app.gerPaneName());
        app.doAction("READ_BARCODE");
        assertEquals("ConfirmPane", app.gerPaneName());
        app.doAction("SETTLEMENT_BUTTON_FAIL");
        assertEquals("ResultPaneFail", app.gerPaneName());
        app.doAction("REREAD_BUTTON");
        assertEquals("BarcodeReaderPane", app.gerPaneName());
        app.doAction("CANCEL_BUTTON");
        assertEquals("HomePane", app.gerPaneName());

    }
    /*決済失敗→OKボタン */
    @Test
    public void testSettlementFail_OKButton() {
        JustPayApp app = new JustPayApp();
        assertEquals("HomePane", app.gerPaneName());
        app.doAction("READ_BUTTON");
        assertEquals("BarcodeReaderPane", app.gerPaneName());
        app.doAction("READ_BARCODE");
        assertEquals("ConfirmPane", app.gerPaneName());
        app.doAction("SETTLEMENT_BUTTON_FAIL");
        assertEquals("ResultPaneFail", app.gerPaneName());
        app.doAction("OK_BUTTON");
        assertEquals("HomePane", app.gerPaneName());
    }
    /*金額確認→キャンセルボタン */
    @Test
    public void testSettlementFail_Cancel() {
        JustPayApp app = new JustPayApp();
        assertEquals("HomePane", app.gerPaneName());
        app.doAction("READ_BUTTON");
        assertEquals("BarcodeReaderPane", app.gerPaneName());
        app.doAction("READ_BARCODE");
        assertEquals("ConfirmPane", app.gerPaneName());
        app.doAction("CANCEL_BUTTON");
        assertEquals("HomePane", app.gerPaneName());
    }
}
