package defpackage;

import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.CertificatePinner;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ma0 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ma0(oy9 oy9Var, String str, Object obj, ty9 ty9Var) {
        this.a = 23;
        this.b = str;
        this.c = obj;
        this.d = ty9Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i;
        er1 er1Var;
        kf8 kf8Var;
        boolean zG1;
        ot5 ot5Var;
        int i2 = this.a;
        int i3 = 2;
        int i4 = 1;
        jt1 jt1Var = null;
        heb hebVar = heb.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                ((na0) obj3).a();
                b00 b00Var = (b00) ((nc1) obj2).d;
                int i5 = ((pg8) obj).a;
                do {
                    i = b00Var.get();
                } while (!b00Var.compareAndSet(i, ((i >>> 27) & 15) == i5 ? i - 1 : i));
                break;
            case 1:
                String str = (String) obj3;
                ul0 ul0Var = (ul0) obj2;
                if (!((sl0) ((a07) obj).getValue()).c || bw9.a0(str)) {
                    ul0Var.k();
                } else {
                    ul0Var.l(str);
                }
                break;
            case 2:
                oo0 oo0Var = (oo0) obj3;
                kf8 kf8VarE1 = oo0.e1(oo0Var, (x67) obj2, (hd) obj);
                if (kf8VarE1 != null) {
                    er1 er1Var2 = oo0Var.A;
                    if (na5.b(er1Var2.H, -1L)) {
                        t75.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                    }
                }
                break;
            case 3:
                ib4 ib4Var = (ib4) obj3;
                ib4 ib4Var2 = (ib4) obj2;
                if (((Boolean) ((a07) obj).getValue()).booleanValue()) {
                    ib4Var.invoke();
                } else {
                    ib4Var2.invoke();
                }
                break;
            case 4:
                ib4 ib4Var3 = (ib4) obj2;
                ib4 ib4Var4 = (ib4) obj;
                if (((fxb) obj3).h()) {
                    ib4Var3.invoke();
                } else {
                    ib4Var4.invoke();
                }
                break;
            case 5:
                CertificateChainCleaner certificateChainCleaner = ((CertificatePinner) obj3).b;
                certificateChainCleaner.getClass();
                break;
            case 6:
                er1 er1Var3 = (er1) obj3;
                sfb sfbVar = (sfb) obj2;
                ro0 ro0Var = (ro0) obj;
                ho0 ho0Var = er1Var3.F;
                while (true) {
                    g07 g07Var = ho0Var.a;
                    int i6 = g07Var.c;
                    if (i6 == 0) {
                        er1Var = er1Var3;
                    } else if (i6 == 0) {
                        so9.n("MutableVector is empty.");
                        break;
                    } else {
                        kf8 kf8Var2 = (kf8) ((dr1) g07Var.a[i6 - 1]).a.invoke();
                        if (kf8Var2 == null) {
                            er1Var = er1Var3;
                            zG1 = true;
                        } else {
                            er1Var = er1Var3;
                            zG1 = er1.g1(er1Var, kf8Var2, 0L, 0L, 3);
                        }
                        if (zG1) {
                            g07 g07Var2 = ho0Var.a;
                            ((dr1) g07Var2.k(g07Var2.c - 1)).b.resumeWith(hebVar);
                            er1Var3 = er1Var;
                        }
                    }
                }
                if (er1Var.G && (kf8Var = (kf8) er1Var.E.invoke()) != null && er1.g1(er1Var, kf8Var, 0L, 0L, 3)) {
                    er1Var.G = false;
                }
                sfbVar.e = er1.e1(er1Var, ro0Var, 0L);
                break;
            case 7:
                ((kb4) obj3).invoke(lw1.S((kf8) obj2, (hw) obj));
                break;
            case 8:
                String str2 = (String) obj3;
                dw2 dw2Var = (dw2) obj2;
                if (!((bw2) ((a07) obj).getValue()).c || bw9.a0(str2)) {
                    dw2Var.k();
                } else {
                    dw2Var.l(str2);
                }
                break;
            case 9:
                ib4 ib4Var5 = (ib4) obj2;
                ib4 ib4Var6 = (ib4) obj;
                int i7 = ((r03) obj3).i;
                if (i7 == 1) {
                    ib4Var5.invoke();
                } else if (i7 == 2) {
                    ib4Var6.invoke();
                }
                break;
            case 10:
                Map map = (Map) obj2;
                pc6 pc6Var = (pc6) obj;
                zj3 zj3Var = ((nk3) obj3).u;
                os osVar = new os(2, (byte) 0);
                String str3 = (String) map.get("User-Agent");
                if (str3 == null) {
                    str3 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";
                }
                osVar.e = str3;
                osVar.m(map);
                osVar.b = 30000;
                zj3Var.K(new ii2(osVar).c(pc6Var));
                break;
            case 11:
                ((kb4) obj3).invoke((rl3) obj2);
                ((a07) obj).setValue(Boolean.FALSE);
                break;
            case 12:
                t13 t13Var = (t13) obj3;
                ib4 ib4Var7 = (ib4) obj2;
                ib4 ib4Var8 = (ib4) obj;
                if (t13Var == t13.a) {
                    ib4Var7.invoke();
                } else if (t13Var == t13.b) {
                    ib4Var8.invoke();
                }
                break;
            case 13:
                ConnectivityManager connectivityManager = (ConnectivityManager) obj2;
                a75 a75Var = (a75) obj;
                if (((ng8) obj3).a) {
                    cp4.k().d(f1c.a, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) a75Var);
                }
                break;
            case 14:
                st5 st5Var = (st5) obj3;
                br9 br9Var = (br9) obj2;
                br9 br9Var2 = (br9) obj;
                nt5 nt5VarJ = st5Var.j();
                int i8 = nt5VarJ.n;
                List list = nt5VarJ.k;
                if (i8 != 0 && (ot5Var = (ot5) br9Var.getValue()) != null) {
                    int i9 = st5Var.i();
                    int i10 = ot5Var.q;
                    float f = i10 == 0 ? 0.0f : i9 / i10;
                    ot5 ot5Var2 = (ot5) fc1.E0(list);
                    int i11 = nt5VarJ.m - nt5VarJ.q;
                    int i12 = ot5Var2.q;
                    size = (((list.size() - (((Boolean) br9Var2.getValue()).booleanValue() ? 1 : 0)) - f) - (1.0f - (i12 != 0 ? (i11 - ot5Var2.p) / i12 : 0.0f))) / nt5VarJ.n;
                }
                break;
            case 15:
                st5 st5Var2 = (st5) obj2;
                at5 at5Var = (at5) ((fo2) obj3).getValue();
                break;
            case 16:
                ah1.J((vx1) obj3, null, null, new y46((n7c) obj2, (f28) obj, jt1Var, 5), 3);
                break;
            case 17:
                h28 h28Var = (h28) obj;
                String str4 = (String) fc1.A0(((zk7) obj2).k(), (List) obj3);
                if (str4 != null && !((g28) h28Var.d.getValue()).a) {
                    za1 za1VarA = vtb.a(h28Var);
                    aj2 aj2Var = rw2.a;
                    h28Var.g(za1VarA, nh2.c, new y46(h28Var, str4, jt1Var, 18));
                }
                break;
            case 18:
                vx1 vx1Var = (vx1) obj2;
                kb9 kb9Var = (kb9) obj;
                if (((Boolean) ((kb9) obj3).b.d.invoke(lb9.b)).booleanValue()) {
                    ah1.J(vx1Var, null, null, new ro6(kb9Var, jt1Var, i3), 3);
                }
                break;
            case 19:
                tb9 tb9Var = (tb9) obj3;
                vx1 vx1VarA = utb.a(tb9Var);
                aj2 aj2Var2 = rw2.a;
                tb9Var.g(vx1VarA, nh2.c, new sb9(tb9Var, jt1Var, i4));
                ((a07) obj).setValue(Boolean.FALSE);
                ((ib4) obj2).invoke();
                break;
            case 20:
                ((kb4) obj3).invoke(Float.valueOf(0.0f));
                ((kb4) obj2).invoke(Float.valueOf(1.3f));
                ((kb4) obj).invoke(Float.valueOf(0.5f));
                break;
            case 21:
                ib4 ib4Var9 = (ib4) obj;
                int size = ((ArrayList) obj3).size() - ((mu8) obj2).a().size();
                for (int i13 = 0; i13 < size; i13++) {
                    ib4Var9.invoke();
                }
                break;
            case 22:
                yc4 yc4Var = (yc4) obj3;
                si9 si9Var = (si9) obj2;
                zg7 zg7Var = (zg7) obj;
                if (yc4Var != null) {
                    si9Var.a(si9Var.c(yc4Var) - si9Var.t);
                }
                List listJ = yb0.J(si9Var, null, si9Var.t, null);
                jl1 jl1Var = (jl1) fc1.F0(listJ);
                Integer num = jl1Var != null ? jl1Var.b : null;
                List listH = zg7Var.h(num);
                List listI0 = listH;
                if (num != null) {
                    boolean zIsEmpty = listH.isEmpty();
                    listI0 = listH;
                    if (!zIsEmpty) {
                        listI0 = fc1.I0(gc1.Y(new jl1(((jl1) fc1.x0(listH)).a, null, num)), fc1.t0(listH, 1));
                    }
                }
                break;
            case 23:
                StringBuilder sbM = dx1.m("SubsamplingState. resetTileDecoder:", (String) obj3, ". failed. ");
                sbM.append(qm8.a(obj2));
                sbM.append(". '");
                sbM.append(((ty9) obj).a());
                sbM.append('\'');
                break;
            case 24:
                t27 t27Var = (t27) obj2;
                ((a07) obj).setValue(Boolean.FALSE);
                ((joa) obj3).k();
                t27Var.getClass();
                t27Var.a(r79.INSTANCE);
                break;
            case 25:
                roa roaVar = yoa.a;
                ((a07) obj2).setValue(Boolean.FALSE);
                ((a07) obj).setValue(yia.d);
                ((jka) obj3).a.setValue(t19.c);
                break;
            case 26:
                StringBuilder sb = new StringBuilder("TileManager. loadTile. canceled. bitmap=");
                sb.append((Bitmap) obj3);
                sb.append(", ");
                sb.append((bta) obj2);
                sb.append(". '");
                break;
            case 27:
                kb4 kb4Var = (kb4) obj2;
                ib4 ib4Var10 = (ib4) obj;
                if (((x31) obj3).c()) {
                    kb4Var.invoke(Boolean.FALSE);
                    ib4Var10.invoke();
                } else {
                    kb4Var.invoke(Boolean.TRUE);
                }
                break;
            case 28:
                ((a07) obj).setValue(Boolean.FALSE);
                ((kb4) obj3).invoke(((xl7) obj2).a);
                break;
            default:
                ((a07) obj).setValue(Boolean.FALSE);
                ((kb4) obj3).invoke(Integer.valueOf(((asb) obj2).b));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ma0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
