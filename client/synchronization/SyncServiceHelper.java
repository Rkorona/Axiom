package com.server.auditor.ssh.client.synchronization;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.synchronization.api.models.ApiKey;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.ChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.user.CustomerSurveyAction;
import com.server.auditor.ssh.client.synchronization.handleresponse.SyncCallbackResultReceiver;
import com.server.auditor.ssh.client.synchronization.handleresponse.SyncResultReceiver;
import hg.b2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SyncServiceHelper {
    private static hg.d mSharedPreferences = com.server.auditor.ssh.client.app.a.N().M();
    private static final wn.j syncKeysAndIdentitiesRepository = new wn.j(mSharedPreferences);
    private Context mContext;
    private SyncResultReceiver mSyncResultReceiver;
    private boolean isFirstSyncWasRanAlready = false;
    private final List<SyncCallbackResultReceiver> mListeners = new ArrayList();

    public SyncServiceHelper(Context context) {
        this.mContext = context;
        SyncResultReceiver syncResultReceiver = new SyncResultReceiver(new Handler(Looper.getMainLooper()));
        this.mSyncResultReceiver = syncResultReceiver;
        syncResultReceiver.setSyncListener(new SyncCallbackResultReceiver() { // from class: com.server.auditor.ssh.client.synchronization.s
            @Override // com.server.auditor.ssh.client.synchronization.handleresponse.SyncCallbackResultReceiver
            public final void onServiceCallback(int i10, Bundle bundle) {
                this.f39083a.lambda$new$0(i10, bundle);
            }
        });
    }

    private Intent initIntent(String str) {
        Intent intent = new Intent(this.mContext, (Class<?>) SyncIntentService.class);
        intent.setAction(str);
        SyncResultReceiver syncResultReceiver = this.mSyncResultReceiver;
        if (syncResultReceiver != null) {
            intent.putExtra(SyncResultReceiver.BUNDLE_RESULT_RECEIVER, syncResultReceiver);
        }
        setApiKeyToIntent(intent);
        return intent;
    }

    public static boolean isIdentitySynced() {
        return syncKeysAndIdentitiesRepository.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessageToListeners, reason: merged with bridge method [inline-methods] */
    public void lambda$new$0(int i10, Bundle bundle) {
        ArrayList arrayList = new ArrayList(this.mListeners);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((SyncCallbackResultReceiver) it.next()).onServiceCallback(i10, bundle);
        }
    }

    private Intent setApiKeyToIntent(Intent intent) {
        ApiKey apiKey = com.server.auditor.ssh.client.app.a.N().getApiKey();
        if (apiKey != null) {
            intent.putExtra(SyncConstants.Bundle.API_KEY, apiKey);
        }
        return intent;
    }

    private void startFirstSync(String str, Integer num) {
        Intent intentInitIntent = initIntent(SyncConstants.Actions.ACTION_FIRST_SYNC);
        intentInitIntent.putExtra(str, num);
        startSyncService(intentInitIntent);
    }

    private void startSyncService(Intent intent) {
        try {
            Context context = this.mContext;
            if (context != null) {
                context.startService(intent);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public void activateDevice(boolean z10) {
        Intent intentInitIntent = initIntent(SyncConstants.Actions.ACTIVATE_DEVICE);
        setApiKeyToIntent(intentInitIntent);
        intentInitIntent.putExtra(SyncConstants.Bundle.IS_TRIAL, z10);
        startSyncService(intentInitIntent);
    }

    public void addListener(SyncCallbackResultReceiver syncCallbackResultReceiver) {
        this.mListeners.add(syncCallbackResultReceiver);
    }

    public void authDevicePassword(byte[] bArr, byte[] bArr2, String str, String str2, String str3, String str4, String str5) {
        Intent intentInitIntent = initIntent(SyncConstants.Actions.ACTION_CHANGE_PASSWORD_V4_1);
        intentInitIntent.putExtra(SyncConstants.Bundle.ENCRYPTED_PRIVATE_KEY, str);
        intentInitIntent.putExtra(SyncConstants.Bundle.PUBLIC_KEY, str2);
        intentInitIntent.putExtra(SyncConstants.Bundle.OLD_SALT, str3);
        intentInitIntent.putExtra(SyncConstants.Bundle.OLD_HMAC_SALT, str4);
        intentInitIntent.putExtra(SyncConstants.Bundle.OTP_TOKEN, str5);
        intentInitIntent.putExtra(SyncConstants.Bundle.OLD_PASSWORD, bArr);
        intentInitIntent.putExtra(SyncConstants.Bundle.NEW_PASSWORD, bArr2);
        startSyncService(intentInitIntent);
    }

    public void getUserProfile() {
        if (com.server.auditor.ssh.client.app.a.N().m0()) {
            return;
        }
        startSyncService(initIntent(SyncConstants.Actions.ACTION_GET_USER_PROFILE));
    }

    public void planToSendCustomerSurveyInteractionData(CustomerSurveyAction customerSurveyAction, Integer num, long j10, String str) {
        Intent intentInitIntent = initIntent(SyncConstants.Actions.ACTION_SEND_CUSTOMER_SURVEY_INTERACTION_DATA);
        intentInitIntent.putExtra(SyncConstants.Bundle.CUSTOMER_SURVEY_ACTION_TYPE, customerSurveyAction);
        intentInitIntent.putExtra(SyncConstants.Bundle.CUSTOMER_SURVEY_SCORE, num);
        intentInitIntent.putExtra(SyncConstants.Bundle.CUSTOMER_SURVEY_RATED_TIME_IN_MILLIS, j10);
        intentInitIntent.putExtra(SyncConstants.Bundle.CUSTOMER_SURVEY_FEEDBACK, str);
        startSyncService(intentInitIntent);
    }

    public void putAppSettings() {
        if (com.server.auditor.ssh.client.app.a.N().u0()) {
            startSyncService(initIntent(SyncConstants.Actions.ACTION_PUT_APP_SETTINGS));
        }
    }

    public void regenerateCryptoSpec() {
        startSyncService(initIntent(SyncConstants.Actions.ACTION_REGENERATE_CRYPTO_SPECS));
    }

    public void reloadAllData(boolean z10) {
        if (z10) {
            startFullSync();
        }
        startSyncService(initIntent(SyncConstants.Actions.ACTION_RELOAD_ALL_DATA));
    }

    public void removeListener(SyncCallbackResultReceiver syncCallbackResultReceiver) {
        this.mListeners.remove(syncCallbackResultReceiver);
    }

    public void requestTeamMembersList(boolean z10) {
        if (com.server.auditor.ssh.client.app.a.N().m0()) {
            return;
        }
        Intent intentInitIntent = initIntent(SyncConstants.Actions.ACTION_FETCH_TEAM_MEMBERS);
        intentInitIntent.putExtra(SyncConstants.Bundle.FORCE_PULL_MEMBERS_LIST, z10);
        startSyncService(intentInitIntent);
    }

    public void requestVerifyEmail() {
        startSyncService(initIntent(SyncConstants.Actions.ACTION_VERIFY_EMAIL));
    }

    public void startChangePassword(ChangePasswordModel changePasswordModel) {
        String strC;
        try {
            strC = b2.f52944a.s1().c(ChangePasswordModel.Companion.getSerializer(), changePasswordModel);
        } catch (hv.q e10) {
            y9.a.f86838a.i(e10);
            strC = "";
        }
        Intent intentInitIntent = initIntent(SyncConstants.Actions.ACTION_CHANGE_PASSWORD);
        intentInitIntent.putExtra(SyncConstants.Bundle.CHANGE_PASSWORD_OBJECT, strC);
        startSyncService(intentInitIntent);
    }

    public void startFullSync() {
        startFullSync(null, null);
    }

    public void startLogout(boolean z10, int i10) {
        Intent intentInitIntent = initIntent(SyncConstants.Actions.ACTION_LOGOUT);
        intentInitIntent.putExtra(SyncConstants.Bundle.KEEP_BIOMETRIC_KEYS, z10);
        intentInitIntent.putExtra("LOGOUT_REQUEST_CODE_FIELD_NAME", i10);
        startSyncService(intentInitIntent);
    }

    public void startPartialSync() {
        startSyncService(initIntent(SyncConstants.Actions.GET_BULK_WITH_LAST_SYNCED));
    }

    public void startProfileAndBulkSync() {
        startSyncService(initIntent(SyncConstants.Actions.ACTION_FULL_PROFILE_BULK_SYNC));
    }

    public void updateSshIdData() {
        if (com.server.auditor.ssh.client.app.a.N().m0()) {
            return;
        }
        startSyncService(initIntent(SyncConstants.Actions.ACTION_UPDATE_SSHID_DATA));
    }

    public void startFullSync(String str, Integer num) {
        if (TextUtils.isEmpty(mSharedPreferences.getString(SyncConstants.LastSyncTime.PREFS_LAST_TIME_KEY, "")) && !this.isFirstSyncWasRanAlready) {
            this.isFirstSyncWasRanAlready = true;
            startFirstSync(str, num);
        } else {
            Intent intentInitIntent = initIntent(SyncConstants.Actions.ACTION_FULL_SYNC);
            intentInitIntent.putExtra(str, num);
            startSyncService(intentInitIntent);
        }
    }

    public void activateDevice() {
        activateDevice(false);
    }
}
