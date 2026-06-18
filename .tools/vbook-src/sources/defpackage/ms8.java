package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ms8 implements wh8 {
    public qt8 a;
    public rs8 b;
    public String c;
    public Object d;
    public Object[] e;
    public qs8 f;
    public final wn6 s = new wn6(this, 22);

    public ms8(qt8 qt8Var, rs8 rs8Var, String str, Object obj, Object[] objArr) {
        this.a = qt8Var;
        this.b = rs8Var;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    public final void a() {
        be5 be5Var = this.f;
        if (be5Var != null) {
            be5Var.T();
        }
    }

    public final void b() {
        be5 be5Var = this.f;
        if (be5Var != null) {
            be5Var.T();
        }
    }

    public final void c() throws IOException {
        d();
    }

    public final void d() throws IOException {
        String strL;
        rs8 rs8Var = this.b;
        if (this.f != null) {
            so9.r(this.f, ") is not null", "entry(");
            return;
        }
        if (rs8Var != null) {
            wn6 wn6Var = this.s;
            Object objInvoke = wn6Var.invoke();
            if (objInvoke == null || rs8Var.c(objInvoke)) {
                this.f = rs8Var.a(this.c, wn6Var);
                return;
            }
            if (objInvoke instanceof ak9) {
                ak9 ak9Var = (ak9) objInvoke;
                if (ak9Var.d() == s00.t || ak9Var.d() == lr3.B || ak9Var.d() == ra1.C) {
                    strL = "MutableState containing " + ak9Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strL = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strL = ww1.L(objInvoke);
            }
            throw new IllegalArgumentException(strL);
        }
    }
}
