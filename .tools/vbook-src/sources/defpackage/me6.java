package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class me6 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie6 b;

    public /* synthetic */ me6(ie6 ie6Var, int i) {
        this.a = i;
        this.b = ie6Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        ie6 ie6Var = this.b;
        switch (i) {
            case 0:
                Member member = (Member) obj;
                member.getClass();
                wg6 wg6Var = new wg6((Method) member);
                Object obj2 = ie6Var.b;
                if (obj2 != null) {
                    wg6Var.u0(obj2);
                }
                return wg6Var;
            case 1:
                Member member2 = (Member) obj;
                member2.getClass();
                bq1 bq1Var = new bq1();
                Object obj3 = ie6Var.b;
                return bq1Var;
            case 2:
                Member member3 = (Member) obj;
                member3.getClass();
                uu3 uu3Var = new uu3((Field) member3);
                Object obj4 = ie6Var.b;
                if (obj4 != null) {
                    uu3Var.u0(obj4);
                }
                return uu3Var;
            case 3:
                Member member4 = (Member) obj;
                member4.getClass();
                wg6 wg6Var2 = new wg6((Method) member4);
                Object obj5 = ie6Var.b;
                if (obj5 != null) {
                    wg6Var2.u0(obj5);
                }
                return wg6Var2;
            case 4:
                Member member5 = (Member) obj;
                member5.getClass();
                bq1 bq1Var2 = new bq1();
                Object obj6 = ie6Var.b;
                return bq1Var2;
            default:
                Member member6 = (Member) obj;
                member6.getClass();
                uu3 uu3Var2 = new uu3((Field) member6);
                Object obj7 = ie6Var.b;
                if (obj7 != null) {
                    uu3Var2.u0(obj7);
                }
                return uu3Var2;
        }
    }
}
