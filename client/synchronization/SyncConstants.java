package com.server.auditor.ssh.client.synchronization;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class SyncConstants {

    public static class Actions {
        public static final String ACTION_CHANGE_PASSWORD = "action_change_password";
        public static final String ACTION_CHANGE_PASSWORD_V4_1 = "action_change_password_v4.1";
        public static final String ACTION_FETCH_TEAM_MEMBERS = "action_fetch_team_members";
        public static final String ACTION_FIRST_SYNC = "action_first_sync";
        public static final String ACTION_FULL_PROFILE_BULK_SYNC = "action_full_profile_bulk_sync";
        public static final String ACTION_FULL_SYNC = "action_full_sync";
        public static final String ACTION_GET_FIRST_BULK = "action_get_first_bulk";
        public static final String ACTION_GET_USER_PROFILE = "action_get_user_profile";
        public static final String ACTION_LOGOUT = "action_logout";
        public static final String ACTION_PUT_APP_SETTINGS = "action_put_settings";
        public static final String ACTION_REGENERATE_CRYPTO_SPECS = "action_regenerate_crypto_specs";
        public static final String ACTION_RELOAD_ALL_DATA = "action_reload_all_data";
        public static final String ACTION_SEND_CUSTOMER_SURVEY_INTERACTION_DATA = "ACTION_SEND_CUSTOMER_SURVEY_INTERACTION_DATA";
        public static final String ACTION_UPDATE_SSHID_DATA = "ACTION_UPDATE_SSHID_DATA";
        public static final String ACTION_VERIFY_EMAIL = "action_verify_email";
        public static final String ACTIVATE_DEVICE = "action_activate_current_mobile_device";
        public static final String GET_BULK_WITH_LAST_SYNCED = "action_get_bulk_with_last_synced";
    }

    public static class Bundle {
        public static final String ACTION = "bundle_action";
        public static final String API_KEY = "bundle_api_key";
        public static final String BAD_REQUEST_ERROR = "bad_request_error_model";
        public static final String CHANGE_PASSWORD_ERROR_MESSAGE = "change_password_error_message";
        public static final String CHANGE_PASSWORD_OBJECT = "bundle_change_password_object";
        public static final String CUSTOMER_SURVEY_ACTION_TYPE = "customer_survey_action_type";
        public static final String CUSTOMER_SURVEY_FEEDBACK = "customer_survey_feedback";
        public static final String CUSTOMER_SURVEY_INTERACTION_DATA_KEY = "customer_survey_interaction_data_key";
        public static final String CUSTOMER_SURVEY_RATED_TIME_IN_MILLIS = "customer_survey_rated_time_in_millis";
        public static final String CUSTOMER_SURVEY_SCORE = "customer_survey_score";
        public static final String ENCRYPTED_PRIVATE_KEY = "encrypted_private_key";
        public static final String ERROR_BODY = "bundle_error_body";
        public static final String FORCE_PULL_MEMBERS_LIST = "force_pull_members_list";
        public static final String HAS_CUSTOMER_SURVEY_INITIALIZED_KEY = "HAS_CUSTOMER_SURVEY_INITIALIZED_KEY";
        public static final String HISTORY_SYNC_RESULT_CODE = "HISTORY_SYNC_RESULT_CODE";
        public static final String IS_REPEAT_REQUIRE = "is_repeat_require";
        public static final String IS_TRIAL = "is_trial";
        public static final String KEEP_BIOMETRIC_KEYS = "keep_biometric_keys";
        public static final String NEED_SSH_ID_LOCK_SCREEN = "NEED_SSH_ID_LOCK_SCREEN";
        public static final String NEW_PASSWORD = "new_password";
        public static final String OLD_HMAC_SALT = "old_hmac_salt";
        public static final String OLD_PASSWORD = "old_password";
        public static final String OLD_SALT = "old_salt";
        public static final String OTP_TOKEN = "otp_token";
        public static final String OTP_TOKEN_ERROR_MESSAGE = "otp_token_error_message";
        public static final String PASSWORD = "password_for_check";
        public static final String PUBLIC_KEY = "public_key";
        public static final String REQUIRE_TWO_FACTOR_AUTH_FOR_TEAM_MEMBERS_MESSAGE = "bundle_require_two_factor_auth_for_team_members_message";
        public static final String RESULT_OUTDATED_VERSION_MESSAGE = "bundle_outdated_message";
        public static final String THROTTLING_SECONDS = "throttling_seconds";
        public static final String USERNAME = "bundle_username";
    }

    public static class ErrorMessages {
        public static final String BACKEND_API_ISNT_AVAILABLE = "Backend API isn't available - can't fetch user info for sync";
        public static final String NETWORK_ERROR_MESSAGE = "Network Error";
        public static final String NOT_ENOUGH_PERMISSIONS_TO_SHARE = "User does not have permission to create shared data.";
        public static final String REQUIRE_TWO_FACTOR_AUTH_FOR_TEAM_MEMBERS = "Two factor auth should be set up before sync.";
    }

    public static class Headers {
        public static final String RETRY_AFTER_HEADER = "Retry-After";
    }

    public static class LastSyncTime {
        public static final String PREFS_LAST_TIME_KEY = "Last Synced Time for bulk";
        public static final SimpleDateFormat sLastSyncFomratToday;
        public static final SimpleDateFormat sLastSyncFormat;

        static {
            Locale locale = Locale.US;
            sLastSyncFormat = new SimpleDateFormat("HH:mm MMM dd", locale);
            sLastSyncFomratToday = new SimpleDateFormat("HH:mm", locale);
        }
    }

    public static class ResultCode {
        public static final int BAD_REQUEST = 400;
        public static final int CANNOT_INIT_CLIENT_SESSION = -2;
        public static final int CREATED = 201;
        public static final int MINIMAL_VERSION_ERROR = 490;
        public static final int MULTIPLE_CHOICES = 300;
        public static final int NETWORK_ERROR = -1;
        public static final int NOT_FOUND = 404;
        public static final int NOT_PERMITTED = 403;
        public static final int NO_CONTENT = 204;
        public static final int OK = 200;
        public static final int OTP_CODE_ERROR = 487;
        public static final int SCHEDULED_TO_DELETE_ERROR = 488;
        public static final int THROTTLING_CODE_ERROR = 429;
        public static final int UNAUTHORIZED = 401;
        public static final int UNEXPECTED_ERROR = 0;
    }
}
