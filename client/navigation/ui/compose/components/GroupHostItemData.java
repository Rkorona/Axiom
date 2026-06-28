package com.server.auditor.ssh.client.navigation.ui.compose.components;

import androidx.annotation.Keep;
import jo.a;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class GroupHostItemData {
    public static final int $stable = 0;
    private final String headerText;
    private final a hostIcon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f30380id;
    private final boolean isSelected;
    private final String itemType;
    private final String subtitle;

    public GroupHostItemData(long j10, String str, String str2, String str3, a aVar, boolean z10) {
        t.f(str, "itemType");
        t.f(str2, "headerText");
        t.f(str3, "subtitle");
        t.f(aVar, "hostIcon");
        this.f30380id = j10;
        this.itemType = str;
        this.headerText = str2;
        this.subtitle = str3;
        this.hostIcon = aVar;
        this.isSelected = z10;
    }

    public static /* synthetic */ GroupHostItemData copy$default(GroupHostItemData groupHostItemData, long j10, String str, String str2, String str3, a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = groupHostItemData.f30380id;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = groupHostItemData.itemType;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            str2 = groupHostItemData.headerText;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = groupHostItemData.subtitle;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            aVar = groupHostItemData.hostIcon;
        }
        a aVar2 = aVar;
        if ((i10 & 32) != 0) {
            z10 = groupHostItemData.isSelected;
        }
        return groupHostItemData.copy(j11, str4, str5, str6, aVar2, z10);
    }

    public final long component1() {
        return this.f30380id;
    }

    public final String component2() {
        return this.itemType;
    }

    public final String component3() {
        return this.headerText;
    }

    public final String component4() {
        return this.subtitle;
    }

    public final a component5() {
        return this.hostIcon;
    }

    public final boolean component6() {
        return this.isSelected;
    }

    public final GroupHostItemData copy(long j10, String str, String str2, String str3, a aVar, boolean z10) {
        t.f(str, "itemType");
        t.f(str2, "headerText");
        t.f(str3, "subtitle");
        t.f(aVar, "hostIcon");
        return new GroupHostItemData(j10, str, str2, str3, aVar, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupHostItemData)) {
            return false;
        }
        GroupHostItemData groupHostItemData = (GroupHostItemData) obj;
        return this.f30380id == groupHostItemData.f30380id && t.b(this.itemType, groupHostItemData.itemType) && t.b(this.headerText, groupHostItemData.headerText) && t.b(this.subtitle, groupHostItemData.subtitle) && t.b(this.hostIcon, groupHostItemData.hostIcon) && this.isSelected == groupHostItemData.isSelected;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final a getHostIcon() {
        return this.hostIcon;
    }

    public final long getId() {
        return this.f30380id;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.f30380id) * 31) + this.itemType.hashCode()) * 31) + this.headerText.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.hostIcon.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        return "GroupHostItemData(id=" + this.f30380id + ", itemType=" + this.itemType + ", headerText=" + this.headerText + ", subtitle=" + this.subtitle + ", hostIcon=" + this.hostIcon + ", isSelected=" + this.isSelected + ")";
    }

    public /* synthetic */ GroupHostItemData(long j10, String str, String str2, String str3, a aVar, boolean z10, int i10, k kVar) {
        this(j10, str, str2, str3, aVar, (i10 & 32) != 0 ? false : z10);
    }
}
