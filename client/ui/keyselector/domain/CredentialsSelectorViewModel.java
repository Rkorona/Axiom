package com.server.auditor.ssh.client.ui.keyselector.domain;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.KeychainNavGraphRoute;
import com.server.auditor.ssh.client.synchronization.api.VariablesConverter;
import com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.sort.TermiusSortType;
import j3.t0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import ju.n0;
import tp.c0;
import ut.m0;
import wu.i0;
import zu.g0;
import zu.k0;

/* JADX INFO: loaded from: classes4.dex */
public final class CredentialsSelectorViewModel extends AndroidViewModel {
    public static final String SELECTED_SSH_KEY_ID_KEY = "selected_ssh_key_id";
    public static final String SELECTED_SSH_KEY_PURPOSE_KEY = "selected_ssh_key_purpose";
    public static final String SSH_ID_WAS_ATTACHED = "ssh_id_was_attached";
    public static final String UPDATED_SSH_ID_PARAMETERS = "updated_ssh_id_parameters";
    private final zu.f _filteredSshKeyItems;
    private final yu.d _fragmentActions;
    private final zu.w _fullSshKeysList;
    private final zu.w _isBiometricKeyGenerationAvailable;
    private final zu.w _isImportingDialogShown;
    private final zu.w _isNeedShowSetupItem;
    private final zu.w _isSshIdSetupCompleted;
    private final zu.w _isUserHasTeam;
    private final k0 _searchQuery;
    private final zu.w _searchState;
    private final zu.w _selectSshKeySortingMode;
    private final zu.w _showSortTypeSelector;
    private final zu.w _sshIdUsername;
    private final zu.w _uiState;
    private final zu.w _vaultName;
    private final Application application;
    private final k0 filteredSshKeyItems;
    private final tp.a fragmentActionDebouncer;
    private final zu.f fragmentActions;
    private final no.d getKeysItemsUseCase;
    private final gp.p getSshIdCompletedStateUseCase;
    private final gp.q getSshIdUsernameUseCase;
    private final ut.n importCertificateUseCase$delegate;
    private final ut.n importSshKeyUseCase$delegate;
    private final k0 isImportingDialogShown;
    private final no.g keyPickerAnalyticsInteractor;
    private final hg.d keyValueRepository;
    private final k0 searchState;
    private final no.h sortSshKeysUseCase;
    private final VaultKeyId targetVaultKeyId;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private final k0 uiState;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    @hv.p
    @Keep
    public interface CredentialsFragmentActions extends Parcelable {
        public static final a Companion = a.f40211a;

        public static final class OnNavigateToRoute implements CredentialsFragmentActions {
            public static final int $stable = 0;
            public static final Parcelable.Creator<OnNavigateToRoute> CREATOR = new a();
            private final KeychainNavGraphRoute route;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OnNavigateToRoute createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    return new OnNavigateToRoute((KeychainNavGraphRoute) parcel.readParcelable(OnNavigateToRoute.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OnNavigateToRoute[] newArray(int i10) {
                    return new OnNavigateToRoute[i10];
                }
            }

            public OnNavigateToRoute(KeychainNavGraphRoute keychainNavGraphRoute) {
                ju.t.f(keychainNavGraphRoute, "route");
                this.route = keychainNavGraphRoute;
            }

            public static /* synthetic */ OnNavigateToRoute copy$default(OnNavigateToRoute onNavigateToRoute, KeychainNavGraphRoute keychainNavGraphRoute, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    keychainNavGraphRoute = onNavigateToRoute.route;
                }
                return onNavigateToRoute.copy(keychainNavGraphRoute);
            }

            public final KeychainNavGraphRoute component1() {
                return this.route;
            }

            public final OnNavigateToRoute copy(KeychainNavGraphRoute keychainNavGraphRoute) {
                ju.t.f(keychainNavGraphRoute, "route");
                return new OnNavigateToRoute(keychainNavGraphRoute);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OnNavigateToRoute) && ju.t.b(this.route, ((OnNavigateToRoute) obj).route);
            }

            public final KeychainNavGraphRoute getRoute() {
                return this.route;
            }

            public int hashCode() {
                return this.route.hashCode();
            }

            public String toString() {
                return "OnNavigateToRoute(route=" + this.route + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeParcelable(this.route, i10);
            }
        }

        public static final class OnOpenCertificateImportScreen implements CredentialsFragmentActions {
            public static final OnOpenCertificateImportScreen INSTANCE = new OnOpenCertificateImportScreen();
            public static final Parcelable.Creator<OnOpenCertificateImportScreen> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OnOpenCertificateImportScreen createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return OnOpenCertificateImportScreen.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OnOpenCertificateImportScreen[] newArray(int i10) {
                    return new OnOpenCertificateImportScreen[i10];
                }
            }

