package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.KnownHostsDBModel;
import com.server.auditor.ssh.client.database.models.RuleDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.database.models.SyncableModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SetupTeamVaultShareEntitiesSectionType<T extends SyncableModel> implements Parcelable {
    public static final int $stable = 8;
    private final List<T> items;

    public static final class Groups extends SetupTeamVaultShareEntitiesSectionType<GroupDBModel> {
        private final List<GroupDBModel> items;
        public static final Parcelable.Creator<Groups> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Groups createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(Groups.class.getClassLoader()));
                }
                return new Groups(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Groups[] newArray(int i10) {
                return new Groups[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Groups() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Groups copy$default(Groups groups, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = groups.items;
            }
            return groups.copy(list);
        }

        public final List<GroupDBModel> component1() {
            return this.items;
        }

        public final Groups copy(List<? extends GroupDBModel> list) {
            ju.t.f(list, "items");
            return new Groups(list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Groups) && ju.t.b(this.items, ((Groups) obj).items);
        }

        @Override // com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType
        public List<GroupDBModel> getItems() {
            return this.items;
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return "Groups(items=" + this.items + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            List<GroupDBModel> list = this.items;
            parcel.writeInt(list.size());
            Iterator<GroupDBModel> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i10);
            }
        }

        public /* synthetic */ Groups(List list, int i10, ju.k kVar) {
            this((i10 & 1) != 0 ? vt.v.o() : list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Groups(List<? extends GroupDBModel> list) {
            super(list, null);
            ju.t.f(list, "items");
            this.items = list;
        }
    }

    public static final class Hosts extends SetupTeamVaultShareEntitiesSectionType<HostDBModel> {
        private final List<HostDBModel> items;
        public static final Parcelable.Creator<Hosts> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Hosts createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(Hosts.class.getClassLoader()));
                }
                return new Hosts(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Hosts[] newArray(int i10) {
                return new Hosts[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Hosts() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Hosts copy$default(Hosts hosts, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = hosts.items;
            }
            return hosts.copy(list);
        }

        public final List<HostDBModel> component1() {
            return this.items;
        }

        public final Hosts copy(List<? extends HostDBModel> list) {
            ju.t.f(list, "items");
            return new Hosts(list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Hosts) && ju.t.b(this.items, ((Hosts) obj).items);
        }

        @Override // com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType
        public List<HostDBModel> getItems() {
            return this.items;
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return "Hosts(items=" + this.items + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            List<HostDBModel> list = this.items;
            parcel.writeInt(list.size());
            Iterator<HostDBModel> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i10);
            }
        }

        public /* synthetic */ Hosts(List list, int i10, ju.k kVar) {
            this((i10 & 1) != 0 ? vt.v.o() : list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Hosts(List<? extends HostDBModel> list) {
            super(list, null);
            ju.t.f(list, "items");
            this.items = list;
        }
    }

    public static final class Identities extends SetupTeamVaultShareEntitiesSectionType<IdentityDBModel> {
        private final List<IdentityDBModel> items;
        public static final Parcelable.Creator<Identities> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Identities createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(Identities.class.getClassLoader()));
                }
                return new Identities(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Identities[] newArray(int i10) {
                return new Identities[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Identities() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Identities copy$default(Identities identities, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = identities.items;
            }
            return identities.copy(list);
        }

        public final List<IdentityDBModel> component1() {
            return this.items;
        }

        public final Identities copy(List<? extends IdentityDBModel> list) {
            ju.t.f(list, "items");
            return new Identities(list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Identities) && ju.t.b(this.items, ((Identities) obj).items);
        }

        @Override // com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType
        public List<IdentityDBModel> getItems() {
            return this.items;
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return "Identities(items=" + this.items + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            List<IdentityDBModel> list = this.items;
            parcel.writeInt(list.size());
            Iterator<IdentityDBModel> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i10);
            }
        }

        public /* synthetic */ Identities(List list, int i10, ju.k kVar) {
            this((i10 & 1) != 0 ? vt.v.o() : list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Identities(List<? extends IdentityDBModel> list) {
            super(list, null);
            ju.t.f(list, "items");
            this.items = list;
        }
    }

    public static final class KnownHosts extends SetupTeamVaultShareEntitiesSectionType<KnownHostsDBModel> {
        private final List<KnownHostsDBModel> items;
        public static final Parcelable.Creator<KnownHosts> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KnownHosts createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(KnownHosts.class.getClassLoader()));
                }
                return new KnownHosts(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final KnownHosts[] newArray(int i10) {
                return new KnownHosts[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public KnownHosts() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ KnownHosts copy$default(KnownHosts knownHosts, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = knownHosts.items;
            }
            return knownHosts.copy(list);
        }

        public final List<KnownHostsDBModel> component1() {
            return this.items;
        }

        public final KnownHosts copy(List<? extends KnownHostsDBModel> list) {
            ju.t.f(list, "items");
            return new KnownHosts(list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof KnownHosts) && ju.t.b(this.items, ((KnownHosts) obj).items);
        }

        @Override // com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType
        public List<KnownHostsDBModel> getItems() {
            return this.items;
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return "KnownHosts(items=" + this.items + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            List<KnownHostsDBModel> list = this.items;
            parcel.writeInt(list.size());
            Iterator<KnownHostsDBModel> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i10);
            }
        }

        public /* synthetic */ KnownHosts(List list, int i10, ju.k kVar) {
            this((i10 & 1) != 0 ? vt.v.o() : list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public KnownHosts(List<? extends KnownHostsDBModel> list) {
            super(list, null);
            ju.t.f(list, "items");
            this.items = list;
        }
    }

    public static final class PortForwardings extends SetupTeamVaultShareEntitiesSectionType<RuleDBModel> {
        private final List<RuleDBModel> items;
        public static final Parcelable.Creator<PortForwardings> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PortForwardings createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(PortForwardings.class.getClassLoader()));
                }
                return new PortForwardings(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PortForwardings[] newArray(int i10) {
                return new PortForwardings[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PortForwardings() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PortForwardings copy$default(PortForwardings portForwardings, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = portForwardings.items;
            }
            return portForwardings.copy(list);
        }

        public final List<RuleDBModel> component1() {
            return this.items;
        }

        public final PortForwardings copy(List<? extends RuleDBModel> list) {
            ju.t.f(list, "items");
            return new PortForwardings(list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PortForwardings) && ju.t.b(this.items, ((PortForwardings) obj).items);
        }

        @Override // com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType
        public List<RuleDBModel> getItems() {
            return this.items;
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return "PortForwardings(items=" + this.items + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            List<RuleDBModel> list = this.items;
            parcel.writeInt(list.size());
            Iterator<RuleDBModel> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i10);
            }
        }

        public /* synthetic */ PortForwardings(List list, int i10, ju.k kVar) {
            this((i10 & 1) != 0 ? vt.v.o() : list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PortForwardings(List<? extends RuleDBModel> list) {
            super(list, null);
            ju.t.f(list, "items");
            this.items = list;
        }
    }

    public static final class SnippetPackages extends SetupTeamVaultShareEntitiesSectionType<SnippetPackageDBModel> {
        private final List<SnippetPackageDBModel> items;
        public static final Parcelable.Creator<SnippetPackages> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SnippetPackages createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(SnippetPackages.class.getClassLoader()));
                }
                return new SnippetPackages(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SnippetPackages[] newArray(int i10) {
                return new SnippetPackages[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SnippetPackages() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SnippetPackages copy$default(SnippetPackages snippetPackages, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = snippetPackages.items;
            }
            return snippetPackages.copy(list);
        }

        public final List<SnippetPackageDBModel> component1() {
            return this.items;
        }

        public final SnippetPackages copy(List<SnippetPackageDBModel> list) {
            ju.t.f(list, "items");
            return new SnippetPackages(list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SnippetPackages) && ju.t.b(this.items, ((SnippetPackages) obj).items);
        }

        @Override // com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType
        public List<SnippetPackageDBModel> getItems() {
            return this.items;
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return "SnippetPackages(items=" + this.items + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            List<SnippetPackageDBModel> list = this.items;
            parcel.writeInt(list.size());
            Iterator<SnippetPackageDBModel> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i10);
            }
        }

        public /* synthetic */ SnippetPackages(List list, int i10, ju.k kVar) {
            this((i10 & 1) != 0 ? vt.v.o() : list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SnippetPackages(List<SnippetPackageDBModel> list) {
            super(list, null);
            ju.t.f(list, "items");
            this.items = list;
        }
    }

    public static final class Snippets extends SetupTeamVaultShareEntitiesSectionType<SnippetDBModel> {
        private final List<SnippetDBModel> items;
        public static final Parcelable.Creator<Snippets> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Snippets createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(Snippets.class.getClassLoader()));
                }
                return new Snippets(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Snippets[] newArray(int i10) {
                return new Snippets[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Snippets() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Snippets copy$default(Snippets snippets, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = snippets.items;
            }
            return snippets.copy(list);
        }

        public final List<SnippetDBModel> component1() {
            return this.items;
        }

        public final Snippets copy(List<? extends SnippetDBModel> list) {
            ju.t.f(list, "items");
            return new Snippets(list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Snippets) && ju.t.b(this.items, ((Snippets) obj).items);
        }

        @Override // com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType
        public List<SnippetDBModel> getItems() {
            return this.items;
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return "Snippets(items=" + this.items + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            List<SnippetDBModel> list = this.items;
            parcel.writeInt(list.size());
            Iterator<SnippetDBModel> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i10);
            }
        }

        public /* synthetic */ Snippets(List list, int i10, ju.k kVar) {
            this((i10 & 1) != 0 ? vt.v.o() : list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Snippets(List<? extends SnippetDBModel> list) {
            super(list, null);
            ju.t.f(list, "items");
            this.items = list;
        }
    }

    public static final class SshKeys extends SetupTeamVaultShareEntitiesSectionType<SshKeyDBModel> {
        private final List<SshKeyDBModel> items;
        public static final Parcelable.Creator<SshKeys> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SshKeys createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(SshKeys.class.getClassLoader()));
                }
                return new SshKeys(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SshKeys[] newArray(int i10) {
                return new SshKeys[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SshKeys() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SshKeys copy$default(SshKeys sshKeys, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = sshKeys.items;
            }
            return sshKeys.copy(list);
        }

        public final List<SshKeyDBModel> component1() {
            return this.items;
        }

        public final SshKeys copy(List<? extends SshKeyDBModel> list) {
            ju.t.f(list, "items");
            return new SshKeys(list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SshKeys) && ju.t.b(this.items, ((SshKeys) obj).items);
        }

        @Override // com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType
        public List<SshKeyDBModel> getItems() {
            return this.items;
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return "SshKeys(items=" + this.items + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            List<SshKeyDBModel> list = this.items;
            parcel.writeInt(list.size());
            Iterator<SshKeyDBModel> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i10);
            }
        }

        public /* synthetic */ SshKeys(List list, int i10, ju.k kVar) {
            this((i10 & 1) != 0 ? vt.v.o() : list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SshKeys(List<? extends SshKeyDBModel> list) {
            super(list, null);
            ju.t.f(list, "items");
            this.items = list;
        }
    }

    public /* synthetic */ SetupTeamVaultShareEntitiesSectionType(List list, ju.k kVar) {
        this(list);
    }

    public List<T> getItems() {
        return this.items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SetupTeamVaultShareEntitiesSectionType(List<? extends T> list) {
        this.items = list;
    }
}
