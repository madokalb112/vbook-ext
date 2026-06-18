package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import defpackage.lc5;
import defpackage.xl7;
import defpackage.y86;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzbd extends Exception {
    public static final /* synthetic */ int zza = 0;
    private static final Map zzb;
    private final zzbb zzc;
    private final zzba zzd;
    private final String zze;
    private final Map zzf;

    static {
        xl7 xl7Var = new xl7(zztv.JS_NETWORK_ERROR, new zzbd(zzbb.zzc, zzba.zzd, null));
        zztv zztvVar = zztv.JS_INTERNAL_ERROR;
        zzbb zzbbVar = zzbb.zzb;
        zzb = y86.P(xl7Var, new xl7(zztvVar, new zzbd(zzbbVar, zzba.zzc, null)), new xl7(zztv.JS_INVALID_SITE_KEY, new zzbd(zzbb.zzd, zzba.zze, null)), new xl7(zztv.JS_INVALID_SITE_KEY_TYPE, new zzbd(zzbb.zze, zzba.zzf, null)), new xl7(zztv.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzbd(zzbb.zzf, zzba.zzg, null)), new xl7(zztv.JS_INVALID_ACTION, new zzbd(zzbb.zzg, zzba.zzh, null)), new xl7(zztv.JS_PROGRAM_ERROR, new zzbd(zzbbVar, zzba.zzj, null)));
    }

    public zzbd(zzbb zzbbVar, zzba zzbaVar, String str) {
        this.zzc = zzbbVar;
        this.zzd = zzbaVar;
        this.zze = str;
        zzbb zzbbVar2 = zzbb.zzc;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        this.zzf = y86.P(new xl7(zzbbVar2, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new xl7(zzbb.zzh, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new xl7(zzbb.zzi, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new xl7(zzbb.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), new xl7(zzbb.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), new xl7(zzbb.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), new xl7(zzbb.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), new xl7(zzbb.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)), new xl7(zzbb.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null)));
    }

    public final zzba zza() {
        return this.zzd;
    }

    public final zzbb zzb() {
        return this.zzc;
    }

    public final RecaptchaException zzc() {
        zzba zzbaVar = this.zzd;
        if (lc5.Q(zzbaVar, zzba.zzI)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
        }
        if (lc5.Q(zzbaVar, zzba.zzao)) {
            return new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, null, 2, null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null) : recaptchaException;
    }

    public final String zzd() {
        return this.zze;
    }
}
