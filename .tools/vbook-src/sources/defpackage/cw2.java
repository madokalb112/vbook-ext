package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cw2 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public cw2(Comparator comparator) {
        this.a = 5;
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j;
        long j2;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                int iCompare = ((k54) obj3).compare(obj, obj2);
                if (iCompare == 0) {
                    break;
                }
                break;
            case 1:
                int iCompare2 = ((k54) obj3).compare(obj, obj2);
                if (iCompare2 == 0) {
                    break;
                }
                break;
            case 2:
                hy7 hy7Var = (hy7) obj3;
                break;
            case 3:
                fz6 fz6Var = (fz6) obj3;
                break;
            case 4:
                az6 az6Var = (az6) obj3;
                break;
            case 5:
                int iCompare3 = ((Comparator) obj3).compare(obj, obj2);
                if (iCompare3 == 0) {
                    break;
                }
                break;
            case 6:
                int iCompare4 = ((cw2) obj3).compare(obj, obj2);
                if (iCompare4 == 0) {
                    break;
                }
                break;
            case 7:
                zv5 zv5Var = (zv5) obj2;
                tk0 tk0Var = (tk0) obj3;
                int iOrdinal = tk0Var.ordinal();
                if (iOrdinal == 0) {
                    j = zv5Var.v + zv5Var.w;
                } else if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        j = zv5Var.w;
                    }
                    mn5.g();
                } else {
                    j = zv5Var.v;
                }
                Long lValueOf = Long.valueOf(j);
                zv5 zv5Var2 = (zv5) obj;
                int iOrdinal2 = tk0Var.ordinal();
                if (iOrdinal2 == 0) {
                    j2 = zv5Var2.w + zv5Var2.v;
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 == 2) {
                        j2 = zv5Var2.w;
                    }
                    mn5.g();
                } else {
                    j2 = zv5Var2.v;
                }
                break;
            case 8:
                laa laaVar = (laa) obj3;
                break;
            case 9:
                int iCompare5 = ((cd9) obj3).compare(obj, obj2);
                if (iCompare5 == 0) {
                    break;
                }
                break;
            default:
                int iCompare6 = ((cd9) obj3).compare(obj, obj2);
                if (iCompare6 == 0) {
                    break;
                }
                break;
        }
        return t1c.O(((cla) obj).a, ((cla) obj2).a);
    }

    public /* synthetic */ cw2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
