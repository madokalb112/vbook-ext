package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class vra extends kc4 implements kb4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vra(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        jt1 jt1Var;
        Object next;
        int i = this.a;
        int i2 = 13;
        int i3 = 10;
        int i4 = 1;
        int i5 = 2;
        int i6 = 0;
        heb hebVar = heb.a;
        jt1 jt1Var2 = null;
        switch (i) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                csa csaVar = (csa) this.receiver;
                csaVar.getClass();
                qtb.h(csaVar, vtb.a(csaVar), new zra(csaVar, fFloatValue, jt1Var2, i6));
                return hebVar;
            case 1:
                return Boolean.valueOf(wwa.a((wwa) this.receiver, ((Character) obj).charValue()));
            case 2:
                String str = (String) obj;
                str.getClass();
                c1b c1bVar = (c1b) this.receiver;
                c1bVar.getClass();
                za1 za1VarA = vtb.a(c1bVar);
                aj2 aj2Var = rw2.a;
                c1bVar.g(za1VarA, nh2.c, new qoa(c1bVar, str, jt1Var2, i2));
                return hebVar;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                c1b c1bVar2 = (c1b) this.receiver;
                c1bVar2.getClass();
                za1 za1VarA2 = vtb.a(c1bVar2);
                aj2 aj2Var2 = rw2.a;
                c1bVar2.g(za1VarA2, nh2.c, new qoa(c1bVar2, str2, jt1Var2, i2));
                return hebVar;
            case 4:
                long jLongValue = ((Number) obj).longValue();
                c1b c1bVar3 = (c1b) this.receiver;
                Iterator it = ((b1b) c1bVar3.f.getValue()).g.iterator();
                while (true) {
                    jt1Var = null;
                    if (it.hasNext()) {
                        next = it.next();
                        if (((bp2) next).a == jLongValue) {
                        }
                    } else {
                        next = null;
                    }
                }
                bp2 bp2Var = (bp2) next;
                if (bp2Var != null && bp2Var.d != 2) {
                    za1 za1VarA3 = vtb.a(c1bVar3);
                    aj2 aj2Var3 = rw2.a;
                    c1bVar3.g(za1VarA3, nh2.c, new i43(c1bVar3, jLongValue, jt1Var, 2));
                }
                return hebVar;
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                t4b t4bVar = (t4b) this.receiver;
                t4bVar.getClass();
                za1 za1VarA4 = vtb.a(t4bVar);
                aj2 aj2Var4 = rw2.a;
                t4bVar.g(za1VarA4, nh2.c, new lk0(t4bVar, zBooleanValue, jt1Var2, i3));
                return hebVar;
            case 6:
                int iIntValue = ((Number) obj).intValue();
                t4b t4bVar2 = (t4b) this.receiver;
                t4bVar2.getClass();
                za1 za1VarA5 = vtb.a(t4bVar2);
                aj2 aj2Var5 = rw2.a;
                t4bVar2.g(za1VarA5, nh2.c, new tl0(t4bVar2, iIntValue, jt1Var2, i3));
                return hebVar;
            case 7:
                int iIntValue2 = ((Number) obj).intValue();
                o9b o9bVar = (o9b) this.receiver;
                o9bVar.getClass();
                za1 za1VarA6 = vtb.a(o9bVar);
                aj2 aj2Var6 = rw2.a;
                o9bVar.g(za1VarA6, nh2.c, new n9b(o9bVar, iIntValue2, jt1Var2, i4));
                return hebVar;
            case 8:
                int iIntValue3 = ((Number) obj).intValue();
                o9b o9bVar2 = (o9b) this.receiver;
                o9bVar2.getClass();
                za1 za1VarA7 = vtb.a(o9bVar2);
                aj2 aj2Var7 = rw2.a;
                o9bVar2.g(za1VarA7, nh2.c, new n9b(o9bVar2, iIntValue3, jt1Var2, i6));
                return hebVar;
            case 9:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                o9b o9bVar3 = (o9b) this.receiver;
                o9bVar3.getClass();
                za1 za1VarA8 = vtb.a(o9bVar3);
                aj2 aj2Var8 = rw2.a;
                o9bVar3.g(za1VarA8, nh2.c, new m9b(o9bVar3, zBooleanValue2, jt1Var2, i4));
                return hebVar;
            case 10:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                o9b o9bVar4 = (o9b) this.receiver;
                o9bVar4.getClass();
                za1 za1VarA9 = vtb.a(o9bVar4);
                aj2 aj2Var9 = rw2.a;
                o9bVar4.g(za1VarA9, nh2.c, new m9b(o9bVar4, zBooleanValue3, jt1Var2, i5));
                return hebVar;
            case 11:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                o9b o9bVar5 = (o9b) this.receiver;
                o9bVar5.getClass();
                za1 za1VarA10 = vtb.a(o9bVar5);
                aj2 aj2Var10 = rw2.a;
                o9bVar5.g(za1VarA10, nh2.c, new m9b(o9bVar5, zBooleanValue4, jt1Var2, i6));
                return hebVar;
            case 12:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                o9b o9bVar6 = (o9b) this.receiver;
                o9bVar6.getClass();
                za1 za1VarA11 = vtb.a(o9bVar6);
                aj2 aj2Var11 = rw2.a;
                o9bVar6.g(za1VarA11, nh2.c, new m9b(o9bVar6, zBooleanValue5, jt1Var2, 3));
                return hebVar;
            case 13:
                Map map = (Map) obj;
                map.getClass();
                rab rabVar = (rab) this.receiver;
                rabVar.getClass();
                rabVar.g(vtb.a(rabVar), rw2.a, new qt0(rabVar, map, null));
                return hebVar;
            case 14:
                return (Integer) ((y48) this.receiver).a(obj);
            case 15:
                String str3 = (String) obj;
                str3.getClass();
                ehb ehbVar = (ehb) this.receiver;
                ehbVar.getClass();
                za1 za1VarA12 = vtb.a(ehbVar);
                aj2 aj2Var12 = rw2.a;
                ehbVar.g(za1VarA12, nh2.c, new oc(ehbVar, str3, (jt1) null));
                return hebVar;
            default:
                throw null;
        }
    }
}
