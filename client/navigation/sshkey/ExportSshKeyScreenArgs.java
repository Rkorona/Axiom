package com.server.auditor.ssh.client.navigation.sshkey;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ExportSshKeyScreenArgs implements w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f29617a;

        public a(SshKeyDBModel sshKeyDBModel, long j10) {
            HashMap map = new HashMap();
            this.f29617a = map;
            if (sshKeyDBModel == null) {
                throw new IllegalArgumentException("Argument \"sshKeyModel\" is marked as non-null but was passed a null value.");
            }
            map.put("sshKeyModel", sshKeyDBModel);
            map.put("hostId", Long.valueOf(j10));
        }

        public ExportSshKeyScreenArgs a() {
            return new ExportSshKeyScreenArgs(this.f29617a);
        }
    }

    public static ExportSshKeyScreenArgs fromBundle(Bundle bundle) {
        ExportSshKeyScreenArgs exportSshKeyScreenArgs = new ExportSshKeyScreenArgs();
        bundle.setClassLoader(ExportSshKeyScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("sshKeyModel")) {
            throw new IllegalArgumentException("Required argument \"sshKeyModel\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(SshKeyDBModel.class) && !Serializable.class.isAssignableFrom(SshKeyDBModel.class)) {
            throw new UnsupportedOperationException(SshKeyDBModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        SshKeyDBModel sshKeyDBModel = (SshKeyDBModel) bundle.get("sshKeyModel");
        if (sshKeyDBModel == null) {
            throw new IllegalArgumentException("Argument \"sshKeyModel\" is marked as non-null but was passed a null value.");
        }
        exportSshKeyScreenArgs.arguments.put("sshKeyModel", sshKeyDBModel);
        if (!bundle.containsKey("hostId")) {
            throw new IllegalArgumentException("Required argument \"hostId\" is missing and does not have an android:defaultValue");
        }
        exportSshKeyScreenArgs.arguments.put("hostId", Long.valueOf(bundle.getLong("hostId")));
        return exportSshKeyScreenArgs;
    }

    public static ExportSshKeyScreenArgs fromSavedStateHandle(u0 u0Var) {
        ExportSshKeyScreenArgs exportSshKeyScreenArgs = new ExportSshKeyScreenArgs();
        if (!u0Var.b("sshKeyModel")) {
            throw new IllegalArgumentException("Required argument \"sshKeyModel\" is missing and does not have an android:defaultValue");
        }
        SshKeyDBModel sshKeyDBModel = (SshKeyDBModel) u0Var.c("sshKeyModel");
        if (sshKeyDBModel == null) {
            throw new IllegalArgumentException("Argument \"sshKeyModel\" is marked as non-null but was passed a null value.");
        }
        exportSshKeyScreenArgs.arguments.put("sshKeyModel", sshKeyDBModel);
        if (!u0Var.b("hostId")) {
            throw new IllegalArgumentException("Required argument \"hostId\" is missing and does not have an android:defaultValue");
        }
        Long l10 = (Long) u0Var.c("hostId");
        l10.longValue();
        exportSshKeyScreenArgs.arguments.put("hostId", l10);
        return exportSshKeyScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportSshKeyScreenArgs exportSshKeyScreenArgs = (ExportSshKeyScreenArgs) obj;
        if (this.arguments.containsKey("sshKeyModel") != exportSshKeyScreenArgs.arguments.containsKey("sshKeyModel")) {
            return false;
        }
        if (getSshKeyModel() == null ? exportSshKeyScreenArgs.getSshKeyModel() == null : getSshKeyModel().equals(exportSshKeyScreenArgs.getSshKeyModel())) {
            return this.arguments.containsKey("hostId") == exportSshKeyScreenArgs.arguments.containsKey("hostId") && getHostId() == exportSshKeyScreenArgs.getHostId();
        }
        return false;
    }

    public long getHostId() {
        return ((Long) this.arguments.get("hostId")).longValue();
    }

    public SshKeyDBModel getSshKeyModel() {
        return (SshKeyDBModel) this.arguments.get("sshKeyModel");
    }

    public int hashCode() {
        return (((getSshKeyModel() != null ? getSshKeyModel().hashCode() : 0) + 31) * 31) + ((int) (getHostId() ^ (getHostId() >>> 32)));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("sshKeyModel")) {
            SshKeyDBModel sshKeyDBModel = (SshKeyDBModel) this.arguments.get("sshKeyModel");
            if (Parcelable.class.isAssignableFrom(SshKeyDBModel.class) || sshKeyDBModel == null) {
                bundle.putParcelable("sshKeyModel", (Parcelable) Parcelable.class.cast(sshKeyDBModel));
            } else {
                if (!Serializable.class.isAssignableFrom(SshKeyDBModel.class)) {
                    throw new UnsupportedOperationException(SshKeyDBModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putSerializable("sshKeyModel", (Serializable) Serializable.class.cast(sshKeyDBModel));
            }
        }
        if (this.arguments.containsKey("hostId")) {
            bundle.putLong("hostId", ((Long) this.arguments.get("hostId")).longValue());
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("sshKeyModel")) {
            SshKeyDBModel sshKeyDBModel = (SshKeyDBModel) this.arguments.get("sshKeyModel");
            if (Parcelable.class.isAssignableFrom(SshKeyDBModel.class) || sshKeyDBModel == null) {
                u0Var.h("sshKeyModel", (Parcelable) Parcelable.class.cast(sshKeyDBModel));
            } else {
                if (!Serializable.class.isAssignableFrom(SshKeyDBModel.class)) {
                    throw new UnsupportedOperationException(SshKeyDBModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                u0Var.h("sshKeyModel", (Serializable) Serializable.class.cast(sshKeyDBModel));
            }
        }
        if (this.arguments.containsKey("hostId")) {
            Long l10 = (Long) this.arguments.get("hostId");
            l10.longValue();
            u0Var.h("hostId", l10);
        }
        return u0Var;
    }

    public String toString() {
        return "ExportSshKeyScreenArgs{sshKeyModel=" + getSshKeyModel() + ", hostId=" + getHostId() + "}";
    }

    private ExportSshKeyScreenArgs() {
        this.arguments = new HashMap();
    }

    private ExportSshKeyScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}
