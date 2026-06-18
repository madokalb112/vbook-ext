package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zk4 implements t91, jn0, pm5, ix1, fa7, js9, hj1, ur1, tn7 {
    public static final zk4 b = new zk4(1);
    public static final zk4 c = new zk4(2);
    public static final zk4 d = new zk4(4);
    public static final kf8 e = new kf8(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final zk4 f = new zk4(6);
    public static final /* synthetic */ zk4 s = new zk4(7);
    public static final zk4 t = new zk4(8);
    public static final /* synthetic */ zk4 u = new zk4(9);
    public static final zk4 v = new zk4(10);
    public static final zk4 w = new zk4(11);
    public static final zk4 x = new zk4(12);
    public static final zk4 y = new zk4(13);
    public static final zk4 z = new zk4(14);
    public final /* synthetic */ int a;

    public zk4() {
        this.a = 28;
        w45 w45Var = a55.b;
        hh8 hh8Var = hh8.e;
    }

    public static long f(z12 z12Var, float f2) {
        float[] fArr = z12Var.a;
        int i = 1;
        long jA = d14.a(fArr[0], fArr[1]);
        float f3 = 0.0f;
        float f4 = f2;
        while (true) {
            float f5 = i / 3.0f;
            long jC = z12Var.c(f5);
            float fE = y86.E(y86.Q(jC, jA));
            if (fE >= f4) {
                return d14.a(f5 - ((1.0f - (f4 / fE)) / 3.0f), f2);
            }
            f4 -= fE;
            f3 += fE;
            if (i == 3) {
                return d14.a(1.0f, f3);
            }
            i++;
            jA = jC;
        }
    }

    public static String i(long j, String str) {
        Locale localeB = i36.c().b(0);
        if (localeB == null) {
            localeB = Locale.getDefault();
        }
        localeB.getClass();
        p95 p95Var = p95.c;
        p95 p95VarG = ny1.G(j);
        p95VarG.getClass();
        try {
            String str2 = new SimpleDateFormat(str, localeB).format(new Date(p95VarG.c()));
            str2.getClass();
            return str2;
        } catch (Exception unused) {
            return "";
        }
    }

    public static long j() {
        return r95.a.k().c();
    }

    public static SharedPreferences k(Context context, String str) {
        return context.getSharedPreferences("com.google.firebase.auth.internal.browserSignInSessionStore." + str, 0);
    }

    public static void l(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }

    @Override // defpackage.hj1
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (ni1 ni1Var : componentRegistrar.getComponents()) {
            String str = ni1Var.a;
            if (str != null) {
                ni1Var = new ni1(str, ni1Var.b, ni1Var.c, ni1Var.d, ni1Var.e, new gj1(0, str, ni1Var), ni1Var.g);
            }
            arrayList.add(ni1Var);
        }
        return arrayList;
    }

    public void b(ou6 ou6Var, float f2, long j, dd4 dd4Var, int i) {
        float f3;
        long j2;
        float f4;
        long jE;
        dd4Var.h0(-1498258020);
        int i2 = (dd4Var.f(ou6Var) ? 4 : 2) | i | Token.GENEXPR;
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            dd4Var.a0();
            if ((i & 1) == 0 || dd4Var.C()) {
                f4 = i28.b;
                jE = dd1.e(i28.a, dd4Var);
            } else {
                dd4Var.Y();
                f4 = f2;
                jE = j;
            }
            dd4Var.r();
            pn0.a(fe.L(tg9.h(tg9.f(ou6Var, 1.0f), f4), jE, jf0.G), dd4Var, 0);
            j2 = jE;
            f3 = f4;
        } else {
            dd4Var.Y();
            f3 = f2;
            j2 = j;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new p14(this, ou6Var, f3, j2, i);
        }
    }

    public Rect c(Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            objInvoke.getClass();
            return new Rect((Rect) objInvoke);
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                throw e2;
            }
            jn0.h.getClass();
            Log.w(in0.b, e2);
            return lr3.d.c(activity);
        }
    }

    public Object d(jh4 jh4Var, jt1 jt1Var) {
        long j = jh4Var.u;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (j >> 32), (int) (j & 4294967295L), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Canvas canvas2 = sc.a;
        rc rcVar = new rc();
        rcVar.a = canvas;
        jh4Var.c(rcVar, (jh4) null);
        return bitmapCreateBitmap;
    }

    public Object e(Uri uri, f42 f42Var) {
        return Long.valueOf(hjb.T(new BufferedReader(new InputStreamReader(f42Var)).readLine()));
    }

    public long g(long j, long j2) {
        float fB = og9.b(j2) / og9.b(j);
        return fu8.a(fB, fB);
    }

    @Override // defpackage.fa7
    public String h() {
        return "expected an Int value";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t91
    public void t(is4 is4Var, o1a o1aVar) {
        jt1 jt1Var = null;
        switch (this.a) {
            case 1:
                is4Var.getClass();
                uf4 uf4Var = new uf4("ObservableContent", 29);
                ru4 ru4Var = is4Var.d;
                ru4Var.f(ru4.m, uf4Var);
                ru4Var.g(uf4Var, new e8((zb4) o1aVar, jt1Var, 0));
                break;
            case 10:
                is4Var.getClass();
                is4Var.d.g(ru4.k, new lb((ac4) o1aVar, jt1Var, 7));
                break;
            default:
                is4Var.getClass();
                tv4 tv4Var = (tv4) bt4.a(is4Var, tv4.b);
                tv4Var.a.add(new q51((zb4) o1aVar, is4Var, jt1Var, 9));
                break;
        }
    }

    public /* synthetic */ zk4(int i) {
        this.a = i;
    }
}
