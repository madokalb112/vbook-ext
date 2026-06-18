package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class qjb {
    public static final long a = vp1.b(0, 0, 0, 0, 5);
    public static final /* synthetic */ int b = 0;

    public static final sx a(dd4 dd4Var) {
        if (!((Boolean) dd4Var.j(c95.a)).booleanValue()) {
            dd4Var.f0(2019088453);
            dd4Var.q(false);
            return null;
        }
        dd4Var.f0(2019030948);
        sx sxVar = (sx) dd4Var.j(r16.a);
        dd4Var.q(false);
        return sxVar;
    }

    public static final a25 b(Object obj, dd4 dd4Var) {
        dd4Var.f0(1319639034);
        if (obj instanceof a25) {
            dd4Var.f0(1530875884);
            a25 a25Var = (a25) obj;
            dd4Var.q(false);
            dd4Var.q(false);
            return a25Var;
        }
        dd4Var.f0(1530915130);
        Context context = (Context) dd4Var.j(he.b);
        boolean zF = dd4Var.f(context) | dd4Var.f(obj);
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            w15 w15Var = new w15(context);
            w15Var.c = obj;
            objQ = w15Var.a();
            dd4Var.p0(objQ);
        }
        a25 a25Var2 = (a25) objQ;
        dd4Var.q(false);
        dd4Var.q(false);
        return a25Var2;
    }

    public static final long c(long j) {
        int iM = t96.M(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) t96.M(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iM) << 32);
    }

    public static void d(String str) {
        throw new IllegalArgumentException(j39.m("Unsupported type: ", str, ". ", xv5.p("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void e(a25 a25Var) {
        Object obj = a25Var.b;
        if (obj instanceof w15) {
            gp.l("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof ky4) {
            d("ImageBitmap");
            throw null;
        }
        if (obj instanceof p35) {
            d("ImageVector");
            throw null;
        }
        if (obj instanceof ul7) {
            d("Painter");
            throw null;
        }
        if (a25Var.c != null) {
            gp.l("request.target must be null.");
        } else {
            if (((px5) fx1.u0(a25Var, f25.e)) == null) {
                return;
            }
            gp.l("request.lifecycle must be null.");
        }
    }
}
