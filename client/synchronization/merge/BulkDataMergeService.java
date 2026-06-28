package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.synchronization.api.Shareable;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import java.util.Iterator;
import java.util.List;
import ju.k;
import ju.t;
import rg.h;
import rg.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BulkDataMergeService<T> {
    private static final String CRYPTO_ERROR_MESSAGE = "Could not encrypt with team key";
    private final Class<T> clazz;
    private final h remoteAnnotationCryptor;
    private final v teamAnnotationCryptors;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public BulkDataMergeService(h hVar, v vVar, Class<T> cls) {
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(cls, "clazz");
        this.remoteAnnotationCryptor = hVar;
        this.teamAnnotationCryptors = vVar;
        this.clazz = cls;
    }

    private final void decryptPersonal(T t10) {
        this.remoteAnnotationCryptor.k(t10, this.clazz);
    }

    private final void decryptShared(T t10) {
        t.d(t10, "null cannot be cast to non-null type com.server.auditor.ssh.client.synchronization.api.Shareable");
        h teamEncryptorByEncryptedWith = getTeamEncryptorByEncryptedWith(getEncryptedWithOfObj((Shareable) t10));
        if (teamEncryptorByEncryptedWith == null) {
            throw new IllegalStateException(CRYPTO_ERROR_MESSAGE);
        }
        teamEncryptorByEncryptedWith.k(t10, this.clazz);
    }

    private final Long getEncryptedWithOfObj(Shareable shareable) {
        return shareable.getEncryptedWith();
    }

    private final h getTeamEncryptorByEncryptedWith(Long l10) {
        return (h) this.teamAnnotationCryptors.k().get(l10);
    }

    private final boolean isShared(Object obj) {
        if (obj instanceof Shareable) {
            return t.b(((Shareable) obj).getShared(), Boolean.TRUE);
        }
        return false;
    }

    public final void decrypt(List<? extends T> list) {
        t.f(list, "list");
        for (T t10 : list) {
            try {
                if (isShared(t10)) {
                    decryptShared(t10);
                } else {
                    decryptPersonal(t10);
                }
            } catch (Exception e10) {
                y9.a.f86838a.i(e10);
            }
        }
    }

    public abstract void deleteItems(DeleteSet deleteSet);

    public final void merge(List<? extends T> list, DeleteSet deleteSet) {
        t.f(list, "list");
        t.f(deleteSet, "deleteSet");
        Iterator<? extends T> it = list.iterator();
        while (it.hasNext()) {
            mergeEntity(it.next());
        }
        deleteItems(deleteSet);
    }

    public abstract void mergeEntity(T t10);
}
