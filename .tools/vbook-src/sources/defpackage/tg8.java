package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tg8 extends dc1 {
    public final a91 b;
    public final uv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg8(a91 a91Var, oi5 oi5Var) {
        super(oi5Var);
        oi5Var.getClass();
        this.b = a91Var;
        m39 m39VarE = oi5Var.e();
        m39VarE.getClass();
        this.c = new uv(m39VarE, 0);
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return this.c;
    }

    @Override // defpackage.h0
    public final Object f() {
        return new ArrayList();
    }

    @Override // defpackage.h0
    public final int g(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.h0
    public final Iterator h(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new n1(objArr);
    }

    @Override // defpackage.h0
    public final int i(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // defpackage.h0
    public final Object l(Object obj) {
        throw null;
    }

    @Override // defpackage.h0
    public final Object m(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) tu1.M(this.b), arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }

    @Override // defpackage.dc1
    public final void n(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
