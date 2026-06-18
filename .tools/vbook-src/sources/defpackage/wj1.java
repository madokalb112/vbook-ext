package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class wj1 implements ec4 {
    @Override // defpackage.ec4
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Number number) {
        int i;
        ou6 ou6Var = (ou6) obj;
        String str = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        ks1 ks1Var = (ks1) obj4;
        zb4 zb4Var = (zb4) obj5;
        ib4 ib4Var = (ib4) obj6;
        dd4 dd4Var = (dd4) obj7;
        int iIntValue = ((Integer) number).intValue();
        if ((iIntValue & 6) == 0) {
            i = (dd4Var.f(ou6Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= dd4Var.f(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= dd4Var.g(zBooleanValue) ? 256 : Token.CASE;
        }
        if ((iIntValue & 3072) == 0) {
            i |= dd4Var.f(ks1Var) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= dd4Var.h(zb4Var) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= dd4Var.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (dd4Var.V(i & 1, (599187 & i) != 599186)) {
            bt1.c(str, zBooleanValue, ks1Var, ou6Var, zb4Var, ib4Var, dd4Var, ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }
}
