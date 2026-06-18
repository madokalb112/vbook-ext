package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzkn;
import com.google.android.recaptcha.internal.zzko;
import defpackage.w58;
import defpackage.xv5;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class zzko<MessageType extends zzko<MessageType, BuilderType>, BuilderType extends zzkn<MessageType, BuilderType>> implements zzoi {
    protected int zza = 0;

    public static void zzc(Iterable iterable, List list) {
        zzkn.zzd(iterable, list);
    }

    public int zza(zzow zzowVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final zzle zzb() {
        try {
            int iZzo = zzo();
            zzle zzleVar = zzle.zzb;
            byte[] bArr = new byte[iZzo];
            zzlk zzlkVar = new zzlk(bArr, 0, iZzo);
            zze(zzlkVar);
            zzlkVar.zzC();
            return new zzlc(bArr);
        } catch (IOException e) {
            w58.l(xv5.p("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public final byte[] zzd() {
        try {
            int iZzo = zzo();
            byte[] bArr = new byte[iZzo];
            zzlk zzlkVar = new zzlk(bArr, 0, iZzo);
            zze(zzlkVar);
            zzlkVar.zzC();
            return bArr;
        } catch (IOException e) {
            w58.l(xv5.p("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }
}
