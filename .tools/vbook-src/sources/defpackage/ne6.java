package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ne6 {
    public static final bv4 a = new bv4(28);

    public static vx3 a(jc1 jc1Var, dj0 dj0Var, ie6 ie6Var) {
        return m(m(m(m(m(m(m(m(m(m(jc1Var, ie6Var, "name", (String) dj0Var.b, new uq4(14, (byte) 0)), ie6Var, "nameCondition", null, new uq4(15, (byte) 0)), ie6Var, "modifiers", (LinkedHashSet) dj0Var.c, new uq4(17, (byte) 0)), ie6Var, "modifiersNot", (LinkedHashSet) dj0Var.d, new uq4(18, (byte) 0)), ie6Var, "modifiersCondition", null, new uq4(19, (byte) 0)), ie6Var, "isSynthetic", null, new uq4(20, (byte) 0)), ie6Var, "isSyntheticNot", null, new uq4(21, (byte) 0)), ie6Var, "annotations", (LinkedHashSet) dj0Var.e, new je6(ie6Var, 1)), ie6Var, "annotationsNot", (LinkedHashSet) dj0Var.f, new je6(ie6Var, 2)), ie6Var, "genericString", null, new uq4(22, (byte) 0));
    }

    public static final int b(String str) {
        long j = 0;
        for (int i = 0; i < str.length(); i++) {
            j += ((long) str.charAt(i)) > 127 ? 2L : 1L;
        }
        return (int) j;
    }

    public static final String c(int i, String str) {
        int iB = i - b(str);
        return iB > 0 ? tw2.n(str, iw9.G(iB, " ")) : str;
    }

    public static boolean d(Collection collection, List list, ie6 ie6Var) {
        Class cls;
        if (collection.size() == list.size()) {
            Collection collection2 = collection;
            ArrayList arrayList = new ArrayList(gc1.M(collection2, 10));
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(r(it.next(), ie6Var, null));
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                int i3 = i + 1;
                if (i < 0) {
                    gc1.i0();
                    throw null;
                }
                Class cls2 = (Class) obj;
                Class cls3 = (Class) list.get(i);
                cls = rkb.class;
                Class<rkb> clsO = tu1.O(ug8.a(cls));
                if (lc5.Q(cls2, clsO != null ? clsO : rkb.class) || lc5.Q(cls3, cls2)) {
                    arrayList2.add(obj);
                }
                i = i3;
            }
            if (arrayList2.size() == list.size()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean e(ie6 ie6Var, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReturnType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(tu1.M(tu1.J(annotation)));
        }
        return d(set, arrayList, ie6Var);
    }

    public static final boolean f(ie6 ie6Var, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReturnType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(tu1.M(tu1.J(annotation)));
        }
        return !d(set, arrayList, ie6Var);
    }

    public static final boolean g(ie6 ie6Var, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReceiverType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(tu1.M(tu1.J(annotation)));
        }
        return d(set, arrayList, ie6Var);
    }

    public static final boolean h(ie6 ie6Var, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReceiverType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(tu1.M(tu1.J(annotation)));
        }
        return !d(set, arrayList, ie6Var);
    }

    public static final boolean i(ie6 ie6Var, Set set, Executable executable) {
        AnnotatedType[] annotatedParameterTypes = executable.getAnnotatedParameterTypes();
        ArrayList arrayList = new ArrayList(annotatedParameterTypes.length);
        for (AnnotatedType annotatedType : annotatedParameterTypes) {
            Annotation[] annotations = annotatedType.getAnnotations();
            ArrayList arrayList2 = new ArrayList(annotations.length);
            for (Annotation annotation : annotations) {
                arrayList2.add(tu1.M(tu1.J(annotation)));
            }
            arrayList.add(arrayList2);
        }
        return d(set, gc1.O(arrayList), ie6Var);
    }

    public static final boolean j(ie6 ie6Var, Set set, Executable executable) {
        AnnotatedType[] annotatedParameterTypes = executable.getAnnotatedParameterTypes();
        ArrayList arrayList = new ArrayList(annotatedParameterTypes.length);
        for (AnnotatedType annotatedType : annotatedParameterTypes) {
            Annotation[] annotations = annotatedType.getAnnotations();
            ArrayList arrayList2 = new ArrayList(annotations.length);
            for (Annotation annotation : annotations) {
                arrayList2.add(tu1.M(tu1.J(annotation)));
            }
            arrayList.add(arrayList2);
        }
        return !d(set, gc1.O(arrayList), ie6Var);
    }

    public static final boolean k(ie6 ie6Var, Set set, Executable executable) {
        AnnotatedType[] annotatedExceptionTypes = executable.getAnnotatedExceptionTypes();
        ArrayList arrayList = new ArrayList(annotatedExceptionTypes.length);
        for (AnnotatedType annotatedType : annotatedExceptionTypes) {
            Annotation[] annotations = annotatedType.getAnnotations();
            ArrayList arrayList2 = new ArrayList(annotations.length);
            for (Annotation annotation : annotations) {
                arrayList2.add(tu1.M(tu1.J(annotation)));
            }
            arrayList.add(arrayList2);
        }
        return d(set, gc1.O(arrayList), ie6Var);
    }

    public static final boolean l(ie6 ie6Var, Set set, Executable executable) {
        AnnotatedType[] annotatedExceptionTypes = executable.getAnnotatedExceptionTypes();
        ArrayList arrayList = new ArrayList(annotatedExceptionTypes.length);
        for (AnnotatedType annotatedType : annotatedExceptionTypes) {
            Annotation[] annotations = annotatedType.getAnnotations();
            ArrayList arrayList2 = new ArrayList(annotations.length);
            for (Annotation annotation : annotations) {
                arrayList2.add(tu1.M(tu1.J(annotation)));
            }
            arrayList.add(arrayList2);
        }
        return !d(set, gc1.O(arrayList), ie6Var);
    }

    public static vx3 m(a39 a39Var, ie6 ie6Var, String str, Object obj, yb4 yb4Var) {
        return new vx3(a39Var, true, new um(obj, yb4Var, ie6Var, str, 15));
    }

    public static Annotation[] n(Member member) {
        if (member instanceof AnnotatedElement) {
            return ((AnnotatedElement) member).getDeclaredAnnotations();
        }
        mn5.n(member, "Unsupported member type: ");
        return null;
    }

    public static List o(dj0 dj0Var, ie6 ie6Var, Class cls, kb4 kb4Var) throws NoSuchFieldException, NoSuchMethodException {
        Class cls2;
        List listO = lc3.a;
        if (cls != null) {
            cls2 = Object.class;
            Class<Object> clsO = tu1.O(ug8.a(cls2));
            if (!cls.equals(clsO != null ? clsO : Object.class)) {
                Collection collection = (Collection) kb4Var.invoke(cls);
                if (collection.isEmpty()) {
                    if (ie6Var.c) {
                        listO = o(dj0Var, ie6Var, cls.getSuperclass(), kb4Var);
                    } else {
                        p(dj0Var, ie6Var);
                    }
                    collection = listO;
                }
                return (List) collection;
            }
        }
        p(dj0Var, ie6Var);
        return listO;
    }

    public static void p(dj0 dj0Var, ie6 ie6Var) throws NoSuchFieldException, NoSuchMethodException {
        String strQ;
        boolean z = dj0Var instanceof ug6;
        if (z) {
            strQ = q(ie6Var, dj0Var, "method");
        } else {
            if (!(dj0Var instanceof qu3)) {
                mn5.n(dj0Var, "Unsupported condition type: ");
                return;
            }
            strQ = q(ie6Var, dj0Var, "field");
        }
        he6 he6Var = ie6Var.d;
        if (he6Var != he6.a) {
            if (he6Var == he6.b) {
                d6a d6aVar = xi5.a;
                xi5.a(bw9.B0(strQ).toString(), null);
                return;
            }
            return;
        }
        if (z) {
            throw new NoSuchMethodException(strQ.concat("\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.0.2 ======\n"));
        }
        if (dj0Var instanceof qu3) {
            throw new NoSuchFieldException(strQ.concat("\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.0.2 ======\n"));
        }
        mn5.n(dj0Var, "Unsupported condition type: ");
    }

    public static final String q(ie6 ie6Var, dj0 dj0Var, String str) {
        String strConcat;
        String strA;
        boolean z = ie6Var.c;
        Class cls = ie6Var.a;
        String str2 = z ? " (Also tried for superclass)" : "";
        try {
            Map mapJ = dj0Var.j();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : mapJ.entrySet()) {
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    strA = value instanceof ub4 ? "(Runtime Condition)" : ((value instanceof Collection) && ((Collection) value).isEmpty()) ? null : rkb.a(value);
                }
                String strH = strA != null ? iw9.H(strA.toString(), false, " (Kotlin reflection is not available)", "") : null;
                xl7 xl7Var = strH != null ? new xl7(str3, strH) : null;
                if (xl7Var != null) {
                    arrayList.add(xl7Var);
                }
            }
            if (arrayList.isEmpty()) {
                strConcat = cls.toString();
            } else {
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iB = b((String) ((xl7) it.next()).a);
                while (it.hasNext()) {
                    int iB2 = b((String) ((xl7) it.next()).a);
                    if (iB < iB2) {
                        iB = iB2;
                    }
                }
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iB3 = b((String) ((xl7) it2.next()).b);
                while (it2.hasNext()) {
                    int iB4 = b((String) ((xl7) it2.next()).b);
                    if (iB3 < iB4) {
                        iB3 = iB4;
                    }
                }
                String strH2 = iw9.H(cls.toString(), false, " (Kotlin reflection is not available)", "");
                int iB5 = b(strH2) - ((iB + iB3) + 3);
                if (iB5 < 0) {
                    iB5 = 0;
                }
                int i = iB3 + iB5;
                String str4 = "+-" + iw9.G(iB, "-") + "-+-" + iw9.G(i, "-") + "-+";
                int i2 = iB + i + 3;
                strConcat = fc1.D0(gc1.Z("+-" + iw9.G(i2, "-") + "-+", "| " + c(i2, strH2) + " |", str4, fc1.D0(arrayList, "\n", null, null, new g25(iB, i, 1), 30), str4), "\n", null, null, null, 62);
            }
        } catch (Throwable unused) {
            strConcat = iw9.H(cls.toString(), false, " (Kotlin reflection is not available)", "").concat("\nFailed to build condition table.");
        }
        return j39.n(j39.q("No ", str, " found matching the condition for current class", str2, ".\n"), strConcat, "\nSuggestion: ", !ie6Var.c ? "Members in superclass are not reflected in the current class, you can try adding superclass() in your condition and try again. " : "Check if the conditions are correct and valid, and try again. ");
    }

    public static Class r(Object obj, ie6 ie6Var, String str) {
        Class<?> clsB;
        Class cls;
        if (obj instanceof Class) {
            clsB = (Class) obj;
        } else if (obj instanceof a91) {
            clsB = tu1.M((a91) obj);
        } else if (obj instanceof String) {
            he6 he6Var = ie6Var.d;
            Class cls2 = ie6Var.a;
            if (he6Var == he6.a) {
                clsB = c91.a(cls2.getClassLoader(), (String) obj);
            } else {
                clsB = c91.b((String) obj, cls2.getClassLoader(), 2);
                if (clsB == null) {
                    clsB = Object.class;
                    Class<?> clsO = tu1.O(ug8.a(clsB));
                    if (clsO != null) {
                        clsB = clsO;
                    }
                }
            }
        } else {
            if (!(obj instanceof rkb)) {
                w58.i(obj, ", supported types are Class, KClass, String and VagueType.", "Unsupported type: ");
                return null;
            }
            clsB = obj.getClass();
        }
        cls = rkb.class;
        Class<rkb> clsO2 = tu1.O(ug8.a(cls));
        if (!clsB.equals(clsO2 != null ? clsO2 : rkb.class) || str == null) {
            return clsB;
        }
        w58.i(str, "\".", "VagueType is not supported for \"");
        return null;
    }
}
