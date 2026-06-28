package com.server.auditor.ssh.client.yubikey.nordpolbackward;

import android.app.Activity;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import bu.b;
import com.server.auditor.ssh.client.yubikey.nordpolbackward.TagDispatcher;
import ju.k;
import ju.t;
import uq.c;

/* JADX INFO: loaded from: classes4.dex */
public final class TagDispatcher {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46888e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f46889f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f46890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f46891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NfcAdapter f46892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NfcAdapter.ReaderCallback f46893d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NfcStatus {
        private static final /* synthetic */ bu.a $ENTRIES;
        private static final /* synthetic */ NfcStatus[] $VALUES;
        public static final NfcStatus AVAILABLE_ENABLED = new NfcStatus("AVAILABLE_ENABLED", 0);
        public static final NfcStatus AVAILABLE_DISABLED = new NfcStatus("AVAILABLE_DISABLED", 1);
        public static final NfcStatus NOT_AVAILABLE = new NfcStatus("NOT_AVAILABLE", 2);

        private static final /* synthetic */ NfcStatus[] $values() {
            return new NfcStatus[]{AVAILABLE_ENABLED, AVAILABLE_DISABLED, NOT_AVAILABLE};
        }

        static {
            NfcStatus[] nfcStatusArr$values = $values();
            $VALUES = nfcStatusArr$values;
            $ENTRIES = b.a(nfcStatusArr$values);
        }

        private NfcStatus(String str, int i10) {
        }

        public static bu.a getEntries() {
            return $ENTRIES;
        }

        public static NfcStatus valueOf(String str) {
            return (NfcStatus) Enum.valueOf(NfcStatus.class, str);
        }

        public static NfcStatus[] values() {
            return (NfcStatus[]) $VALUES.clone();
        }
    }

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final TagDispatcher a(Activity activity, c cVar, boolean... zArr) {
            t.f(activity, "activity");
            t.f(cVar, "listener");
            t.f(zArr, "techFlags");
            return new TagDispatcher(activity, cVar, null);
        }

        private a() {
        }
    }

    public /* synthetic */ TagDispatcher(Activity activity, c cVar, k kVar) {
        this(activity, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TagDispatcher tagDispatcher, Tag tag) {
        t.f(tag, "tag");
        tagDispatcher.f46891b.Ee(tag);
    }

    public final void c() {
        NfcAdapter nfcAdapter = this.f46892c;
        if (nfcAdapter != null) {
            nfcAdapter.disableReaderMode(this.f46890a);
        }
    }

    public final NfcStatus d() {
        NfcAdapter nfcAdapter = this.f46892c;
        if (nfcAdapter == null) {
            return NfcStatus.NOT_AVAILABLE;
        }
        if (!nfcAdapter.isEnabled()) {
            return NfcStatus.AVAILABLE_DISABLED;
        }
        this.f46892c.enableReaderMode(this.f46890a, this.f46893d, 131, null);
        return NfcStatus.AVAILABLE_ENABLED;
    }

    public final void e(Intent intent) {
    }

    private TagDispatcher(Activity activity, c cVar) {
        this.f46890a = activity;
        this.f46891b = cVar;
        this.f46892c = NfcAdapter.getDefaultAdapter(activity);
        this.f46893d = new NfcAdapter.ReaderCallback() { // from class: uq.d
            @Override // android.nfc.NfcAdapter.ReaderCallback
            public final void onTagDiscovered(Tag tag) {
                TagDispatcher.b(this.f82551a, tag);
            }
        };
    }
}
