package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x5b {
    public final m62 a;
    public final rs2 b;
    public final x78 c;
    public final ds3 d;
    public final v98 e;
    public final sv8 f;
    public final Object g = new Object();
    public final HashMap h = new HashMap();

    public x5b(m62 m62Var, rs2 rs2Var, x78 x78Var, ds3 ds3Var, v98 v98Var, sv8 sv8Var) {
        this.a = m62Var;
        this.b = rs2Var;
        this.c = x78Var;
        this.d = ds3Var;
        this.e = v98Var;
        this.f = sv8Var;
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        synchronized (this.g) {
            String str3 = str2 + "-" + str;
            w5b w5bVar = (w5b) this.h.get(str3);
            if (w5bVar != null) {
                int i = w5bVar.b - 1;
                w5bVar.b = i;
                if (i == 0) {
                    w5bVar.a.close();
                    this.h.remove(str3);
                }
            }
        }
    }

    public final ArrayList b() {
        Collection collectionValues = this.h.values();
        collectionValues.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            v5b v5bVar = ((w5b) it.next()).a;
            ca8 ca8Var = v5bVar instanceof ca8 ? (ca8) v5bVar : null;
            if (ca8Var != null) {
                arrayList.add(ca8Var);
            }
        }
        return arrayList;
    }

    public final w5b c(String str, String str2) {
        Object next;
        v5b is3Var;
        if (lc5.Q(str, "qt")) {
            is3Var = new ca8(str2, this.b, this.c, this.e);
        } else {
            m62 m62Var = this.a;
            b92 b92Var = m62Var.x;
            b92Var.getClass();
            lb2 lb2Var = lb2.a;
            qj qjVar = (qj) ((yf1) b92Var).a;
            bb2 bb2Var = new bb2(b92Var, 7);
            qjVar.getClass();
            Iterator it = new af9(630744953, new String[]{"DbExtension"}, qjVar, "DbExtension.sq", "getTranslateExtension", "SELECT id, name, author, version, source, path, description, language, type, nsfw, development, draft, pinedAt, updateAt\nFROM DbExtension\nWHERE draft = 0 AND type = 6\nORDER BY pinedAt DESC, lastUse DESC, updateAt DESC", bb2Var).c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ze4) next).a.equals(str)) {
                    break;
                }
            }
            ze4 ze4Var = (ze4) next;
            ze4Var.getClass();
            is3Var = new is3(ze4Var.a, m62Var, this.d, this.f);
        }
        return new w5b(is3Var);
    }

    public final v5b d(String str, String str2) {
        Object pm8Var;
        v5b v5bVar;
        str.getClass();
        str2.getClass();
        synchronized (this.g) {
            try {
                String str3 = str + "-" + str2;
                HashMap map = this.h;
                Object objC = map.get(str3);
                if (objC == null) {
                    objC = c(str, str2);
                    map.put(str3, objC);
                }
                w5b w5bVar = (w5b) objC;
                w5bVar.b++;
                pm8Var = w5bVar.a;
            } catch (Throwable th) {
                pm8Var = new pm8(th);
            }
            if (pm8Var instanceof pm8) {
                pm8Var = null;
            }
            v5bVar = (v5b) pm8Var;
        }
        return v5bVar;
    }
}
