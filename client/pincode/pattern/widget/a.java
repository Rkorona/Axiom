package com.server.auditor.ssh.client.pincode.pattern.widget;

import com.server.auditor.ssh.client.database.SQLiteHelper;
import com.server.auditor.ssh.client.pincode.pattern.widget.LockPatternView;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static String a(List list) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(b(list).getBytes(SQLiteHelper.DEFAULT_CHARSET));
            byte[] bArrDigest = messageDigest.digest();
            return String.format(null, "%0" + (bArrDigest.length * 2) + "x", new BigInteger(1, bArrDigest)).toLowerCase();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static String b(List list) {
        if (list == null) {
            return "";
        }
        int size = list.size();
        byte[] bArr = new byte[size];
        for (int i10 = 0; i10 < size; i10++) {
            LockPatternView.Cell cell = (LockPatternView.Cell) list.get(i10);
            bArr[i10] = (byte) ((cell.row * 3) + cell.column);
        }
        try {
            return new String(bArr, SQLiteHelper.DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static List c(String str) {
        ArrayList arrayListA = xk.a.a();
        try {
            for (byte b10 : str.getBytes(SQLiteHelper.DEFAULT_CHARSET)) {
                arrayListA.add(LockPatternView.Cell.of(b10 / 3, b10 % 3));
            }
        } catch (UnsupportedEncodingException unused) {
        }
        return arrayListA;
    }
}
