package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowQueue;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.VaultKeyIdDbConverter;
import com.server.auditor.ssh.client.database.models.RuleDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.models.Identity;
import com.server.auditor.ssh.client.models.properties.SshProperties;
import com.server.auditor.ssh.client.models.viewitems.PFRuleViewItem;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import hg.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class PFRulesDBAdapter extends DbAdapterAbstract<RuleDBModel> {
    public static final String APP_VIEW = "pf_app";
    public static final String TABLE = "port_forwarding";

    public PFRulesDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
    }

    private String[] getActiveRules(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String makeDescriptionString(String str, int i10, String str2, int i11, String str3) {
        return "Local Rule".equals(str) ? String.format("Local:%s → %s → %s:%s", Integer.valueOf(i10), str3, str2, Integer.valueOf(i11)) : "Remote Rule".equals(str) ? String.format("Port %s on %s → This device → %s:%s", Integer.valueOf(i10), str3, str2, Integer.valueOf(i11)) : "Dynamic Rule".equals(str) ? String.format("SOCKS proxy on local port %s through %s", Integer.valueOf(i10), str3) : "Can not get correct Name";
    }

    protected List<PFRuleViewItem> associateCursorToList(Cursor cursor, List<Integer> list) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        SshProperties sshProperties;
        ArrayList arrayList;
        Identity identity;
        SshKeyDBModel sshKeyDBModel;
        List<Integer> list2 = list;
        ArrayList arrayList2 = new ArrayList();
        int columnIndex = cursor.getColumnIndex(Column.ID);
        int columnIndex2 = cursor.getColumnIndex(Column.TYPE);
        int columnIndex3 = cursor.getColumnIndex(Column.BOUND_ADDRESS);
        int columnIndex4 = cursor.getColumnIndex(Column.LOCAL_PORT);
        int columnIndex5 = cursor.getColumnIndex(Column.FORWARDING_HOST);
        int columnIndex6 = cursor.getColumnIndex("label");
        int columnIndex7 = cursor.getColumnIndex(Column.HOST_TITLE);
        int columnIndex8 = cursor.getColumnIndex(Column.REMOTE_PORT);
        int columnIndex9 = cursor.getColumnIndex(Column.ADDRESS);
        int columnIndex10 = cursor.getColumnIndex(Column.OS_NAME);
        int columnIndex11 = cursor.getColumnIndex(Column.FONT_SIZE);
        int columnIndex12 = cursor.getColumnIndex(Column.PORT);
        int columnIndex13 = cursor.getColumnIndex(Column.COLOR_SCHEME);
        ArrayList arrayList3 = arrayList2;
        int columnIndex14 = cursor.getColumnIndex(Column.CHARSET);
        int columnIndex15 = cursor.getColumnIndex("username");
        int columnIndex16 = cursor.getColumnIndex("password");
        int columnIndex17 = cursor.getColumnIndex(Column.KEY_PRIVATE);
        int columnIndex18 = cursor.getColumnIndex(Column.PASS_PHRASE);
        int columnIndex19 = cursor.getColumnIndex(Column.SSH_CONFIG_ID);
        int columnIndex20 = cursor.getColumnIndex("ssh_identity_id");
        int columnIndex21 = cursor.getColumnIndex(Column.SSH_KEY_ID);
        int columnIndex22 = cursor.getColumnIndex(Column.IS_SHARED);
        int i19 = columnIndex12;
        int columnIndex23 = cursor.getColumnIndex(Column.SSH_ID_MODE);
        if (!cursor.moveToFirst()) {
            return arrayList3;
        }
        while (true) {
            String string = cursor.getString(columnIndex9);
            String string2 = cursor.getString(columnIndex10);
            int i20 = columnIndex9;
            int i21 = columnIndex10;
            long j10 = cursor.getLong(columnIndex);
            String string3 = cursor.getString(columnIndex2);
            String string4 = cursor.getString(columnIndex3);
            int i22 = cursor.getInt(columnIndex4);
            String string5 = cursor.getString(columnIndex5);
            int i23 = columnIndex;
            int i24 = columnIndex2;
            String string6 = columnIndex6 != -1 ? cursor.getString(columnIndex6) : "";
            String string7 = cursor.getString(columnIndex7);
            int i25 = cursor.getInt(columnIndex8);
            boolean z10 = (list2 != null && list2.contains(Integer.valueOf((int) j10))) || NewConnectionFlowQueue.INSTANCE.isPortForwardingInQueue(j10);
            boolean z11 = !cursor.isNull(columnIndex22) && cursor.getInt(columnIndex22) == 1;
            if (cursor.isNull(columnIndex19)) {
                i10 = columnIndex17;
                i11 = columnIndex18;
                i12 = columnIndex21;
                i13 = i19;
                i14 = columnIndex3;
                i15 = columnIndex4;
                i16 = columnIndex16;
                i17 = columnIndex20;
                i18 = columnIndex19;
                sshProperties = null;
            } else {
                int i26 = cursor.getInt(columnIndex11);
                int i27 = i19;
                int i28 = cursor.getInt(i27);
                i13 = i27;
                String string8 = cursor.getString(columnIndex13);
                String string9 = cursor.getString(columnIndex14);
                long j11 = cursor.getLong(columnIndex19);
                int i29 = columnIndex20;
                if (cursor.isNull(i29)) {
                    int i30 = columnIndex16;
                    i17 = i29;
                    i12 = columnIndex21;
                    i16 = i30;
                    i18 = columnIndex19;
                    i10 = columnIndex17;
                    i11 = columnIndex18;
                    i14 = columnIndex3;
                    i15 = columnIndex4;
                    identity = null;
                } else {
                    i18 = columnIndex19;
                    String string10 = cursor.getString(columnIndex15);
                    int i31 = columnIndex16;
                    String string11 = cursor.getString(i31);
                    long j12 = cursor.getLong(i29);
                    i17 = i29;
                    VaultKeyId vaultKeyId = new VaultKeyIdDbConverter().toVaultKeyId(cursor);
                    String string12 = cursor.getString(columnIndex23);
                    i12 = columnIndex21;
                    if (cursor.isNull(i12)) {
                        i16 = i31;
                        i10 = columnIndex17;
                        i11 = columnIndex18;
                        i14 = columnIndex3;
                        i15 = columnIndex4;
                        sshKeyDBModel = null;
                    } else {
                        i16 = i31;
                        int i32 = columnIndex17;
                        i14 = columnIndex3;
                        String string13 = cursor.getString(i32);
                        i10 = i32;
                        int i33 = columnIndex18;
                        i15 = columnIndex4;
                        i11 = i33;
                        SshKeyDBModel sshKeyDBModel2 = new SshKeyDBModel("", cursor.getString(i33), string13, "");
                        sshKeyDBModel2.setIdInDatabase(cursor.getLong(i12));
                        sshKeyDBModel = sshKeyDBModel2;
                    }
                    identity = new Identity("", string10, string11, sshKeyDBModel, j12, true, vaultKeyId, string12);
                }
                sshProperties = new SshProperties(Integer.valueOf(i28), string8, Integer.valueOf(i26), string9, identity, Long.valueOf(j11));
            }
            if (TextUtils.isEmpty(string)) {
                arrayList = arrayList3;
                f.p().z().removeItemByLocalId(j10);
            } else {
                PFRuleViewItem pFRuleViewItem = new PFRuleViewItem(string, sshProperties, string2, j10, string3, string4, i22, string5, string7, i25, z10, string6, new VaultKeyIdDbConverter().toVaultKeyId(cursor));
                pFRuleViewItem.setShared(z11);
                arrayList = arrayList3;
                arrayList.add(pFRuleViewItem);
            }
            if (!cursor.moveToNext()) {
                return arrayList;
            }
            arrayList3 = arrayList;
            columnIndex3 = i14;
            columnIndex4 = i15;
            columnIndex19 = i18;
            columnIndex9 = i20;
            columnIndex10 = i21;
            columnIndex = i23;
            columnIndex2 = i24;
            i19 = i13;
            columnIndex17 = i10;
            columnIndex18 = i11;
            columnIndex20 = i17;
            columnIndex16 = i16;
            columnIndex21 = i12;
            list2 = list;
        }
    }

    public Cursor getCursorForAdapter(String str, String[] strArr) {
        return this.mContentResolver.query(getViewContentUri("pf_app"), null, str, strArr, null);
    }

    public List<PFRuleViewItem> getItemsForBaseAdapter(List<Integer> list) {
        return getItemsForBaseAdapter(list, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, null);
    }

    public List<RuleDBModel> getRulesUsesHost(Long l10) {
        return getItemList(String.format("%s=%s", Column.HOST_ID, l10));
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return "port_forwarding";
    }

    private List<PFRuleViewItem> getItemsForBaseAdapter(List<Integer> list, String str, String[] strArr) {
        int length = strArr == null ? 0 : strArr.length;
        String[] activeRules = getActiveRules(list);
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : activeRules) {
            sb2.append("?,");
        }
        if (sb2.length() != 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        String[] strArr2 = new String[activeRules.length + length];
        if (strArr != null) {
            System.arraycopy(strArr, 0, strArr2, 0, length);
        }
        System.arraycopy(activeRules, 0, strArr2, length, activeRules.length);
        Cursor cursorForAdapter = getCursorForAdapter(String.format("(%s) and %s IN (%s) and %s != %s", str, Column.ID, sb2.toString(), Column.STATUS, 2), strArr2);
        Cursor cursorForAdapter2 = getCursorForAdapter(String.format("(%s) and %s NOT IN (%s) and %s != %s", str, Column.ID, sb2.toString(), Column.STATUS, 2), strArr2);
        List<PFRuleViewItem> listAssociateCursorToList = associateCursorToList(cursorForAdapter, list);
        List<PFRuleViewItem> listAssociateCursorToList2 = associateCursorToList(cursorForAdapter2, list);
        cursorForAdapter.close();
        cursorForAdapter2.close();
        listAssociateCursorToList.addAll(listAssociateCursorToList2);
        return listAssociateCursorToList;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public RuleDBModel createItemFromCursor(Cursor cursor) {
        return new RuleDBModel(cursor, this.localCryptor);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public RuleDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        this.localCryptor.h();
        RuleDBModel ruleDBModelWithExternalRefrences = RuleDBModel.getRuleDBModelWithExternalRefrences(cursor, this.localCryptor);
        if (this.localCryptor.i()) {
            this.localCryptor.l().logLocalDecryptError(Avo.Entity.PORT_FORWARDING_RULE, ruleDBModelWithExternalRefrences.getIdOnServer());
        }
        return ruleDBModelWithExternalRefrences;
    }
}
