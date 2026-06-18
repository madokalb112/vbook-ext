package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class oh1 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zk7 b;

    public /* synthetic */ oh1(zk7 zk7Var, int i) {
        this.a = i;
        this.b = zk7Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zk7 zk7Var = this.b;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                List list = (List) obj;
                int iIntValue = ((Integer) obj3).intValue();
                list.getClass();
                qx8.a(zk7Var, list, null, (dd4) obj2, (iIntValue << 3) & Token.ASSIGN_MOD);
                break;
            case 1:
                List list2 = (List) obj;
                int iIntValue2 = ((Integer) obj3).intValue();
                list2.getClass();
                qx8.a(zk7Var, list2, null, (dd4) obj2, (iIntValue2 << 3) & Token.ASSIGN_MOD);
                break;
            case 2:
                List list3 = (List) obj;
                int iIntValue3 = ((Integer) obj3).intValue();
                list3.getClass();
                rj1 rj1Var = fw.c;
                rj1 rj1Var2 = fw.d;
                int i2 = ((iIntValue3 << 3) & Token.ASSIGN_MOD) | 27648;
                qx8.b(this.b, list3, null, rj1Var, rj1Var2, (dd4) obj2, i2, 4);
                break;
            case 3:
                List list4 = (List) obj;
                int iIntValue4 = ((Integer) obj3).intValue();
                list4.getClass();
                qx8.a(zk7Var, list4, null, (dd4) obj2, (iIntValue4 << 3) & Token.ASSIGN_MOD);
                break;
            case 4:
                List list5 = (List) obj;
                int iIntValue5 = ((Integer) obj3).intValue();
                list5.getClass();
                rj1 rj1Var3 = h67.f;
                rj1 rj1Var4 = h67.g;
                int i3 = ((iIntValue5 << 3) & Token.ASSIGN_MOD) | 27648;
                qx8.b(this.b, list5, null, rj1Var3, rj1Var4, (dd4) obj2, i3, 4);
                break;
            case 5:
                List list6 = (List) obj;
                int iIntValue6 = ((Integer) obj3).intValue();
                list6.getClass();
                rj1 rj1Var5 = gjb.t;
                rj1 rj1Var6 = gjb.u;
                int i4 = ((iIntValue6 << 3) & Token.ASSIGN_MOD) | 27648;
                qx8.b(this.b, list6, null, rj1Var5, rj1Var6, (dd4) obj2, i4, 4);
                break;
            default:
                List list7 = (List) obj;
                int iIntValue7 = ((Integer) obj3).intValue();
                list7.getClass();
                rj1 rj1Var7 = ah1.x;
                rj1 rj1Var8 = ah1.y;
                int i5 = ((iIntValue7 << 3) & Token.ASSIGN_MOD) | 27648;
                qx8.b(this.b, list7, null, rj1Var7, rj1Var8, (dd4) obj2, i5, 4);
                break;
        }
        return hebVar;
    }
}
