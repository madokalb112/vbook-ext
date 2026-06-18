package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class rv5 implements kb4 {
    public final /* synthetic */ int a;

    public /* synthetic */ rv5(f76 f76Var) {
        this.a = 22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = true;
        Context context = null;
        int i2 = 0;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return hebVar;
            case 1:
                return hebVar;
            case 2:
                ji0 ji0Var = (ji0) obj;
                ji0Var.getClass();
                return ji0Var.c;
            case 3:
                ((qq5) obj).getClass();
                return new bi4(bx1.e(qq5.b));
            case 4:
                ji0 ji0Var2 = (ji0) obj;
                ji0Var2.getClass();
                return ji0Var2.c;
            case 5:
                ((qq5) obj).getClass();
                return new bi4(bx1.e(qq5.b));
            case 6:
                ji0 ji0Var3 = (ji0) obj;
                ji0Var3.getClass();
                return ji0Var3.c;
            case 7:
                ((qq5) obj).getClass();
                return new bi4(bx1.e(qq5.b));
            case 8:
                ji0 ji0Var4 = (ji0) obj;
                ji0Var4.getClass();
                return ji0Var4.c;
            case 9:
                ((qq5) obj).getClass();
                return new bi4(bx1.e(qq5.b));
            case 10:
                ji0 ji0Var5 = (ji0) obj;
                ji0Var5.getClass();
                return ji0Var5.a;
            case 11:
                Context baseContext = (Context) ((qm1) obj).m0(he.b);
                while (true) {
                    if (baseContext instanceof ContextWrapper) {
                        if (baseContext instanceof Activity) {
                            context = baseContext;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    }
                }
                return (Activity) context;
            case 12:
                i26 i26Var = (i26) obj;
                i26Var.getClass();
                yn2.u(i26Var, 't');
                return hebVar;
            case 13:
                i26 i26Var2 = (i26) obj;
                i26Var2.getClass();
                yn2.u(i26Var2, 'T');
                return hebVar;
            case 14:
                ((a72) obj).getClass();
                return hebVar;
            case 15:
                a72 a72Var = (a72) obj;
                a72Var.getClass();
                yn2.u(a72Var, ':');
                ((g3) a72Var).d(new je0(new oy8(jj7.a)));
                yn2.J(a72Var, "", new rv5(16));
                return hebVar;
            case 16:
                a72 a72Var2 = (a72) obj;
                a72Var2.getClass();
                yn2.u(a72Var2, '.');
                ((g3) a72Var2).d(new je0(new b94()));
                return hebVar;
            case 17:
                x91 x91Var = (x91) obj;
                x91Var.getClass();
                p46 p46Var = (p46) x91Var.b;
                bbc bbcVar = p46Var.c;
                if (bbcVar == null) {
                    int i3 = o46.a;
                    bbcVar = new bbc(27);
                }
                bbc bbcVar2 = bbcVar;
                y36 y36Var = p46Var.e;
                ArrayList arrayList = p46Var.a;
                ArrayList arrayList2 = p46Var.b;
                boolean z2 = p46Var.d == q46.b;
                mc8 mc8Var = p46Var.f;
                boolean z3 = z2;
                x91Var.a(bv4.O, new t46(z3, bbcVar2, arrayList, arrayList2, y36Var, x91Var, mc8Var, null));
                x91Var.a(bv4.N, new u46(z3, bbcVar2, arrayList2, y36Var, mc8Var, null));
                x91Var.a(fu6.G, new v46(z3, y36Var, arrayList2, null));
                x91Var.a(wfc.v, new w46(z3, y36Var, bbcVar2, null));
                if (!z3 && y36Var.c) {
                    y91 y91Var = km8.a;
                    y91Var.getClass();
                    Object objInvoke = ((ib4) y91Var.b).invoke();
                    gm8 gm8Var = (gm8) objInvoke;
                    gm8Var.getClass();
                    gm8Var.b = new rv5(18);
                    gm8Var.a = new mt4((Object) y36Var, (jt1) (null == true ? 1 : 0), 8);
                    j00 j00Var = (j00) y91Var.d;
                    kb4 kb4Var = (kb4) y91Var.c;
                    j00Var.getClass();
                    objInvoke.getClass();
                    is4 is4Var = x91Var.a;
                    is4Var.getClass();
                    x91 x91Var2 = new x91(j00Var, is4Var, objInvoke);
                    kb4Var.invoke(x91Var2);
                    ArrayList arrayList3 = x91Var2.c;
                    int size = arrayList3.size();
                    while (i2 < size) {
                        Object obj2 = arrayList3.get(i2);
                        i2++;
                        wo4 wo4Var = (wo4) obj2;
                        wo4Var.getClass();
                        wo4Var.a.t(is4Var, wo4Var.b);
                    }
                }
                return hebVar;
            case 18:
                ((ks4) obj).getClass();
                return Boolean.valueOf(!n03.b(r0.d()));
            case 19:
                n29 n29Var = (n29) obj;
                n29Var.getClass();
                bs1.a.getClass();
                l29.d(n29Var, xr1.c);
                return hebVar;
            case 20:
                n29 n29Var2 = (n29) obj;
                n29Var2.getClass();
                bs1.a.getClass();
                l29.d(n29Var2, xr1.b);
                return hebVar;
            case 21:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                if (((CharSequence) entry.getKey()).length() != 0 && ((String) entry.getKey()).charAt(0) != '#') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                return new xl7(iw9.H((String) entry2.getKey(), false, "{0}", "¿"), entry2.getValue());
            case 23:
                ((Long) obj).getClass();
                return hebVar;
            case 24:
                obj.getClass();
                if (obj instanceof y51) {
                    return Long.valueOf(((y51) obj).a.b());
                }
                if (obj instanceof mx2) {
                    return Long.valueOf(((mx2) obj).a);
                }
                return 0;
            case 25:
                at5 at5Var = (at5) obj;
                at5Var.getClass();
                at5.b0(at5Var, (String) null, md2.j, 3);
                at5.b0(at5Var, (String) null, md2.l, 3);
                at5.b0(at5Var, (String) null, md2.n, 3);
                at5.b0(at5Var, (String) null, md2.p, 3);
                at5.b0(at5Var, (String) null, md2.r, 3);
                return hebVar;
            case 26:
                oy4 oy4Var = (oy4) obj;
                oy4Var.getClass();
                return oy4Var.a;
            case 27:
                d35 d35Var = (d35) obj;
                d35Var.getClass();
                return d35Var.a;
            case 28:
                bi5 bi5Var = (bi5) obj;
                bi5Var.getClass();
                return bi5Var.b();
            default:
                return xv5.i(6, (Integer) obj);
        }
    }

    public /* synthetic */ rv5(int i) {
        this.a = i;
    }
}
