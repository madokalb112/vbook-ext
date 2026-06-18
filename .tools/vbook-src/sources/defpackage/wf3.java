package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class wf3 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;

    public /* synthetic */ wf3(a07 a07Var, int i) {
        this.a = i;
        this.b = a07Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        heb hebVar = heb.a;
        a07 a07Var = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                a07Var.setValue(bool);
                break;
            case 1:
                a07Var.setValue((bi5) obj);
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                a07Var.setValue(str);
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                a07Var.setValue(str2);
                break;
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                a07Var.setValue(bool2);
                break;
            case 5:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                a07Var.setValue(bool3);
                break;
            case 6:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                a07Var.setValue(bool4);
                break;
            case 7:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                a07Var.setValue(bool5);
                break;
            case 8:
                String str3 = (String) obj;
                str3.getClass();
                a07Var.setValue(str3);
                break;
            case 9:
                String str4 = (String) obj;
                str4.getClass();
                a07Var.setValue(str4);
                break;
            case 10:
                String str5 = (String) obj;
                str5.getClass();
                StringBuilder sb = new StringBuilder();
                int length = str5.length();
                while (i2 < length) {
                    char cCharAt = str5.charAt(i2);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                    i2++;
                }
                a07Var.setValue(sb.toString());
                break;
            case 11:
                String str6 = (String) obj;
                str6.getClass();
                StringBuilder sb2 = new StringBuilder();
                int length2 = str6.length();
                while (i2 < length2) {
                    char cCharAt2 = str6.charAt(i2);
                    if (Character.isDigit(cCharAt2)) {
                        sb2.append(cCharAt2);
                    }
                    i2++;
                }
                a07Var.setValue(sb2.toString());
                break;
            case 12:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                a07Var.setValue(bool6);
                break;
            case 13:
                ((Boolean) obj).getClass();
                a07Var.setValue(Boolean.FALSE);
                break;
            case 14:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                a07Var.setValue(bool7);
                break;
            case 15:
                String str7 = (String) obj;
                str7.getClass();
                a07Var.setValue(str7);
                break;
            case 16:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                a07Var.setValue(bool8);
                break;
            case 17:
                wga wgaVar = (wga) obj;
                wgaVar.getClass();
                a07Var.setValue(wgaVar);
                break;
            case 18:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                a07Var.setValue(bool9);
                break;
            case 19:
                a07Var.setValue((bi5) obj);
                break;
            case 20:
                String str8 = (String) obj;
                str8.getClass();
                a07Var.setValue(str8);
                break;
            case 21:
                String str9 = (String) obj;
                str9.getClass();
                a07Var.setValue(str9);
                break;
            case 22:
                wt7 wt7Var = (wt7) obj;
                if (wt7Var == null) {
                    ((kb4) a07Var.getValue()).invoke(null);
                } else {
                    ((kb4) a07Var.getValue()).invoke(new fj7(wt7Var, 1));
                }
                break;
            case 23:
                List list = (List) obj;
                if (list == null) {
                    ((kb4) a07Var.getValue()).invoke(lc3.a);
                } else {
                    kb4 kb4Var = (kb4) a07Var.getValue();
                    ArrayList arrayList = new ArrayList(gc1.M(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new fj7((wt7) it.next(), 1));
                    }
                    kb4Var.invoke(arrayList);
                }
                break;
            case 24:
                Float f = (Float) obj;
                f.getClass();
                a07Var.setValue(f);
                break;
            case 25:
                Float f2 = (Float) obj;
                f2.getClass();
                a07Var.setValue(f2);
                break;
            case 26:
                String str10 = (String) obj;
                str10.getClass();
                a07Var.setValue(str10);
                break;
            case 27:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                a07Var.setValue(bool10);
                break;
            case 28:
                Boolean bool11 = (Boolean) obj;
                bool11.booleanValue();
                a07Var.setValue(bool11);
                break;
            default:
                Boolean bool12 = (Boolean) obj;
                bool12.booleanValue();
                a07Var.setValue(bool12);
                break;
        }
        return hebVar;
    }
}
