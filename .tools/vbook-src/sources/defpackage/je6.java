package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class je6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie6 b;

    public /* synthetic */ je6(ie6 ie6Var, int i) {
        this.a = i;
        this.b = ie6Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        boolean zQ;
        int i = this.a;
        int i2 = 0;
        ie6 ie6Var = this.b;
        switch (i) {
            case 0:
                zQ = lc5.Q(((Method) obj2).getReturnType(), ne6.r(obj, ie6Var, "Method: returnType"));
                break;
            case 1:
                Set set = (Set) obj;
                Annotation[] annotationArrN = ne6.n((Member) obj2);
                ArrayList arrayList = new ArrayList(annotationArrN.length);
                int length = annotationArrN.length;
                while (i2 < length) {
                    arrayList.add(tu1.M(tu1.J(annotationArrN[i2])));
                    i2++;
                }
                zQ = ne6.d(set, arrayList, ie6Var);
                break;
            case 2:
                Set set2 = (Set) obj;
                Annotation[] annotationArrN2 = ne6.n((Member) obj2);
                ArrayList arrayList2 = new ArrayList(annotationArrN2.length);
                int length2 = annotationArrN2.length;
                while (i2 < length2) {
                    arrayList2.add(tu1.M(tu1.J(annotationArrN2[i2])));
                    i2++;
                }
                zQ = !ne6.d(set2, arrayList2, ie6Var);
                break;
            default:
                zQ = lc5.Q(((Field) obj2).getType(), ne6.r(obj, ie6Var, "Field: type"));
                break;
        }
        return Boolean.valueOf(zQ);
    }
}
