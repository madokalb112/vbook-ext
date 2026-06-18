package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wb1 implements gta {
    public final b15 a;

    public wb1(b15 b15Var) {
        this.a = b15Var;
    }

    @Override // defpackage.gta
    public final eta a(String str, dh0 dh0Var, String str2, q05 q05Var) {
        q05Var.getClass();
        Bitmap bitmap = dh0Var.a;
        pe8 pe8VarD = this.a.d();
        if (pe8VarD != null) {
            pe8VarD.b(new pe6(str), new qe6(new ah0(bitmap), mc3.a));
        }
        return null;
    }

    @Override // defpackage.gta
    public final eta c(String str) {
        qe6 qe6VarA;
        pe8 pe8VarD = this.a.d();
        if (pe8VarD == null || (qe6VarA = pe8VarD.a(new pe6(str))) == null) {
            return null;
        }
        ah0 ah0Var = qe6VarA.a;
        ah0Var.getClass();
        return new dh0(ah0Var.a);
    }
}
