package defpackage;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import j$.time.Instant;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fu6 implements fk7, mb8, t91, v39, lv, sk7, ur1, vc3, ht3, qa1, u08, tp9, ns3 {
    public static nc1 B;
    public static fu6 M;
    public final /* synthetic */ int a;
    public static final yf0 b = new yf0(-1.0f, -1.0f);
    public static final yf0 c = new yf0(0.0f, -1.0f);
    public static final yf0 d = new yf0(1.0f, -1.0f);
    public static final yf0 e = new yf0(-1.0f, 0.0f);
    public static final yf0 f = new yf0(0.0f, 0.0f);
    public static final yf0 s = new yf0(1.0f, 0.0f);
    public static final yf0 t = new yf0(-1.0f, 1.0f);
    public static final yf0 u = new yf0(0.0f, 1.0f);
    public static final yf0 v = new yf0(1.0f, 1.0f);
    public static final /* synthetic */ fu6 w = new fu6(2);
    public static final ys0 x = new ys0(null);
    public static final fu6 y = new fu6(3);
    public static final fu6 z = new fu6(4);
    public static final fu6 A = new fu6(5);
    public static final fu6 C = new fu6(6);
    public static final fu6 D = new fu6(7);
    public static final fu6 E = new fu6(8);
    public static final fu6 F = new fu6(9);
    public static final fu6 G = new fu6(10);
    public static final fu6 H = new fu6(11);
    public static final b59 I = new b59(null, null, null, null, null);
    public static final so9 J = new so9(6);
    public static final so9 K = new so9(7);
    public static final /* synthetic */ fu6 L = new fu6(13);

    public /* synthetic */ fu6(int i) {
        this.a = i;
    }

    public float a() {
        return 0.0f;
    }

    @Override // defpackage.v39
    public /* bridge */ /* synthetic */ Object b() {
        return I;
    }

    @Override // defpackage.v39
    public void d(Object obj, ge8 ge8Var) throws IOException {
        ((FileOutputStream) ge8Var.b).write(iw9.B(ue5.d.b(b59.Companion.serializer(), (b59) obj)));
    }

    public void e(pn2 pn2Var, int i, int[] iArr, zm5 zm5Var, int[] iArr2) {
        if (zm5Var == zm5.a) {
            pv.a(i, iArr, iArr2, false);
        } else {
            pv.a(i, iArr, iArr2, true);
        }
    }

    public CharSequence f(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return ((Preference) listPreference).a.getString(2131952014);
        }
        return null;
    }

    public long g(long j, long j2) {
        if (og9.b(j) <= og9.b(j2) && og9.a(j) <= og9.a(j2)) {
            return fu8.a(1.0f, 1.0f);
        }
        float fMin = Math.min(og9.b(j2) / og9.b(j), og9.a(j2) / og9.a(j));
        return fu8.a(fMin, fMin);
    }

    @Override // defpackage.r58
    public Object get() {
        return wjb.a;
    }

    @Override // defpackage.vc3
    public bv0 h(bv0 bv0Var, jx1 jx1Var) {
        throw null;
    }

    public float i(float f2) {
        double d2 = f2;
        return (float) (d2 < 0.031248d ? d2 / 16.0d : tw1.j0(d2, 1.8d));
    }

    public StackTraceElement[] j(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // defpackage.qa1
    public p95 k() {
        Instant instantNow = Instant.now();
        instantNow.getClass();
        return e11.g0(instantNow);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ey1 */
    @Override // defpackage.v39
    public Object l(FileInputStream fileInputStream) throws ey1 {
        try {
            te5 te5Var = ue5.d;
            String strZ = iw9.z(p7c.d0(fileInputStream));
            te5Var.getClass();
            return (b59) te5Var.a(b59.Companion.serializer(), strZ);
        } catch (Exception e2) {
            throw new ey1("Cannot parse session configs", e2);
        }
    }

    public float o(float f2) {
        double d2 = f2;
        return (float) (d2 < 0.001953d ? d2 * 16.0d : tw1.j0(d2, 0.5555555555555556d));
    }

    @Override // defpackage.vc3
    public ut0 q(ut0 ut0Var, jx1 jx1Var) {
        throw null;
    }

    public void r(pn2 pn2Var, int i, int[] iArr, int[] iArr2) {
        pv.a(i, iArr, iArr2, false);
    }

    public e2b s(int i, int i2) {
        return new nt2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t91
    public void t(is4 is4Var, o1a o1aVar) {
        is4Var.getClass();
        is4Var.s.g(ru4.h, new c8((zb4) o1aVar, null, 6));
    }

    public String toString() {
        switch (this.a) {
            case 15:
                return "Arrangement#Center";
            case 18:
                return "Empty";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.vc3
    public ut0 u(ut0 ut0Var, jx1 jx1Var) {
        throw null;
    }

    public Object w(Object obj) {
        Object pm8Var;
        String str = (String) obj;
        Object obj2 = lc3.a;
        if (str.length() == 0) {
            return obj2;
        }
        try {
            uf5 uf5Var = xf5.a;
            uf5Var.getClass();
            pm8Var = (List) uf5Var.a(new wv(tv9.a, 0), str);
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        Throwable thA = qm8.a(pm8Var);
        if (thA == null) {
            obj2 = pm8Var;
        } else {
            String message = thA.getMessage();
            if (message == null) {
                message = "";
            }
            String strConcat = "Failed to decode string list from database: ".concat(message);
            if (pu.a()) {
                e46 e46Var = e46.b;
                k89 k89Var = k89.c;
                if (e46Var.a.a.compareTo(k89Var) <= 0) {
                    e46Var.a(k89Var, "Log", strConcat, (Throwable) null);
                }
            }
        }
        return (List) obj2;
    }

    public void n() {
    }

    public void v(wy8 wy8Var) {
    }

    public int c(int i, int i2) {
        return i2;
    }

    public int m(int i, int i2) {
        return i;
    }
}
