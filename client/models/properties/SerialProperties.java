package com.server.auditor.ssh.client.models.properties;

import android.hardware.usb.UsbDevice;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class SerialProperties extends ConnectionProperties {
    public static final int $stable = 8;
    private final Integer baudRate;
    private final Integer dataBits;
    private final Integer flowControl;
    private final Integer parity;
    private final Integer stopBits;
    private final UsbDevice usbDevice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerialProperties(UsbDevice usbDevice, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        super(null, null, null, null, null);
        t.f(usbDevice, "usbDevice");
        this.usbDevice = usbDevice;
        this.baudRate = num;
        this.dataBits = num2;
        this.parity = num3;
        this.stopBits = num4;
        this.flowControl = num5;
    }

    public Object clone() {
        return super.clone();
    }

    public final Integer getBaudRate() {
        return this.baudRate;
    }

    public final Integer getDataBits() {
        return this.dataBits;
    }

    public final Integer getFlowControl() {
        return this.flowControl;
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionProperties
    public Integer getMergeFontSize(Long l10) {
        return null;
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionProperties
    public String getMergedCharset(Long l10) {
        return "";
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionProperties
    public String getMergedColorScheme(Long l10) {
        return "";
    }

    public final Integer getParity() {
        return this.parity;
    }

    public final Integer getStopBits() {
        return this.stopBits;
    }

    public final UsbDevice getUsbDevice() {
        return this.usbDevice;
    }
}
