package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e7 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        Object value;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                j7 j7Var = (j7) obj2;
                String str = ((sgb) obj).a;
                str.getClass();
                if (!((i7) j7Var.e.getValue()).c) {
                    za1 za1VarA = vtb.a(j7Var);
                    aj2 aj2Var = rw2.a;
                    j7Var.g(za1VarA, nh2.c, new y(j7Var, str, null, 1));
                }
                break;
            case 1:
                ((kb4) ((a07) obj).getValue()).invoke(((pz0) obj2).a);
                break;
            case 2:
                ((a07) obj).setValue(((kv1) obj2).a.a);
                break;
            case 3:
                ((kb4) obj2).invoke(((sgb) obj).a);
                break;
            case 4:
                ((kb4) obj2).invoke(String.valueOf(((fv1) obj).a));
                break;
            case 5:
                String str2 = ((sgb) obj).a;
                str2.getClass();
                fr9 fr9Var = ((t02) obj2).e;
                Set setD1 = fc1.d1(((s02) fr9Var.getValue()).h);
                if (!setD1.add(str2)) {
                    setD1.remove(str2);
                }
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, s02.a((s02) value, false, false, false, false, false, null, null, setD1, null, 383)));
                }
                break;
            case 6:
                zza zzaVar = ((r9b) obj2).n;
                break;
            case 7:
                az2 az2Var = (az2) obj;
                ((yb4) obj2).invoke(az2Var.b, az2Var.c);
                break;
            case 8:
                ((kb4) obj2).invoke(((w93) obj).a);
                break;
            case 9:
                ((kb4) obj2).invoke(((br3) obj).a);
                break;
            case 10:
                ((kb4) obj2).invoke(((fr3) obj).b);
                break;
            case 11:
                ((kb4) obj2).invoke(((o54) obj).a);
                break;
            case 12:
                ((kb4) obj2).invoke(((q26) obj).b);
                break;
            case 13:
                yha yhaVar = (yha) obj;
                ((zb4) obj2).c(yhaVar.a, yhaVar.b, yhaVar.c);
                break;
            case 14:
                ((kb4) obj2).invoke(Long.valueOf(((y51) obj).a.b()));
                break;
            case 15:
                ((kb4) obj2).invoke((xr) obj);
                break;
            case 16:
                d35 d35Var = (d35) obj;
                ((yb4) obj2).invoke(Integer.valueOf(d35Var.c), Float.valueOf(d35Var.d));
                break;
            case 17:
                ((kb4) obj2).invoke(Integer.valueOf(((d35) obj).c));
                break;
            case 18:
                ((kb4) obj2).invoke((wl5) obj);
                break;
            case 19:
                ((kb4) obj2).invoke(((u78) obj).a);
                break;
            case 20:
                ((kb4) obj2).invoke((yja) obj);
                break;
            case 21:
                ((kb4) obj2).invoke(Integer.valueOf(((koa) obj).c));
                break;
            case 22:
                ((kb4) obj2).invoke((kra) obj);
                break;
            case 23:
                ah1.M((t27) obj2, String.valueOf(((fv1) obj).a));
                break;
            case 24:
                o78 o78Var = (o78) obj;
                ((zb4) obj2).c(o78Var.a, o78Var.b, o78Var.c);
                break;
            case 25:
                gg1 gg1Var = (gg1) obj;
                ((yb4) obj2).invoke(gg1Var.b, gg1Var.c);
                break;
            case 26:
                ((kb4) obj2).invoke(((h0a) obj).c);
                break;
            case 27:
                k0a k0aVar = (k0a) obj;
                ((yb4) obj2).invoke(k0aVar.b, k0aVar.c);
                break;
            case 28:
                ((kb4) obj2).invoke(Integer.valueOf(((qo2) obj).a));
                break;
            default:
                dab dabVar = (dab) obj;
                ((ac4) obj2).g(dabVar.a, dabVar.c, dabVar.d, dabVar.e);
                break;
        }
        return hebVar;
    }
}
