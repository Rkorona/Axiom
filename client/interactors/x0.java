package com.server.auditor.ssh.client.interactors;

import android.content.SharedPreferences;
import android.hardware.usb.UsbDevice;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.models.properties.SerialProperties;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f27681d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27682e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hg.d f27683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final il.o0 f27684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f27685c;

    public interface a {
        void A1();

        void E1();

        void Z0(int i10, int i11, int i12, int i13, int i14);

        void l1();

        void m0(Host host);
    }

    public static final class b {
        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    public x0(hg.d dVar, il.o0 o0Var, a aVar) {
        ju.t.f(dVar, "insensitiveKeyValueRepository");
        ju.t.f(o0Var, "analytics");
        ju.t.f(aVar, "callback");
        this.f27683a = dVar;
        this.f27684b = o0Var;
        this.f27685c = aVar;
    }

    private final SerialProperties e(UsbDevice usbDevice, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        return new SerialProperties(usbDevice, num, num3, num5, num4, num2);
    }

    private final void f() {
        this.f27685c.Z0(this.f27683a.getInt("serial_last_used_baud_rate", 9600), this.f27683a.getInt("serial_last_used_flow_control", 0), this.f27683a.getInt("serial_last_used_data_bits", 8), this.f27683a.getInt("serial_last_used_stop_bits", 1), this.f27683a.getInt("serial_last_used_parity", 0));
    }

    private final SerialProperties h(SerialProperties serialProperties) {
        Integer baudRate = serialProperties.getBaudRate();
        if (baudRate != null) {
            int iIntValue = baudRate.intValue();
            SharedPreferences.Editor editorEdit = this.f27683a.edit();
            editorEdit.putInt("serial_last_used_baud_rate", iIntValue);
            editorEdit.apply();
        } else {
            this.f27683a.edit().remove("serial_last_used_baud_rate");
        }
        Integer flowControl = serialProperties.getFlowControl();
        if (flowControl != null) {
            int iIntValue2 = flowControl.intValue();
            SharedPreferences.Editor editorEdit2 = this.f27683a.edit();
            editorEdit2.putInt("serial_last_used_flow_control", iIntValue2);
            editorEdit2.apply();
        } else {
            this.f27683a.edit().remove("serial_last_used_flow_control");
        }
        Integer dataBits = serialProperties.getDataBits();
        if (dataBits != null) {
            int iIntValue3 = dataBits.intValue();
            SharedPreferences.Editor editorEdit3 = this.f27683a.edit();
            editorEdit3.putInt("serial_last_used_data_bits", iIntValue3);
            editorEdit3.apply();
        } else {
            this.f27683a.edit().remove("serial_last_used_data_bits");
        }
        Integer stopBits = serialProperties.getStopBits();
        if (stopBits != null) {
            int iIntValue4 = stopBits.intValue();
            SharedPreferences.Editor editorEdit4 = this.f27683a.edit();
            editorEdit4.putInt("serial_last_used_stop_bits", iIntValue4);
            editorEdit4.apply();
        } else {
            this.f27683a.edit().remove("serial_last_used_stop_bits");
        }
        Integer parity = serialProperties.getParity();
        if (parity == null) {
            this.f27683a.edit().remove("serial_last_used_parity");
            return serialProperties;
        }
        int iIntValue5 = parity.intValue();
        SharedPreferences.Editor editorEdit5 = this.f27683a.edit();
        editorEdit5.putInt("serial_last_used_parity", iIntValue5);
        editorEdit5.apply();
        return serialProperties;
    }

    public final void a() {
        this.f27684b.a();
        this.f27685c.E1();
        f();
    }

    public final void b() {
        this.f27685c.A1();
    }

    public final void c() {
        this.f27684b.b();
        this.f27685c.l1();
    }

    public final void d(UsbDevice usbDevice, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        ju.t.f(usbDevice, "device");
        this.f27685c.m0(new Host(usbDevice.getManufacturerName(), h(e(usbDevice, num, num2, num3, num4, num5))));
    }

    public final void g() {
        this.f27685c.Z0(9600, 0, 8, 1, 0);
    }
}