            private OnOpenCertificateImportScreen() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OnOpenCertificateImportScreen);
            }

            public int hashCode() {
                return 672979000;
            }

            public String toString() {
                return "OnOpenCertificateImportScreen";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class OnOpenKeyImportScreen implements CredentialsFragmentActions {
            public static final OnOpenKeyImportScreen INSTANCE = new OnOpenKeyImportScreen();
            public static final Parcelable.Creator<OnOpenKeyImportScreen> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OnOpenKeyImportScreen createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return OnOpenKeyImportScreen.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OnOpenKeyImportScreen[] newArray(int i10) {
                    return new OnOpenKeyImportScreen[i10];
                }
            }

            private OnOpenKeyImportScreen() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OnOpenKeyImportScreen);
            }

            public int hashCode() {
                return -635447040;
            }

            public String toString() {
                return "OnOpenKeyImportScreen";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class OnShowSshIdSetupFlow implements CredentialsFragmentActions {
            public static final OnShowSshIdSetupFlow INSTANCE = new OnShowSshIdSetupFlow();
            public static final Parcelable.Creator<OnShowSshIdSetupFlow> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OnShowSshIdSetupFlow createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return OnShowSshIdSetupFlow.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OnShowSshIdSetupFlow[] newArray(int i10) {
                    return new OnShowSshIdSetupFlow[i10];
                }
            }

            private OnShowSshIdSetupFlow() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OnShowSshIdSetupFlow);
            }

            public int hashCode() {
                return 1639178283;
            }

            public String toString() {
                return "OnShowSshIdSetupFlow";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class OnSshIdPickerResult implements CredentialsFragmentActions {
            public static final OnSshIdPickerResult INSTANCE = new OnSshIdPickerResult();
            public static final Parcelable.Creator<OnSshIdPickerResult> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OnSshIdPickerResult createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return OnSshIdPickerResult.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OnSshIdPickerResult[] newArray(int i10) {
                    return new OnSshIdPickerResult[i10];
                }
            }

            private OnSshIdPickerResult() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OnSshIdPickerResult);
            }

            public int hashCode() {
                return -370752024;
            }

            public String toString() {
                return "OnSshIdPickerResult";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class OnSshKeyPickerResult implements CredentialsFragmentActions {
            private final long sshKeyId;
            public static final Parcelable.Creator<OnSshKeyPickerResult> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OnSshKeyPickerResult createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    return new OnSshKeyPickerResult(parcel.readLong());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OnSshKeyPickerResult[] newArray(int i10) {
                    return new OnSshKeyPickerResult[i10];
                }
            }

            public OnSshKeyPickerResult(long j10) {
                this.sshKeyId = j10;
            }

            public static /* synthetic */ OnSshKeyPickerResult copy$default(OnSshKeyPickerResult onSshKeyPickerResult, long j10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    j10 = onSshKeyPickerResult.sshKeyId;
                }
                return onSshKeyPickerResult.copy(j10);
            }

            public final long component1() {
                return this.sshKeyId;
            }

            public final OnSshKeyPickerResult copy(long j10) {
                return new OnSshKeyPickerResult(j10);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OnSshKeyPickerResult) && this.sshKeyId == ((OnSshKeyPickerResult) obj).sshKeyId;
            }

            public final long getSshKeyId() {
                return this.sshKeyId;
            }

            public int hashCode() {
                return Long.hashCode(this.sshKeyId);
            }

            public String toString() {
                return "OnSshKeyPickerResult(sshKeyId=" + this.sshKeyId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeLong(this.sshKeyId);
            }
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f40211a = new a();

            private a() {
            }

            public final hv.c serializer() {
                return new hv.m("com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.CredentialsFragmentActions", n0.b(CredentialsFragmentActions.class), new qu.b[0], new hv.c[0], new Annotation[0]);
            }
        }
    }

    @Keep
    public static abstract class KeyPickerUiState {
        public static final int $stable = 0;

        public static final class a extends KeyPickerUiState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f40212a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1057469703;
            }

            public String toString() {
                return VariablesConverter.CLIENT_COLOR_SCHEME_DEFAULT;
            }
        }

        public static final class b extends KeyPickerUiState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f40213a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -216159732;
            }

            public String toString() {
                return "SearchHasResults";
            }
        }

        public static final class c extends KeyPickerUiState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f40214a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -820771810;
            }

            public String toString() {
                return "SearchWithoutResults";
            }
        }

        public /* synthetic */ KeyPickerUiState(ju.k kVar) {
            this();
        }

        private KeyPickerUiState() {
        }
    }

    @Keep
    public interface SearchState {

        public static final class a implements SearchState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f40215a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1015859556;
            }

            public String toString() {
                return "NoSearch";
            }
        }

        public static final class b implements SearchState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final t0 f40216a;

            public b(t0 t0Var) {
                ju.t.f(t0Var, "query");
                this.f40216a = t0Var;
            }

            public final t0 a() {
                return this.f40216a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && ju.t.b(this.f40216a, ((b) obj).f40216a);
            }

            public int hashCode() {
                return this.f40216a.hashCode();
            }

            public String toString() {
                return "SearchQuery(query=" + this.f40216a + ")";
            }
        }
    }

    @Keep
    public static final class SshKeysData {
        public static final int $stable = 8;
        private final List<lj.y> items;

        /* JADX WARN: Multi-variable type inference failed */
        public SshKeysData() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SshKeysData copy$default(SshKeysData sshKeysData, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = sshKeysData.items;
            }
            return sshKeysData.copy(list);
        }

        public final List<lj.y> component1() {
            return this.items;
        }

        public final SshKeysData copy(List<? extends lj.y> list) {
            ju.t.f(list, "items");
            return new SshKeysData(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SshKeysData) && ju.t.b(this.items, ((SshKeysData) obj).items);
        }

        public final List<lj.y> getItems() {
            return this.items;
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return "SshKeysData(items=" + this.items + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SshKeysData(List<? extends lj.y> list) {
            ju.t.f(list, "items");
            this.items = list;
        }

        public /* synthetic */ SshKeysData(List list, int i10, ju.k kVar) {
            this((i10 & 1) != 0 ? vt.v.o() : list);
        }
    }

    @hv.p
    @Keep
    public interface UIClicksActions extends Parcelable {
        public static final a Companion = a.f40217a;

        public static final class OnGenerateNewSshKeyClicked implements UIClicksActions {
            public static final OnGenerateNewSshKeyClicked INSTANCE = new OnGenerateNewSshKeyClicked();
            public static final Parcelable.Creator<OnGenerateNewSshKeyClicked> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OnGenerateNewSshKeyClicked createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return OnGenerateNewSshKeyClicked.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OnGenerateNewSshKeyClicked[] newArray(int i10) {
                    return new OnGenerateNewSshKeyClicked[i10];
                }
            }

            private OnGenerateNewSshKeyClicked() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OnGenerateNewSshKeyClicked);
            }

            public int hashCode() {
                return -216544054;
            }

            public String toString() {
                return "OnGenerateNewSshKeyClicked";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class OnImportCertificateClicked implements UIClicksActions {
            public static final OnImportCertificateClicked INSTANCE = new OnImportCertificateClicked();
            public static final Parcelable.Creator<OnImportCertificateClicked> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OnImportCertificateClicked createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return OnImportCertificateClicked.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OnImportCertificateClicked[] newArray(int i10) {
                    return new OnImportCertificateClicked[i10];
                }
            }

            private OnImportCertificateClicked() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OnImportCertificateClicked);
            }

            public int hashCode() {
                return 481255706;
            }

            public String toString() {
                return "OnImportCertificateClicked";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class OnImportSshKeyClicked implements UIClicksActions {
            public static final OnImportSshKeyClicked INSTANCE = new OnImportSshKeyClicked();
            public static final Parcelable.Creator<OnImportSshKeyClicked> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OnImportSshKeyClicked createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return OnImportSshKeyClicked.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OnImportSshKeyClicked[] newArray(int i10) {
                    return new OnImportSshKeyClicked[i10];
                }
            }

            private OnImportSshKeyClicked() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OnImportSshKeyClicked);
            }

            public int hashCode() {
                return 1884622886;
            }

            public String toString() {
                return "OnImportSshKeyClicked";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class OnNewBiometricKeyClicked implements UIClicksActions {
            public static final OnNewBiometricKeyClicked INSTANCE = new OnNewBiometricKeyClicked();
            public static final Parcelable.Creator<OnNewBiometricKeyClicked> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OnNewBiometricKeyClicked createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return OnNewBiometricKeyClicked.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OnNewBiometricKeyClicked[] newArray(int i10) {
                    return new OnNewBiometricKeyClicked[i10];
                }
            }

            private OnNewBiometricKeyClicked() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OnNewBiometricKeyClicked);
            }

            public int hashCode() {
                return -558875355;
            }

            public String toString() {
                return "OnNewBiometricKeyClicked";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class OnNewFidoKeyClicked implements UIClicksActions {
            public static final OnNewFidoKeyClicked INSTANCE = new OnNewFidoKeyClicked();
            public static final Parcelable.Creator<OnNewFidoKeyClicked> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OnNewFidoKeyClicked createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return OnNewFidoKeyClicked.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OnNewFidoKeyClicked[] newArray(int i10) {
                    return new OnNewFidoKeyClicked[i10];
                }
            }

            private OnNewFidoKeyClicked() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OnNewFidoKeyClicked);
            }

            public int hashCode() {
                return 420011857;
            }

            public String toString() {
                return "OnNewFidoKeyClicked";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class OnPasteCertificateClicked implements UIClicksActions {
            public static final OnPasteCertificateClicked INSTANCE = new OnPasteCertificateClicked();
            public static final Parcelable.Creator<OnPasteCertificateClicked> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OnPasteCertificateClicked createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return OnPasteCertificateClicked.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OnPasteCertificateClicked[] newArray(int i10) {
                    return new OnPasteCertificateClicked[i10];
                }
            }

            private OnPasteCertificateClicked() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OnPasteCertificateClicked);
            }

            public int hashCode() {
                return 1970942942;
            }

            public String toString() {
                return "OnPasteCertificateClicked";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class OnPasteSshKeyClicked implements UIClicksActions {
            public static final OnPasteSshKeyClicked INSTANCE = new OnPasteSshKeyClicked();
            public static final Parcelable.Creator<OnPasteSshKeyClicked> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OnPasteSshKeyClicked createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return OnPasteSshKeyClicked.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OnPasteSshKeyClicked[] newArray(int i10) {
                    return new OnPasteSshKeyClicked[i10];
                }
            }

            private OnPasteSshKeyClicked() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OnPasteSshKeyClicked);
            }

            public int hashCode() {
                return -1652911390;
            }

            public String toString() {
                return "OnPasteSshKeyClicked";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f40217a = new a();

            private a() {
            }

            public final hv.c serializer() {
                return new hv.m("com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.UIClicksActions", n0.b(UIClicksActions.class), new qu.b[0], new hv.c[0], new Annotation[0]);
            }
        }
    }

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f40219b;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel$a$a, reason: collision with other inner class name */
        static final class C0628a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f40221a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CredentialsSelectorViewModel f40222b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel$a$a$a, reason: collision with other inner class name */
            static final class C0629a implements zu.g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ CredentialsSelectorViewModel f40223a;

                C0629a(CredentialsSelectorViewModel credentialsSelectorViewModel) {
                    this.f40223a = credentialsSelectorViewModel;
                }

                @Override // zu.g
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(SshKeysData sshKeysData, zt.e eVar) {
                    this.f40223a.updateUiState();
                    return m0.f82633a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0628a(CredentialsSelectorViewModel credentialsSelectorViewModel, zt.e eVar) {
                super(2, eVar);
                this.f40222b = credentialsSelectorViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new C0628a(this.f40222b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f40221a;
                if (i10 == 0) {
                    ut.x.b(obj);
                    zu.f fVar = this.f40222b._filteredSshKeyItems;
                    C0629a c0629a = new C0629a(this.f40222b);
                    this.f40221a = 1;
                    if (fVar.collect(c0629a, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                }
                return m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((C0628a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            a aVar = CredentialsSelectorViewModel.this.new a(eVar);
            aVar.f40219b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            String string;
            au.b.f();
            if (this.f40218a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            i0 i0Var = (i0) this.f40219b;
            CredentialsSelectorViewModel.this.updateSshIdRelatedThings();
            zu.w wVar = CredentialsSelectorViewModel.this._isUserHasTeam;
            CredentialsSelectorViewModel credentialsSelectorViewModel = CredentialsSelectorViewModel.this;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(credentialsSelectorViewModel.isUserHasTeam())));
            zu.w wVar2 = CredentialsSelectorViewModel.this._isBiometricKeyGenerationAvailable;
            CredentialsSelectorViewModel credentialsSelectorViewModel2 = CredentialsSelectorViewModel.this;
            do {
                value2 = wVar2.getValue();
                ((Boolean) value2).getClass();
            } while (!wVar2.g(value2, kotlin.coroutines.jvm.internal.b.a(credentialsSelectorViewModel2.isBiometricItemAvailable())));
            zu.w wVar3 = CredentialsSelectorViewModel.this._vaultName;
            CredentialsSelectorViewModel credentialsSelectorViewModel3 = CredentialsSelectorViewModel.this;
            do {
                value3 = wVar3.getValue();
            } while (!wVar3.g(value3, credentialsSelectorViewModel3.getRelevantVaultName()));
            zu.w wVar4 = CredentialsSelectorViewModel.this._selectSshKeySortingMode;
            CredentialsSelectorViewModel credentialsSelectorViewModel4 = CredentialsSelectorViewModel.this;
            do {
                value4 = wVar4.getValue();
                string = credentialsSelectorViewModel4.keyValueRepository.getString("termius_ssh_key_picker_sort_type", null);
                if (string == null) {
                    string = com.server.auditor.ssh.client.fragments.hostngroups.j.f25092a.name();
                }
            } while (!wVar4.g(value4, TermiusSortType.valueOf(string)));
            wu.k.d(i0Var, null, null, new C0628a(CredentialsSelectorViewModel.this, null), 3, null);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class a0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40224a;

        a0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new a0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40224a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            CredentialsSelectorViewModel.this._isUserHasTeam.setValue(kotlin.coroutines.jvm.internal.b.a(CredentialsSelectorViewModel.this.isUserHasTeam()));
            CredentialsSelectorViewModel.this._vaultName.setValue(CredentialsSelectorViewModel.this.getRelevantVaultName());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class b {
        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class b0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40226a;

        b0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new b0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40226a;
            if (i10 == 0) {
                ut.x.b(obj);
                if (CredentialsSelectorViewModel.this._searchState.getValue() instanceof SearchState.a) {
                    CredentialsSelectorViewModel.this._uiState.setValue(KeyPickerUiState.a.f40212a);
                } else if (CredentialsSelectorViewModel.this._searchState.getValue() instanceof SearchState.b) {
                    if (CredentialsSelectorViewModel.this.isCurrentSearchQueryNotEmpty()) {
                        zu.f fVar = CredentialsSelectorViewModel.this._filteredSshKeyItems;
                        this.f40226a = 1;
                        obj = zu.h.y(fVar, this);
                        if (obj == objF) {
                            return objF;
                        }
                    } else {
                        CredentialsSelectorViewModel.this._uiState.setValue(KeyPickerUiState.a.f40212a);
                    }
                }
                return m0.f82633a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (((SshKeysData) obj).getItems().isEmpty()) {
                CredentialsSelectorViewModel.this._uiState.setValue(KeyPickerUiState.c.f40214a);
            } else {
                CredentialsSelectorViewModel.this._uiState.setValue(KeyPickerUiState.b.f40213a);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f40229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f40230c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f40231d;

        c(zt.e eVar) {
            super(4, eVar);
        }

        @Override // iu.r
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SshKeysData sshKeysData, String str, TermiusSortType termiusSortType, zt.e eVar) {
            c cVar = CredentialsSelectorViewModel.this.new c(eVar);
            cVar.f40229b = sshKeysData;
            cVar.f40230c = str;
            cVar.f40231d = termiusSortType;
            return cVar.invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40228a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshKeysData sshKeysData = (SshKeysData) this.f40229b;
            String str = (String) this.f40230c;
            TermiusSortType termiusSortType = (TermiusSortType) this.f40231d;
            no.h hVar = CredentialsSelectorViewModel.this.sortSshKeysUseCase;
            List<lj.y> items = sshKeysData.getItems();
            List arrayList = new ArrayList();
            for (Object obj2 : items) {
                String strC = ((lj.y) obj2).c();
                ju.t.e(strC, "getTitle(...)");
                Locale locale = Locale.ROOT;
                String lowerCase = strC.toLowerCase(locale);
                ju.t.e(lowerCase, "toLowerCase(...)");
                String lowerCase2 = str.toLowerCase(locale);
                ju.t.e(lowerCase2, "toLowerCase(...)");
                if (su.s.Y(lowerCase, lowerCase2, false, 2, null)) {
                    arrayList.add(obj2);
                }
            }
            return sshKeysData.copy(hVar.a(arrayList, termiusSortType));
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40233a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ VaultKeyId f40235c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(VaultKeyId vaultKeyId, zt.e eVar) {
            super(2, eVar);
            this.f40235c = vaultKeyId;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new d(this.f40235c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40233a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            CredentialsSelectorViewModel.this._fullSshKeysList.setValue(new SshKeysData(CredentialsSelectorViewModel.this.getKeysItemsUseCase.a(this.f40235c)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40236a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40236a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            CredentialsSelectorViewModel credentialsSelectorViewModel = CredentialsSelectorViewModel.this;
            credentialsSelectorViewModel.fillSshKeyList(credentialsSelectorViewModel.targetVaultKeyId);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(zu.g gVar, zt.e eVar) {
            return ((e) create(gVar, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f40238a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f40240c;

        f(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40238a = obj;
            this.f40240c |= RtlSpacingHelper.UNDEFINED;
            return CredentialsSelectorViewModel.this.handleCertificateImportResult(null, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f40241a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f40243c;

        g(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40241a = obj;
            this.f40243c |= RtlSpacingHelper.UNDEFINED;
            return CredentialsSelectorViewModel.this.handleSshKeyImportResult(null, this);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f40245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f40246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CredentialsSelectorViewModel f40247d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Intent intent, int i10, CredentialsSelectorViewModel credentialsSelectorViewModel, zt.e eVar) {
            super(2, eVar);
            this.f40245b = intent;
            this.f40246c = i10;
            this.f40247d = credentialsSelectorViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new h(this.f40245b, this.f40246c, this.f40247d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40244a;
            if (i10 == 0) {
                ut.x.b(obj);
                Intent intent = this.f40245b;
                Uri data = intent != null ? intent.getData() : null;
                if (this.f40246c == -1 && data != null) {
                    CredentialsSelectorViewModel credentialsSelectorViewModel = this.f40247d;
                    this.f40244a = 1;
                    if (credentialsSelectorViewModel.handleCertificateImportResult(data, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VaultKeyId f40249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CredentialsSelectorViewModel f40250c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(VaultKeyId vaultKeyId, CredentialsSelectorViewModel credentialsSelectorViewModel, zt.e eVar) {
            super(2, eVar);
            this.f40249b = vaultKeyId;
            this.f40250c = credentialsSelectorViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new i(this.f40249b, this.f40250c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40248a;
            if (i10 == 0) {
                ut.x.b(obj);
                String string = UUID.randomUUID().toString();
                ju.t.e(string, "toString(...)");
                KeychainNavGraphRoute.GenerateSshKeyRoute generateSshKeyRoute = new KeychainNavGraphRoute.GenerateSshKeyRoute(string, this.f40249b, true);
                this.f40250c.keyPickerAnalyticsInteractor.c();
                yu.d dVar = this.f40250c._fragmentActions;
                CredentialsFragmentActions.OnNavigateToRoute onNavigateToRoute = new CredentialsFragmentActions.OnNavigateToRoute(generateSshKeyRoute);
                this.f40248a = 1;
                if (dVar.b(onNavigateToRoute, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40251a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40251a;
            if (i10 == 0) {
                ut.x.b(obj);
                CredentialsSelectorViewModel.this.keyPickerAnalyticsInteractor.d();
                yu.d dVar = CredentialsSelectorViewModel.this._fragmentActions;
                CredentialsFragmentActions.OnOpenCertificateImportScreen onOpenCertificateImportScreen = CredentialsFragmentActions.OnOpenCertificateImportScreen.INSTANCE;
                this.f40251a = 1;
                if (dVar.b(onOpenCertificateImportScreen, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40253a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40253a;
            if (i10 == 0) {
                ut.x.b(obj);
                CredentialsSelectorViewModel.this.keyPickerAnalyticsInteractor.e();
                yu.d dVar = CredentialsSelectorViewModel.this._fragmentActions;
                CredentialsFragmentActions.OnOpenKeyImportScreen onOpenKeyImportScreen = CredentialsFragmentActions.OnOpenKeyImportScreen.INSTANCE;
                this.f40253a = 1;
                if (dVar.b(onOpenKeyImportScreen, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40255a;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f40257a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CredentialsSelectorViewModel f40258b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CredentialsSelectorViewModel credentialsSelectorViewModel, zt.e eVar) {
                super(1, eVar);
                this.f40258b = credentialsSelectorViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(zt.e eVar) {
                return new a(this.f40258b, eVar);
            }

            @Override // iu.l
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(zt.e eVar) {
                return ((a) create(eVar)).invokeSuspend(m0.f82633a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f40257a;
                if (i10 == 0) {
                    ut.x.b(obj);
                    String string = UUID.randomUUID().toString();
                    ju.t.e(string, "toString(...)");
                    KeychainNavGraphRoute.GenerateBiometricKeyRoute generateBiometricKeyRoute = new KeychainNavGraphRoute.GenerateBiometricKeyRoute(string, VaultKeyId.Companion.a(), true);
                    this.f40258b.keyPickerAnalyticsInteractor.a();
                    yu.d dVar = this.f40258b._fragmentActions;
                    CredentialsFragmentActions.OnNavigateToRoute onNavigateToRoute = new CredentialsFragmentActions.OnNavigateToRoute(generateBiometricKeyRoute);
                    this.f40257a = 1;
                    if (dVar.b(onNavigateToRoute, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                }
                return m0.f82633a;
            }
        }

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40255a;
            if (i10 == 0) {
                ut.x.b(obj);
                tp.a aVar = CredentialsSelectorViewModel.this.fragmentActionDebouncer;
                m0 m0Var = m0.f82633a;
                a aVar2 = new a(CredentialsSelectorViewModel.this, null);
                this.f40255a = 1;
                if (aVar.a(m0Var, aVar2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40259a;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f40261a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CredentialsSelectorViewModel f40262b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CredentialsSelectorViewModel credentialsSelectorViewModel, zt.e eVar) {
                super(1, eVar);
                this.f40262b = credentialsSelectorViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(zt.e eVar) {
                return new a(this.f40262b, eVar);
            }

            @Override // iu.l
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(zt.e eVar) {
                return ((a) create(eVar)).invokeSuspend(m0.f82633a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f40261a;
                if (i10 == 0) {
                    ut.x.b(obj);
                    String string = UUID.randomUUID().toString();
                    ju.t.e(string, "toString(...)");
                    KeychainNavGraphRoute.GenerateFidoKeyRoute generateFidoKeyRoute = new KeychainNavGraphRoute.GenerateFidoKeyRoute(string, VaultKeyId.Companion.a(), true);
                    this.f40262b.keyPickerAnalyticsInteractor.b();
                    yu.d dVar = this.f40262b._fragmentActions;
                    CredentialsFragmentActions.OnNavigateToRoute onNavigateToRoute = new CredentialsFragmentActions.OnNavigateToRoute(generateFidoKeyRoute);
                    this.f40261a = 1;
                    if (dVar.b(onNavigateToRoute, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                }
                return m0.f82633a;
            }
        }

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40259a;
            if (i10 == 0) {
                ut.x.b(obj);
                tp.a aVar = CredentialsSelectorViewModel.this.fragmentActionDebouncer;
                m0 m0Var = m0.f82633a;
                a aVar2 = new a(CredentialsSelectorViewModel.this, null);
                this.f40259a = 1;
                if (aVar.a(m0Var, aVar2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40263a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40263a;
            if (i10 == 0) {
                ut.x.b(obj);
                Long lE = kotlin.coroutines.jvm.internal.b.e(0L);
                String strE = c0.e();
                String strE2 = c0.e();
                String strE3 = c0.e();
                String strE4 = c0.e();
                String strE5 = c0.e();
                VaultKeyId vaultKeyIdA = VaultKeyId.Companion.a();
                String string = UUID.randomUUID().toString();
                ju.t.e(string, "toString(...)");
                KeychainNavGraphRoute.EditSshKeyRoute editSshKeyRoute = new KeychainNavGraphRoute.EditSshKeyRoute(lE, "paste_certificate_action", strE, strE2, strE3, strE4, strE5, vaultKeyIdA, string, true);
                CredentialsSelectorViewModel.this.keyPickerAnalyticsInteractor.g();
                yu.d dVar = CredentialsSelectorViewModel.this._fragmentActions;
                CredentialsFragmentActions.OnNavigateToRoute onNavigateToRoute = new CredentialsFragmentActions.OnNavigateToRoute(editSshKeyRoute);
                this.f40263a = 1;
                if (dVar.b(onNavigateToRoute, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40265a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40265a;
            if (i10 == 0) {
                ut.x.b(obj);
                Long lE = kotlin.coroutines.jvm.internal.b.e(0L);
                String strE = c0.e();
                String strE2 = c0.e();
                String strE3 = c0.e();
                String strE4 = c0.e();
                String strE5 = c0.e();
                VaultKeyId vaultKeyIdA = VaultKeyId.Companion.a();
                String string = UUID.randomUUID().toString();
                ju.t.e(string, "toString(...)");
                KeychainNavGraphRoute.EditSshKeyRoute editSshKeyRoute = new KeychainNavGraphRoute.EditSshKeyRoute(lE, "paste_key_action", strE, strE2, strE3, strE4, strE5, vaultKeyIdA, string, true);
                CredentialsSelectorViewModel.this.keyPickerAnalyticsInteractor.h();
                yu.d dVar = CredentialsSelectorViewModel.this._fragmentActions;
                CredentialsFragmentActions.OnNavigateToRoute onNavigateToRoute = new CredentialsFragmentActions.OnNavigateToRoute(editSshKeyRoute);
                this.f40265a = 1;
                if (dVar.b(onNavigateToRoute, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40267a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new p(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40267a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            CredentialsSelectorViewModel.this.keyPickerAnalyticsInteractor.f();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40269a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40269a;
            if (i10 == 0) {
                ut.x.b(obj);
                yu.d dVar = CredentialsSelectorViewModel.this._fragmentActions;
                CredentialsFragmentActions.OnSshIdPickerResult onSshIdPickerResult = CredentialsFragmentActions.OnSshIdPickerResult.INSTANCE;
                this.f40269a = 1;
                if (dVar.b(onSshIdPickerResult, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40271a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f40273c;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f40274a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CredentialsSelectorViewModel f40275b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f40276c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CredentialsSelectorViewModel credentialsSelectorViewModel, long j10, zt.e eVar) {
                super(1, eVar);
                this.f40275b = credentialsSelectorViewModel;
                this.f40276c = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(zt.e eVar) {
                return new a(this.f40275b, this.f40276c, eVar);
            }

            @Override // iu.l
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(zt.e eVar) {
                return ((a) create(eVar)).invokeSuspend(m0.f82633a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f40274a;
                if (i10 == 0) {
                    ut.x.b(obj);
                    yu.d dVar = this.f40275b._fragmentActions;
                    CredentialsFragmentActions.OnSshKeyPickerResult onSshKeyPickerResult = new CredentialsFragmentActions.OnSshKeyPickerResult(this.f40276c);
                    this.f40274a = 1;
                    if (dVar.b(onSshKeyPickerResult, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                }
                return m0.f82633a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(long j10, zt.e eVar) {
            super(2, eVar);
            this.f40273c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new r(this.f40273c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40271a;
            if (i10 == 0) {
                ut.x.b(obj);
                tp.a aVar = CredentialsSelectorViewModel.this.fragmentActionDebouncer;
                Long lE = kotlin.coroutines.jvm.internal.b.e(this.f40273c);
                a aVar2 = new a(CredentialsSelectorViewModel.this, this.f40273c, null);
                this.f40271a = 1;
                if (aVar.a(lE, aVar2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f40278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f40279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CredentialsSelectorViewModel f40280d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(Intent intent, int i10, CredentialsSelectorViewModel credentialsSelectorViewModel, zt.e eVar) {
            super(2, eVar);
            this.f40278b = intent;
            this.f40279c = i10;
            this.f40280d = credentialsSelectorViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new s(this.f40278b, this.f40279c, this.f40280d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40277a;
            if (i10 == 0) {
                ut.x.b(obj);
                Intent intent = this.f40278b;
                Uri data = intent != null ? intent.getData() : null;
                if (this.f40279c == -1 && data != null) {
                    CredentialsSelectorViewModel credentialsSelectorViewModel = this.f40280d;
                    this.f40277a = 1;
                    if (credentialsSelectorViewModel.handleSshKeyImportResult(data, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40281a;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f40283a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CredentialsSelectorViewModel f40284b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CredentialsSelectorViewModel credentialsSelectorViewModel, zt.e eVar) {
                super(1, eVar);
                this.f40284b = credentialsSelectorViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(zt.e eVar) {
                return new a(this.f40284b, eVar);
            }

            @Override // iu.l
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(zt.e eVar) {
                return ((a) create(eVar)).invokeSuspend(m0.f82633a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
            
                if (r12.b(r1, r11) == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = au.b.f()
                    int r1 = r11.f40283a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    ut.x.b(r12)
                    goto L51
                L12:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1a:
                    ut.x.b(r12)
                    goto L36
                L1e:
                    ut.x.b(r12)
                    com.server.auditor.ssh.client.ui.sshid.domain.SshIdStateInteractor r4 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdStateInteractor
                    r9 = 15
                    r10 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r4.<init>(r5, r6, r7, r8, r9, r10)
                    r11.f40283a = r3
                    java.lang.Object r12 = r4.a(r11)
                    if (r12 != r0) goto L36
                    goto L50
                L36:
                    com.server.auditor.ssh.client.ui.sshid.domain.SshIdStateInteractor$SshIdState r12 = (com.server.auditor.ssh.client.ui.sshid.domain.SshIdStateInteractor.SshIdState) r12
                    com.server.auditor.ssh.client.ui.sshid.domain.SshIdStateInteractor$SshIdState$ReadyToUse r1 = com.server.auditor.ssh.client.ui.sshid.domain.SshIdStateInteractor.SshIdState.ReadyToUse.INSTANCE
                    boolean r12 = ju.t.b(r12, r1)
                    if (r12 != 0) goto L51
                    com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel r12 = r11.f40284b
                    yu.d r12 = com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.access$get_fragmentActions$p(r12)
                    com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel$CredentialsFragmentActions$OnShowSshIdSetupFlow r1 = com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.CredentialsFragmentActions.OnShowSshIdSetupFlow.INSTANCE
                    r11.f40283a = r2
                    java.lang.Object r12 = r12.b(r1, r11)
                    if (r12 != r0) goto L51
                L50:
                    return r0
                L51:
                    ut.m0 r12 = ut.m0.f82633a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.t.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        t(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new t(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40281a;
            if (i10 == 0) {
                ut.x.b(obj);
                tp.a aVar = CredentialsSelectorViewModel.this.fragmentActionDebouncer;
                m0 m0Var = m0.f82633a;
                a aVar2 = new a(CredentialsSelectorViewModel.this, null);
                this.f40281a = 1;
                if (aVar.a(m0Var, aVar2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class u implements zu.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.f f40285a;

        public static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zu.g f40286a;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel$u$a$a, reason: collision with other inner class name */
            public static final class C0630a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f40287a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f40288b;

                public C0630a(zt.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f40287a = obj;
                    this.f40288b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(zu.g gVar) {
                this.f40286a = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // zu.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, zt.e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.u.a.C0630a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel$u$a$a r0 = (com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.u.a.C0630a) r0
                    int r1 = r0.f40288b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f40288b = r1
                    goto L18
                L13:
                    com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel$u$a$a r0 = new com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel$u$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f40287a
                    java.lang.Object r1 = au.b.f()
                    int r2 = r0.f40288b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    ut.x.b(r6)
                    goto L54
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    ut.x.b(r6)
                    zu.g r6 = r4.f40286a
                    com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel$SearchState r5 = (com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.SearchState) r5
                    boolean r2 = r5 instanceof com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.SearchState.b
                    if (r2 == 0) goto L47
                    com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel$SearchState$b r5 = (com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.SearchState.b) r5
                    j3.t0 r5 = r5.a()
                    java.lang.String r5 = r5.m()
                    goto L4b
                L47:
                    java.lang.String r5 = tp.c0.e()
                L4b:
                    r0.f40288b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L54
                    return r1
                L54:
                    ut.m0 r5 = ut.m0.f82633a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.u.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public u(zu.f fVar) {
            this.f40285a = fVar;
        }

        @Override // zu.f
        public Object collect(zu.g gVar, zt.e eVar) {
            Object objCollect = this.f40285a.collect(new a(gVar), eVar);
            return objCollect == au.b.f() ? objCollect : m0.f82633a;
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40290a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SearchState f40292c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(SearchState searchState, zt.e eVar) {
            super(2, eVar);
            this.f40292c = searchState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new v(this.f40292c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40290a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            CredentialsSelectorViewModel.this._searchState.setValue(this.f40292c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((v) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40293a;

        w(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new w(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40293a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            CredentialsSelectorViewModel credentialsSelectorViewModel = CredentialsSelectorViewModel.this;
            credentialsSelectorViewModel.fillSshKeyList(credentialsSelectorViewModel.targetVaultKeyId);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((w) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40295a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f40297c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f40297c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new x(this.f40297c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40295a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            CredentialsSelectorViewModel.this._showSortTypeSelector.setValue(kotlin.coroutines.jvm.internal.b.a(this.f40297c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((x) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40298a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TermiusSortType f40300c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(TermiusSortType termiusSortType, zt.e eVar) {
            super(2, eVar);
            this.f40300c = termiusSortType;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new y(this.f40300c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40298a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            hg.d dVar = CredentialsSelectorViewModel.this.keyValueRepository;
            ju.t.e(dVar, "access$getKeyValueRepository$p(...)");
            TermiusSortType termiusSortType = this.f40300c;
            SharedPreferences.Editor editorEdit = dVar.edit();
            editorEdit.putString("termius_ssh_key_picker_sort_type", termiusSortType.name());
            editorEdit.apply();
            CredentialsSelectorViewModel.this._selectSshKeySortingMode.setValue(this.f40300c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((y) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class z extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f40301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f40302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f40303c;

        z(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CredentialsSelectorViewModel.this.new z(eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r5.f40303c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r5.f40302b
                zu.w r0 = (zu.w) r0
                java.lang.Object r1 = r5.f40301a
                java.lang.String r1 = (java.lang.String) r1
                ut.x.b(r6)
                goto L56
            L1a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L22:
                ut.x.b(r6)
                goto L38
            L26:
                ut.x.b(r6)
                com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel r6 = com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.this
                gp.q r6 = com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.access$getGetSshIdUsernameUseCase$p(r6)
                r5.f40303c = r3
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L38
                goto L53
            L38:
                r1 = r6
                java.lang.String r1 = (java.lang.String) r1
                com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel r6 = com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.this
                zu.w r6 = com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.access$get_isSshIdSetupCompleted$p(r6)
                com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel r4 = com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.this
                gp.p r4 = com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.access$getGetSshIdCompletedStateUseCase$p(r4)
                r5.f40301a = r1
                r5.f40302b = r6
                r5.f40303c = r2
                java.lang.Object r2 = r4.a(r5)
                if (r2 != r0) goto L54
            L53:
                return r0
            L54:
                r0 = r6
                r6 = r2
            L56:
                r0.setValue(r6)
                com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel r6 = com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.this
                zu.w r6 = com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.access$get_sshIdUsername$p(r6)
                r6.setValue(r1)
                com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel r6 = com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.this
                zu.w r6 = com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.access$get_isNeedShowSetupItem$p(r6)
                com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel r0 = com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.this
                com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId r0 = com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.access$getTargetVaultKeyId$p(r0)
                boolean r0 = com.server.auditor.ssh.client.ui.vaults.data.a.b(r0)
                if (r0 == 0) goto L87
                com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel r0 = com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.this
                com.server.auditor.ssh.client.app.a r0 = com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.access$getTermiusStorage$p(r0)
                boolean r0 = r0.r0()
                if (r0 == 0) goto L87
                int r0 = r1.length()
                if (r0 != 0) goto L87
                goto L88
            L87:
                r3 = 0
            L88:
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r3)
                r6.setValue(r0)
                ut.m0 r6 = ut.m0.f82633a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.z.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((z) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CredentialsSelectorViewModel(Application application, VaultKeyId vaultKeyId) {
        super(application);
        ju.t.f(application, "application");
        ju.t.f(vaultKeyId, "targetVaultKeyId");
        this.application = application;
        this.targetVaultKeyId = vaultKeyId;
        this.keyPickerAnalyticsInteractor = new no.g();
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        this.keyValueRepository = aVarN.M();
        int i10 = 1;
        this.fragmentActionDebouncer = new tp.a(0L, 1, null);
        this.sortSshKeysUseCase = new no.h();
        SshKeyDBAdapter sshKeyDBAdapterW = hg.f.p().W();
        ju.t.e(sshKeyDBAdapterW, "getSshKeyDBAdapter(...)");
        this.getKeysItemsUseCase = new no.d(sshKeyDBAdapterW);
        this.getSshIdUsernameUseCase = new gp.q(null, 1, null);
        this.getSshIdCompletedStateUseCase = new gp.p(null, 1, null);
        this.importSshKeyUseCase$delegate = ut.o.a(new iu.a() { // from class: no.a
            @Override // iu.a
            public final Object a() {
                return CredentialsSelectorViewModel.importSshKeyUseCase_delegate$lambda$0();
            }
        });
        this.importCertificateUseCase$delegate = ut.o.a(new iu.a() { // from class: no.b
            @Override // iu.a
            public final Object a() {
                return CredentialsSelectorViewModel.importCertificateUseCase_delegate$lambda$1();
            }
        });
        zu.w wVarA = zu.m0.a(new SshKeysData(null, i10, 0 == true ? 1 : 0));
        this._fullSshKeysList = wVarA;
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._fragmentActions = dVarB;
        this.fragmentActions = zu.h.M(dVarB);
        zu.w wVarA2 = zu.m0.a(KeyPickerUiState.a.f40212a);
        this._uiState = wVarA2;
        this.uiState = zu.h.b(wVarA2);
        zu.w wVarA3 = zu.m0.a(SearchState.a.f40215a);
        this._searchState = wVarA3;
        this.searchState = zu.h.b(wVarA3);
        zu.w wVarA4 = zu.m0.a(TermiusSortType.ByNameAscending);
        this._selectSshKeySortingMode = wVarA4;
        Boolean bool = Boolean.FALSE;
        this._showSortTypeSelector = zu.m0.a(bool);
        this._isBiometricKeyGenerationAvailable = zu.m0.a(bool);
        this._vaultName = zu.m0.a("Personal");
        this._isUserHasTeam = zu.m0.a(bool);
        this._isNeedShowSetupItem = zu.m0.a(bool);
        this._isSshIdSetupCompleted = zu.m0.a(bool);
        this._sshIdUsername = zu.m0.a(c0.e());
        zu.w wVarA5 = zu.m0.a(bool);
        this._isImportingDialogShown = wVarA5;
        this.isImportingDialogShown = zu.h.b(wVarA5);
        u uVar = new u(wVarA3);
        i0 i0VarA = j1.a(this);
        g0.a aVar = g0.f88389a;
        k0 k0VarP = zu.h.P(uVar, i0VarA, g0.a.b(aVar, 5000L, 0L, 2, null), c0.e());
        this._searchQuery = k0VarP;
        zu.f fVarI = zu.h.i(wVarA, k0VarP, wVarA4, new c(null));
        this._filteredSshKeyItems = fVarI;
        this.filteredSshKeyItems = zu.h.P(zu.h.L(fVarI, new e(null)), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), new SshKeysData(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0));
        wu.k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fillSshKeyList(VaultKeyId vaultKeyId) {
        wu.k.d(j1.a(this), null, null, new d(vaultKeyId, null), 3, null);
    }

    private final no.e getImportCertificateUseCase() {
        return (no.e) this.importCertificateUseCase$delegate.getValue();
    }

    private final no.f getImportSshKeyUseCase() {
        return (no.f) this.importSshKeyUseCase$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getRelevantVaultName() {
        return vl.g.f83702b.f(this.targetVaultKeyId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c9, code lost:
    
        if (r1.b(r4, r2) == r3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleCertificateImportResult(android.net.Uri r18, zt.e<? super ut.m0> r19) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.handleCertificateImportResult(android.net.Uri, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        if (r1.b(r4, r2) == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleSshKeyImportResult(android.net.Uri r18, zt.e<? super ut.m0> r19) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.keyselector.domain.CredentialsSelectorViewModel.handleSshKeyImportResult(android.net.Uri, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final no.e importCertificateUseCase_delegate$lambda$1() {
        return new no.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final no.f importSshKeyUseCase_delegate$lambda$0() {
        return new no.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isBiometricItemAvailable() {
        return this.termiusStorage.M().getBoolean("is_hardware_key_storage_available", false) && com.server.auditor.ssh.client.ui.vaults.data.a.b(this.targetVaultKeyId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCurrentSearchQueryNotEmpty() {
        return !su.s.m0((CharSequence) this._searchQuery.getValue()) && ((CharSequence) this._searchQuery.getValue()).length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUiState() {
        wu.k.d(j1.a(this), null, null, new b0(null), 3, null);
    }

    public final k0 getFilteredSshKeyItems() {
        return this.filteredSshKeyItems;
    }

    public final zu.f getFragmentActions() {
        return this.fragmentActions;
    }

    public final k0 getSearchState() {
        return this.searchState;
    }

    public final k0 getSelectSshKeySortingMode() {
        return zu.h.b(this._selectSshKeySortingMode);
    }

    public final k0 getShowSortTypeSelector() {
        return this._showSortTypeSelector;
    }

    public final k0 getSshIdUsername() {
        return this._sshIdUsername;
    }

    public final k0 getUiState() {
        return this.uiState;
    }

    public final k0 getVaultName() {
        return this._vaultName;
    }

    public final k0 isBiometricKeyGenerationAvailable() {
        return this._isBiometricKeyGenerationAvailable;
    }

    public final k0 isImportingDialogShown() {
        return this.isImportingDialogShown;
    }

    public final k0 isNeedShowSetupItem() {
        return this._isNeedShowSetupItem;
    }

    public final k0 isSshIdSetupCompleted() {
        return this._isSshIdSetupCompleted;
    }

    /* JADX INFO: renamed from: isUserHasTeam, reason: collision with other method in class */
    public final k0 m16isUserHasTeam() {
        return this._isUserHasTeam;
    }

    public final void onCertificateImportResultReceived(int i10, Intent intent) {
        wu.k.d(j1.a(this), null, null, new h(intent, i10, this, null), 3, null);
    }

    public final void onGenerateNewSshKeyClicked(VaultKeyId vaultKeyId) {
        ju.t.f(vaultKeyId, "targetVaultKeyId");
        wu.k.d(j1.a(this), null, null, new i(vaultKeyId, this, null), 3, null);
    }

    public final void onImportCertificateClicked() {
        wu.k.d(j1.a(this), null, null, new j(null), 3, null);
    }

    public final void onImportSshKeyClicked() {
        wu.k.d(j1.a(this), null, null, new k(null), 3, null);
    }

    public final void onNewBiometricKeyClick() {
        wu.k.d(j1.a(this), null, null, new l(null), 3, null);
    }

    public final void onNewFidoKeyClick() {
        wu.k.d(j1.a(this), null, null, new m(null), 3, null);
    }

    public final void onPasteCertificateClicked() {
        wu.k.d(j1.a(this), null, null, new n(null), 3, null);
    }

    public final void onPasteSshKeyClicked() {
        wu.k.d(j1.a(this), null, null, new o(null), 3, null);
    }

    public final void onSendNewKeyButtonPressedEvent() {
        wu.k.d(j1.a(this), null, null, new p(null), 3, null);
    }

    public final void onSshIdItemClicked() {
        wu.k.d(j1.a(this), null, null, new q(null), 3, null);
    }

    public final void onSshKeyClicked(long j10) {
        wu.k.d(j1.a(this), null, null, new r(j10, null), 3, null);
    }

    public final void onSshKeyImportResultReceived(int i10, Intent intent) {
        wu.k.d(j1.a(this), null, null, new s(intent, i10, this, null), 3, null);
    }

    public final void onStartSetupFlowButtonPressedEvent() {
        wu.k.d(j1.a(this), null, null, new t(null), 3, null);
    }

    public final void updateSearchState(SearchState searchState) {
        ju.t.f(searchState, "state");
        wu.k.d(j1.a(this), null, null, new v(searchState, null), 3, null);
    }

    public final void updateSoftwareKeys() {
        wu.k.d(j1.a(this), null, null, new w(null), 3, null);
    }

    public final void updateSortTypeSelectorVisibility(boolean z10) {
        wu.k.d(j1.a(this), null, null, new x(z10, null), 3, null);
    }

    public final void updateSortingType(TermiusSortType termiusSortType) {
        ju.t.f(termiusSortType, Column.TYPE);
        wu.k.d(j1.a(this), null, null, new y(termiusSortType, null), 3, null);
    }

    public final void updateSshIdRelatedThings() {
        wu.k.d(j1.a(this), null, null, new z(null), 3, null);
    }

    public final void updateTeamRelatedInfo() {
        wu.k.d(j1.a(this), null, null, new a0(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isUserHasTeam() {
        return this.termiusStorage.m();
    }
}
