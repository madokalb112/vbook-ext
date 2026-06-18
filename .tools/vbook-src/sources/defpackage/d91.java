package defpackage;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d91 implements w39, um7 {
    public final e91 a = new e91();
    public final ub4 b;

    public d91(kb4 kb4Var) {
        this.b = kb4Var;
    }

    @Override // defpackage.um7
    public Object a(a91 a91Var, ArrayList arrayList) {
        Object pm8Var;
        Object obj = this.a.get(tu1.M(a91Var));
        obj.getClass();
        zz6 zz6Var = (zz6) obj;
        Object tm7Var = zz6Var.a.get();
        if (tm7Var == null) {
            synchronized (zz6Var) {
                tm7Var = zz6Var.a.get();
                if (tm7Var == null) {
                    tm7Var = new tm7();
                    zz6Var.a = new SoftReference(tm7Var);
                }
            }
        }
        tm7 tm7Var2 = (tm7) tm7Var;
        ArrayList arrayList2 = new ArrayList(gc1.M(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(new si5((pi5) obj2));
        }
        ConcurrentHashMap concurrentHashMap = tm7Var2.a;
        Object obj3 = concurrentHashMap.get(arrayList2);
        if (obj3 == null) {
            try {
                pm8Var = (oi5) ((yb4) this.b).invoke(a91Var, arrayList);
            } catch (Throwable th) {
                pm8Var = new pm8(th);
            }
            qm8 qm8Var = new qm8(pm8Var);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, qm8Var);
            obj3 = objPutIfAbsent == null ? qm8Var : objPutIfAbsent;
        }
        return ((qm8) obj3).a;
    }

    @Override // defpackage.w39
    public oi5 m(a91 a91Var) {
        Object obj = this.a.get(tu1.M(a91Var));
        obj.getClass();
        zz6 zz6Var = (zz6) obj;
        Object qw0Var = zz6Var.a.get();
        if (qw0Var == null) {
            synchronized (zz6Var) {
                qw0Var = zz6Var.a.get();
                if (qw0Var == null) {
                    qw0Var = new qw0((oi5) ((kb4) this.b).invoke(a91Var));
                    zz6Var.a = new SoftReference(qw0Var);
                }
            }
        }
        return ((qw0) qw0Var).a;
    }

    public d91(yb4 yb4Var) {
        this.b = yb4Var;
    }
}
