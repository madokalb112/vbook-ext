package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nn8 {
    public static final km7 d = new km7(0, 0, 0, (dha) null, (iu7) null, (iy5) null, 0, 0, 511);
    public final List a;
    public km7 b;
    public mm7 c;

    public nn8(km7 km7Var, mm7 mm7Var, int i) {
        ArrayList arrayList = new ArrayList();
        km7Var = (i & 4) != 0 ? d : km7Var;
        mm7Var = (i & 8) != 0 ? new ri2() : mm7Var;
        km7Var.getClass();
        mm7Var.getClass();
        this.a = arrayList;
        this.b = km7Var;
        this.c = mm7Var;
    }

    public static boolean d(nn8 nn8Var) {
        List list = nn8Var.a;
        if (list.isEmpty()) {
            return true;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!((on8) list.get(i)).i()) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(nn8 nn8Var) {
        List list = nn8Var.a;
        if (list.isEmpty()) {
            return true;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!((on8) list.get(i)).j()) {
                return false;
            }
        }
        return true;
    }

    public final on8 a(int i) {
        List list = this.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            on8 on8Var = (on8) list.get(i2);
            if (on8Var.e.length() > 0) {
                if (i != -1) {
                    on8Var.f = xv5.d(i, i, on8Var.e);
                }
                return on8Var;
            }
            on8 on8VarB = on8Var.b(i);
            if (on8VarB != null) {
                return on8VarB;
            }
        }
        on8 on8Var2 = (on8) fc1.z0(list);
        list.clear();
        if (on8Var2 != null) {
            on8Var2.b.clear();
            if (i != -1) {
                on8Var2.f = xv5.d(i, i, on8Var2.e);
            }
            list.add(on8Var2);
        }
        return on8Var2;
    }

    public final xl7 b(int i, int i2, int i3, boolean z) {
        nn8 nn8Var;
        if (i > 0) {
            i3++;
        }
        on8 on8VarA = this.c.a();
        on8VarA.getClass();
        on8VarA.c = this;
        on8 on8VarA2 = this.c.a();
        mm7 mm7Var = this.c;
        mm7Var.getClass();
        on8VarA2.f = xv5.d(i3, i3, mm7Var.a().e);
        mm7 mm7Var2 = this.c;
        mm7Var2.getClass();
        int length = mm7Var2.a().e.length() + i3;
        List list = this.a;
        if (list.isEmpty()) {
            nn8Var = this;
            list.add(new on8(nn8Var, null, null, zk9.h(length, length), null, null, 219));
        } else {
            nn8Var = this;
        }
        if (length > i2) {
            return new xl7(Integer.valueOf(length), nn8Var.a(length));
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            xl7 xl7VarG = ((on8) list.get(i4)).g(i2, length, z);
            if (xl7VarG.b != null) {
                return xl7VarG;
            }
            length = ((Number) xl7VarG.a).intValue();
        }
        return new xl7(Integer.valueOf(length), null);
    }

    public final xl7 c(int i, int i2, long j) {
        if (i > 0) {
            i2++;
        }
        on8 on8VarA = this.c.a();
        on8VarA.getClass();
        on8VarA.c = this;
        on8 on8VarA2 = this.c.a();
        mm7 mm7Var = this.c;
        mm7Var.getClass();
        on8VarA2.f = xv5.d(i2, i2, mm7Var.a().e);
        mm7 mm7Var2 = this.c;
        mm7Var2.getClass();
        int length = mm7Var2.a().e.length() + i2;
        List list = this.a;
        if (list.isEmpty()) {
            list.add(new on8(this, null, null, zk9.h(length, length), null, null, 219));
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            xl7 xl7VarH = ((on8) list.get(i3)).h(length, j);
            arrayList.addAll((Collection) xl7VarH.b);
            length = ((Number) xl7VarH.a).intValue();
        }
        return new xl7(Integer.valueOf(length), arrayList);
    }

    public final void f(int i, long j) {
        ArrayList arrayList = new ArrayList();
        List list = this.a;
        int iS = gc1.S(list);
        if (iS >= 0) {
            int i2 = 0;
            while (true) {
                xl7 xl7VarM = ((on8) list.get(i2)).m(i, j);
                on8 on8Var = (on8) xl7VarM.b;
                if (on8Var != null) {
                    list.set(i2, on8Var);
                } else {
                    arrayList.add(Integer.valueOf(i2));
                }
                i = ((Number) xl7VarM.a).intValue();
                if (i2 == iS) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                list.isEmpty();
                return;
            }
            list.remove(((Number) arrayList.get(size)).intValue());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" - Start Text: " + this.c.a());
        sb.append('\n');
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ny1.K(sb, i, (on8) list.get(i), " -");
        }
        return sb.toString();
    }
}
