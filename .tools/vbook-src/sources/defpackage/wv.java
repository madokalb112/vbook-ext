package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wv extends dc1 {
    public final /* synthetic */ int b;
    public final qz5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv(oi5 oi5Var, int i) {
        super(oi5Var);
        this.b = i;
        oi5Var.getClass();
        switch (i) {
            case 1:
                super(oi5Var);
                m39 m39VarE = oi5Var.e();
                m39VarE.getClass();
                this.c = new uv(m39VarE, 2);
                break;
            case 2:
                super(oi5Var);
                m39 m39VarE2 = oi5Var.e();
                m39VarE2.getClass();
                this.c = new uv(m39VarE2, 3);
                break;
            default:
                m39 m39VarE3 = oi5Var.e();
                m39VarE3.getClass();
                this.c = new uv(m39VarE3, 1);
                break;
        }
    }

    @Override // defpackage.oi5
    public final m39 e() {
        switch (this.b) {
        }
        return (uv) this.c;
    }

    @Override // defpackage.h0
    public final Object f() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.h0
    public final int g(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // defpackage.h0
    public final Iterator h(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // defpackage.h0
    public final int i(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // defpackage.h0
    public final Object l(Object obj) {
        switch (this.b) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.h0
    public final Object m(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    @Override // defpackage.dc1
    public final void n(int i, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                break;
        }
    }
}
