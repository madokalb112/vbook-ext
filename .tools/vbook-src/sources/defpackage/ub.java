package defpackage;

import android.content.Context;
import baidu.lac.jni.LacLib;
import com.reader.data.download.impl.AndroidDownloadService;
import com.reader.data.server.AndroidTestServerService;
import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ub implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ub(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v30, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v92 */
    /* JADX WARN: Type inference failed for: r13v93 */
    /* JADX WARN: Type inference failed for: r13v94 */
    /* JADX WARN: Type inference failed for: r13v95 */
    @Override // defpackage.ib4
    public final Object invoke() {
        ?? r13;
        ?? r132;
        int i = this.a;
        int i2 = 3;
        int i3 = 7;
        Integer num = null;
        heb hebVar = heb.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Context context = ((wb) obj).a;
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            case 1:
                fr9 fr9Var = AndroidBookUpdateWorker.k;
                Context context2 = ((zz5) ((AndroidBookUpdateWorker) obj)).a;
                context2.getClass();
                return new kc(context2);
            case 2:
                boolean z = AndroidDownloadService.s;
                return new of((AndroidDownloadService) obj);
            case 3:
                qg qgVar = (qg) obj;
                String str = qgVar.b.a;
                if (str == null) {
                    gp.l("LacConfig.modelPath must be set. Extract assets/lac_model to a filesystem path and pass it in.");
                    return null;
                }
                long jCreate = LacLib.create(qgVar.a, str, 1);
                if (jCreate != 0) {
                    return Long.valueOf(jCreate);
                }
                gp.j("LacLib.create returned 0 — model load failed");
                return null;
            case 4:
                s25 s25Var = ((li) obj).b;
                s25Var.getClass();
                mh0 mh0Var = new mh0(tu1.s(s25Var.a()), i2);
                try {
                    Integer numValueOf = Integer.valueOf(new wi3(mh0Var).c(0));
                    try {
                        mh0Var.close();
                    } catch (Throwable th) {
                        num = th;
                    }
                    Integer num2 = num;
                    num = numValueOf;
                    r13 = num2;
                    break;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    try {
                        mh0Var.close();
                        r13 = th3;
                    } catch (Throwable th4) {
                        i12.r(th3, th4);
                        r13 = th3;
                    }
                    break;
                }
                if (r13 == 0) {
                    return new yi3(num.intValue());
                }
                throw r13;
            case 5:
                s25 s25Var2 = ((mi) obj).b;
                s25Var2.getClass();
                mh0 mh0Var2 = new mh0(tu1.s(s25Var2.a()), i2);
                try {
                    Integer numValueOf2 = Integer.valueOf(new wi3(mh0Var2).c(0));
                    try {
                        mh0Var2.close();
                    } catch (Throwable th5) {
                        num = th5;
                    }
                    Integer num3 = num;
                    num = numValueOf2;
                    r132 = num3;
                    break;
                } catch (Throwable th6) {
                    Throwable th7 = th6;
                    try {
                        mh0Var2.close();
                        r132 = th7;
                    } catch (Throwable th8) {
                        i12.r(th7, th8);
                        r132 = th7;
                    }
                    break;
                }
                if (r132 == 0) {
                    return new yi3(num.intValue());
                }
                throw r132;
            case 6:
                ex1.U((wi) obj);
                return hebVar;
            case 7:
                return new l6a(((vj) obj).a);
            case 8:
                fr9 fr9Var2 = AndroidTestServerService.d;
                return new xj((AndroidTestServerService) obj);
            case 9:
                return ((rca) obj).Z();
            case 10:
                c87 c87Var = new c87(((kl) obj).a.getApplicationContext(), "text_to_speech");
                c87Var.u.icon = 2131231010;
                return c87Var;
            case 11:
                ((jj4) obj).a(0);
                return hebVar;
            case 12:
                Object[] objArr = (Object[]) obj;
                objArr.getClass();
                return new n1(objArr);
            case 13:
                ((oq9) obj).cancel(null);
                return hebVar;
            case 14:
                ec0 ec0Var = (ec0) obj;
                ec0Var.d++;
                ec0Var.d();
                return hebVar;
            case 15:
                return (bp) obj;
            case 16:
                return vg0.b((vg0) obj);
            case 17:
                return (kf8) obj;
            case 18:
                return (ts9) ((ez0) obj).d.getValue();
            case 19:
                v41 v41Var = (v41) obj;
                if (!((t41) v41Var.e.getValue()).a && !v41Var.u && v41Var.t) {
                    String str2 = v41Var.s;
                    za1 za1VarA = vtb.a(v41Var);
                    aj2 aj2Var = rw2.a;
                    v41Var.g(za1VarA, nh2.c, new u41(true, v41Var, false, str2, null));
                }
                return hebVar;
            case 20:
                xq0 xq0Var = new xq0();
                xq0Var.m4write((byte[]) obj);
                return xq0Var;
            case 21:
                ib4 ib4Var = ((re1) obj).X;
                if (ib4Var != null) {
                    ib4Var.invoke();
                }
                return Boolean.TRUE;
            case 22:
                return gc1.Y((xl7) obj);
            case 23:
                px pxVar = (px) obj;
                if (pxVar.D == null) {
                    yd5 yd5Var = pxVar.v;
                    if (yd5Var != null) {
                        yd5Var.cancel(null);
                    }
                    pxVar.v = null;
                } else if (pxVar.u) {
                    pxVar.n();
                }
                return hebVar;
            case 24:
                bn1 bn1Var = (bn1) obj;
                dk4 dk4Var = ek4.a;
                fk4 fk4Var = new fk4(5);
                wh7 wh7Var = (wh7) bn1Var.b;
                ek4 ek4VarC = wh7Var.c();
                qk1 qk1Var = new qk1(26);
                ek4VarC.getClass();
                ek4VarC.d(new b18(i3, fk4Var, qk1Var));
                fk4Var.h("Content-Encoding", ((wq1) bn1Var.d).getName());
                String strC = wh7Var.c().c("Vary");
                fk4Var.h("Vary", strC != null ? strC.concat(", Accept-Encoding") : "Accept-Encoding");
                return fk4Var.I();
            case 25:
                cn1 cn1Var = (cn1) obj;
                dk4 dk4Var2 = ek4.a;
                fk4 fk4Var2 = new fk4(5);
                vh7 vh7Var = cn1Var.a;
                ek4 ek4VarC2 = vh7Var.c();
                qk1 qk1Var2 = new qk1(27);
                ek4VarC2.getClass();
                ek4VarC2.d(new b18(i3, fk4Var2, qk1Var2));
                fk4Var2.h("Content-Encoding", cn1Var.b.getName());
                String strC2 = vh7Var.c().c("Vary");
                fk4Var2.h("Vary", strC2 != null ? strC2.concat(", Accept-Encoding") : "Accept-Encoding");
                return fk4Var2.I();
            case 26:
                return ((c85) obj).f(":memory:");
            case 27:
                return ((qv5) obj).d();
            case 28:
                return new ega((lh7) obj, 0.0f);
            default:
                ((dda) obj).close();
                return hebVar;
        }
    }
}
