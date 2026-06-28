package com.server.auditor.ssh.client.synchronization.retrofit;

import com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository;
import com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo;
import com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo;
import com.server.auditor.ssh.client.help.ProductBoardTokenResponseModel;
import com.server.auditor.ssh.client.navigation.teamtrialviasharing.InviteRequest;
import com.server.auditor.ssh.client.synchronization.api.models.AppSettings;
import com.server.auditor.ssh.client.synchronization.api.models.Auth2faModel;
import com.server.auditor.ssh.client.synchronization.api.models.ChangePasswordResponse;
import com.server.auditor.ssh.client.synchronization.api.models.CheckEmailModel;
import com.server.auditor.ssh.client.synchronization.api.models.CheckUsernameResponse;
import com.server.auditor.ssh.client.synchronization.api.models.CryptoSpec;
import com.server.auditor.ssh.client.synchronization.api.models.EncryptionKeyApiModel;
import com.server.auditor.ssh.client.synchronization.api.models.MobileDevice;
import com.server.auditor.ssh.client.synchronization.api.models.PlayIntegrityNonceResponse;
import com.server.auditor.ssh.client.synchronization.api.models.ProTrialExtensionResponse;
import com.server.auditor.ssh.client.synchronization.api.models.RegisterTOTPResponse;
import com.server.auditor.ssh.client.synchronization.api.models.SsoDomainAuthUrlRequest;
import com.server.auditor.ssh.client.synchronization.api.models.SsoDomainAuthUrlResponse;
import com.server.auditor.ssh.client.synchronization.api.models.SsoDomainCheckEmail;
import com.server.auditor.ssh.client.synchronization.api.models.SsoDomainTokenRequest;
import com.server.auditor.ssh.client.synchronization.api.models.SsoDomainTokenResponse;
import com.server.auditor.ssh.client.synchronization.api.models.TerminalShellAssistRequest;
import com.server.auditor.ssh.client.synchronization.api.models.TerminalShellAssistResponse;
import com.server.auditor.ssh.client.synchronization.api.models.UserActiveDeviceResponse;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.BulkModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.BulkModelFullData;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeactivateTeamRequestBody;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.AuthDevicePasswordRequest;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.AuthDevicePasswordResponse;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.ChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.history.PostHistoryConnectionsRequest;
import com.server.auditor.ssh.client.synchronization.api.models.newcrypto.ObtainSecurityTokenRequest;
import com.server.auditor.ssh.client.synchronization.api.models.newcrypto.ObtainSecurityTokenResponse;
import com.server.auditor.ssh.client.synchronization.api.models.newcrypto.StaleDeviceItemWithMeta;
import com.server.auditor.ssh.client.synchronization.api.models.newcrypto.StaleMemberItemWithMeta;
import com.server.auditor.ssh.client.synchronization.api.models.password.DevicePasswordRecoveryRequest;
import com.server.auditor.ssh.client.synchronization.api.models.password.DevicePasswordRecoveryResponse;
import com.server.auditor.ssh.client.synchronization.api.models.srp.SrpMigrationOldPasswordRequest;
import com.server.auditor.ssh.client.synchronization.api.models.srp.SrpSaltResponse;
import com.server.auditor.ssh.client.synchronization.api.models.sso.DetectFirebaseActionModel;
import com.server.auditor.ssh.client.synchronization.api.models.sso.DetectFirebaseActionResponse;
import com.server.auditor.ssh.client.synchronization.api.models.teams.ListPendingInvitesResponse;
import com.server.auditor.ssh.client.synchronization.api.models.teams.ListTeamMembersResponse;
import com.server.auditor.ssh.client.synchronization.api.models.teams.TeamTrialExtensionResponse;
import com.server.auditor.ssh.client.synchronization.api.models.user.AuthResponseModel;
import com.server.auditor.ssh.client.synchronization.api.models.user.BulkAccountResponse;
import com.server.auditor.ssh.client.synchronization.api.models.user.CellPhoneModel;
import com.server.auditor.ssh.client.synchronization.api.models.user.CentrifugeToken;
import com.server.auditor.ssh.client.synchronization.api.models.user.CentrifugoChannelTokenList;
import com.server.auditor.ssh.client.synchronization.api.models.user.CentrifugoClientId;
import com.server.auditor.ssh.client.synchronization.api.models.user.ChangeEmailRequest;
import com.server.auditor.ssh.client.synchronization.api.models.user.CreateATeamResponse;
import com.server.auditor.ssh.client.synchronization.api.models.user.CustomerSurveyPayload;
import com.server.auditor.ssh.client.synchronization.api.models.user.DowngradeBulkAccountResponse;
import com.server.auditor.ssh.client.synchronization.api.models.user.ResetPasswordRequestModel;
import com.server.auditor.ssh.client.synchronization.api.models.user.StorePublicKeyRequestBody;
import com.server.auditor.ssh.client.synchronization.api.models.user.TeamPublicKeysByDevices;
import com.server.auditor.ssh.client.synchronization.api.models.user.UserAuthModel;
import com.server.auditor.ssh.client.ui.auth.signup.data.TriggerSendEmailCodeRequest;
import com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRequest;
import com.server.auditor.ssh.client.ui.sessionlogs.data.CompleteSessionLogFileUploadRequest;
import com.server.auditor.ssh.client.ui.sessionlogs.data.CompleteSessionLogFileUploadResponse;
import com.server.auditor.ssh.client.ui.sessionlogs.data.HistorySyncResponse;
import com.server.auditor.ssh.client.ui.sessionlogs.data.InitiateSessionLogFileUploadRequest;
import com.server.auditor.ssh.client.ui.sessionlogs.data.PresignSessionLogFileChunkRequest;
import com.server.auditor.ssh.client.ui.sessionlogs.data.PresignedSessionLogFileChunkResponse;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogItemApiModel;
import com.server.auditor.ssh.client.ui.sessionlogs.domain.PostSessionLogsBookmarksRequest;
import com.server.auditor.ssh.client.ui.sessionlogs.domain.PostSessionLogsBookmarksResponse;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdCreationPayload;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUpdateCaPayload;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUpdatePropertiesPayload;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUploadPasskeysPayload;
import com.server.auditor.ssh.client.ui.vaults.data.RequestPersonalVaultApiResponse;
import com.server.auditor.ssh.client.ui.vaults.data.RequestVaultsApiResponse;
import com.server.auditor.ssh.client.ui.vaults.data.UpdatePersonalVaultApiRequest;
import com.server.auditor.ssh.client.ui.vaults.data.UpdatePersonalVaultApiResponse;
import com.server.auditor.ssh.client.ui.vaults.data.UpdateVaultApiRequestBody;
import com.server.auditor.ssh.client.ui.vaults.data.UpdateVaultApiResponse;
import java.util.List;
import pv.c0;
import pv.e0;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import ut.m0;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public interface SyncRestInterface {

    public static final class DefaultImpls {
        public static /* synthetic */ Call requestTeamMemberPublicKeyCollection$default(SyncRestInterface syncRestInterface, Integer num, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestTeamMemberPublicKeyCollection");
            }
            if ((i10 & 1) != 0) {
                num = null;
            }
            return syncRestInterface.requestTeamMemberPublicKeyCollection(num);
        }
    }

    @POST("api/v4.1/auth/email/availability/")
    Object checkEmailAvailability(@Body CheckEmailModel checkEmailModel, e<? super Response<CheckUsernameResponse>> eVar);

    @POST("/api/v4.1/auth/sso/domain/check_email/")
    Object checkEmailHasESSO(@Body CheckEmailModel checkEmailModel, e<? super Response<SsoDomainCheckEmail>> eVar);

    @PUT("/api/v4/terminal/history/log/upload/{id}/complete/")
    Object completeSessionLogFileUpload(@Path("id") long j10, @Body CompleteSessionLogFileUploadRequest completeSessionLogFileUploadRequest, e<? super Response<CompleteSessionLogFileUploadResponse>> eVar);

    @POST("/api/v4/ssh-id/")
    Object createSshId(@Body SshIdCreationPayload sshIdCreationPayload, e<? super Response<SshIdResponse>> eVar);

    @POST("/api/v3.3/auth/device/login/")
    Object deviceAuthNew(@Body UserAuthModel userAuthModel, e<? super Response<AuthResponseModel>> eVar);

    @POST("/api/v4/auth/otp/disable/")
    Object disable2faOtp(@Body Auth2faModel auth2faModel, e<? super Response<Void>> eVar);

    @POST("/api/v4/auth/otp/enable/")
    Object enable2faOtp(@Body Auth2faModel auth2faModel, e<? super Response<Void>> eVar);

    @GET("api/v3/setting/mobile/")
    Object fetchAppSettings(e<? super Response<AppSettings>> eVar);

    @GET("/api/v3/keyserver/key/my/")
    Object fetchMyEncryptedKeySet(e<? super Response<EncryptedPersonalKeySet>> eVar);

    @POST("api/v4.1/auth/sso/firebase/detect_action/")
    Object firebaseDetectAction(@Body DetectFirebaseActionModel detectFirebaseActionModel, e<? super Response<DetectFirebaseActionResponse>> eVar);

    @GET("api/v4/user/productboard/jwt/")
    Object getProductBoardToken(e<? super Response<ProductBoardTokenResponseModel>> eVar);

    @GET("/api/v4/ssh-id/")
    Object getSshIdData(e<? super Response<SshIdResponse>> eVar);

    @POST("/api/v4/terminal/history/log/upload/")
    Object initiateSessionLogFileUpload(@Body InitiateSessionLogFileUploadRequest initiateSessionLogFileUploadRequest, e<? super Response<SessionLogItemApiModel>> eVar);

    @GET("/api/v3/team/invite/")
    Object listPendingTeamInvitations(@Query("limit") int i10, @Query("offset") int i11, e<? super Response<ListPendingInvitesResponse>> eVar);

    @GET("/api/v3/team/member/")
    Object listTeamMembers(@Query("offset") int i10, @Query("limit") int i11, e<? super Response<ListTeamMembersResponse>> eVar);

    @DELETE("/api/v3/auth/device/logout/current/")
    Object logout(e<? super Response<Void>> eVar);

    @DELETE("/api/v3/auth/device/logout/{id}/")
    Object logoutSpecificDevice(@Path("id") int i10, e<? super Response<Void>> eVar);

    @POST("/api/v3/user/srp/")
    Object migrateToNewCrypto(@Body SrpMigrationOldPasswordRequest srpMigrationOldPasswordRequest, e<? super Response<Void>> eVar);

    @POST("api/v4/auth/security/token/")
    Object obtainSecurityToken(@Body ObtainSecurityTokenRequest obtainSecurityTokenRequest, e<? super Response<ObtainSecurityTokenResponse>> eVar);

    @GET("/api/v3/user/device/")
    Object obtainUserActiveDevices(e<? super Response<List<UserActiveDeviceResponse>>> eVar);

    @POST("api/v4.1/auth/device/password/")
    Object postAuthDevicePassword(@Body AuthDevicePasswordRequest authDevicePasswordRequest, e<? super Response<AuthDevicePasswordResponse>> eVar);

    @POST("/api/v3/team/trial/")
    Object postCreateTeamForTrial(@Body CreateTeamTrialRequest createTeamTrialRequest, e<? super Response<CreateATeamResponse>> eVar);

    @POST("api/v4.2/survey/ces/dialog-interaction/")
    Object postCustomerSurveyInteractionData(@Body CustomerSurveyPayload customerSurveyPayload, e<? super Response<Void>> eVar);

    @POST("/api/v4.1/team/trial/deactivate/")
    Object postDeactivateTeamTrial(@Body DeactivateTeamRequestBody deactivateTeamRequestBody, e<? super Response<DowngradeBulkAccountResponse>> eVar);

    @POST("api/v4/auth/device/password/recovery/")
    Object postDevicePasswordRecovery(@Body DevicePasswordRecoveryRequest devicePasswordRecoveryRequest, e<? super Response<DevicePasswordRecoveryResponse>> eVar);

    @POST("api/v5/terminal/sync/")
    Object postFullBulk(@Body BulkModel bulkModel, e<? super Response<BulkModelFullData>> eVar);

    @POST("/api/v5/terminal/history-sync/")
    Object postHistoryConnections(@Body PostHistoryConnectionsRequest postHistoryConnectionsRequest, e<? super Response<HistorySyncResponse>> eVar);

    @POST("/api/v3/keyserver/key/my/")
    Call<EncryptedPersonalKeySet> postMyEncryptedKeySet(@Body EncryptedPersonalKeySet encryptedPersonalKeySet);

    @POST("/api/v4/keyserver/key/encryption/")
    Call<EncryptedEncryptionKey> postNewEncryptedEncryptionKey(@Body NewEncryptedEncryptionKey newEncryptedEncryptionKey);

    @POST("/api/v4/keyserver/key/encryption/")
    Object postNewEncryptedEncryptionKeyWithResponse(@Body NewEncryptedEncryptionKey newEncryptedEncryptionKey, e<? super Response<EncryptedEncryptionKey>> eVar);

    @POST("api/v3/password/reset/")
    Object postPasswordReset(@Body ResetPasswordRequestModel resetPasswordRequestModel, e<? super Response<Void>> eVar);

    @POST("api/v4.2/survey/ces/dialog-interaction/init/")
    Object postRequestCustomerSurveyInitialization(e<? super Response<Void>> eVar);

    @POST("/api/v4/terminal/history/log/bookmark/")
    Object postSessionLogsBookmarks(@Body PostSessionLogsBookmarksRequest postSessionLogsBookmarksRequest, e<? super Response<PostSessionLogsBookmarksResponse>> eVar);

    @POST("/api/v3/subscription/")
    Object postSubscriptionInfo(@Body AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo, e<? super Response<Void>> eVar);

    @POST("api/v4/auth/device/password/")
    Object postUserChangePassword(@Body ChangePasswordModel changePasswordModel, e<? super Response<ChangePasswordResponse>> eVar);

    @POST("api/v4/user/email/")
    Object postUserEmail(@Body ChangeEmailRequest changeEmailRequest, e<? super Response<Void>> eVar);

    @PUT("/api/v4/terminal/history/log/upload/{id}/presign_parts/")
    Object presignSessionLogFileChunk(@Path("id") long j10, @Body PresignSessionLogFileChunkRequest presignSessionLogFileChunkRequest, e<? super Response<PresignedSessionLogFileChunkResponse>> eVar);

    @PUT("api/v3/setting/mobile/")
    Object putAppSettings(@Body AppSettings appSettings, e<? super Response<Void>> eVar);

    @PUT("api/v3/user/device/current/")
    Object putDeviceActivationStatus(@Body MobileDevice mobileDevice, e<? super Response<Void>> eVar);

    @POST("api/v4.1/auth/otp/authy/register/")
    Object register2faByAuthy(@Body CellPhoneModel cellPhoneModel, e<? super Response<Void>> eVar);

    @POST("api/v4.1/auth/otp/totp/register/")
    Object register2faByTOTP(e<? super Response<RegisterTOTPResponse>> eVar);

    @GET("api/v4/bulk/account/")
    Object requestBulkAccount(e<? super Response<BulkAccountResponse>> eVar);

    @GET("api/v3/auth/device/centrifugo/token/")
    Object requestCentrifugoToken(e<? super Response<CentrifugeToken>> eVar);

    @GET("api/v5/terminal/sync/")
    Object requestDataLastSynced(@Query("last_synced__gte") String str, e<? super Response<BulkModelFullData>> eVar);

    @GET("api/v2/account/email/confirm/")
    Object requestEmailConfirmation(e<? super Response<Void>> eVar);

    @GET("/api/v5/terminal/history-sync/")
    Object requestHistoryConnections(@Query("revision") String str, e<? super Response<HistorySyncResponse>> eVar);

    @GET("/api/v3/in-app-messages/")
    Object requestInAppMessages(@Query("offset") int i10, @Query("limit") int i11, e<? super Response<InAppNotificationsApiRepository.InAppMessageResponse>> eVar);

    @GET("/api/v4/keyserver/key/encryption/")
    Call<EncryptedEncryptionKey> requestMyEncryptedEncryptionKey();

    @GET("/api/v3/keyserver/key/my/")
    Call<EncryptedPersonalKeySet> requestMyEncryptedKeySet();

    @GET("api/v3/auth/device/stale-encryption/")
    Object requestNotUpdatedDevices(@Query("offset") int i10, @Query("limit") int i11, e<? super Response<StaleDeviceItemWithMeta>> eVar);

    @GET("api/v3/team/member/stale-encryption/")
    Object requestNotUpdatedMembers(@Query("offset") int i10, @Query("limit") int i11, e<? super Response<StaleMemberItemWithMeta>> eVar);

    @GET("/api/v4.1/team/vault/personal/")
    Object requestPersonalVault(e<? super Response<RequestPersonalVaultApiResponse>> eVar);

    @GET("/api/v4/auth/integrity/nonce/")
    Object requestPlayIntegrityNonce(e<? super Response<PlayIntegrityNonceResponse>> eVar);

    @POST("api/v3/auth/device/centrifugo/subscribe/token/")
    Object requestPrivateSubscriptionToken(@Body CentrifugoClientId centrifugoClientId, e<? super Response<CentrifugoChannelTokenList>> eVar);

    @POST("/api/v4/trial/extend/")
    Object requestProTrialExtension(e<? super Response<ProTrialExtensionResponse>> eVar);

    @GET("api/v4/terminal/authorized-keys/")
    Object requestPublicKeys(e<? super Response<TeamPublicKeysByDevices>> eVar);

    @POST("/api/v3/user/password/recovery/verification-code/")
    Object requestSendingVerificationCode(e<? super Response<NewCryptoCodeRepo.VerificationCodeResponse>> eVar);

    @POST("/api/v3/user/srp/initial-data/")
    Object requestSrpSalt(e<? super Response<SrpSaltResponse>> eVar);

    @POST("/api/v4.1/auth/sso/domain/auth_url/")
    Object requestSsoDomainAuthUrl(@Body SsoDomainAuthUrlRequest ssoDomainAuthUrlRequest, e<? super Response<SsoDomainAuthUrlResponse>> eVar);

    @POST("/api/v4.1/auth/sso/domain/token/")
    Object requestSsoDomainToken(@Body SsoDomainTokenRequest ssoDomainTokenRequest, e<? super Response<SsoDomainTokenResponse>> eVar);

    @POST("api/v4/team/vault/request-to-upgrade-plan/")
    Object requestSubscriptionUpgrade(e<? super Response<Void>> eVar);

    @GET("/api/v3/keyserver/key/team/")
    Call<TeamMemberPublicKeyCollection> requestTeamMemberPublicKeyCollection(@Query("user_id") Integer num);

    @PATCH("/api/v4/team/trial/extend/")
    Object requestTeamTrialExtension(e<? super Response<TeamTrialExtensionResponse>> eVar);

    @POST("/api/v4/terminal/shell-assist/")
    Object requestTerminalShellAssist(@Body TerminalShellAssistRequest terminalShellAssistRequest, e<? super Response<TerminalShellAssistResponse>> eVar);

    @GET("/api/v4/account/{user_id}/avatar/")
    Object requestUserAvatar(@Path("user_id") int i10, e<? super Response<e0>> eVar);

    @GET("/api/v4.1/team/trial/deactivate/")
    Object requestUserSharedDataForDeactivate(e<? super Response<BulkModelFullData>> eVar);

    @GET("api/v3/crypto/regenerate/")
    Object requestV3CryptoRegenerate(e<? super Response<CryptoSpec>> eVar);

    @GET("/api/v4.1/team/vault/")
    Object requestVaults(e<? super Response<RequestVaultsApiResponse>> eVar);

    @GET("/api/v4/team/vault/keys/")
    Object requestVaultsKeysList(e<? super Response<List<EncryptionKeyApiModel>>> eVar);

    @POST("/api/v3/marketing/mailing/backup_and_sync/")
    Object sendBackUpAndSyncPromoEmail(e<? super Response<Void>> eVar);

    @POST("/api/v3/team/invite/")
    Object sendInvite(@Body InviteRequest inviteRequest, e<? super Response<Void>> eVar);

    @POST("/api/v3/marketing/mailing/import_desktop/")
    Object sendQuickImportPromoEmail(e<? super Response<Void>> eVar);

    @POST("api/v4/terminal/authorized-keys/")
    Object storePublicKey(@Body StorePublicKeyRequestBody storePublicKeyRequestBody, e<? super Response<Void>> eVar);

    @POST("/api/v4/account/email/code/send/")
    Object triggerSendEmailCode(@Body TriggerSendEmailCodeRequest triggerSendEmailCodeRequest, e<? super Response<Void>> eVar);

    @PATCH("/api/v4.1/team/vault/personal/")
    Object updatePersonalVault(@Body UpdatePersonalVaultApiRequest updatePersonalVaultApiRequest, e<? super Response<UpdatePersonalVaultApiResponse>> eVar);

    @PUT("api/v4/ssh-id/")
    Object updateSshIdCa(@Body SshIdUpdateCaPayload sshIdUpdateCaPayload, e<? super Response<SshIdResponse>> eVar);

    @PUT("api/v4/ssh-id/")
    Object updateSshIdProperties(@Body SshIdUpdatePropertiesPayload sshIdUpdatePropertiesPayload, e<? super Response<SshIdResponse>> eVar);

    @PATCH("/api/v4.1/team/vault/{id}/")
    Object updateVault(@Path("id") long j10, @Body UpdateVaultApiRequestBody updateVaultApiRequestBody, e<? super Response<UpdateVaultApiResponse>> eVar);

    @PUT
    Object uploadSessionLogFileChunkContent(@Header("x-amz-checksum-sha256") String str, @Url String str2, @Body c0 c0Var, e<? super Response<m0>> eVar);

    @POST("/api/v4/ssh-id/passkey/")
    Object uploadSshIdPasskeys(@Body SshIdUploadPasskeysPayload sshIdUploadPasskeysPayload, e<? super Response<SshIdResponse>> eVar);

    @POST("/api/v4/account/email/code/validate/")
    Object validateEmailCode(@Body ValidateEmailCodeRequest validateEmailCodeRequest, e<? super Response<Void>> eVar);
}
