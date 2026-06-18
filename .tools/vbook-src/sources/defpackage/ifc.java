package defpackage;

import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.recaptcha.internal.zzce;
import com.google.android.recaptcha.internal.zznm;
import com.google.android.recaptcha.internal.zznn;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ifc {
    public static /* synthetic */ void a() throws zznm {
        throw new zznm("Protocol message tag had invalid wire type.");
    }

    public static /* synthetic */ void b(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static /* synthetic */ void c(int i, int i2, Throwable th) throws zzce {
        throw new zzce(i, i2, th);
    }

    public static /* synthetic */ void d(int i, Object obj, Object obj2, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(i);
        sb.append((Object) " parameters found ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void e(Object obj, Object obj2, String str) {
        throw new NullPointerException(str + obj + obj2);
    }

    public static /* synthetic */ void f(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    public static /* synthetic */ void g(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void h(String str) throws zznn {
        throw new zznn(str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.measurement.zzaeh */
    public static /* synthetic */ void i(String str) throws zzaeh {
        throw new zzaeh(str);
    }
}
