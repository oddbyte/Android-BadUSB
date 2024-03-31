package me.arianb.usb_hid_client.report_senders;

import static me.arianb.usb_hid_client.hid_utils.CharacterDevice.MOUSE_DEVICE_PATH;

import android.view.View;

public class MouseSender extends ReportSender {
    public final static byte MOUSE_BUTTON_LEFT = 1;
    public final static byte MOUSE_BUTTON_RIGHT = 2;
    public final static byte MOUSE_BUTTON_MIDDLE = 3;

    public MouseSender(View parentLayout) {
        super(MOUSE_DEVICE_PATH, false, parentLayout);
    }

    public void click(byte button) {
        super.addReportWithLock(new byte[]{button, 0, 0});
    }

    public void move(byte x, byte y) {
        super.addReportWithLock(new byte[]{0, x, y});
    }
}