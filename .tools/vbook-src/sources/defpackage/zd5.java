package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zd5 extends CancellationException implements yv1 {
    public final transient yd5 a;

    public zd5(yd5 yd5Var, String str, Throwable th) {
        super(str);
        this.a = yd5Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.yv1
    public final /* bridge */ /* synthetic */ Throwable a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zd5)) {
            return false;
        }
        zd5 zd5Var = (zd5) obj;
        if (!lc5.Q(zd5Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = zd5Var.a;
        if (obj2 == null) {
            obj2 = j77.b;
        }
        Object obj3 = this.a;
        if (obj3 == null) {
            obj3 = j77.b;
        }
        return lc5.Q(obj2, obj3) && lc5.Q(zd5Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = message.hashCode() * 31;
        Object obj = this.a;
        if (obj == null) {
            obj = j77.b;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.a;
        if (obj == null) {
            obj = j77.b;
        }
        sb.append(obj);
        return sb.toString();
    }
}
