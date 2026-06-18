package defpackage;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cp4 implements fa7, nlb, l73 {
    public static final cp4 c;
    public static final cp4 d;
    public static final cp4 e;
    public static final cp4 f;
    public static final Object s = new Object();
    public static volatile cp4 t;
    public final /* synthetic */ int a;
    public int b;

    static {
        int i = 0;
        c = new cp4(0, i);
        d = new cp4(2, i);
        e = new cp4(1, i);
        f = new cp4(3, i);
    }

    public /* synthetic */ cp4(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public static cp4 k() {
        cp4 cp4Var;
        synchronized (s) {
            try {
                if (t == null) {
                    t = new cp4(3, 1);
                }
                cp4Var = t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cp4Var;
    }

    public static String o(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public int b(Context context, String str, boolean z) {
        return 0;
    }

    public int c(Context context, String str) {
        return this.b;
    }

    public void d(String str, String str2) {
        if (this.b <= 3) {
            Log.d(str, str2);
        }
    }

    public int e() {
        return 0;
    }

    public void g(String str, String str2, Throwable th) {
        if (this.b <= 3) {
            Log.d(str, str2, th);
        }
    }

    @Override // defpackage.fa7
    public String h() {
        switch (this.a) {
            case 4:
                return tw2.q(new StringBuilder("expected at least "), this.b, " digits");
            default:
                return tw2.q(new StringBuilder("expected at most "), this.b, " digits");
        }
    }

    public void i(String str, String str2) {
        if (this.b <= 6) {
            Log.e(str, str2);
        }
    }

    public void j(String str, String str2, Throwable th) {
        if (this.b <= 6) {
            Log.e(str, str2, th);
        }
    }

    public void l(String str, String str2) {
        if (this.b <= 4) {
            Log.i(str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.odb n(defpackage.ie8 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cp4.n(ie8):odb");
    }

    public void p(String str, String str2) {
        if (this.b <= 5) {
            Log.w(str, str2);
        }
    }

    public int t() {
        return this.b;
    }

    public vo u(long j, vo voVar, vo voVar2, vo voVar3) {
        return j < ((long) this.b) * 1000000 ? voVar : voVar2;
    }

    public /* synthetic */ cp4(int i) {
        this.a = i;
    }

    public vo m(long j, vo voVar, vo voVar2, vo voVar3) {
        return voVar3;
    }
}
