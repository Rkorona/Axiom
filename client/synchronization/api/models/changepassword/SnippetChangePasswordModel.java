package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.Shareable;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.h1;
import lv.i;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SnippetChangePasswordModel extends EntityChangePasswordModel implements Shareable {
    public static final String CHANGE_PASSWORD_SNIPPET_SET_NAME = "snippet_set";
    private final Boolean autoClose;
    private Long encryptedWith;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39042id;
    private Boolean isShared;

    @gg.a
    public String label;

    @gg.a
    public String script;
    private final String setName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return SnippetChangePasswordModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SnippetChangePasswordModel(int i10, String str, String str2, Boolean bool, long j10, Boolean bool2, Long l10, String str3, s2 s2Var) {
        super(null);
        if (8 != (i10 & 8)) {
            d2.a(i10, 8, SnippetChangePasswordModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        if ((i10 & 2) == 0) {
            this.script = null;
        } else {
            this.script = str2;
        }
        if ((i10 & 4) == 0) {
            this.autoClose = null;
        } else {
            this.autoClose = bool;
        }
        this.f39042id = j10;
        if ((i10 & 16) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool2;
        }
        if ((i10 & 32) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l10;
        }
        if ((i10 & 64) == 0) {
            this.setName = CHANGE_PASSWORD_SNIPPET_SET_NAME;
        } else {
            this.setName = str3;
        }
    }

    @o("auto_close")
    public static /* synthetic */ void getAutoClose$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @o("script")
    public static /* synthetic */ void getScript$annotations() {
    }

    @o(EntityChangePasswordModel.CHANGE_PASSWORD_SET_NAME_SERIAL_NAME)
    public static /* synthetic */ void getSetName$annotations() {
    }

    @o(Column.IS_SHARED)
    private static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SnippetChangePasswordModel snippetChangePasswordModel, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || snippetChangePasswordModel.label != null) {
            dVar.v(fVar, 0, x2.f64817a, snippetChangePasswordModel.label);
        }
        if (dVar.E(fVar, 1) || snippetChangePasswordModel.script != null) {
            dVar.v(fVar, 1, x2.f64817a, snippetChangePasswordModel.script);
        }
        if (dVar.E(fVar, 2) || snippetChangePasswordModel.autoClose != null) {
            dVar.v(fVar, 2, i.f64704a, snippetChangePasswordModel.autoClose);
        }
        dVar.q(fVar, 3, snippetChangePasswordModel.getId());
        if (dVar.E(fVar, 4) || snippetChangePasswordModel.isShared != null) {
            dVar.v(fVar, 4, i.f64704a, snippetChangePasswordModel.isShared);
        }
        if (dVar.E(fVar, 5) || snippetChangePasswordModel.getEncryptedWith() != null) {
            dVar.v(fVar, 5, h1.f64699a, snippetChangePasswordModel.getEncryptedWith());
        }
        if (!dVar.E(fVar, 6) && t.b(snippetChangePasswordModel.getSetName(), CHANGE_PASSWORD_SNIPPET_SET_NAME)) {
            return;
        }
        dVar.f(fVar, 6, snippetChangePasswordModel.getSetName());
    }

    public final Boolean getAutoClose() {
        return this.autoClose;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.changepassword.EntityChangePasswordModel
    public long getId() {
        return this.f39042id;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.changepassword.EntityChangePasswordModel
    public String getSetName() {
        return this.setName;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return this.isShared;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void resetSharingBeforeSync() {
        this.isShared = Boolean.FALSE;
        setEncryptedWith(null);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    public /* synthetic */ SnippetChangePasswordModel(String str, String str2, Boolean bool, long j10, Boolean bool2, Long l10, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : bool, j10, (i10 & 16) != 0 ? null : bool2, (i10 & 32) != 0 ? null : l10);
    }

    public SnippetChangePasswordModel(String str, String str2, Boolean bool, long j10, Boolean bool2, Long l10) {
        super(null);
        this.label = str;
        this.script = str2;
        this.autoClose = bool;
        this.f39042id = j10;
        this.isShared = bool2;
        this.encryptedWith = l10;
        this.setName = CHANGE_PASSWORD_SNIPPET_SET_NAME;
    }
}
