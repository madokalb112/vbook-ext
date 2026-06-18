package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class qd0 extends ymb {
    public static final o90 b = new o90();
    public final qd0 a;

    public qd0() {
        q6a.a.getClass();
        this.a = this;
    }

    @Override // defpackage.ymb
    public final Object l(String str, kt1 kt1Var) {
        pp1 pp1Var = new pp1(new pd0(this, str, null), 6);
        aj2 aj2Var = rw2.a;
        return cx1.S(pp1Var, nh2.c);
    }

    @Override // defpackage.ymb
    public Object n(String str, inb inbVar, kt1 kt1Var) {
        str.getClass();
        return b.d(this, new File(str), inbVar, str, kt1Var);
    }

    @Override // defpackage.ymb
    public final Object q(String str, kt1 kt1Var) {
        return pu1.n0(new fb(this, str, null, 3), kt1Var);
    }

    @Override // defpackage.ymb
    public final String toString() {
        return "LocalVfs";
    }
}
