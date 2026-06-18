package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a91 implements r81, jk5, th5, ph5, sh5 {
    public static final Map b;
    public final Class a;

    static {
        List listZ = gc1.Z(ib4.class, kb4.class, yb4.class, zb4.class, ac4.class, bc4.class, cc4.class, dc4.class, ec4.class, fc4.class, jb4.class, lb4.class, mb4.class, nb4.class, ob4.class, pb4.class, qb4.class, rb4.class, sb4.class, tb4.class, vb4.class, wb4.class, xb4.class);
        ArrayList arrayList = new ArrayList(gc1.M(listZ, 10));
        int i = 0;
        for (Object obj : listZ) {
            int i2 = i + 1;
            if (i < 0) {
                gc1.i0();
                throw null;
            }
            arrayList.add(new xl7((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = y86.h0(arrayList);
    }

    public a91(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.r81
    public final Class c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a91) && tu1.N(this).equals(tu1.N((a91) obj));
    }

    public final String f() {
        String strU;
        Class cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strU2 = kc5.u(cls.getName());
            return strU2 == null ? cls.getCanonicalName() : strU2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strU = kc5.u(componentType.getName())) != null) {
            strConcat = strU.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final GenericDeclaration findJavaDeclaration() {
        return this.a;
    }

    public final String g() {
        String strM;
        Class cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM2 = kc5.M(cls.getName());
                return strM2 == null ? cls.getSimpleName() : strM2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM = kc5.M(componentType.getName())) != null) {
                strConcat = strM.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return bw9.s0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return bw9.r0('$', simpleName, simpleName);
        }
        return bw9.s0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean h(Object obj) {
        Class clsN = this.a;
        clsN.getClass();
        Map map = b;
        map.getClass();
        Integer num = (Integer) map.get(clsN);
        if (num != null) {
            return fw.v0(num.intValue(), obj);
        }
        if (clsN.isPrimitive()) {
            clsN = tu1.N(ug8.a(clsN));
        }
        return clsN.isInstance(obj);
    }

    public final int hashCode() {
        return tu1.N(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
