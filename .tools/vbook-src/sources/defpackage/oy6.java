package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oy6 extends wd0 {
    public final vg9 d = vg9.a;

    @Override // defpackage.wd0
    public final void a(i8a i8aVar, dd4 dd4Var, int i) {
        dd4Var.h0(1693961520);
        int i2 = (dd4Var.f(i8aVar) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            o8a o8aVar = new o8a();
            String str = i8aVar.a;
            if (bw9.a0(str)) {
                str = "No Music Playing";
            }
            String str2 = i8aVar.b;
            if (bw9.a0(str2)) {
                str2 = "Tap to Play";
            }
            p7c.c(hn9.j(o8aVar), e9.d, jf0.G(-50630130, new ky6(i8aVar, str, o8aVar, str2), dd4Var), dd4Var, 384);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xp5(this, i8aVar, i, 22);
        }
    }

    @Override // defpackage.wd0
    public final vg9 c() {
        return this.d;
    }
}
