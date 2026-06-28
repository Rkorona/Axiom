package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.NavigationPopUpWhenLargeActivity;
import com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository;
import com.server.auditor.ssh.client.widget.TeamOnlineWidget;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class TeamOnlineWidgetPreference extends Preference {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final com.server.auditor.ssh.client.interactors.o f46563d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final com.server.auditor.ssh.client.interactors.q f46564e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final List f46565f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamOnlineWidgetPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ju.t.f(context, "context");
        this.f46563d0 = new com.server.auditor.ssh.client.interactors.o();
        this.f46564e0 = new com.server.auditor.ssh.client.interactors.q();
        x0(R.layout.settings_team_online);
        this.f46565f0 = new ArrayList();
    }

    private final List P0(List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            TeamMembersOnlineCacheRepository.TeamUser teamUser = (TeamMembersOnlineCacheRepository.TeamUser) list.get(i10);
            if (teamUser != null) {
                arrayList.add(new TeamOnlineWidget.b(this.f46563d0.a(teamUser.getUserId(), teamUser.getUsername()), this.f46564e0.e(teamUser.getUsername(), teamUser.getFullName()), teamUser.isOnline(), teamUser.getAvatarUri()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q0(TeamOnlineWidgetPreference teamOnlineWidgetPreference, View view) {
        NavigationPopUpWhenLargeActivity.a aVar = NavigationPopUpWhenLargeActivity.f28304b;
        Context contextO = teamOnlineWidgetPreference.o();
        ju.t.e(contextO, "getContext(...)");
        aVar.b(contextO, new NavigationPopUpWhenLargeActivity.NavigationDestination.TeamPresenceFlow(NavigationPopUpWhenLargeActivity.TeamPresenceFlowStartDestination.Default.INSTANCE));
    }

    public final void R0(List list) {
        ju.t.f(list, "teamUsers");
        List listP0 = P0(new ArrayList(list));
        this.f46565f0.clear();
        this.f46565f0.addAll(listP0);
        P();
    }

    @Override // androidx.preference.Preference
    public void V(androidx.preference.m mVar) {
        ju.t.f(mVar, "holder");
        super.V(mVar);
        TeamOnlineWidget teamOnlineWidget = (TeamOnlineWidget) mVar.f10534a.findViewById(R.id.team_online_widget);
        teamOnlineWidget.z(this.f46565f0);
        teamOnlineWidget.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.widget.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeamOnlineWidgetPreference.Q0(this.f46852a, view);
            }
        });
    }
}
