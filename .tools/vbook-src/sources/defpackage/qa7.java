package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qa7 implements oi5 {
    public final Object a;
    public final List b;
    public final dp5 c;

    public qa7(Object obj, String str) {
        obj.getClass();
        this.a = obj;
        this.b = lc3.a;
        this.c = ex1.Z(xu5.b, new e67(2, str, this));
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        obj.getClass();
        md2Var.v(e()).a0(e());
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39VarE = e();
        am1 am1VarT = yd2Var.t(m39VarE);
        int iF = am1VarT.f(e());
        if (iF != -1) {
            throw new u39(dx1.f(iF, "Unexpected index "));
        }
        am1VarT.n(m39VarE);
        return this.a;
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return (m39) this.c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qa7(String str, Object obj, Annotation[] annotationArr) {
        this(obj, str);
        obj.getClass();
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.b = listAsList;
    }
}
