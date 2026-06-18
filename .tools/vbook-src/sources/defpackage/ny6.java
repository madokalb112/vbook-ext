package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ny6 extends wd0 {
    public final /* synthetic */ int d;

    public /* synthetic */ ny6(int i) {
        this.d = i;
    }

    @Override // defpackage.wd0
    public final void a(i8a i8aVar, dd4 dd4Var, int i) {
        int i2 = this.d;
        e9 e9Var = e9.d;
        switch (i2) {
            case 0:
                dd4Var.h0(560770927);
                int i3 = i | (dd4Var.f(i8aVar) ? 4 : 2);
                if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
                    o8a o8aVar = new o8a();
                    String str = i8aVar.a;
                    if (bw9.a0(str)) {
                        str = "No Music Playing";
                    }
                    String str2 = i8aVar.b;
                    if (bw9.a0(str2)) {
                        str2 = "Tap to Play";
                    }
                    p7c.c(hn9.j(o8aVar), e9Var, jf0.G(-1183820723, new ky6(o8aVar, str, str2, i8aVar), dd4Var), dd4Var, 384);
                } else {
                    dd4Var.Y();
                }
                ye8 ye8VarU = dd4Var.u();
                if (ye8VarU != null) {
                    ye8VarU.d = new xp5(this, i8aVar, i, 21);
                }
                break;
            default:
                dd4Var.h0(-1467815183);
                int i4 = i | (dd4Var.f(i8aVar) ? 4 : 2);
                if (dd4Var.V(i4 & 1, (i4 & 3) != 2)) {
                    o8a o8aVar2 = new o8a();
                    p7c.c(hn9.j(o8aVar2), e9Var, jf0.G(1082560463, new xp5(23, o8aVar2, i8aVar), dd4Var), dd4Var, 384);
                } else {
                    dd4Var.Y();
                }
                ye8 ye8VarU2 = dd4Var.u();
                if (ye8VarU2 != null) {
                    ye8VarU2.d = new xp5(this, i8aVar, i, 24);
                }
                break;
        }
    }
}
