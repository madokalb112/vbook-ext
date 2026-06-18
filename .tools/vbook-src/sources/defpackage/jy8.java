package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jy8 extends q2 {
    public final a91 a;
    public final dp5 b;
    public final Map c;
    public final LinkedHashMap d;

    public jy8(String str, a91 a91Var, a91[] a91VarArr, oi5[] oi5VarArr) {
        this.a = a91Var;
        this.b = ex1.Z(xu5.b, new e67(9, str, this));
        if (a91VarArr.length != oi5VarArr.length) {
            mn5.i(a91Var.g(), " should be marked @Serializable", "All subclasses of sealed class ");
            throw null;
        }
        int iMin = Math.min(a91VarArr.length, oi5VarArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new xl7(a91VarArr[i], oi5VarArr[i]));
        }
        Map mapH0 = y86.h0(arrayList);
        this.c = mapH0;
        Set<Map.Entry> setEntrySet = mapH0.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strA = ((oi5) entry.getValue()).e().a();
            Object obj = linkedHashMap.get(strA);
            if (obj == null) {
                linkedHashMap.containsKey(strA);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                sb.append(this.a);
                sb.append("' have the same serial name '");
                sb.append(strA);
                sb.append("': '");
                sb.append(entry2.getKey());
                Object key = entry.getKey();
                sb.append("', '");
                sb.append(key);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            linkedHashMap.put(strA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(y86.O(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (oi5) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.d = linkedHashMap2;
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return (m39) this.b.getValue();
    }

    @Override // defpackage.q2
    public final oi5 f(am1 am1Var, String str) {
        oi5 oi5Var = (oi5) this.d.get(str);
        return oi5Var != null ? oi5Var : super.f(am1Var, str);
    }

    @Override // defpackage.q2
    public final oi5 g(md2 md2Var, Object obj) {
        obj.getClass();
        oi5 oi5Var = (oi5) this.c.get(ug8.a(obj.getClass()));
        oi5 oi5VarG = oi5Var != null ? oi5Var : super.g(md2Var, obj);
        if (oi5VarG != null) {
            return oi5VarG;
        }
        return null;
    }

    @Override // defpackage.q2
    public final a91 h() {
        return this.a;
    }
}
