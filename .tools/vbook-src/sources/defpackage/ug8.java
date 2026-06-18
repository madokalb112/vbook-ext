package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ug8 {
    public static final vg8 a;

    static {
        vg8 vg8Var = null;
        try {
            vg8Var = (vg8) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (vg8Var == null) {
            vg8Var = new vg8();
        }
        a = vg8Var;
    }

    public static a91 a(Class cls) {
        a.getClass();
        return new a91(cls);
    }

    public static fbb b(Class cls) {
        a91 a91VarA = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        list.getClass();
        return new fbb(a91VarA, list, 1);
    }

    public static void c(cbb cbbVar, fbb fbbVar) {
        vg8 vg8Var = a;
        List listSingletonList = Collections.singletonList(fbbVar);
        vg8Var.getClass();
        listSingletonList.getClass();
        if (cbbVar.d == null) {
            cbbVar.d = listSingletonList;
        } else {
            w58.i(cbbVar, "' have already been initialized.", "Upper bounds of type parameter '");
        }
    }

    public static fbb d(Class cls) {
        a91 a91VarA = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        list.getClass();
        return new fbb(a91VarA, list, 0);
    }

    public static fbb e(Class cls, ri5 ri5Var) {
        a91 a91VarA = a(cls);
        List listSingletonList = Collections.singletonList(ri5Var);
        a.getClass();
        listSingletonList.getClass();
        return new fbb(a91VarA, listSingletonList, 0);
    }

    public static fbb f(Class cls, ri5... ri5VarArr) {
        a91 a91VarA = a(cls);
        List listO0 = fw.O0(ri5VarArr);
        a.getClass();
        return new fbb(a91VarA, listO0, 0);
    }
}
