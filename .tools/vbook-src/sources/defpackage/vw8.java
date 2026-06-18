package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class vw8 implements yb4 {
    public final /* synthetic */ int a;

    public /* synthetic */ vw8(int i) {
        this.a = 24;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return Integer.valueOf(((ww8) obj2).a.h());
            case 1:
                return Long.valueOf(((r19) obj2).d.get());
            case 2:
                a91 a91Var = (a91) obj;
                List list = (List) obj2;
                a91Var.getClass();
                list.getClass();
                ArrayList arrayListS = yn2.S(a49.a, list, true);
                arrayListS.getClass();
                return yn2.L(a91Var, arrayListS, new fz0(8, list));
            case 3:
                a91 a91Var2 = (a91) obj;
                List list2 = (List) obj2;
                a91Var2.getClass();
                list2.getClass();
                ArrayList arrayListS2 = yn2.S(a49.a, list2, true);
                arrayListS2.getClass();
                oi5 oi5VarL = yn2.L(a91Var2, arrayListS2, new fz0(9, list2));
                if (oi5VarL != null) {
                    return s32.J0(oi5VarL);
                }
                return null;
            case 4:
                ((r43) obj).getClass();
                return hebVar;
            case 5:
                ((qq5) obj).getClass();
                ((gg1) obj2).getClass();
                return new bi4(bx1.e(qq5.b));
            case 6:
                ((qq5) obj).getClass();
                ((k0a) obj2).getClass();
                return new bi4(bx1.e(qq5.b));
            case 7:
                ((Integer) obj).intValue();
                ih9 ih9Var = (ih9) obj2;
                ih9Var.getClass();
                return ih9Var.a;
            case 8:
                ((Integer) obj).intValue();
                da8 da8Var = (da8) obj2;
                da8Var.getClass();
                return da8Var.a;
            case 9:
                ((Integer) obj).intValue();
                p17 p17Var = (p17) obj2;
                p17Var.getClass();
                return p17Var.a;
            case 10:
                ca6 ca6Var = (ca6) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ca6Var.getClass();
                return Integer.valueOf(ca6Var.v(iIntValue));
            case 11:
                ca6 ca6Var2 = (ca6) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ca6Var2.getClass();
                return Integer.valueOf(ca6Var2.d(iIntValue2));
            case 12:
                ca6 ca6Var3 = (ca6) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ca6Var3.getClass();
                return Integer.valueOf(ca6Var3.p(iIntValue3));
            case 13:
                ca6 ca6Var4 = (ca6) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ca6Var4.getClass();
                return Integer.valueOf(ca6Var4.X(iIntValue4));
            case 14:
                ega egaVar = (ega) obj2;
                return gc1.Z(Float.valueOf(egaVar.a.h()), Boolean.valueOf(((lh7) egaVar.f.getValue()) == lh7.a));
            case 15:
                ms8 ms8Var = (ms8) obj;
                wga wgaVar = (wga) obj2;
                return gc1.E(vt8.a(wgaVar.a, vt8.a, ms8Var), vt8.a(new pja(wgaVar.b), vt8.p, ms8Var));
            case 16:
                ija ijaVar = (ija) obj2;
                ((ms8) obj).getClass();
                ijaVar.getClass();
                Boolean bool = (Boolean) ijaVar.a.getValue();
                bool.booleanValue();
                return gc1.Z(bool, (String) ijaVar.b.getValue());
            case 17:
                ((Integer) obj).intValue();
                i6b i6bVar = (i6b) obj2;
                i6bVar.getClass();
                return i6bVar.a;
            case 18:
                hx1 hx1Var = (hx1) obj2;
                if (!(hx1Var instanceof fsa)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue5 = num != null ? num.intValue() : 1;
                return iIntValue5 == 0 ? hx1Var : Integer.valueOf(iIntValue5 + 1);
            case 19:
                fsa fsaVar = (fsa) obj;
                hx1 hx1Var2 = (hx1) obj2;
                if (fsaVar != null) {
                    return fsaVar;
                }
                if (hx1Var2 instanceof fsa) {
                    return (fsa) hx1Var2;
                }
                return null;
            case 20:
                msa msaVar = (msa) obj;
                hx1 hx1Var3 = (hx1) obj2;
                if (hx1Var3 instanceof fsa) {
                    fsa fsaVar2 = (fsa) hx1Var3;
                    jx1 jx1Var = msaVar.a;
                    Object objJ0 = fsaVar2.j0();
                    Object[] objArr = msaVar.b;
                    int i2 = msaVar.d;
                    objArr[i2] = objJ0;
                    fsa[] fsaVarArr = msaVar.c;
                    msaVar.d = i2 + 1;
                    fsaVarArr[i2] = fsaVar2;
                }
                return msaVar;
            case 21:
                return Integer.valueOf((((cs8) obj).a - ((cs8) obj2).a) * (-1));
            case 22:
                ((Integer) obj).intValue();
                dab dabVar = (dab) obj2;
                dabVar.getClass();
                return dabVar.a;
            case 23:
                e0b e0bVar = (e0b) obj2;
                return gc1.Z(Float.valueOf(e0bVar.a), Float.valueOf(e0bVar.d.h()), Float.valueOf(e0bVar.b.h()));
            case 24:
                ((Integer) obj2).getClass();
                gjb.L((dd4) obj, qu1.x0(1));
                return hebVar;
            case 25:
                ((Integer) obj2).getClass();
                ((pn) obj).getClass();
                return new vr1(wd3.c(ah1.a0(350, 0, null, 6), 2), wd3.d(ah1.a0(350, 0, null, 6), 2));
            case 26:
                pn pnVar = (pn) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                pnVar.getClass();
                boolean z = iIntValue6 == 0;
                if2 if2Var = b83.d;
                p9b p9bVarA0 = ah1.a0(450, 0, if2Var, 2);
                t3b t3bVar = new t3b(3);
                be3 be3VarK = !z ? wd3.k(p9bVarA0, new nn(t3bVar, pnVar, 0)) : z ? wd3.k(p9bVarA0, new nn(t3bVar, pnVar, 1)) : be3.b;
                p9b p9bVarA02 = ah1.a0(450, 0, if2Var, 2);
                s9b s9bVar = wd3.a;
                long jC = lc1.c(0.5f, lc1.b);
                be3 be3VarA = be3VarK.a(new be3(new q3b((kt3) null, (nh9) null, (f11) null, (bu8) null, new slb(jC, lc1.c(0.0f, jC), p9bVarA02), (LinkedHashMap) null, Token.ASSIGN_DIV)));
                p9b p9bVarA03 = ah1.a0(450, 0, if2Var, 2);
                kd kdVar = kd.B;
                return new vr1(be3VarA, !z ? wd3.o(p9bVarA03, new on(pnVar, kdVar, 0)) : z ? wd3.o(p9bVarA03, new on(pnVar, kdVar, 1)) : cj3.b);
            case 27:
                ((ev8) obj).getClass();
                ((rm7) obj2).getClass();
                return new m76();
            case 28:
                ((sn5) obj).t = true;
                return hebVar;
            default:
                ((Integer) obj).intValue();
                Integer num2 = (Integer) obj2;
                num2.intValue();
                return num2;
        }
    }

    public /* synthetic */ vw8(int i, byte b) {
        this.a = i;
    }
}
