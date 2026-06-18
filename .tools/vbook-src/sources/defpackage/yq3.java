package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yq3 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yq3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        long j;
        Object pm8Var;
        r04 r04Var;
        Object pm8Var2;
        r04 r04Var2;
        int i = 11;
        final int i2 = 2;
        final int i3 = 1;
        final int i4 = 10;
        final int i5 = 3;
        final byte b = 0;
        switch (this.a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                return ((kx1) this.b).invoke(Integer.valueOf(iIntValue), ((List) this.c).get(iIntValue));
            case 1:
                hl2.m((AtomicBoolean) this.b, (rg8) this.c);
                return heb.a;
            case 2:
                ((Boolean) obj).booleanValue();
                ((kb4) this.b).invoke(((o54) this.c).a);
                return heb.a;
            case 3:
                return ((se3) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 4:
                int iIntValue2 = ((Number) obj).intValue();
                return ((kx1) this.b).invoke(Integer.valueOf(iIntValue2), ((List) this.c).get(iIntValue2));
            case 5:
                return ((se3) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 6:
                tj9 tj9Var = (tj9) obj;
                synchronized (vj9.c) {
                    j = vj9.e;
                    vj9.e = 1 + j;
                }
                return new yz6(j, tj9Var, (kb4) this.b, (kb4) this.c);
            case 7:
                return ((xl4) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 8:
                return ((xl4) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 9:
                ((Boolean) obj).getClass();
                ((kb4) this.b).invoke(((vl5) this.c).b);
                return heb.a;
            case 10:
                return ((fz4) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 11:
                r00 r00Var = (r00) this.b;
                Object obj2 = r00Var.b;
                ay0 ay0Var = (ay0) this.c;
                synchronized (obj2) {
                    ((ArrayList) r00Var.c).remove(ay0Var);
                }
                return heb.a;
            case 12:
                return ((rv5) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 13:
                return ((rv5) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 14:
                return ((rv5) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 15:
                return ((rv5) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 16:
                int iIntValue3 = ((Number) obj).intValue();
                return ((uq4) this.b).invoke(Integer.valueOf(iIntValue3), ((List) this.c).get(iIntValue3));
            case 17:
                Class cls = (Class) obj;
                ug6 ug6Var = (ug6) ((dj0) this.b);
                final ie6 ie6Var = (ie6) this.c;
                ie6Var.getClass();
                bv4 bv4Var = ne6.a;
                try {
                    pm8Var = fw.O0(cls.getDeclaredMethods());
                    break;
                } catch (Throwable th) {
                    pm8Var = new pm8(th);
                }
                Throwable thA = qm8.a(pm8Var);
                if (thA != null) {
                    d6a d6aVar = xi5.a;
                    xi5.a("Failed to get declared methods in " + bv4Var + " because got an exception.", thA);
                }
                if (pm8Var instanceof pm8) {
                    pm8Var = null;
                }
                Object obj3 = (List) pm8Var;
                if (obj3 == null) {
                    obj3 = lc3.a;
                }
                final int i6 = 6;
                final int i7 = 5;
                vx3 vx3VarM = ne6.m(ne6.m(ne6.m(ne6.m(ne6.a(new jc1(obj3, 0), ug6Var, ie6Var), ie6Var, "parameters", ug6Var.g, new yb4() { // from class: ke6
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj4, Object obj5) {
                        boolean zD;
                        boolean zD2;
                        int i8 = b;
                        boolean z = false;
                        ie6 ie6Var2 = ie6Var;
                        switch (i8) {
                            case 0:
                                zD = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            case 1:
                                List list = (List) obj4;
                                Annotation[][] parameterAnnotations = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                                for (Annotation[] annotationArr : parameterAnnotations) {
                                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                                    for (Annotation annotation : annotationArr) {
                                        arrayList2.add(tu1.M(tu1.J(annotation)));
                                    }
                                    arrayList.add(arrayList2);
                                }
                                if (list.size() == arrayList.size()) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int i9 = 0;
                                    for (Object obj6 : list) {
                                        int i10 = i9 + 1;
                                        if (i9 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj6, (List) arrayList.get(i9), ie6Var2)) {
                                            arrayList3.add(obj6);
                                        }
                                        i9 = i10;
                                    }
                                    if (arrayList3.size() == arrayList.size()) {
                                        z = true;
                                    }
                                }
                                return Boolean.valueOf(z);
                            case 2:
                                List list2 = (List) obj4;
                                Annotation[][] parameterAnnotations2 = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList4 = new ArrayList(parameterAnnotations2.length);
                                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                                    ArrayList arrayList5 = new ArrayList(annotationArr2.length);
                                    for (Annotation annotation2 : annotationArr2) {
                                        arrayList5.add(tu1.M(tu1.J(annotation2)));
                                    }
                                    arrayList4.add(arrayList5);
                                }
                                if (list2.size() == arrayList4.size()) {
                                    ArrayList arrayList6 = new ArrayList();
                                    int i11 = 0;
                                    for (Object obj7 : list2) {
                                        int i12 = i11 + 1;
                                        if (i11 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj7, (List) arrayList4.get(i11), ie6Var2)) {
                                            arrayList6.add(obj7);
                                        }
                                        i11 = i12;
                                    }
                                    if (arrayList6.size() == arrayList4.size()) {
                                        z = true;
                                    }
                                }
                                zD = !z;
                                return Boolean.valueOf(zD);
                            case 3:
                                zD = ne6.e(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 4:
                                zD = ne6.f(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 5:
                                zD = ne6.g(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 6:
                                zD2 = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                break;
                            case 7:
                                zD = ne6.h(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 8:
                                zD = ne6.i(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 9:
                                zD = ne6.j(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 10:
                                zD = ne6.k(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 11:
                                zD = ne6.l(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 12:
                                zD = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            default:
                                zD2 = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                break;
                        }
                        zD = !zD2;
                        return Boolean.valueOf(zD);
                    }
                }), ie6Var, "parametersNot", ug6Var.h, new yb4() { // from class: ke6
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj4, Object obj5) {
                        boolean zD;
                        boolean zD2;
                        int i8 = i6;
                        boolean z = false;
                        ie6 ie6Var2 = ie6Var;
                        switch (i8) {
                            case 0:
                                zD = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            case 1:
                                List list = (List) obj4;
                                Annotation[][] parameterAnnotations = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                                for (Annotation[] annotationArr : parameterAnnotations) {
                                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                                    for (Annotation annotation : annotationArr) {
                                        arrayList2.add(tu1.M(tu1.J(annotation)));
                                    }
                                    arrayList.add(arrayList2);
                                }
                                if (list.size() == arrayList.size()) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int i9 = 0;
                                    for (Object obj6 : list) {
                                        int i10 = i9 + 1;
                                        if (i9 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj6, (List) arrayList.get(i9), ie6Var2)) {
                                            arrayList3.add(obj6);
                                        }
                                        i9 = i10;
                                    }
                                    if (arrayList3.size() == arrayList.size()) {
                                        z = true;
                                    }
                                }
                                return Boolean.valueOf(z);
                            case 2:
                                List list2 = (List) obj4;
                                Annotation[][] parameterAnnotations2 = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList4 = new ArrayList(parameterAnnotations2.length);
                                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                                    ArrayList arrayList5 = new ArrayList(annotationArr2.length);
                                    for (Annotation annotation2 : annotationArr2) {
                                        arrayList5.add(tu1.M(tu1.J(annotation2)));
                                    }
                                    arrayList4.add(arrayList5);
                                }
                                if (list2.size() == arrayList4.size()) {
                                    ArrayList arrayList6 = new ArrayList();
                                    int i11 = 0;
                                    for (Object obj7 : list2) {
                                        int i12 = i11 + 1;
                                        if (i11 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj7, (List) arrayList4.get(i11), ie6Var2)) {
                                            arrayList6.add(obj7);
                                        }
                                        i11 = i12;
                                    }
                                    if (arrayList6.size() == arrayList4.size()) {
                                        z = true;
                                    }
                                }
                                zD = !z;
                                return Boolean.valueOf(zD);
                            case 3:
                                zD = ne6.e(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 4:
                                zD = ne6.f(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 5:
                                zD = ne6.g(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 6:
                                zD2 = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                break;
                            case 7:
                                zD = ne6.h(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 8:
                                zD = ne6.i(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 9:
                                zD = ne6.j(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 10:
                                zD = ne6.k(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 11:
                                zD = ne6.l(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 12:
                                zD = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            default:
                                zD2 = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                break;
                        }
                        zD = !zD2;
                        return Boolean.valueOf(zD);
                    }
                }), ie6Var, "parametersCondition", null, new yb4() { // from class: le6
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
                    @Override // defpackage.yb4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
                        /*
                            Method dump skipped, instruction units count: 602
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.le6.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }), ie6Var, "parameterCount", null, new yb4() { // from class: le6
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
                    @Override // defpackage.yb4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
                        /*
                            Method dump skipped, instruction units count: 602
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.le6.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                });
                final int i8 = 7;
                final int i9 = 8;
                final int i10 = 9;
                final int i11 = 12;
                final int i12 = 13;
                vx3 vx3VarM2 = ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(vx3VarM, ie6Var, "parameterCountCondition", null, new yb4() { // from class: le6
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
                    @Override // defpackage.yb4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
                        /*
                            Method dump skipped, instruction units count: 602
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.le6.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }), ie6Var, "typeParameters", ug6Var.i, new yb4() { // from class: le6
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
                    @Override // defpackage.yb4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
                        /*
                            Method dump skipped, instruction units count: 602
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.le6.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }), ie6Var, "typeParametersNot", ug6Var.j, new yb4() { // from class: le6
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
                    @Override // defpackage.yb4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
                        /*
                            Method dump skipped, instruction units count: 602
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.le6.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }), ie6Var, "exceptionTypes", ug6Var.k, new yb4() { // from class: ke6
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj4, Object obj5) {
                        boolean zD;
                        boolean zD2;
                        int i82 = i11;
                        boolean z = false;
                        ie6 ie6Var2 = ie6Var;
                        switch (i82) {
                            case 0:
                                zD = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            case 1:
                                List list = (List) obj4;
                                Annotation[][] parameterAnnotations = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                                for (Annotation[] annotationArr : parameterAnnotations) {
                                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                                    for (Annotation annotation : annotationArr) {
                                        arrayList2.add(tu1.M(tu1.J(annotation)));
                                    }
                                    arrayList.add(arrayList2);
                                }
                                if (list.size() == arrayList.size()) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int i92 = 0;
                                    for (Object obj6 : list) {
                                        int i102 = i92 + 1;
                                        if (i92 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj6, (List) arrayList.get(i92), ie6Var2)) {
                                            arrayList3.add(obj6);
                                        }
                                        i92 = i102;
                                    }
                                    if (arrayList3.size() == arrayList.size()) {
                                        z = true;
                                    }
                                }
                                return Boolean.valueOf(z);
                            case 2:
                                List list2 = (List) obj4;
                                Annotation[][] parameterAnnotations2 = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList4 = new ArrayList(parameterAnnotations2.length);
                                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                                    ArrayList arrayList5 = new ArrayList(annotationArr2.length);
                                    for (Annotation annotation2 : annotationArr2) {
                                        arrayList5.add(tu1.M(tu1.J(annotation2)));
                                    }
                                    arrayList4.add(arrayList5);
                                }
                                if (list2.size() == arrayList4.size()) {
                                    ArrayList arrayList6 = new ArrayList();
                                    int i112 = 0;
                                    for (Object obj7 : list2) {
                                        int i122 = i112 + 1;
                                        if (i112 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj7, (List) arrayList4.get(i112), ie6Var2)) {
                                            arrayList6.add(obj7);
                                        }
                                        i112 = i122;
                                    }
                                    if (arrayList6.size() == arrayList4.size()) {
                                        z = true;
                                    }
                                }
                                zD = !z;
                                return Boolean.valueOf(zD);
                            case 3:
                                zD = ne6.e(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 4:
                                zD = ne6.f(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 5:
                                zD = ne6.g(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 6:
                                zD2 = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                break;
                            case 7:
                                zD = ne6.h(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 8:
                                zD = ne6.i(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 9:
                                zD = ne6.j(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 10:
                                zD = ne6.k(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 11:
                                zD = ne6.l(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 12:
                                zD = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            default:
                                zD2 = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                break;
                        }
                        zD = !zD2;
                        return Boolean.valueOf(zD);
                    }
                }), ie6Var, "exceptionTypesNot", ug6Var.l, new yb4() { // from class: ke6
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj4, Object obj5) {
                        boolean zD;
                        boolean zD2;
                        int i82 = i12;
                        boolean z = false;
                        ie6 ie6Var2 = ie6Var;
                        switch (i82) {
                            case 0:
                                zD = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            case 1:
                                List list = (List) obj4;
                                Annotation[][] parameterAnnotations = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                                for (Annotation[] annotationArr : parameterAnnotations) {
                                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                                    for (Annotation annotation : annotationArr) {
                                        arrayList2.add(tu1.M(tu1.J(annotation)));
                                    }
                                    arrayList.add(arrayList2);
                                }
                                if (list.size() == arrayList.size()) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int i92 = 0;
                                    for (Object obj6 : list) {
                                        int i102 = i92 + 1;
                                        if (i92 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj6, (List) arrayList.get(i92), ie6Var2)) {
                                            arrayList3.add(obj6);
                                        }
                                        i92 = i102;
                                    }
                                    if (arrayList3.size() == arrayList.size()) {
                                        z = true;
                                    }
                                }
                                return Boolean.valueOf(z);
                            case 2:
                                List list2 = (List) obj4;
                                Annotation[][] parameterAnnotations2 = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList4 = new ArrayList(parameterAnnotations2.length);
                                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                                    ArrayList arrayList5 = new ArrayList(annotationArr2.length);
                                    for (Annotation annotation2 : annotationArr2) {
                                        arrayList5.add(tu1.M(tu1.J(annotation2)));
                                    }
                                    arrayList4.add(arrayList5);
                                }
                                if (list2.size() == arrayList4.size()) {
                                    ArrayList arrayList6 = new ArrayList();
                                    int i112 = 0;
                                    for (Object obj7 : list2) {
                                        int i122 = i112 + 1;
                                        if (i112 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj7, (List) arrayList4.get(i112), ie6Var2)) {
                                            arrayList6.add(obj7);
                                        }
                                        i112 = i122;
                                    }
                                    if (arrayList6.size() == arrayList4.size()) {
                                        z = true;
                                    }
                                }
                                zD = !z;
                                return Boolean.valueOf(zD);
                            case 3:
                                zD = ne6.e(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 4:
                                zD = ne6.f(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 5:
                                zD = ne6.g(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 6:
                                zD2 = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                break;
                            case 7:
                                zD = ne6.h(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 8:
                                zD = ne6.i(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 9:
                                zD = ne6.j(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 10:
                                zD = ne6.k(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 11:
                                zD = ne6.l(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 12:
                                zD = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            default:
                                zD2 = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                break;
                        }
                        zD = !zD2;
                        return Boolean.valueOf(zD);
                    }
                }), ie6Var, "genericExceptionTypes", ug6Var.m, new yb4() { // from class: le6
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
                    @Override // defpackage.yb4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
                        /*
                            Method dump skipped, instruction units count: 602
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.le6.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }), ie6Var, "genericExceptionTypesNot", ug6Var.n, new yb4() { // from class: le6
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
                    @Override // defpackage.yb4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
                        /*
                            Method dump skipped, instruction units count: 602
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.le6.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }), ie6Var, "genericParameters", ug6Var.o, new yb4() { // from class: le6
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
                    @Override // defpackage.yb4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
                        /*
                            Method dump skipped, instruction units count: 602
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.le6.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }), ie6Var, "genericParametersNot", ug6Var.p, new yb4() { // from class: le6
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
                    @Override // defpackage.yb4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
                        /*
                            Method dump skipped, instruction units count: 602
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.le6.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }), ie6Var, "isVarArgs", null, new yb4() { // from class: le6
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
                    @Override // defpackage.yb4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
                        /*
                            Method dump skipped, instruction units count: 602
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.le6.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                });
                final int i13 = 4;
                final int i14 = 8;
                final int i15 = 9;
                final int i16 = 11;
                vx3 vx3VarM3 = ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(vx3VarM2, ie6Var, "isVarArgsNot", null, new yb4() { // from class: le6
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
                    @Override // defpackage.yb4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
                        /*
                            Method dump skipped, instruction units count: 602
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.le6.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }), ie6Var, "parameterAnnotations", ug6Var.q, new yb4() { // from class: ke6
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj4, Object obj5) {
                        boolean zD;
                        boolean zD2;
                        int i82 = i3;
                        boolean z = false;
                        ie6 ie6Var2 = ie6Var;
                        switch (i82) {
                            case 0:
                                zD = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            case 1:
                                List list = (List) obj4;
                                Annotation[][] parameterAnnotations = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                                for (Annotation[] annotationArr : parameterAnnotations) {
                                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                                    for (Annotation annotation : annotationArr) {
                                        arrayList2.add(tu1.M(tu1.J(annotation)));
                                    }
                                    arrayList.add(arrayList2);
                                }
                                if (list.size() == arrayList.size()) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int i92 = 0;
                                    for (Object obj6 : list) {
                                        int i102 = i92 + 1;
                                        if (i92 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj6, (List) arrayList.get(i92), ie6Var2)) {
                                            arrayList3.add(obj6);
                                        }
                                        i92 = i102;
                                    }
                                    if (arrayList3.size() == arrayList.size()) {
                                        z = true;
                                    }
                                }
                                return Boolean.valueOf(z);
                            case 2:
                                List list2 = (List) obj4;
                                Annotation[][] parameterAnnotations2 = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList4 = new ArrayList(parameterAnnotations2.length);
                                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                                    ArrayList arrayList5 = new ArrayList(annotationArr2.length);
                                    for (Annotation annotation2 : annotationArr2) {
                                        arrayList5.add(tu1.M(tu1.J(annotation2)));
                                    }
                                    arrayList4.add(arrayList5);
                                }
                                if (list2.size() == arrayList4.size()) {
                                    ArrayList arrayList6 = new ArrayList();
                                    int i112 = 0;
                                    for (Object obj7 : list2) {
                                        int i122 = i112 + 1;
                                        if (i112 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj7, (List) arrayList4.get(i112), ie6Var2)) {
                                            arrayList6.add(obj7);
                                        }
                                        i112 = i122;
                                    }
                                    if (arrayList6.size() == arrayList4.size()) {
                                        z = true;
                                    }
                                }
                                zD = !z;
                                return Boolean.valueOf(zD);
                            case 3:
                                zD = ne6.e(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 4:
                                zD = ne6.f(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 5:
                                zD = ne6.g(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 6:
                                zD2 = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                break;
                            case 7:
                                zD = ne6.h(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 8:
                                zD = ne6.i(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 9:
                                zD = ne6.j(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 10:
                                zD = ne6.k(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 11:
                                zD = ne6.l(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 12:
                                zD = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            default:
                                zD2 = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                break;
                        }
                        zD = !zD2;
                        return Boolean.valueOf(zD);
                    }
                }), ie6Var, "parameterAnnotationsNot", ug6Var.r, new yb4() { // from class: ke6
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj4, Object obj5) {
                        boolean zD;
                        boolean zD2;
                        int i82 = i2;
                        boolean z = false;
                        ie6 ie6Var2 = ie6Var;
                        switch (i82) {
                            case 0:
                                zD = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            case 1:
                                List list = (List) obj4;
                                Annotation[][] parameterAnnotations = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                                for (Annotation[] annotationArr : parameterAnnotations) {
                                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                                    for (Annotation annotation : annotationArr) {
                                        arrayList2.add(tu1.M(tu1.J(annotation)));
                                    }
                                    arrayList.add(arrayList2);
                                }
                                if (list.size() == arrayList.size()) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int i92 = 0;
                                    for (Object obj6 : list) {
                                        int i102 = i92 + 1;
                                        if (i92 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj6, (List) arrayList.get(i92), ie6Var2)) {
                                            arrayList3.add(obj6);
                                        }
                                        i92 = i102;
                                    }
                                    if (arrayList3.size() == arrayList.size()) {
                                        z = true;
                                    }
                                }
                                return Boolean.valueOf(z);
                            case 2:
                                List list2 = (List) obj4;
                                Annotation[][] parameterAnnotations2 = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList4 = new ArrayList(parameterAnnotations2.length);
                                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                                    ArrayList arrayList5 = new ArrayList(annotationArr2.length);
                                    for (Annotation annotation2 : annotationArr2) {
                                        arrayList5.add(tu1.M(tu1.J(annotation2)));
                                    }
                                    arrayList4.add(arrayList5);
                                }
                                if (list2.size() == arrayList4.size()) {
                                    ArrayList arrayList6 = new ArrayList();
                                    int i112 = 0;
                                    for (Object obj7 : list2) {
                                        int i122 = i112 + 1;
                                        if (i112 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj7, (List) arrayList4.get(i112), ie6Var2)) {
                                            arrayList6.add(obj7);
                                        }
                                        i112 = i122;
                                    }
                                    if (arrayList6.size() == arrayList4.size()) {
                                        z = true;
                                    }
                                }
                                zD = !z;
                                return Boolean.valueOf(zD);
                            case 3:
                                zD = ne6.e(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 4:
                                zD = ne6.f(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 5:
                                zD = ne6.g(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 6:
                                zD2 = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                break;
                            case 7:
                                zD = ne6.h(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 8:
                                zD = ne6.i(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 9:
                                zD = ne6.j(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 10:
                                zD = ne6.k(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 11:
                                zD = ne6.l(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 12:
                                zD = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            default:
                                zD2 = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                break;
                        }
                        zD = !zD2;
                        return Boolean.valueOf(zD);
                    }
                }), ie6Var, "annotatedReturnType", ug6Var.s, new yb4() { // from class: ke6
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj4, Object obj5) {
                        boolean zD;
                        boolean zD2;
                        int i82 = i5;
                        boolean z = false;
                        ie6 ie6Var2 = ie6Var;
                        switch (i82) {
                            case 0:
                                zD = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            case 1:
                                List list = (List) obj4;
                                Annotation[][] parameterAnnotations = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                                for (Annotation[] annotationArr : parameterAnnotations) {
                                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                                    for (Annotation annotation : annotationArr) {
                                        arrayList2.add(tu1.M(tu1.J(annotation)));
                                    }
                                    arrayList.add(arrayList2);
                                }
                                if (list.size() == arrayList.size()) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int i92 = 0;
                                    for (Object obj6 : list) {
                                        int i102 = i92 + 1;
                                        if (i92 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj6, (List) arrayList.get(i92), ie6Var2)) {
                                            arrayList3.add(obj6);
                                        }
                                        i92 = i102;
                                    }
                                    if (arrayList3.size() == arrayList.size()) {
                                        z = true;
                                    }
                                }
                                return Boolean.valueOf(z);
                            case 2:
                                List list2 = (List) obj4;
                                Annotation[][] parameterAnnotations2 = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList4 = new ArrayList(parameterAnnotations2.length);
                                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                                    ArrayList arrayList5 = new ArrayList(annotationArr2.length);
                                    for (Annotation annotation2 : annotationArr2) {
                                        arrayList5.add(tu1.M(tu1.J(annotation2)));
                                    }
                                    arrayList4.add(arrayList5);
                                }
                                if (list2.size() == arrayList4.size()) {
                                    ArrayList arrayList6 = new ArrayList();
                                    int i112 = 0;
                                    for (Object obj7 : list2) {
                                        int i122 = i112 + 1;
                                        if (i112 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj7, (List) arrayList4.get(i112), ie6Var2)) {
                                            arrayList6.add(obj7);
                                        }
                                        i112 = i122;
                                    }
                                    if (arrayList6.size() == arrayList4.size()) {
                                        z = true;
                                    }
                                }
                                zD = !z;
                                return Boolean.valueOf(zD);
                            case 3:
                                zD = ne6.e(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 4:
                                zD = ne6.f(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 5:
                                zD = ne6.g(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 6:
                                zD2 = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                break;
                            case 7:
                                zD = ne6.h(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 8:
                                zD = ne6.i(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 9:
                                zD = ne6.j(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 10:
                                zD = ne6.k(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 11:
                                zD = ne6.l(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 12:
                                zD = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            default:
                                zD2 = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                break;
                        }
                        zD = !zD2;
                        return Boolean.valueOf(zD);
                    }
                }), ie6Var, "annotatedReturnTypeNot", ug6Var.t, new yb4() { // from class: ke6
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj4, Object obj5) {
                        boolean zD;
                        boolean zD2;
                        int i82 = i13;
                        boolean z = false;
                        ie6 ie6Var2 = ie6Var;
                        switch (i82) {
                            case 0:
                                zD = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            case 1:
                                List list = (List) obj4;
                                Annotation[][] parameterAnnotations = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                                for (Annotation[] annotationArr : parameterAnnotations) {
                                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                                    for (Annotation annotation : annotationArr) {
                                        arrayList2.add(tu1.M(tu1.J(annotation)));
                                    }
                                    arrayList.add(arrayList2);
                                }
                                if (list.size() == arrayList.size()) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int i92 = 0;
                                    for (Object obj6 : list) {
                                        int i102 = i92 + 1;
                                        if (i92 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj6, (List) arrayList.get(i92), ie6Var2)) {
                                            arrayList3.add(obj6);
                                        }
                                        i92 = i102;
                                    }
                                    if (arrayList3.size() == arrayList.size()) {
                                        z = true;
                                    }
                                }
                                return Boolean.valueOf(z);
                            case 2:
                                List list2 = (List) obj4;
                                Annotation[][] parameterAnnotations2 = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList4 = new ArrayList(parameterAnnotations2.length);
                                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                                    ArrayList arrayList5 = new ArrayList(annotationArr2.length);
                                    for (Annotation annotation2 : annotationArr2) {
                                        arrayList5.add(tu1.M(tu1.J(annotation2)));
                                    }
                                    arrayList4.add(arrayList5);
                                }
                                if (list2.size() == arrayList4.size()) {
                                    ArrayList arrayList6 = new ArrayList();
                                    int i112 = 0;
                                    for (Object obj7 : list2) {
                                        int i122 = i112 + 1;
                                        if (i112 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj7, (List) arrayList4.get(i112), ie6Var2)) {
                                            arrayList6.add(obj7);
                                        }
                                        i112 = i122;
                                    }
                                    if (arrayList6.size() == arrayList4.size()) {
                                        z = true;
                                    }
                                }
                                zD = !z;
                                return Boolean.valueOf(zD);
                            case 3:
                                zD = ne6.e(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 4:
                                zD = ne6.f(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 5:
                                zD = ne6.g(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 6:
                                zD2 = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                break;
                            case 7:
                                zD = ne6.h(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 8:
                                zD = ne6.i(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 9:
                                zD = ne6.j(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 10:
                                zD = ne6.k(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 11:
                                zD = ne6.l(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 12:
                                zD = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            default:
                                zD2 = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                break;
                        }
                        zD = !zD2;
                        return Boolean.valueOf(zD);
                    }
                }), ie6Var, "annotatedReceiverType", ug6Var.u, new yb4() { // from class: ke6
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj4, Object obj5) {
                        boolean zD;
                        boolean zD2;
                        int i82 = i7;
                        boolean z = false;
                        ie6 ie6Var2 = ie6Var;
                        switch (i82) {
                            case 0:
                                zD = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            case 1:
                                List list = (List) obj4;
                                Annotation[][] parameterAnnotations = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                                for (Annotation[] annotationArr : parameterAnnotations) {
                                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                                    for (Annotation annotation : annotationArr) {
                                        arrayList2.add(tu1.M(tu1.J(annotation)));
                                    }
                                    arrayList.add(arrayList2);
                                }
                                if (list.size() == arrayList.size()) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int i92 = 0;
                                    for (Object obj6 : list) {
                                        int i102 = i92 + 1;
                                        if (i92 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj6, (List) arrayList.get(i92), ie6Var2)) {
                                            arrayList3.add(obj6);
                                        }
                                        i92 = i102;
                                    }
                                    if (arrayList3.size() == arrayList.size()) {
                                        z = true;
                                    }
                                }
                                return Boolean.valueOf(z);
                            case 2:
                                List list2 = (List) obj4;
                                Annotation[][] parameterAnnotations2 = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList4 = new ArrayList(parameterAnnotations2.length);
                                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                                    ArrayList arrayList5 = new ArrayList(annotationArr2.length);
                                    for (Annotation annotation2 : annotationArr2) {
                                        arrayList5.add(tu1.M(tu1.J(annotation2)));
                                    }
                                    arrayList4.add(arrayList5);
                                }
                                if (list2.size() == arrayList4.size()) {
                                    ArrayList arrayList6 = new ArrayList();
                                    int i112 = 0;
                                    for (Object obj7 : list2) {
                                        int i122 = i112 + 1;
                                        if (i112 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj7, (List) arrayList4.get(i112), ie6Var2)) {
                                            arrayList6.add(obj7);
                                        }
                                        i112 = i122;
                                    }
                                    if (arrayList6.size() == arrayList4.size()) {
                                        z = true;
                                    }
                                }
                                zD = !z;
                                return Boolean.valueOf(zD);
                            case 3:
                                zD = ne6.e(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 4:
                                zD = ne6.f(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 5:
                                zD = ne6.g(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 6:
                                zD2 = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                break;
                            case 7:
                                zD = ne6.h(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 8:
                                zD = ne6.i(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 9:
                                zD = ne6.j(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 10:
                                zD = ne6.k(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 11:
                                zD = ne6.l(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 12:
                                zD = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            default:
                                zD2 = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                break;
                        }
                        zD = !zD2;
                        return Boolean.valueOf(zD);
                    }
                }), ie6Var, "annotatedReceiverTypeNot", ug6Var.v, new yb4() { // from class: ke6
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj4, Object obj5) {
                        boolean zD;
                        boolean zD2;
                        int i82 = i8;
                        boolean z = false;
                        ie6 ie6Var2 = ie6Var;
                        switch (i82) {
                            case 0:
                                zD = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            case 1:
                                List list = (List) obj4;
                                Annotation[][] parameterAnnotations = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                                for (Annotation[] annotationArr : parameterAnnotations) {
                                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                                    for (Annotation annotation : annotationArr) {
                                        arrayList2.add(tu1.M(tu1.J(annotation)));
                                    }
                                    arrayList.add(arrayList2);
                                }
                                if (list.size() == arrayList.size()) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int i92 = 0;
                                    for (Object obj6 : list) {
                                        int i102 = i92 + 1;
                                        if (i92 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj6, (List) arrayList.get(i92), ie6Var2)) {
                                            arrayList3.add(obj6);
                                        }
                                        i92 = i102;
                                    }
                                    if (arrayList3.size() == arrayList.size()) {
                                        z = true;
                                    }
                                }
                                return Boolean.valueOf(z);
                            case 2:
                                List list2 = (List) obj4;
                                Annotation[][] parameterAnnotations2 = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList4 = new ArrayList(parameterAnnotations2.length);
                                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                                    ArrayList arrayList5 = new ArrayList(annotationArr2.length);
                                    for (Annotation annotation2 : annotationArr2) {
                                        arrayList5.add(tu1.M(tu1.J(annotation2)));
                                    }
                                    arrayList4.add(arrayList5);
                                }
                                if (list2.size() == arrayList4.size()) {
                                    ArrayList arrayList6 = new ArrayList();
                                    int i112 = 0;
                                    for (Object obj7 : list2) {
                                        int i122 = i112 + 1;
                                        if (i112 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj7, (List) arrayList4.get(i112), ie6Var2)) {
                                            arrayList6.add(obj7);
                                        }
                                        i112 = i122;
                                    }
                                    if (arrayList6.size() == arrayList4.size()) {
                                        z = true;
                                    }
                                }
                                zD = !z;
                                return Boolean.valueOf(zD);
                            case 3:
                                zD = ne6.e(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 4:
                                zD = ne6.f(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 5:
                                zD = ne6.g(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 6:
                                zD2 = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                break;
                            case 7:
                                zD = ne6.h(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 8:
                                zD = ne6.i(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 9:
                                zD = ne6.j(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 10:
                                zD = ne6.k(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 11:
                                zD = ne6.l(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 12:
                                zD = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            default:
                                zD2 = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                break;
                        }
                        zD = !zD2;
                        return Boolean.valueOf(zD);
                    }
                }), ie6Var, "annotatedParameterTypes", ug6Var.w, new yb4() { // from class: ke6
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj4, Object obj5) {
                        boolean zD;
                        boolean zD2;
                        int i82 = i14;
                        boolean z = false;
                        ie6 ie6Var2 = ie6Var;
                        switch (i82) {
                            case 0:
                                zD = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            case 1:
                                List list = (List) obj4;
                                Annotation[][] parameterAnnotations = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                                for (Annotation[] annotationArr : parameterAnnotations) {
                                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                                    for (Annotation annotation : annotationArr) {
                                        arrayList2.add(tu1.M(tu1.J(annotation)));
                                    }
                                    arrayList.add(arrayList2);
                                }
                                if (list.size() == arrayList.size()) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int i92 = 0;
                                    for (Object obj6 : list) {
                                        int i102 = i92 + 1;
                                        if (i92 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj6, (List) arrayList.get(i92), ie6Var2)) {
                                            arrayList3.add(obj6);
                                        }
                                        i92 = i102;
                                    }
                                    if (arrayList3.size() == arrayList.size()) {
                                        z = true;
                                    }
                                }
                                return Boolean.valueOf(z);
                            case 2:
                                List list2 = (List) obj4;
                                Annotation[][] parameterAnnotations2 = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList4 = new ArrayList(parameterAnnotations2.length);
                                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                                    ArrayList arrayList5 = new ArrayList(annotationArr2.length);
                                    for (Annotation annotation2 : annotationArr2) {
                                        arrayList5.add(tu1.M(tu1.J(annotation2)));
                                    }
                                    arrayList4.add(arrayList5);
                                }
                                if (list2.size() == arrayList4.size()) {
                                    ArrayList arrayList6 = new ArrayList();
                                    int i112 = 0;
                                    for (Object obj7 : list2) {
                                        int i122 = i112 + 1;
                                        if (i112 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj7, (List) arrayList4.get(i112), ie6Var2)) {
                                            arrayList6.add(obj7);
                                        }
                                        i112 = i122;
                                    }
                                    if (arrayList6.size() == arrayList4.size()) {
                                        z = true;
                                    }
                                }
                                zD = !z;
                                return Boolean.valueOf(zD);
                            case 3:
                                zD = ne6.e(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 4:
                                zD = ne6.f(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 5:
                                zD = ne6.g(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 6:
                                zD2 = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                break;
                            case 7:
                                zD = ne6.h(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 8:
                                zD = ne6.i(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 9:
                                zD = ne6.j(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 10:
                                zD = ne6.k(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 11:
                                zD = ne6.l(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 12:
                                zD = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            default:
                                zD2 = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                break;
                        }
                        zD = !zD2;
                        return Boolean.valueOf(zD);
                    }
                }), ie6Var, "annotatedParameterTypesNot", ug6Var.x, new yb4() { // from class: ke6
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj4, Object obj5) {
                        boolean zD;
                        boolean zD2;
                        int i82 = i15;
                        boolean z = false;
                        ie6 ie6Var2 = ie6Var;
                        switch (i82) {
                            case 0:
                                zD = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            case 1:
                                List list = (List) obj4;
                                Annotation[][] parameterAnnotations = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                                for (Annotation[] annotationArr : parameterAnnotations) {
                                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                                    for (Annotation annotation : annotationArr) {
                                        arrayList2.add(tu1.M(tu1.J(annotation)));
                                    }
                                    arrayList.add(arrayList2);
                                }
                                if (list.size() == arrayList.size()) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int i92 = 0;
                                    for (Object obj6 : list) {
                                        int i102 = i92 + 1;
                                        if (i92 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj6, (List) arrayList.get(i92), ie6Var2)) {
                                            arrayList3.add(obj6);
                                        }
                                        i92 = i102;
                                    }
                                    if (arrayList3.size() == arrayList.size()) {
                                        z = true;
                                    }
                                }
                                return Boolean.valueOf(z);
                            case 2:
                                List list2 = (List) obj4;
                                Annotation[][] parameterAnnotations2 = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList4 = new ArrayList(parameterAnnotations2.length);
                                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                                    ArrayList arrayList5 = new ArrayList(annotationArr2.length);
                                    for (Annotation annotation2 : annotationArr2) {
                                        arrayList5.add(tu1.M(tu1.J(annotation2)));
                                    }
                                    arrayList4.add(arrayList5);
                                }
                                if (list2.size() == arrayList4.size()) {
                                    ArrayList arrayList6 = new ArrayList();
                                    int i112 = 0;
                                    for (Object obj7 : list2) {
                                        int i122 = i112 + 1;
                                        if (i112 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj7, (List) arrayList4.get(i112), ie6Var2)) {
                                            arrayList6.add(obj7);
                                        }
                                        i112 = i122;
                                    }
                                    if (arrayList6.size() == arrayList4.size()) {
                                        z = true;
                                    }
                                }
                                zD = !z;
                                return Boolean.valueOf(zD);
                            case 3:
                                zD = ne6.e(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 4:
                                zD = ne6.f(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 5:
                                zD = ne6.g(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 6:
                                zD2 = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                break;
                            case 7:
                                zD = ne6.h(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 8:
                                zD = ne6.i(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 9:
                                zD = ne6.j(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 10:
                                zD = ne6.k(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 11:
                                zD = ne6.l(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 12:
                                zD = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            default:
                                zD2 = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                break;
                        }
                        zD = !zD2;
                        return Boolean.valueOf(zD);
                    }
                }), ie6Var, "annotatedExceptionTypes", ug6Var.y, new yb4() { // from class: ke6
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj4, Object obj5) {
                        boolean zD;
                        boolean zD2;
                        int i82 = i4;
                        boolean z = false;
                        ie6 ie6Var2 = ie6Var;
                        switch (i82) {
                            case 0:
                                zD = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            case 1:
                                List list = (List) obj4;
                                Annotation[][] parameterAnnotations = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                                for (Annotation[] annotationArr : parameterAnnotations) {
                                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                                    for (Annotation annotation : annotationArr) {
                                        arrayList2.add(tu1.M(tu1.J(annotation)));
                                    }
                                    arrayList.add(arrayList2);
                                }
                                if (list.size() == arrayList.size()) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int i92 = 0;
                                    for (Object obj6 : list) {
                                        int i102 = i92 + 1;
                                        if (i92 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj6, (List) arrayList.get(i92), ie6Var2)) {
                                            arrayList3.add(obj6);
                                        }
                                        i92 = i102;
                                    }
                                    if (arrayList3.size() == arrayList.size()) {
                                        z = true;
                                    }
                                }
                                return Boolean.valueOf(z);
                            case 2:
                                List list2 = (List) obj4;
                                Annotation[][] parameterAnnotations2 = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList4 = new ArrayList(parameterAnnotations2.length);
                                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                                    ArrayList arrayList5 = new ArrayList(annotationArr2.length);
                                    for (Annotation annotation2 : annotationArr2) {
                                        arrayList5.add(tu1.M(tu1.J(annotation2)));
                                    }
                                    arrayList4.add(arrayList5);
                                }
                                if (list2.size() == arrayList4.size()) {
                                    ArrayList arrayList6 = new ArrayList();
                                    int i112 = 0;
                                    for (Object obj7 : list2) {
                                        int i122 = i112 + 1;
                                        if (i112 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj7, (List) arrayList4.get(i112), ie6Var2)) {
                                            arrayList6.add(obj7);
                                        }
                                        i112 = i122;
                                    }
                                    if (arrayList6.size() == arrayList4.size()) {
                                        z = true;
                                    }
                                }
                                zD = !z;
                                return Boolean.valueOf(zD);
                            case 3:
                                zD = ne6.e(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 4:
                                zD = ne6.f(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 5:
                                zD = ne6.g(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 6:
                                zD2 = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                break;
                            case 7:
                                zD = ne6.h(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 8:
                                zD = ne6.i(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 9:
                                zD = ne6.j(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 10:
                                zD = ne6.k(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 11:
                                zD = ne6.l(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 12:
                                zD = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            default:
                                zD2 = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                break;
                        }
                        zD = !zD2;
                        return Boolean.valueOf(zD);
                    }
                }), ie6Var, "annotatedExceptionTypesNot", ug6Var.z, new yb4() { // from class: ke6
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj4, Object obj5) {
                        boolean zD;
                        boolean zD2;
                        int i82 = i16;
                        boolean z = false;
                        ie6 ie6Var2 = ie6Var;
                        switch (i82) {
                            case 0:
                                zD = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            case 1:
                                List list = (List) obj4;
                                Annotation[][] parameterAnnotations = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                                for (Annotation[] annotationArr : parameterAnnotations) {
                                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                                    for (Annotation annotation : annotationArr) {
                                        arrayList2.add(tu1.M(tu1.J(annotation)));
                                    }
                                    arrayList.add(arrayList2);
                                }
                                if (list.size() == arrayList.size()) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int i92 = 0;
                                    for (Object obj6 : list) {
                                        int i102 = i92 + 1;
                                        if (i92 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj6, (List) arrayList.get(i92), ie6Var2)) {
                                            arrayList3.add(obj6);
                                        }
                                        i92 = i102;
                                    }
                                    if (arrayList3.size() == arrayList.size()) {
                                        z = true;
                                    }
                                }
                                return Boolean.valueOf(z);
                            case 2:
                                List list2 = (List) obj4;
                                Annotation[][] parameterAnnotations2 = ((Executable) obj5).getParameterAnnotations();
                                ArrayList arrayList4 = new ArrayList(parameterAnnotations2.length);
                                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                                    ArrayList arrayList5 = new ArrayList(annotationArr2.length);
                                    for (Annotation annotation2 : annotationArr2) {
                                        arrayList5.add(tu1.M(tu1.J(annotation2)));
                                    }
                                    arrayList4.add(arrayList5);
                                }
                                if (list2.size() == arrayList4.size()) {
                                    ArrayList arrayList6 = new ArrayList();
                                    int i112 = 0;
                                    for (Object obj7 : list2) {
                                        int i122 = i112 + 1;
                                        if (i112 < 0) {
                                            gc1.i0();
                                            throw null;
                                        }
                                        if (ne6.d((Collection) obj7, (List) arrayList4.get(i112), ie6Var2)) {
                                            arrayList6.add(obj7);
                                        }
                                        i112 = i122;
                                    }
                                    if (arrayList6.size() == arrayList4.size()) {
                                        z = true;
                                    }
                                }
                                zD = !z;
                                return Boolean.valueOf(zD);
                            case 3:
                                zD = ne6.e(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 4:
                                zD = ne6.f(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 5:
                                zD = ne6.g(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 6:
                                zD2 = ne6.d((List) obj4, fw.O0(((Executable) obj5).getParameterTypes()), ie6Var2);
                                break;
                            case 7:
                                zD = ne6.h(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 8:
                                zD = ne6.i(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 9:
                                zD = ne6.j(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 10:
                                zD = ne6.k(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 11:
                                zD = ne6.l(ie6Var2, (Set) obj4, (Executable) obj5);
                                return Boolean.valueOf(zD);
                            case 12:
                                zD = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                return Boolean.valueOf(zD);
                            default:
                                zD2 = ne6.d((Set) obj4, fw.O0(((Executable) obj5).getExceptionTypes()), ie6Var2);
                                break;
                        }
                        zD = !zD2;
                        return Boolean.valueOf(zD);
                    }
                }), ie6Var, "returnType", null, new je6(ie6Var, b)), ie6Var, "returnTypeCondition", null, new uq4(12, b)), ie6Var, "isBridge", null, new uq4(13, b)), ie6Var, "isBridgeNot", null, new uq4(16, b)), ie6Var, "isDefault", null, new uq4(23, b)), ie6Var, "isDefaultNot", null, new uq4(24, b));
                a91 a91VarA = ug8.a(Method.class);
                if (a91VarA.equals(ug8.a(Method.class))) {
                    r04Var = new r04(vx3VarM3, new me6(ie6Var, 3));
                } else if (a91VarA.equals(ug8.a(Constructor.class))) {
                    r04Var = new r04(vx3VarM3, new me6(ie6Var, 4));
                } else {
                    if (!a91VarA.equals(ug8.a(Field.class))) {
                        mn5.n(vx3VarM3, "Unsupported member type: ");
                        return null;
                    }
                    r04Var = new r04(vx3VarM3, new me6(ie6Var, 5));
                }
                return f39.r0(r04Var);
            case 18:
                Class cls2 = (Class) obj;
                qu3 qu3Var = (qu3) this.b;
                ie6 ie6Var2 = (ie6) this.c;
                ie6Var2.getClass();
                bv4 bv4Var2 = ne6.a;
                try {
                    pm8Var2 = fw.O0(cls2.getDeclaredFields());
                    break;
                } catch (Throwable th2) {
                    pm8Var2 = new pm8(th2);
                }
                Throwable thA2 = qm8.a(pm8Var2);
                if (thA2 != null) {
                    d6a d6aVar2 = xi5.a;
                    xi5.a("Failed to get declared fields in " + bv4Var2 + " because got an exception.", thA2);
                }
                if (pm8Var2 instanceof pm8) {
                    pm8Var2 = null;
                }
                Object obj4 = (List) pm8Var2;
                if (obj4 == null) {
                    obj4 = lc3.a;
                }
                vx3 vx3VarM4 = ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.m(ne6.a(new jc1(obj4, 0), qu3Var, ie6Var2), ie6Var2, "isEnumConstant", null, new uq4(25, b)), ie6Var2, "isEnumConstantNot", null, new uq4(26, b)), ie6Var2, "type", null, new je6(ie6Var2, i5)), ie6Var2, "typeCondition", null, new uq4(27, b)), ie6Var2, "genericType", null, new uq4(i4, b)), ie6Var2, "genericTypeCondition", null, new uq4(i, b));
                a91 a91VarA2 = ug8.a(Field.class);
                if (a91VarA2.equals(ug8.a(Method.class))) {
                    r04Var2 = new r04(vx3VarM4, new me6(ie6Var2, 0));
                } else if (a91VarA2.equals(ug8.a(Constructor.class))) {
                    r04Var2 = new r04(vx3VarM4, new me6(ie6Var2, 1));
                } else {
                    if (!a91VarA2.equals(ug8.a(Field.class))) {
                        mn5.n(vx3VarM4, "Unsupported member type: ");
                        return null;
                    }
                    r04Var2 = new r04(vx3VarM4, new me6(ie6Var2, 2));
                }
                return f39.r0(r04Var2);
            case 19:
                return ((rv5) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 20:
                int iIntValue4 = ((Number) obj).intValue();
                return ((uq4) this.b).invoke(Integer.valueOf(iIntValue4), ((List) this.c).get(iIntValue4));
            case 21:
                return ((rv5) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 22:
                return ((rv5) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 23:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                bi5 bi5Var = (bi5) this.b;
                a07 a07Var = (a07) this.c;
                a07Var.setValue(zBooleanValue ? fc1.J0(fc1.b1((List) a07Var.getValue()), bi5Var) : fc1.G0(fc1.b1((List) a07Var.getValue()), bi5Var));
                return heb.a;
            case 24:
                return ((rv5) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 25:
                return ((zm6) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 26:
                return ((zm6) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 27:
                return ((zm6) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 28:
                return ((zm6) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            default:
                return ((ss6) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
        }
    }
}
