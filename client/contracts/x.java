package com.server.auditor.ssh.client.contracts;

import android.text.SpannableStringBuilder;
import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import com.server.auditor.ssh.client.models.ChainingHost;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.util.ArrayList;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class x extends MvpViewState<y> implements y {

    public class a extends ViewCommand<y> {
        a() {
            super("clearChainList", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(y yVar) {
            yVar.B7();
        }
    }

    public class b extends ViewCommand<y> {
        b() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(y yVar) {
            yVar.a();
        }
    }

    public class c extends ViewCommand<y> {
        c() {
            super("navigateUp", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(y yVar) {
            yVar.j();
        }
    }

    public class d extends ViewCommand<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f23465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final VaultKeyId f23466b;

        d(long[] jArr, VaultKeyId vaultKeyId) {
            super("openHostSelectionScreen", OneExecutionStateStrategy.class);
            this.f23465a = jArr;
            this.f23466b = vaultKeyId;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(y yVar) {
            yVar.z7(this.f23465a, this.f23466b);
        }
    }

    public class e extends ViewCommand<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChainingHost f23468a;

        e(ChainingHost chainingHost) {
            super("saveChainHost", OneExecutionStateStrategy.class);
            this.f23468a = chainingHost;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(y yVar) {
            yVar.R9(this.f23468a);
        }
    }

    public class f extends ViewCommand<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<Host> f23470a;

        f(ArrayList<Host> arrayList) {
            super("updateChainHostsList", OneExecutionStateStrategy.class);
            this.f23470a = arrayList;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(y yVar) {
            yVar.L7(this.f23470a);
        }
    }

    public class g extends ViewCommand<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HostIconUtil.OsModelType f23472a;

        g(HostIconUtil.OsModelType osModelType) {
            super("updateFinalHostIcon", AddToEndSingleStrategy.class);
            this.f23472a = osModelType;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(y yVar) {
            yVar.Ha(this.f23472a);
        }
    }

    public class h extends ViewCommand<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23474a;

        h(String str) {
            super("updateFinalHostName", AddToEndSingleStrategy.class);
            this.f23474a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(y yVar) {
            yVar.U9(this.f23474a);
        }
    }

    public class i extends ViewCommand<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SpannableStringBuilder f23476a;

        i(SpannableStringBuilder spannableStringBuilder) {
            super("updateTitle", AddToEndSingleStrategy.class);
            this.f23476a = spannableStringBuilder;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(y yVar) {
            yVar.X4(this.f23476a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.y
    public void B7() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((y) it.next()).B7();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.y
    public void Ha(HostIconUtil.OsModelType osModelType) {
        g gVar = new g(osModelType);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((y) it.next()).Ha(osModelType);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.y
    public void L7(ArrayList<Host> arrayList) {
        f fVar = new f(arrayList);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((y) it.next()).L7(arrayList);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.y
    public void R9(ChainingHost chainingHost) {
        e eVar = new e(chainingHost);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((y) it.next()).R9(chainingHost);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.y
    public void U9(String str) {
        h hVar = new h(str);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((y) it.next()).U9(str);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.y
    public void X4(SpannableStringBuilder spannableStringBuilder) {
        i iVar = new i(spannableStringBuilder);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((y) it.next()).X4(spannableStringBuilder);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.y
    public void a() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((y) it.next()).a();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.y
    public void j() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((y) it.next()).j();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.y
    public void z7(long[] jArr, VaultKeyId vaultKeyId) {
        d dVar = new d(jArr, vaultKeyId);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((y) it.next()).z7(jArr, vaultKeyId);
        }
        this.viewCommands.afterApply(dVar);
    }
}
