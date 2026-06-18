package com.google.android.recaptcha.internal;

import defpackage.dx1;
import defpackage.xv5;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzkz extends zzlc {
    private final int zzc;

    public zzkz(byte[] bArr, int i, int i2) {
        super(bArr);
        zzle.zzi(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((zzlc) this).zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(dx1.f(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(xv5.o("Index > length: ", i, i2, ", "));
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zzb(int i) {
        return ((zzlc) this).zza[i];
    }

    @Override // com.google.android.recaptcha.internal.zzlc
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(((zzlc) this).zza, 0, bArr, 0, i3);
    }
}
