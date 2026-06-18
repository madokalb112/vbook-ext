package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class uq4 implements yb4 {
    public final /* synthetic */ int a;

    public /* synthetic */ uq4(int i) {
        this.a = 29;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        Object pm8Var;
        Object pm8Var2;
        Object pm8Var3;
        String genericString;
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((String) obj).getClass();
                ((List) obj2).getClass();
                return hebVar;
            case 1:
                ((String) obj).getClass();
                ((List) obj2).getClass();
                return hebVar;
            case 2:
                ((nv4) obj).getClass();
                ((xu4) obj2).getClass();
                return hebVar;
            case 3:
                int iIntValue = ((Integer) obj2).intValue();
                ((mv4) obj).getClass();
                return Long.valueOf(vb8.b.g() + Math.min((long) (Math.pow(2.0d, iIntValue - 1) * 1000.0d), 60000L));
            case 4:
                ((Integer) obj2).intValue();
                return new bi4(bx1.e(1));
            case 5:
                wq5 wq5Var = (wq5) obj2;
                return gc1.Z(Integer.valueOf(wq5Var.h()), Integer.valueOf(wq5Var.i()));
            case 6:
                st5 st5Var = (st5) obj2;
                return gc1.Z(Integer.valueOf(st5Var.h()), Integer.valueOf(st5Var.i()));
            case 7:
                Map mapD = ((yt5) obj2).d();
                if (mapD.isEmpty()) {
                    return null;
                }
                return mapD;
            case 8:
                nr2 nr2Var = ((uu5) obj2).c;
                return gc1.Z((int[]) nr2Var.c, (int[]) nr2Var.e);
            case 9:
                ((Integer) obj).intValue();
                yha yhaVar = (yha) obj2;
                yhaVar.getClass();
                return yhaVar.a;
            case 10:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((Field) obj2).getGenericType();
                throw null;
            case 11:
                Boolean bool = (Boolean) ((kb4) obj).invoke(((Field) obj2).getGenericType());
                bool.booleanValue();
                return bool;
            case 12:
                try {
                    Boolean bool2 = (Boolean) ((kb4) obj).invoke(((Method) obj2).getReturnType());
                    bool2.booleanValue();
                    pm8Var = bool2;
                    break;
                } catch (Throwable th) {
                    pm8Var = new pm8(th);
                }
                Boolean bool3 = Boolean.FALSE;
                boolean z = pm8Var instanceof pm8;
                Object obj3 = pm8Var;
                if (z) {
                    obj3 = bool3;
                }
                return (Boolean) obj3;
            case 13:
                return Boolean.valueOf(((Method) obj2).isBridge() == ((Boolean) obj).booleanValue());
            case 14:
                return Boolean.valueOf(lc5.Q(((Member) obj2).getName(), (String) obj));
            case 15:
                try {
                    Boolean bool4 = (Boolean) ((kb4) obj).invoke(((Member) obj2).getName());
                    bool4.booleanValue();
                    pm8Var2 = bool4;
                    break;
                } catch (Throwable th2) {
                    pm8Var2 = new pm8(th2);
                }
                Boolean bool5 = Boolean.FALSE;
                boolean z2 = pm8Var2 instanceof pm8;
                Object obj4 = pm8Var2;
                if (z2) {
                    obj4 = bool5;
                }
                return (Boolean) obj4;
            case 16:
                return Boolean.valueOf(((Method) obj2).isBridge() != ((Boolean) obj).booleanValue());
            case 17:
                Member member = (Member) obj2;
                Set set = (Set) obj;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z = true;
                } else {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if ((((uu6) it.next()).a & member.getModifiers()) != 0) {
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                Member member2 = (Member) obj2;
                Set set2 = (Set) obj;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    z = true;
                } else {
                    Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        if ((((uu6) it2.next()).a & member2.getModifiers()) != 0) {
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                kb4 kb4Var = (kb4) obj;
                Member member3 = (Member) obj2;
                try {
                    mc8 mc8Var = uu6.b;
                    int modifiers = member3.getModifiers();
                    mc8Var.getClass();
                    le3 le3Var = uu6.d;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : le3Var) {
                        if ((((uu6) obj5).a & modifiers) != 0) {
                            arrayList.add(obj5);
                        }
                    }
                    pm8Var3 = (Boolean) kb4Var.invoke(fc1.e1(arrayList));
                    pm8Var3.getClass();
                    break;
                } catch (Throwable th3) {
                    pm8Var3 = new pm8(th3);
                }
                Object obj6 = Boolean.FALSE;
                if (pm8Var3 instanceof pm8) {
                    pm8Var3 = obj6;
                }
                return (Boolean) pm8Var3;
            case 20:
                return Boolean.valueOf(((Member) obj2).isSynthetic() == ((Boolean) obj).booleanValue());
            case 21:
                return Boolean.valueOf(((Member) obj2).isSynthetic() != ((Boolean) obj).booleanValue());
            case 22:
                String str = (String) obj;
                Member member4 = (Member) obj2;
                if (member4 instanceof Method) {
                    genericString = ((Method) member4).toGenericString();
                } else if (member4 instanceof Constructor) {
                    genericString = ((Constructor) member4).toGenericString();
                } else {
                    if (!(member4 instanceof Field)) {
                        mn5.n(member4, "Unsupported member type: ");
                        return null;
                    }
                    genericString = ((Field) member4).toGenericString();
                }
                return Boolean.valueOf(lc5.Q(genericString, str));
            case 23:
                return Boolean.valueOf(((Method) obj2).isDefault() == ((Boolean) obj).booleanValue());
            case 24:
                return Boolean.valueOf(((Method) obj2).isDefault() != ((Boolean) obj).booleanValue());
            case 25:
                return Boolean.valueOf(((Field) obj2).isEnumConstant() == ((Boolean) obj).booleanValue());
            case 26:
                return Boolean.valueOf(((Field) obj2).isEnumConstant() != ((Boolean) obj).booleanValue());
            case 27:
                Boolean bool6 = (Boolean) ((kb4) obj).invoke(((Field) obj2).getType());
                bool6.booleanValue();
                return bool6;
            case 28:
                ((Integer) obj).intValue();
                to3 to3Var = (to3) obj2;
                to3Var.getClass();
                return to3Var.a;
            default:
                ((Integer) obj2).getClass();
                h67.m((dd4) obj, qu1.x0(1));
                return hebVar;
        }
    }

    public /* synthetic */ uq4(int i, byte b) {
        this.a = i;
    }
}
