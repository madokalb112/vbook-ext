package defpackage;

import java.util.Collection;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qq0 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ rq0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq0(rq0 rq0Var, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = rq0Var;
        this.d = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        String str = this.d;
        rq0 rq0Var = this.c;
        switch (i) {
            case 0:
                return new qq0(rq0Var, str, jt1Var, 0);
            default:
                return new qq0(rq0Var, str, jt1Var, 1);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((qq0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object value;
        int i = this.a;
        String str = this.d;
        rq0 rq0Var = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    u31 u31Var = new u31(rq0Var.f, 2);
                    this.b = 1;
                    obj = cx1.N(u31Var, this);
                    if (obj == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                Iterable<String> iterable = (Iterable) obj;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    z = false;
                } else {
                    for (String str2 : iterable) {
                        str2.getClass();
                        Pattern patternCompile = Pattern.compile(str2);
                        patternCompile.getClass();
                        str.getClass();
                        if (!patternCompile.matcher(str).matches()) {
                            String strE0 = bw9.E0(str, '/');
                            Pattern patternCompile2 = Pattern.compile("^https?://");
                            patternCompile2.getClass();
                            strE0.getClass();
                            String strReplaceFirst = patternCompile2.matcher(strE0).replaceFirst("");
                            strReplaceFirst.getClass();
                            if (patternCompile.matcher(strReplaceFirst).matches()) {
                            }
                        }
                        z = true;
                    }
                    z = false;
                }
                fr9 fr9Var = rq0Var.s;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, iq0.a((iq0) value, z, false, false, null, null, 61)));
                }
                return heb.a;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                b6 b6Var = rq0Var.e;
                this.b = 1;
                Object objB = ((f6) b6Var).b(str, this);
                return objB == xx1Var ? xx1Var : objB;
        }
    }
}
