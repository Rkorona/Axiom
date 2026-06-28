package com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain;

import android.app.Application;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.j1;
import com.crystalnix.termius.libtermius.wrappers.LibTermiusSshClient;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import com.crystalnix.termius.libtermius.wrappers.sftp.FileItemsStateWithMeta;
import com.crystalnix.termius.libtermius.wrappers.sftp.FileSystemEntryWithMeta;
import com.crystalnix.termius.libtermius.wrappers.sftp.FileSystemSession;
import com.crystalnix.termius.libtermius.wrappers.sftp.FilterState;
import com.crystalnix.termius.libtermius.wrappers.sftp.SelectionModeState;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.DownloadFileForPreviewUseCase;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.models.connections.Connection;
import com.server.auditor.ssh.client.models.connections.ConnectionType;
import com.server.auditor.ssh.client.models.properties.SshProperties;
import com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import com.server.auditor.ssh.client.utils.sort.SftpSortType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lk.a;
import lk.b;
import lk.c;
import lk.f;
import lk.g;
import timber.log.Timber;
import wu.x0;
import zu.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class ComposeSftpPageViewModel extends AndroidViewModel {
    private static final String COPY_PATH_CLIPBOARD_LABEL = "Current path";
    public static final String SFTP_OPTION_DIVIDER = "divider";
    public static final String SFTP_OPTION_TITLE_CHANGE_DOWNLOAD_FOLDER = "sftp_option_title_change_download_folder";
    public static final String SFTP_OPTION_TITLE_COPY = "sftp_option_title_copy";
    public static final String SFTP_OPTION_TITLE_COPY_ITEM_PATH = "sftp_option_title_copy_item_path";
    public static final String SFTP_OPTION_TITLE_COPY_PATH = "sftp_option_title_copy_path";
    public static final String SFTP_OPTION_TITLE_DELETE = "sftp_option_title_delete";
    public static final String SFTP_OPTION_TITLE_DELETE_CONFIRMED = "sftp_option_title_delete_confirmed";
    public static final String SFTP_OPTION_TITLE_DISMISS_SELECT = "sftp_option_title_selection_dismiss";
    public static final String SFTP_OPTION_TITLE_DOWNLOAD = "sftp_option_title_download";
    public static final String SFTP_OPTION_TITLE_EDIT_IN_TERMINAL = "sftp_option_title_edit_in_terminal";
    public static final String SFTP_OPTION_TITLE_HIDDEN_FILES = "sftp_option_title_hidden_files";
    public static final String SFTP_OPTION_TITLE_NEW_FOLDER = "sftp_option_title_new_folder";
    public static final String SFTP_OPTION_TITLE_PASTE = "sftp_option_title_paste";
    public static final String SFTP_OPTION_TITLE_RENAME = "sftp_option_title_rename";
    public static final String SFTP_OPTION_TITLE_SELECTION_MORE = "sftp_option_title_selection_more";
    public static final String SFTP_OPTION_TITLE_SHOW_GUIDE = "sftp_option_title_show_guide";
    public static final String SFTP_OPTION_TITLE_SORT_BY_DATE = "sftp_option_title_sort_by_date";
    public static final String SFTP_OPTION_TITLE_SORT_BY_KIND = "sftp_option_title_sort_by_kind";
    public static final String SFTP_OPTION_TITLE_SORT_BY_NAME = "sftp_option_title_sort_by_name";
    public static final String SFTP_OPTION_TITLE_SORT_BY_SIZE = "sftp_option_title_sort_by_size";
    public static final String SFTP_OPTION_TITLE_UPLOAD = "sftp_option_title_upload";
    public static final String SFTP_OPTION_TITLE_UPLOAD_FILE = "sftp_option_title_upload_file";
    public static final String SFTP_OPTION_TITLE_UPLOAD_FOLDER = "sftp_option_title_upload_folder";
    private static final char URI_PATH_DELIMITER = ':';
    private final zu.w _currentSessionId;
    private final zu.w _deleteConfirmationState;
    private final zu.w _downloadFolderDialogState;
    private final yu.d _openDownloadedItemIntent;
    private final yu.d _sftpFileChooseRequest;
    private final zu.w _sftpRenameDialogRequest;
    private final yu.d _sftpSAFRequest;
    private final zu.w _sftpSelectEditorDialogRequest;
    private final yu.d _showGuide;
    private final zu.w _showSelectionModeMorePopup;
    private final zu.w _showUploadActionsPopup;
    private final yu.d _uploadSAFRequest;
    private final mk.a addDownloadItemsSftpTransferTaskUseCase;
    private final mk.c addUploadFilesSftpTransferTaskUseCase;
    private final mk.d addUploadFolderSftpTransferTaskUseCase;
    private final com.server.auditor.ssh.client.utils.analytics.a avoAnalytics;
    private final ut.n copyToClipboardUseCase$delegate;
    private final mk.h createNewDirectorySftpUseCase;
    private final zu.k0 currentSession;
    private final zu.k0 currentSftpHolder;
    private final zu.k0 deleteConfirmationState;
    private final ut.n downloadFileForPreviewUseCase$delegate;
    private final zu.k0 downloadFolderDialogState;
    private final zu.k0 errorMessage;
    private final zu.k0 fileItems;
    private final zu.k0 filterQuery;
    private final zu.k0 hostAddress;
    private final zu.k0 isConnected;
    private final zu.f openDownloadedItemIntent;
    private final mk.l pasteCopiedFileSftpTransferTaskUseCase;
    private final zu.k0 path;
    private final mk.n prepareSelectedItemsForSftpTransferTaskUseCase;
    private final zu.k0 previewState;
    private final zu.k0 selectionModeState;
    private final SessionManager sessionManager;
    private final zu.f sftpFileChooseRequest;
    private final aj.a sftpLastLocalDirInteractor;
    private final zu.k0 sftpRenameDialogRequest;
    private final zu.f sftpSAFRequest;
    private final zu.k0 sftpSelectEditorDialogRequest;
    private final zu.f showGuide;
    private final zu.k0 showHiddenFiles;
    private final zu.k0 showSelectionModeMorePopup;
    private final zu.k0 showUploadActionsPopup;
    private final zu.k0 sortType;
    private final mk.q startSftpTransferWorkerUseCase;
    private final ek.h startTerminalConnectionsUseCase;
    private final zu.f uploadSAFRequest;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class a0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33189a;

        a0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new a0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            zu.k0 previewState;
            Object objF = au.b.f();
            int i10 = this.f33189a;
            if (i10 == 0) {
                ut.x.b(obj);
                FileSystemSession fileSystemSession = (FileSystemSession) ComposeSftpPageViewModel.this.currentSession.getValue();
                lk.f fVar = (fileSystemSession == null || (previewState = fileSystemSession.getPreviewState()) == null) ? null : (lk.f) previewState.getValue();
                if (fVar instanceof f.a) {
                    yu.d dVar = ComposeSftpPageViewModel.this._openDownloadedItemIntent;
                    String string = ((f.a) fVar).b().toString();
                    ju.t.e(string, "toString(...)");
                    HomeScreenViewModel.b.a aVar = new HomeScreenViewModel.b.a(string);
                    this.f33189a = 1;
                    if (dVar.b(aVar, this) == objF) {
                        return objF;
                    }
                }
                return ut.m0.f82633a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FileSystemSession fileSystemSession2 = (FileSystemSession) ComposeSftpPageViewModel.this.currentSession.getValue();
            if (fileSystemSession2 != null) {
                fileSystemSession2.hidePreview();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f33191a = new b();

        private b() {
        }
    }

    static final class b0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33192a;

        b0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new b0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33192a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Long l10 = (Long) ComposeSftpPageViewModel.this._currentSessionId.getValue();
            int iLongValue = l10 != null ? (int) l10.longValue() : -1;
            ComposeSftpPageViewModel.this.avoAnalytics.a4(Avo.SFTPTransferType.COPY);
            ComposeSftpPageViewModel.this.pasteCopiedFileSftpTransferTaskUseCase.a(iLongValue, (String) ComposeSftpPageViewModel.this.getPath().getValue(), ComposeSftpPageViewModel.this.getApplication());
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f33194a = new c();

        private c() {
        }
    }

    static final class c0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33195a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f33197c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f33197c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new c0(this.f33197c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33195a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = ComposeSftpPageViewModel.this._showSelectionModeMorePopup;
            boolean z10 = this.f33197c;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(z10)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33198a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33198a;
            if (i10 == 0) {
                ut.x.b(obj);
                FileSystemSession fileSystemSession = (FileSystemSession) ComposeSftpPageViewModel.this.currentSession.getValue();
                if (fileSystemSession != null) {
                    this.f33198a = 1;
                    if (fileSystemSession.onDismissError(this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33200a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f33202c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(List list, zt.e eVar) {
            super(2, eVar);
            this.f33202c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new d0(this.f33202c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33200a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Long l10 = (Long) ComposeSftpPageViewModel.this._currentSessionId.getValue();
            int iLongValue = l10 != null ? (int) l10.longValue() : -1;
            ComposeSftpPageViewModel.this.avoAnalytics.a4(Avo.SFTPTransferType.UPLOAD);
            ComposeSftpPageViewModel.this.addUploadFilesSftpTransferTaskUseCase.a(iLongValue, this.f33202c, (String) ComposeSftpPageViewModel.this.getPath().getValue(), ComposeSftpPageViewModel.this.getApplication());
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33203a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33203a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ComposeSftpPageViewModel.this.getCopyToClipboardUseCase().a(ComposeSftpPageViewModel.COPY_PATH_CLIPBOARD_LABEL, (String) ComposeSftpPageViewModel.this.getPath().getValue());
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33205a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v4.a f33207c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(v4.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f33207c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new e0(this.f33207c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33205a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Long l10 = (Long) ComposeSftpPageViewModel.this._currentSessionId.getValue();
            int iLongValue = l10 != null ? (int) l10.longValue() : -1;
            ComposeSftpPageViewModel.this.avoAnalytics.a4(Avo.SFTPTransferType.UPLOAD_FOLDERS);
            ComposeSftpPageViewModel.this.addUploadFolderSftpTransferTaskUseCase.a(iLongValue, this.f33207c, (String) ComposeSftpPageViewModel.this.getPath().getValue(), ComposeSftpPageViewModel.this.getApplication());
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33208a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List<FileSystemEntryWithMeta> items;
            au.b.f();
            if (this.f33208a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (ComposeSftpPageViewModel.this.getSelectionModeState().getValue() instanceof SelectionModeState.Active) {
                Object value = ComposeSftpPageViewModel.this.getFileItems().getValue();
                ArrayList arrayList = null;
                FileItemsStateWithMeta.Presented presented = value instanceof FileItemsStateWithMeta.Presented ? (FileItemsStateWithMeta.Presented) value : null;
                if (presented != null && (items = presented.getItems()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : items) {
                        if (((FileSystemEntryWithMeta) obj2).isSelected()) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = new ArrayList(vt.v.z(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((FileSystemEntryWithMeta) it.next()).getFileSystemEntry());
                    }
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    Long l10 = (Long) ComposeSftpPageViewModel.this._currentSessionId.getValue();
                    ComposeSftpPageViewModel.this.prepareSelectedItemsForSftpTransferTaskUseCase.b(l10 != null ? (int) l10.longValue() : -1, (String) ComposeSftpPageViewModel.this.getPath().getValue(), arrayList);
                }
                FileSystemSession fileSystemSession = (FileSystemSession) ComposeSftpPageViewModel.this.currentSession.getValue();
                if (fileSystemSession != null) {
                    fileSystemSession.dismissSelection();
                }
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33210a;

        f0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new f0(eVar);
        }

        @Override // iu.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SelectionModeState selectionModeState, zt.e eVar) {
            return ((f0) create(selectionModeState, eVar)).invokeSuspend(ut.m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33210a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = ComposeSftpPageViewModel.this._showSelectionModeMorePopup;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            return ut.m0.f82633a;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33212a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v4.a f33214c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(v4.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f33214c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new g(this.f33214c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List<FileSystemEntryWithMeta> items;
            au.b.f();
            if (this.f33212a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Object value = ComposeSftpPageViewModel.this.getFileItems().getValue();
            ArrayList arrayList = null;
            FileItemsStateWithMeta.Presented presented = value instanceof FileItemsStateWithMeta.Presented ? (FileItemsStateWithMeta.Presented) value : null;
            if (presented != null && (items = presented.getItems()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : items) {
                    if (((FileSystemEntryWithMeta) obj2).isSelected()) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList = new ArrayList(vt.v.z(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((FileSystemEntryWithMeta) it.next()).getFileSystemEntry());
                }
            }
            ArrayList arrayList3 = arrayList;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                ComposeSftpPageViewModel.this.avoAnalytics.a4(Avo.SFTPTransferType.DOWNLOAD);
                Long l10 = (Long) ComposeSftpPageViewModel.this._currentSessionId.getValue();
                ComposeSftpPageViewModel.this.addDownloadItemsSftpTransferTaskUseCase.a(l10 != null ? (int) l10.longValue() : -1, this.f33214c, (String) ComposeSftpPageViewModel.this.getPath().getValue(), arrayList3, ComposeSftpPageViewModel.this.getApplication());
            }
            FileSystemSession fileSystemSession = (FileSystemSession) ComposeSftpPageViewModel.this.currentSession.getValue();
            if (fileSystemSession != null) {
                fileSystemSession.dismissSelection();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class g0 extends kotlin.coroutines.jvm.internal.m implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f33216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33217c;

        public g0(zt.e eVar) {
            super(3, eVar);
        }

        @Override // iu.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zu.g gVar, Object obj, zt.e eVar) {
            g0 g0Var = new g0(eVar);
            g0Var.f33216b = gVar;
            g0Var.f33217c = obj;
            return g0Var.invokeSuspend(ut.m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33215a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.g gVar = (zu.g) this.f33216b;
                i iVar = new i(zl.a.f88024a.g(), ((Number) this.f33217c).longValue());
                this.f33215a = 1;
                if (zu.h.u(gVar, iVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f33219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f33220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f33221d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p9.a f33223f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(p9.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f33223f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new h(this.f33223f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objInvoke;
            int i10;
            String str;
            FileSystemSession fileSystemSession;
            FileSystemSession fileSystemSession2;
            Object objF = au.b.f();
            int i11 = this.f33221d;
            if (i11 == 0) {
                ut.x.b(obj);
                Long l10 = (Long) ComposeSftpPageViewModel.this._currentSessionId.getValue();
                if (l10 == null) {
                    return ut.m0.f82633a;
                }
                int iLongValue = (int) l10.longValue();
                FileSystemSession fileSystemSession3 = (FileSystemSession) ComposeSftpPageViewModel.this.currentSession.getValue();
                if (fileSystemSession3 == null) {
                    return ut.m0.f82633a;
                }
                String strB = this.f33223f.b();
                ju.t.e(strB, "getFileName(...)");
                String strA = mk.b.a(strB, (String) ComposeSftpPageViewModel.this.getPath().getValue());
                String str2 = iLongValue + ":" + strA + ":" + this.f33223f.g();
                String strB2 = this.f33223f.b();
                ju.t.e(strB2, "getFileName(...)");
                fileSystemSession3.updatePreviewState(new f.d(strB2, strA, iLongValue));
                DownloadFileForPreviewUseCase downloadFileForPreviewUseCase = ComposeSftpPageViewModel.this.getDownloadFileForPreviewUseCase();
                String strB3 = this.f33223f.b();
                ju.t.e(strB3, "getFileName(...)");
                long jC = this.f33223f.c();
                this.f33219b = fileSystemSession3;
                this.f33220c = strA;
                this.f33218a = iLongValue;
                this.f33221d = 1;
                objInvoke = downloadFileForPreviewUseCase.invoke(iLongValue, strA, strB3, jC, str2, this);
                if (objInvoke != objF) {
                    i10 = iLongValue;
                    str = strA;
                    fileSystemSession = fileSystemSession3;
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileSystemSession2 = (FileSystemSession) this.f33219b;
                ut.x.b(obj);
                fileSystemSession2.hidePreview();
                return ut.m0.f82633a;
            }
            int i12 = this.f33218a;
            String str3 = (String) this.f33220c;
            fileSystemSession = (FileSystemSession) this.f33219b;
            ut.x.b(obj);
            i10 = i12;
            str = str3;
            objInvoke = obj;
            DownloadFileForPreviewUseCase.Result result = (DownloadFileForPreviewUseCase.Result) objInvoke;
            if (result instanceof DownloadFileForPreviewUseCase.Result.Success) {
                String strB4 = this.f33223f.b();
                ju.t.e(strB4, "getFileName(...)");
                DownloadFileForPreviewUseCase.Result.Success success = (DownloadFileForPreviewUseCase.Result.Success) result;
                fileSystemSession.updatePreviewState(new f.a(strB4, str, i10, this.f33223f.c(), success.getMimeType(), success.getUri()));
                ComposeSftpPageViewModel.this.onOpenPreview();
            } else {
                if (result instanceof DownloadFileForPreviewUseCase.Result.Error) {
                    String error = ((DownloadFileForPreviewUseCase.Result.Error) result).getError();
                    this.f33219b = fileSystemSession;
                    this.f33220c = null;
                    this.f33221d = 2;
                    if (fileSystemSession.onSendErrorMessage(error, this) != objF) {
                        fileSystemSession2 = fileSystemSession;
                        fileSystemSession2.hidePreview();
                    }
                    return objF;
                }
                if (!ju.t.b(result, DownloadFileForPreviewUseCase.Result.Canceled.INSTANCE)) {
                    throw new ut.s();
                }
                fileSystemSession.hidePreview();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class h0 extends kotlin.coroutines.jvm.internal.m implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f33225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33226c;

        public h0(zt.e eVar) {
            super(3, eVar);
        }

        @Override // iu.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zu.g gVar, Object obj, zt.e eVar) {
            h0 h0Var = new h0(eVar);
            h0Var.f33225b = gVar;
            h0Var.f33226c = obj;
            return h0Var.invokeSuspend(ut.m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33224a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.g gVar = (zu.g) this.f33225b;
                zu.k0 path = ((FileSystemSession) this.f33226c).getPath();
                this.f33224a = 1;
                if (zu.h.u(gVar, path, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }
    }

    public static final class i implements zu.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.f f33227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f33228b;

        public static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zu.g f33229a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f33230b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel$i$a$a, reason: collision with other inner class name */
            public static final class C0509a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f33231a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f33232b;

                public C0509a(zt.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f33231a = obj;
                    this.f33232b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(zu.g gVar, long j10) {
                this.f33229a = gVar;
                this.f33230b = j10;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // zu.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, zt.e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel.i.a.C0509a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel$i$a$a r0 = (com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel.i.a.C0509a) r0
                    int r1 = r0.f33232b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f33232b = r1
                    goto L18
                L13:
                    com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel$i$a$a r0 = new com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel$i$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f33231a
                    java.lang.Object r1 = au.b.f()
                    int r2 = r0.f33232b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    ut.x.b(r8)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    ut.x.b(r8)
                    zu.g r8 = r6.f33229a
                    java.util.Map r7 = (java.util.Map) r7
                    long r4 = r6.f33230b
                    int r2 = (int) r4
                    java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.d(r2)
                    java.lang.Object r7 = r7.get(r2)
                    r0.f33232b = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L4c
                    return r1
                L4c:
                    ut.m0 r7 = ut.m0.f82633a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel.i.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public i(zu.f fVar, long j10) {
            this.f33227a = fVar;
            this.f33228b = j10;
        }

        @Override // zu.f
        public Object collect(zu.g gVar, zt.e eVar) {
            Object objCollect = this.f33227a.collect(new a(gVar, this.f33228b), eVar);
            return objCollect == au.b.f() ? objCollect : ut.m0.f82633a;
        }
    }

    public static final class i0 extends kotlin.coroutines.jvm.internal.m implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f33235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33236c;

        public i0(zt.e eVar) {
            super(3, eVar);
        }

        @Override // iu.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zu.g gVar, Object obj, zt.e eVar) {
            i0 i0Var = new i0(eVar);
            i0Var.f33235b = gVar;
            i0Var.f33236c = obj;
            return i0Var.invokeSuspend(ut.m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33234a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.g gVar = (zu.g) this.f33235b;
                zu.k0 previewState = ((FileSystemSession) this.f33236c).getPreviewState();
                this.f33234a = 1;
                if (zu.h.u(gVar, previewState, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f33238b;

        j(zt.e eVar) {
            super(3, eVar);
        }

        @Override // iu.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FileSystemSession fileSystemSession, FileItemsStateWithMeta fileItemsStateWithMeta, zt.e eVar) {
            j jVar = new j(eVar);
            jVar.f33238b = fileSystemSession;
            return jVar.invokeSuspend(ut.m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33237a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FileSystemSession fileSystemSession = (FileSystemSession) this.f33238b;
            return kotlin.coroutines.jvm.internal.b.a(fileSystemSession != null && fileSystemSession.isConnected());
        }
    }

    public static final class j0 extends kotlin.coroutines.jvm.internal.m implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f33240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33241c;

        public j0(zt.e eVar) {
            super(3, eVar);
        }

        @Override // iu.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zu.g gVar, Object obj, zt.e eVar) {
            j0 j0Var = new j0(eVar);
            j0Var.f33240b = gVar;
            j0Var.f33241c = obj;
            return j0Var.invokeSuspend(ut.m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33239a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.g gVar = (zu.g) this.f33240b;
                zu.k0 sortOption = ((FileSystemSession) this.f33241c).getSortOption();
                this.f33239a = 1;
                if (zu.h.u(gVar, sortOption, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f33243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComposeSftpPageViewModel f33244c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, ComposeSftpPageViewModel composeSftpPageViewModel, zt.e eVar) {
            super(2, eVar);
            this.f33243b = str;
            this.f33244c = composeSftpPageViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new k(this.f33243b, this.f33244c, eVar);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x0222, code lost:
        
            if (r8.b(r1, r7) == r0) goto L270;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x023d, code lost:
        
            if (r8 == r0) goto L270;
         */
        /* JADX WARN: Code restructure failed: missing block: B:157:0x0333, code lost:
        
            if (r8.emit(r1, r7) == r0) goto L270;
         */
        /* JADX WARN: Code restructure failed: missing block: B:163:0x034f, code lost:
        
            if (r8.b(r1, r7) == r0) goto L270;
         */
        /* JADX WARN: Code restructure failed: missing block: B:269:0x05ae, code lost:
        
            if (r8.onSendErrorMessage(r1, r7) == r0) goto L270;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
        
            if (r8.b(r1, r7) == r0) goto L270;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x01e1, code lost:
        
            if (r8.b(r1, r7) == r0) goto L270;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:237:0x04d0  */
        /* JADX WARN: Removed duplicated region for block: B:273:0x05bf  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01d2  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01e5  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 1590
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class k0 extends kotlin.coroutines.jvm.internal.m implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f33246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33247c;

        public k0(zt.e eVar) {
            super(3, eVar);
        }

        @Override // iu.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zu.g gVar, Object obj, zt.e eVar) {
            k0 k0Var = new k0(eVar);
            k0Var.f33246b = gVar;
            k0Var.f33247c = obj;
            return k0Var.invokeSuspend(ut.m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33245a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.g gVar = (zu.g) this.f33246b;
                zu.k0 filterQuery = ((FileSystemSession) this.f33247c).getFilterQuery();
                this.f33245a = 1;
                if (zu.h.u(gVar, filterQuery, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33248a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33248a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FileSystemSession fileSystemSession = (FileSystemSession) ComposeSftpPageViewModel.this.currentSession.getValue();
            if (fileSystemSession != null) {
                fileSystemSession.hidePreview();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class l0 extends kotlin.coroutines.jvm.internal.m implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f33251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33252c;

        public l0(zt.e eVar) {
            super(3, eVar);
        }

        @Override // iu.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zu.g gVar, Object obj, zt.e eVar) {
            l0 l0Var = new l0(eVar);
            l0Var.f33251b = gVar;
            l0Var.f33252c = obj;
            return l0Var.invokeSuspend(ut.m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33250a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.g gVar = (zu.g) this.f33251b;
                zu.k0 selectionModeState = ((FileSystemSession) this.f33252c).getSelectionModeState();
                this.f33250a = 1;
                if (zu.h.u(gVar, selectionModeState, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33253a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33253a;
            if (i10 == 0) {
                ut.x.b(obj);
                ComposeSftpPageViewModel.this._downloadFolderDialogState.setValue(b.a.f64277a);
                yu.d dVar = ComposeSftpPageViewModel.this._sftpSAFRequest;
                b bVar = b.f33191a;
                this.f33253a = 1;
                if (dVar.b(bVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            ComposeSftpPageViewModel.this.avoAnalytics.Y3();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class m0 extends kotlin.coroutines.jvm.internal.m implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f33256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33257c;

        public m0(zt.e eVar) {
            super(3, eVar);
        }

        @Override // iu.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zu.g gVar, Object obj, zt.e eVar) {
            m0 m0Var = new m0(eVar);
            m0Var.f33256b = gVar;
            m0Var.f33257c = obj;
            return m0Var.invokeSuspend(ut.m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33255a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.g gVar = (zu.g) this.f33256b;
                zu.k0 showHiddenFiles = ((FileSystemSession) this.f33257c).getShowHiddenFiles();
                this.f33255a = 1;
                if (zu.h.u(gVar, showHiddenFiles, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33258a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33260c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, zt.e eVar) {
            super(2, eVar);
            this.f33260c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 k(int i10) {
            return ut.m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new n(this.f33260c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object next;
            Connection connectionC;
            au.b.f();
            if (this.f33258a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = ComposeSftpPageViewModel.this._sftpSelectEditorDialogRequest;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, c.b.f64280a));
            FileSystemSession fileSystemSession = (FileSystemSession) ComposeSftpPageViewModel.this.currentSession.getValue();
            Connection connectionCloneConnection = null;
            if (fileSystemSession != null) {
                long sessionId = fileSystemSession.getSessionId();
                Iterator it = zl.a.f88024a.i().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Connection connectionC2 = ((zl.b) next).c();
                    if (connectionC2 != null && connectionC2.getId() == sessionId) {
                        break;
                    }
                }
                zl.b bVar = (zl.b) next;
                if (bVar != null && (connectionC = bVar.c()) != null) {
                    connectionCloneConnection = connectionC.cloneConnection();
                }
            }
            if (connectionCloneConnection != null) {
                String str = this.f33260c;
                ComposeSftpPageViewModel composeSftpPageViewModel = ComposeSftpPageViewModel.this;
                connectionCloneConnection.setConnectionOrigin(Avo.ConnectionOrigin.SFTP_SCREEN);
                SshProperties safeSshProperties = connectionCloneConnection.getSafeSshProperties();
                ju.t.e(safeSshProperties, "getSafeSshProperties(...)");
                safeSshProperties.setStartupSnippet(new SnippetItem(str, -1L));
                connectionCloneConnection.setConfig(ConnectionType.ssh, safeSshProperties);
                composeSftpPageViewModel.startTerminalConnectionsUseCase.a(vt.v.e(connectionCloneConnection), new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.a
                    @Override // iu.l
                    public final Object invoke(Object obj2) {
                        return ComposeSftpPageViewModel.n.k(((Integer) obj2).intValue());
                    }
                });
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class n0 extends kotlin.coroutines.jvm.internal.m implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f33262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33263c;

        public n0(zt.e eVar) {
            super(3, eVar);
        }

        @Override // iu.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zu.g gVar, Object obj, zt.e eVar) {
            n0 n0Var = new n0(eVar);
            n0Var.f33262b = gVar;
            n0Var.f33263c = obj;
            return n0Var.invokeSuspend(ut.m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33261a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.g gVar = (zu.g) this.f33262b;
                zu.f fVarM = zu.h.M(((FileSystemSession) this.f33263c).getErrorChannel());
                this.f33261a = 1;
                if (zu.h.u(gVar, fVarM, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33264a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f33267d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, String str2, zt.e eVar) {
            super(2, eVar);
            this.f33266c = str;
            this.f33267d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new o(this.f33266c, this.f33267d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33264a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = ComposeSftpPageViewModel.this._sftpRenameDialogRequest;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, g.a.f64306a));
            FileSystemSession fileSystemSession = (FileSystemSession) ComposeSftpPageViewModel.this.currentSession.getValue();
            if (fileSystemSession != null) {
                fileSystemSession.rename(mk.m.a((String) ComposeSftpPageViewModel.this.getPath().getValue(), this.f33266c), mk.m.a((String) ComposeSftpPageViewModel.this.getPath().getValue(), this.f33267d));
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class o0 extends kotlin.coroutines.jvm.internal.m implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f33269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33270c;

        public o0(zt.e eVar) {
            super(3, eVar);
        }

        @Override // iu.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zu.g gVar, Object obj, zt.e eVar) {
            o0 o0Var = new o0(eVar);
            o0Var.f33269b = gVar;
            o0Var.f33270c = obj;
            return o0Var.invokeSuspend(ut.m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33268a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.g gVar = (zu.g) this.f33269b;
                zu.k0 fileEntries = ((FileSystemSession) this.f33270c).getFileEntries();
                this.f33268a = 1;
                if (zu.h.u(gVar, fileEntries, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33271a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new p(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33271a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.w wVar = ComposeSftpPageViewModel.this._deleteConfirmationState;
                a.C0977a c0977a = a.C0977a.f64275a;
                this.f33271a = 1;
                if (wVar.emit(c0977a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class p0 implements zu.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.f f33273a;

        public static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zu.g f33274a;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel$p0$a$a, reason: collision with other inner class name */
            public static final class C0510a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f33275a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f33276b;

                public C0510a(zt.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f33275a = obj;
                    this.f33276b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(zu.g gVar) {
                this.f33274a = gVar;
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
                    boolean r0 = r6 instanceof com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel.p0.a.C0510a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel$p0$a$a r0 = (com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel.p0.a.C0510a) r0
                    int r1 = r0.f33276b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f33276b = r1
                    goto L18
                L13:
                    com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel$p0$a$a r0 = new com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel$p0$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f33275a
                    java.lang.Object r1 = au.b.f()
                    int r2 = r0.f33276b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    ut.x.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    ut.x.b(r6)
                    zu.g r6 = r4.f33274a
                    zl.b r5 = (zl.b) r5
                    com.crystalnix.termius.libtermius.wrappers.sftp.FileSystemSession r5 = r5.d()
                    r0.f33276b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    ut.m0 r5 = ut.m0.f82633a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel.p0.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public p0(zu.f fVar) {
            this.f33273a = fVar;
        }

        @Override // zu.f
        public Object collect(zu.g gVar, zt.e eVar) {
            Object objCollect = this.f33273a.collect(new a(gVar), eVar);
            return objCollect == au.b.f() ? objCollect : ut.m0.f82633a;
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33278a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33278a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ComposeSftpPageViewModel.this._downloadFolderDialogState.setValue(b.a.f64277a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class q0 implements zu.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.f f33280a;

        public static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zu.g f33281a;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel$q0$a$a, reason: collision with other inner class name */
            public static final class C0511a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f33282a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f33283b;

                public C0511a(zt.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f33282a = obj;
                    this.f33283b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(zu.g gVar) {
                this.f33281a = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // zu.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r11, zt.e r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel.q0.a.C0511a
                    if (r0 == 0) goto L13
                    r0 = r12
                    com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel$q0$a$a r0 = (com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel.q0.a.C0511a) r0
                    int r1 = r0.f33283b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f33283b = r1
                    goto L18
                L13:
                    com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel$q0$a$a r0 = new com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel$q0$a$a
                    r0.<init>(r12)
                L18:
                    java.lang.Object r12 = r0.f33282a
                    java.lang.Object r1 = au.b.f()
                    int r2 = r0.f33283b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    ut.x.b(r12)
                    goto L86
                L29:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L31:
                    ut.x.b(r12)
                    zu.g r12 = r10.f33281a
                    com.crystalnix.termius.libtermius.wrappers.sftp.FileSystemSession r11 = (com.crystalnix.termius.libtermius.wrappers.sftp.FileSystemSession) r11
                    java.lang.String r2 = ""
                    r4 = 0
                    if (r11 == 0) goto L79
                    long r5 = r11.getSessionId()
                    zl.a r11 = zl.a.f88024a
                    java.util.List r11 = r11.i()
                    java.util.Iterator r11 = r11.iterator()
                L4b:
                    boolean r7 = r11.hasNext()
                    if (r7 == 0) goto L67
                    java.lang.Object r7 = r11.next()
                    r8 = r7
                    zl.b r8 = (zl.b) r8
                    com.server.auditor.ssh.client.models.connections.Connection r8 = r8.c()
                    if (r8 == 0) goto L4b
                    long r8 = r8.getId()
                    int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                    if (r8 != 0) goto L4b
                    goto L68
                L67:
                    r7 = r4
                L68:
                    zl.b r7 = (zl.b) r7
                    if (r7 == 0) goto L76
                    com.server.auditor.ssh.client.models.connections.Connection r11 = r7.c()
                    if (r11 == 0) goto L76
                    java.lang.String r4 = r11.getHost()
                L76:
                    if (r4 != 0) goto L79
                    r4 = r2
                L79:
                    if (r4 != 0) goto L7c
                    goto L7d
                L7c:
                    r2 = r4
                L7d:
                    r0.f33283b = r3
                    java.lang.Object r11 = r12.emit(r2, r0)
                    if (r11 != r1) goto L86
                    return r1
                L86:
                    ut.m0 r11 = ut.m0.f82633a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.ComposeSftpPageViewModel.q0.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public q0(zu.f fVar) {
            this.f33280a = fVar;
        }

        @Override // zu.f
        public Object collect(zu.g gVar, zt.e eVar) {
            Object objCollect = this.f33280a.collect(new a(gVar), eVar);
            return objCollect == au.b.f() ? objCollect : ut.m0.f82633a;
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33285a;

        r(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new r(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33285a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = ComposeSftpPageViewModel.this._sftpSelectEditorDialogRequest;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, c.b.f64280a));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class r0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33287a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f33289c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r0(long j10, zt.e eVar) {
            super(2, eVar);
            this.f33289c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new r0(this.f33289c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33287a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ComposeSftpPageViewModel.this._currentSessionId.setValue(kotlin.coroutines.jvm.internal.b.e(this.f33289c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((r0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33290a;

        s(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new s(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33290a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = ComposeSftpPageViewModel.this._sftpRenameDialogRequest;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, g.a.f64306a));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33292a;

        t(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new t(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33292a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = ComposeSftpPageViewModel.this._showUploadActionsPopup;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33294a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v4.a f33296c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(v4.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f33296c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new u(this.f33296c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33294a;
            if (i10 == 0) {
                ut.x.b(obj);
                aj.a aVar = ComposeSftpPageViewModel.this.sftpLastLocalDirInteractor;
                v4.a aVar2 = this.f33296c;
                this.f33294a = 1;
                if (aVar.a(aVar2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            if (ComposeSftpPageViewModel.this.getSelectionModeState().getValue() instanceof SelectionModeState.Active) {
                ComposeSftpPageViewModel.this.createDownloadTasksIfNeeded(this.f33296c);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((u) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33297a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33299c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(String str, zt.e eVar) {
            super(2, eVar);
            this.f33299c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new v(this.f33299c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33297a;
            if (i10 == 0) {
                ut.x.b(obj);
                FileSystemSession fileSystemSession = (FileSystemSession) ComposeSftpPageViewModel.this.currentSession.getValue();
                if (fileSystemSession != null) {
                    String str = this.f33299c;
                    this.f33297a = 1;
                    if (fileSystemSession.onSendErrorMessage(str, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((v) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33300a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p9.a f33302c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(p9.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f33302c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new w(this.f33302c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33300a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (ComposeSftpPageViewModel.this.getFileItems().getValue() instanceof FileItemsStateWithMeta.Loading) {
                return ut.m0.f82633a;
            }
            if (!(ComposeSftpPageViewModel.this.getSelectionModeState().getValue() instanceof SelectionModeState.None) && !ju.t.b(this.f33302c.b(), "..")) {
                FileSystemSession fileSystemSession = (FileSystemSession) ComposeSftpPageViewModel.this.currentSession.getValue();
                if (fileSystemSession != null) {
                    fileSystemSession.toggleSelection(this.f33302c);
                }
            } else if (this.f33302c.l() || this.f33302c.m()) {
                FileSystemSession fileSystemSession2 = (FileSystemSession) ComposeSftpPageViewModel.this.currentSession.getValue();
                if (fileSystemSession2 != null) {
                    String str = (String) ComposeSftpPageViewModel.this.getPath().getValue();
                    String strB = this.f33302c.b();
                    ju.t.e(strB, "getFileName(...)");
                    fileSystemSession2.changePath(mk.m.a(str, strB));
                }
            } else {
                ComposeSftpPageViewModel.this.createPreviewDownloadTask(this.f33302c);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((w) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p9.a f33304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComposeSftpPageViewModel f33305c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(p9.a aVar, ComposeSftpPageViewModel composeSftpPageViewModel, zt.e eVar) {
            super(2, eVar);
            this.f33304b = aVar;
            this.f33305c = composeSftpPageViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new x(this.f33304b, this.f33305c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FileSystemSession fileSystemSession;
            au.b.f();
            if (this.f33303a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!ju.t.b(this.f33304b.b(), "..") && (fileSystemSession = (FileSystemSession) this.f33305c.currentSession.getValue()) != null) {
                fileSystemSession.toggleSelection(this.f33304b);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((x) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33306a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FilterState f33308c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(FilterState filterState, zt.e eVar) {
            super(2, eVar);
            this.f33308c = filterState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new y(this.f33308c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33306a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FileSystemSession fileSystemSession = (FileSystemSession) ComposeSftpPageViewModel.this.currentSession.getValue();
            if (fileSystemSession != null) {
                fileSystemSession.updateFilterQuery(this.f33308c);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((y) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class z extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33309a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33311c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(String str, zt.e eVar) {
            super(2, eVar);
            this.f33311c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ComposeSftpPageViewModel.this.new z(this.f33311c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33309a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = ComposeSftpPageViewModel.this._sftpRenameDialogRequest;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, g.a.f64306a));
            FileSystemSession fileSystemSession = (FileSystemSession) ComposeSftpPageViewModel.this.currentSession.getValue();
            if (fileSystemSession != null) {
                ComposeSftpPageViewModel composeSftpPageViewModel = ComposeSftpPageViewModel.this;
                composeSftpPageViewModel.createNewDirectorySftpUseCase.a(fileSystemSession, (String) composeSftpPageViewModel.getPath().getValue(), this.f33311c);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((z) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeSftpPageViewModel(final Application application) {
        super(application);
        ju.t.f(application, "application");
        this.startTerminalConnectionsUseCase = new ek.h();
        this.avoAnalytics = com.server.auditor.ssh.client.utils.analytics.a.y();
        SessionManager sessionManager = SessionManager.getInstance();
        this.sessionManager = sessionManager;
        ju.t.e(sessionManager, "sessionManager");
        mk.q qVar = new mk.q(sessionManager);
        this.startSftpTransferWorkerUseCase = qVar;
        ju.t.e(sessionManager, "sessionManager");
        this.pasteCopiedFileSftpTransferTaskUseCase = new mk.l(qVar, sessionManager);
        ju.t.e(sessionManager, "sessionManager");
        this.addUploadFolderSftpTransferTaskUseCase = new mk.d(qVar, sessionManager);
        ju.t.e(sessionManager, "sessionManager");
        this.addUploadFilesSftpTransferTaskUseCase = new mk.c(qVar, sessionManager);
        ju.t.e(sessionManager, "sessionManager");
        this.prepareSelectedItemsForSftpTransferTaskUseCase = new mk.n(sessionManager);
        ju.t.e(sessionManager, "sessionManager");
        this.addDownloadItemsSftpTransferTaskUseCase = new mk.a(qVar, sessionManager);
        this.createNewDirectorySftpUseCase = new mk.h();
        hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
        ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        this.sftpLastLocalDirInteractor = new aj.a(dVarM, x0.b());
        this.copyToClipboardUseCase$delegate = ut.o.a(new iu.a() { // from class: mk.e
            @Override // iu.a
            public final Object a() {
                return ComposeSftpPageViewModel.copyToClipboardUseCase_delegate$lambda$0(application);
            }
        });
        this.downloadFileForPreviewUseCase$delegate = ut.o.a(new iu.a() { // from class: mk.f
            @Override // iu.a
            public final Object a() {
                return ComposeSftpPageViewModel.downloadFileForPreviewUseCase_delegate$lambda$1(this.f65677a, application);
            }
        });
        zu.w wVarA = zu.m0.a(g.a.f64306a);
        this._sftpRenameDialogRequest = wVarA;
        this.sftpRenameDialogRequest = zu.h.b(wVarA);
        zu.w wVarA2 = zu.m0.a(c.b.f64280a);
        this._sftpSelectEditorDialogRequest = wVarA2;
        this.sftpSelectEditorDialogRequest = zu.h.b(wVarA2);
        Boolean bool = Boolean.FALSE;
        zu.w wVarA3 = zu.m0.a(bool);
        this._showSelectionModeMorePopup = wVarA3;
        this.showSelectionModeMorePopup = zu.h.b(wVarA3);
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._showGuide = dVarB;
        this.showGuide = zu.h.M(dVarB);
        zu.w wVarA4 = zu.m0.a(bool);
        this._showUploadActionsPopup = wVarA4;
        this.showUploadActionsPopup = zu.h.b(wVarA4);
        zu.w wVarA5 = zu.m0.a(b.a.f64277a);
        this._downloadFolderDialogState = wVarA5;
        this.downloadFolderDialogState = zu.h.b(wVarA5);
        yu.d dVarB2 = yu.g.b(-2, null, null, 6, null);
        this._sftpSAFRequest = dVarB2;
        this.sftpSAFRequest = zu.h.M(dVarB2);
        yu.d dVarB3 = yu.g.b(-2, null, null, 6, null);
        this._uploadSAFRequest = dVarB3;
        this.uploadSAFRequest = zu.h.M(dVarB3);
        yu.d dVarB4 = yu.g.b(-2, null, null, 6, null);
        this._openDownloadedItemIntent = dVarB4;
        this.openDownloadedItemIntent = zu.h.M(dVarB4);
        yu.d dVarB5 = yu.g.b(-2, null, null, 6, null);
        this._sftpFileChooseRequest = dVarB5;
        this.sftpFileChooseRequest = zu.h.M(dVarB5);
        zu.w wVarA6 = zu.m0.a(null);
        this._currentSessionId = wVarA6;
        zu.f fVarQ = zu.h.Q(zu.h.w(wVarA6), new g0(null));
        wu.i0 i0VarA = j1.a(this);
        g0.a aVar = zu.g0.f88389a;
        zu.k0 k0VarP = zu.h.P(fVarQ, i0VarA, aVar.c(), null);
        this.currentSftpHolder = k0VarP;
        zu.k0 k0VarP2 = zu.h.P(new p0(zu.h.w(k0VarP)), j1.a(this), aVar.c(), null);
        this.currentSession = k0VarP2;
        this.path = zu.h.P(zu.h.Q(zu.h.w(k0VarP2), new h0(null)), j1.a(this), aVar.c(), "");
        this.previewState = zu.h.P(zu.h.Q(zu.h.w(k0VarP2), new i0(null)), j1.a(this), aVar.c(), f.b.f64298a);
        this.sortType = zu.h.P(zu.h.Q(zu.h.w(k0VarP2), new j0(null)), j1.a(this), aVar.c(), SftpSortType.ByNameAscending);
        this.filterQuery = zu.h.P(zu.h.Q(zu.h.w(k0VarP2), new k0(null)), j1.a(this), aVar.c(), FilterState.NoFilter.INSTANCE);
        this.selectionModeState = zu.h.P(zu.h.K(zu.h.Q(zu.h.w(k0VarP2), new l0(null)), new f0(null)), j1.a(this), aVar.c(), SelectionModeState.None.INSTANCE);
        zu.w wVarA7 = zu.m0.a(a.C0977a.f64275a);
        this._deleteConfirmationState = wVarA7;
        this.deleteConfirmationState = zu.h.b(wVarA7);
        this.showHiddenFiles = zu.h.P(zu.h.Q(zu.h.w(k0VarP2), new m0(null)), j1.a(this), aVar.c(), bool);
        this.errorMessage = zu.h.P(zu.h.Q(zu.h.w(k0VarP2), new n0(null)), j1.a(this), aVar.c(), null);
        zu.k0 k0VarP3 = zu.h.P(zu.h.p(zu.h.Q(zu.h.w(k0VarP2), new o0(null)), new iu.l() { // from class: mk.g
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Long.valueOf(ComposeSftpPageViewModel.fileItems$lambda$13((FileItemsStateWithMeta) obj));
            }
        }), j1.a(this), aVar.c(), FileItemsStateWithMeta.Loading.INSTANCE);
        this.fileItems = k0VarP3;
        this.isConnected = zu.h.P(zu.h.C(k0VarP2, k0VarP3, new j(null)), j1.a(this), aVar.c(), bool);
        this.hostAddress = zu.h.P(new q0(k0VarP2), j1.a(this), aVar.c(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copyPathToClipboard() {
        wu.k.d(j1.a(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copySelectedFileBeforeTransfer() {
        wu.k.d(j1.a(this), null, null, new f(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wn.a copyToClipboardUseCase_delegate$lambda$0(Application application) {
        return new wn.a(new com.server.auditor.ssh.client.help.c(application));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createDownloadTasksIfNeeded(v4.a aVar) {
        wu.k.d(j1.a(this), null, null, new g(aVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createPreviewDownloadTask(p9.a aVar) {
        wu.k.d(j1.a(this), null, null, new h(aVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DownloadFileForPreviewUseCase downloadFileForPreviewUseCase_delegate$lambda$1(ComposeSftpPageViewModel composeSftpPageViewModel, Application application) {
        SessionManager sessionManager = composeSftpPageViewModel.sessionManager;
        ju.t.e(sessionManager, "sessionManager");
        return new DownloadFileForPreviewUseCase(sessionManager, application, j1.a(composeSftpPageViewModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long fileItems$lambda$13(FileItemsStateWithMeta fileItemsStateWithMeta) {
        ju.t.f(fileItemsStateWithMeta, "it");
        return fileItemsStateWithMeta instanceof FileItemsStateWithMeta.Loading ? 200L : 100L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatDownloadFolder(v4.a aVar) {
        try {
            String treeDocumentId = DocumentsContract.getTreeDocumentId(aVar.j());
            ju.t.c(treeDocumentId);
            return su.s.W0(treeDocumentId, URI_PATH_DELIMITER, treeDocumentId);
        } catch (IllegalArgumentException e10) {
            Timber.f79558a.r(LibTermiusSshClient.SFTP_TAG).p(e10, "Failed to parse download folder path", new Object[0]);
            return aVar.j().getPath();
        } catch (SecurityException e11) {
            Timber.f79558a.r(LibTermiusSshClient.SFTP_TAG).p(e11, "Failed to parse download folder path", new Object[0]);
            return aVar.j().getPath();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wn.a getCopyToClipboardUseCase() {
        return (wn.a) this.copyToClipboardUseCase$delegate.getValue();
    }

    private static /* synthetic */ void getCurrentSftpHolder$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DownloadFileForPreviewUseCase getDownloadFileForPreviewUseCase() {
        return (DownloadFileForPreviewUseCase) this.downloadFileForPreviewUseCase$delegate.getValue();
    }

    public static /* synthetic */ void getErrorMessage$annotations() {
    }

    public static /* synthetic */ void getFileItems$annotations() {
    }

    public static /* synthetic */ void getFilterQuery$annotations() {
    }

    public static /* synthetic */ void getPath$annotations() {
    }

    public static /* synthetic */ void getPreviewState$annotations() {
    }

    public static /* synthetic */ void getSelectionModeState$annotations() {
    }

    public static /* synthetic */ void getShowHiddenFiles$annotations() {
    }

    public static /* synthetic */ void getSortType$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOpenPreview() {
        wu.k.d(j1.a(this), null, null, new a0(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPasteCopiedFile() {
        wu.k.d(j1.a(this), null, null, new b0(null), 3, null);
    }

    public final void clearErrorMessage() {
        wu.k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    public final zu.k0 getDeleteConfirmationState() {
        return this.deleteConfirmationState;
    }

    public final zu.k0 getDownloadFolderDialogState() {
        return this.downloadFolderDialogState;
    }

    public final zu.k0 getErrorMessage() {
        return this.errorMessage;
    }

    public final zu.k0 getFileItems() {
        return this.fileItems;
    }

    public final zu.k0 getFilterQuery() {
        return this.filterQuery;
    }

    public final zu.k0 getHostAddress() {
        return this.hostAddress;
    }

    public final zu.f getOpenDownloadedItemIntent() {
        return this.openDownloadedItemIntent;
    }

    public final zu.k0 getPath() {
        return this.path;
    }

    public final zu.k0 getPreviewState() {
        return this.previewState;
    }

    public final zu.k0 getSelectionModeState() {
        return this.selectionModeState;
    }

    public final zu.f getSftpFileChooseRequest() {
        return this.sftpFileChooseRequest;
    }

    public final zu.k0 getSftpRenameDialogRequest() {
        return this.sftpRenameDialogRequest;
    }

    public final zu.f getSftpSAFRequest() {
        return this.sftpSAFRequest;
    }

    public final zu.k0 getSftpSelectEditorDialogRequest() {
        return this.sftpSelectEditorDialogRequest;
    }

    public final zu.f getShowGuide() {
        return this.showGuide;
    }

    public final zu.k0 getShowHiddenFiles() {
        return this.showHiddenFiles;
    }

    public final zu.k0 getShowSelectionModeMorePopup() {
        return this.showSelectionModeMorePopup;
    }

    public final zu.k0 getShowUploadActionsPopup() {
        return this.showUploadActionsPopup;
    }

    public final zu.k0 getSortType() {
        return this.sortType;
    }

    public final zu.f getUploadSAFRequest() {
        return this.uploadSAFRequest;
    }

    public final zu.k0 isConnected() {
        return this.isConnected;
    }

    public final void onActionClick(String str) {
        ju.t.f(str, "action");
        wu.k.d(j1.a(this), null, null, new k(str, this, null), 3, null);
    }

    public final void onCancelShowPreview() {
        wu.k.d(j1.a(this), null, null, new l(null), 3, null);
    }

    public final void onChangeDownloadFolder() {
        wu.k.d(j1.a(this), null, null, new m(null), 3, null);
    }

    public final void onConfirmEditCommand(String str) {
        ju.t.f(str, Column.COMMAND);
        wu.k.d(j1.a(this), null, null, new n(str, null), 3, null);
    }

    public final void onConfirmRename(String str, String str2) {
        ju.t.f(str, "oldName");
        ju.t.f(str2, "newName");
        wu.k.d(j1.a(this), null, null, new o(str, str2, null), 3, null);
    }

    public final void onDismissDeleteRequest() {
        wu.k.d(j1.a(this), null, null, new p(null), 3, null);
    }

    public final void onDismissDownloadFolderDialog() {
        wu.k.d(j1.a(this), null, null, new q(null), 3, null);
    }

    public final void onDismissEditDialogRequest() {
        wu.k.d(j1.a(this), null, null, new r(null), 3, null);
    }

    public final void onDismissNewDirectory() {
        wu.k.d(j1.a(this), null, null, new s(null), 3, null);
    }

    public final void onDismissUploadActionsPopup() {
        wu.k.d(j1.a(this), null, null, new t(null), 3, null);
    }

    public final void onDocumentFileRootForDownloadChosen(v4.a aVar) {
        ju.t.f(aVar, "documentFile");
        wu.k.d(j1.a(this), null, null, new u(aVar, null), 3, null);
    }

    public final void onErrorViewFile(String str) {
        ju.t.f(str, "error");
        wu.k.d(j1.a(this), null, null, new v(str, null), 3, null);
    }

    public final void onFileItemClick(p9.a aVar) {
        ju.t.f(aVar, "fileItem");
        wu.k.d(j1.a(this), null, null, new w(aVar, null), 3, null);
    }

    public final void onFileItemLongClick(p9.a aVar) {
        ju.t.f(aVar, "fileItem");
        wu.k.d(j1.a(this), null, null, new x(aVar, this, null), 3, null);
    }

    public final void onFilterQueryChange(FilterState filterState) {
        ju.t.f(filterState, "filterState");
        wu.k.d(j1.a(this), null, null, new y(filterState, null), 3, null);
    }

    public final void onNewDirectoryName(String str) {
        ju.t.f(str, Column.MULTI_KEY_NAME);
        wu.k.d(j1.a(this), null, null, new z(str, null), 3, null);
    }

    public final void onShowSelectionModeMorePopup(boolean z10) {
        wu.k.d(j1.a(this), null, null, new c0(z10, null), 3, null);
    }

    public final void onUploadFileChosen(List<? extends Uri> list) {
        ju.t.f(list, "uris");
        wu.k.d(j1.a(this), null, null, new d0(list, null), 3, null);
    }

    public final void onUploadFolderChosen(v4.a aVar) {
        ju.t.f(aVar, "documentFile");
        wu.k.d(j1.a(this), null, null, new e0(aVar, null), 3, null);
    }

    public final void updateCurrentSessionId(long j10) {
        wu.k.d(j1.a(this), null, null, new r0(j10, null), 3, null);
    }
}
