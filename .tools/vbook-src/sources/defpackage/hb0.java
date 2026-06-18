package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class hb0 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hb0(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        heb hebVar = heb.a;
        Object obj2 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                uk1 uk1Var = (uk1) obj2;
                uk1Var.a.h(z);
                uk1Var.b.g(z);
                break;
            case 1:
                StringBuilder sb = (StringBuilder) obj2;
                Byte b = (Byte) obj;
                byte bByteValue = b.byteValue();
                if (lb1.a.contains(b) || lb1.d.contains(b)) {
                    sb.append((char) bByteValue);
                } else if (z && bByteValue == 32) {
                    sb.append('+');
                } else {
                    sb.append(lb1.g(bByteValue));
                }
                break;
            case 2:
                rj rjVar = (rj) obj;
                rjVar.getClass();
                rjVar.l(0, Boolean.valueOf(z));
                rjVar.g(1, (String) obj2);
                break;
            case 3:
                ii9 ii9Var = (ii9) obj2;
                n29 n29Var = (n29) obj;
                if (!z) {
                    ni5[] ni5VarArr = l29.a;
                    n29Var.a(j29.j, hebVar);
                }
                String strValueOf = String.valueOf(t96.M(ii9Var.d.h() * 100.0f) / 100.0f);
                ni5[] ni5VarArr2 = l29.a;
                m29 m29Var = j29.b;
                ni5 ni5Var = l29.a[0];
                n29Var.a(m29Var, strValueOf);
                n29Var.a(u19.i, new n3((String) null, new zh9(ii9Var, 2)));
                break;
            case 4:
                List list = (List) obj2;
                at5 at5Var = (at5) obj;
                at5Var.getClass();
                at5Var.c0(list.size(), (kb4) null, new js6(14, list), new rj1(new uq2(3, list), true, 802480018));
                if (z) {
                    at5.b0(at5Var, (String) null, md2.x, 3);
                }
                break;
            default:
                a07 a07Var = (a07) obj2;
                Float f = (Float) obj;
                f.getClass();
                if (!z) {
                    a07Var.setValue(f);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ hb0(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
