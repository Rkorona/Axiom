package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import tp.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Authentication implements Parcelable {
    private AuthType mType;
    private com.server.auditor.ssh.client.models.properties.c password = new com.server.auditor.ssh.client.models.properties.c();
    private com.server.auditor.ssh.client.models.properties.c key = new com.server.auditor.ssh.client.models.properties.c();
    protected boolean isShared = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class AuthType {
        private static final /* synthetic */ AuthType[] $VALUES = $values();
        public static final AuthType Key;
        public static final AuthType Password;
        public static final AuthType PasswordAndKey;
        public static final AuthType WithoutAuth;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.models.Authentication$AuthType$1, reason: invalid class name */
        enum AnonymousClass1 extends AuthType {
            @Override // com.server.auditor.ssh.client.models.Authentication.AuthType, java.lang.Enum
            public String toString() {
                return "using password";
            }

            private AnonymousClass1(String str, int i10) {
                super(str, i10);
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.models.Authentication$AuthType$2, reason: invalid class name */
        enum AnonymousClass2 extends AuthType {
            @Override // com.server.auditor.ssh.client.models.Authentication.AuthType, java.lang.Enum
            public String toString() {
                return "using ssh-Key";
            }

            private AnonymousClass2(String str, int i10) {
                super(str, i10);
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.models.Authentication$AuthType$3, reason: invalid class name */
        enum AnonymousClass3 extends AuthType {
            @Override // com.server.auditor.ssh.client.models.Authentication.AuthType, java.lang.Enum
            public String toString() {
                return "using password and ssh-key";
            }

            private AnonymousClass3(String str, int i10) {
                super(str, i10);
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.models.Authentication$AuthType$4, reason: invalid class name */
        enum AnonymousClass4 extends AuthType {
            @Override // com.server.auditor.ssh.client.models.Authentication.AuthType, java.lang.Enum
            public String toString() {
                return "";
            }

            private AnonymousClass4(String str, int i10) {
                super(str, i10);
            }
        }

        private static /* synthetic */ AuthType[] $values() {
            return new AuthType[]{Password, Key, PasswordAndKey, WithoutAuth};
        }

        static {
            Password = new AnonymousClass1("Password", 0);
            Key = new AnonymousClass2("Key", 1);
            PasswordAndKey = new AnonymousClass3("PasswordAndKey", 2);
            WithoutAuth = new AnonymousClass4("WithoutAuth", 3);
        }

        public static AuthType valueOf(String str) {
            return (AuthType) Enum.valueOf(AuthType.class, str);
        }

        public static AuthType[] values() {
            return (AuthType[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public abstract String toString();

        private AuthType(String str, int i10) {
        }
    }

    Authentication() {
        this.password.f(null);
        this.key.f(null);
        this.mType = AuthType.WithoutAuth;
    }

    private void checkType() {
        if (c0.p((String) this.password.b()) && this.key.b() == null) {
            this.mType = AuthType.WithoutAuth;
        }
        if (!c0.p((String) this.password.b()) && this.key.b() == null) {
            this.mType = AuthType.Password;
        }
        if (c0.p((String) this.password.b()) && this.key.b() != null) {
            this.mType = AuthType.Key;
        }
        if (c0.p((String) this.password.b()) || this.key.b() == null) {
            return;
        }
        this.mType = AuthType.PasswordAndKey;
    }

    public boolean equals(Object obj) {
        boolean zEquals = false;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Authentication) {
            Authentication authentication = (Authentication) obj;
            AuthType authType = this.mType;
            zEquals = authType != null ? authType.equals(authentication.mType) : true;
            if (zEquals && this.password.b() != null) {
                zEquals = ((String) this.password.b()).equals(authentication.password.b());
            }
            if (zEquals && this.key.b() != null) {
                return ((SshKeyDBModel) this.key.b()).equals(authentication.key.b());
            }
        }
        return zEquals;
    }

    public String getPassword() {
        return (String) this.password.b();
    }

    public com.server.auditor.ssh.client.models.properties.c getPasswordData() {
        return this.password;
    }

    public SshKeyDBModel getSshKey() {
        return (SshKeyDBModel) this.key.b();
    }

    public com.server.auditor.ssh.client.models.properties.c getSshKeyData() {
        return this.key;
    }

    public AuthType getType() {
        return this.mType;
    }

    public String getUsername() {
        return null;
    }

    public boolean isShared() {
        return this.isShared;
    }

    public void setPassword(String str) {
        this.password.f(str);
        checkType();
    }

    public void setPasswordAndSource(String str, String str2) {
        this.password.f(str);
        this.password.e(str2);
        checkType();
    }

    public void setShared(boolean z10) {
        this.isShared = z10;
    }

    public void setSshKey(SshKeyDBModel sshKeyDBModel) {
        this.key.f(sshKeyDBModel);
        checkType();
    }

    public void setSshKeyAndSource(SshKeyDBModel sshKeyDBModel, String str) {
        this.key.f(sshKeyDBModel);
        this.key.e(str);
        checkType();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString((String) this.password.b());
        parcel.writeParcelable((Parcelable) this.key.b(), i10);
    }

    public Authentication(String str, SshKeyDBModel sshKeyDBModel) {
        this.password.f(str);
        this.key.f(sshKeyDBModel);
        checkType();
    }

    protected Authentication(Parcel parcel) {
        this.password.f(parcel.readString());
        this.key.f((SshKeyDBModel) parcel.readParcelable(SshKeyDBModel.class.getClassLoader()));
        checkType();
    }
}
