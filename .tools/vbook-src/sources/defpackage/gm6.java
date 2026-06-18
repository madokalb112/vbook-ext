package defpackage;

import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class gm6 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map.Entry b;

    public /* synthetic */ gm6(Map.Entry entry, int i) {
        this.a = i;
        this.b = entry;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        Map.Entry entry = this.b;
        dr5 dr5Var = (dr5) obj;
        ((Integer) obj2).getClass();
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        switch (i) {
            case 0:
                dr5Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var.f(dr5Var) ? 4 : 2;
                }
                if (!dd4Var.V(iIntValue & 1, (iIntValue & Token.DO) != 130)) {
                    dd4Var.Y();
                } else {
                    vm7.d(((oy4) fc1.x0((List) entry.getValue())).d, gjb.m0(fe.L(dr5.a(dr5Var, tg9.f(lu6Var, 1.0f)), dd1.g(((q96) dd4Var.j(s96.a)).a, 1.0f), jf0.G), 20.0f, 4.0f), dd4Var, 0);
                }
                break;
            default:
                dr5Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var.f(dr5Var) ? 4 : 2;
                }
                if (!dd4Var.V(iIntValue & 1, (iIntValue & Token.DO) != 130)) {
                    dd4Var.Y();
                } else {
                    jf0.f(((gba) fc1.x0((List) entry.getValue())).d, gjb.m0(fe.L(dr5.a(dr5Var, tg9.f(lu6Var, 1.0f)), dd1.g(((q96) dd4Var.j(s96.a)).a, 1.0f), jf0.G), 20.0f, 4.0f), dd4Var, 0);
                }
                break;
        }
        return hebVar;
    }
}
