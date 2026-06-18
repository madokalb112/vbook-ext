package defpackage;

import android.content.res.Resources;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wt extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wt(zt ztVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = ztVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        zt ztVar = this.c;
        switch (i) {
            case 0:
                wt wtVar = new wt(ztVar, jt1Var, 0);
                wtVar.b = obj;
                return wtVar;
            case 1:
                wt wtVar2 = new wt(ztVar, jt1Var, 1);
                wtVar2.b = obj;
                return wtVar2;
            case 2:
                wt wtVar3 = new wt(ztVar, jt1Var, 2);
                wtVar3.b = obj;
                return wtVar3;
            default:
                wt wtVar4 = new wt(ztVar, jt1Var, 3);
                wtVar4.b = obj;
                return wtVar4;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((wt) create((String) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 1:
                ((wt) create((String) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 2:
                ((wt) create((vl5) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            default:
                ((wt) create((kra) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        long jH;
        String str;
        int i = this.a;
        heb hebVar = heb.a;
        zt ztVar = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str2 = (String) obj2;
                e11.e0(obj);
                fr9 fr9Var = ztVar.u;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, dsa.a((dsa) value, 0L, null, 0, false, false, false, 0, 0.0d, 0.0f, 0.0f, qu1.X(str2), 0, null, 0.0f, 30719)));
                }
                break;
            case 1:
                String str3 = (String) obj2;
                e11.e0(obj);
                fr9 fr9Var2 = ztVar.u;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, dsa.a((dsa) value2, 0L, null, 0, false, false, false, 0, 0.0d, 0.0f, 0.0f, null, 0, str3, 0.0f, 24575)));
                }
                break;
            case 2:
                vl5 vl5Var = (vl5) obj2;
                e11.e0(obj);
                String str4 = vl5Var != null ? vl5Var.b : null;
                if (str4 == null) {
                    str4 = "";
                }
                f36 f36VarL = sw1.L(str4);
                if (f36VarL == null) {
                    i36 i36Var = i36.b;
                    Locale localeB = i36.d(LocaleList.getAdjustedDefault()).b(0);
                    if (localeB == null && (localeB = Resources.getSystem().getConfiguration().getLocales().get(0)) == null) {
                        localeB = Locale.getDefault();
                    }
                    localeB.getClass();
                    f36VarL = new f36(new bbc(localeB, 3));
                }
                f36.b.c(f36VarL.a);
                fr9 fr9Var3 = ztVar.t;
                if (fr9Var3 != null) {
                    do {
                        value3 = fr9Var3.getValue();
                    } while (!fr9Var3.j(value3, tt.a((tt) value3, f36VarL.d(), 1)));
                }
                break;
            default:
                kra kraVar = (kra) obj2;
                e11.e0(obj);
                fr9 fr9Var4 = ztVar.u;
                if (fr9Var4 != null) {
                    do {
                        value4 = fr9Var4.getValue();
                        jH = kf0.H(kraVar.b);
                        str = kraVar.c;
                        xr.b.getClass();
                    } while (!fr9Var4.j(value4, dsa.a((dsa) value4, jH, bv4.s(str), 0, false, false, false, 0, 0.0d, 0.0f, 0.0f, null, 0, null, 0.0f, 32764)));
                }
                break;
        }
        return hebVar;
    }
}
