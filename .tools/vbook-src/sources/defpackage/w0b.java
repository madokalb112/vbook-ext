package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class w0b implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;

    public /* synthetic */ w0b(a07 a07Var, int i) {
        this.a = i;
        this.b = a07Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                a07Var.setValue(bool);
                break;
            case 1:
                List list = (List) obj;
                list.getClass();
                a07Var.setValue(fc1.I0((List) a07Var.getValue(), list));
                break;
            case 2:
                bi5 bi5Var = (bi5) obj;
                bi5Var.getClass();
                List list2 = (List) a07Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (!lc5.Q((bi5) obj2, bi5Var)) {
                        arrayList.add(obj2);
                    }
                }
                a07Var.setValue(arrayList);
                break;
            case 3:
                String str = (String) obj;
                str.getClass();
                a07Var.setValue(str);
                break;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                a07Var.setValue(str2);
                break;
            case 5:
                String str3 = (String) obj;
                str3.getClass();
                a07Var.setValue(str3);
                break;
            case 6:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                a07Var.setValue(bool2);
                break;
            case 7:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                a07Var.setValue(bool3);
                break;
            case 8:
                a07Var.setValue((bi5) obj);
                break;
            case 9:
                String str4 = (String) obj;
                str4.getClass();
                a07Var.setValue(str4);
                break;
            case 10:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                a07Var.setValue(bool4);
                break;
            case 11:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                a07Var.setValue(bool5);
                break;
            case 12:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                a07Var.setValue(bool6);
                break;
            case 13:
                String str5 = (String) obj;
                str5.getClass();
                a07Var.setValue(str5);
                break;
            case 14:
                String str6 = (String) obj;
                str6.getClass();
                a07Var.setValue(str6);
                break;
            case 15:
                String str7 = (String) obj;
                str7.getClass();
                a07Var.setValue(str7);
                break;
            case 16:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                a07Var.setValue(bool7);
                break;
            case 17:
                wga wgaVar = (wga) obj;
                wgaVar.getClass();
                a07Var.setValue(wgaVar);
                break;
            case 18:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                a07Var.setValue(bool8);
                break;
            case 19:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                a07Var.setValue(bool9);
                break;
            case 20:
                wga wgaVar2 = (wga) obj;
                wgaVar2.getClass();
                a07Var.setValue(wgaVar2);
                break;
            case 21:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                a07Var.setValue(bool10);
                break;
            case 22:
                a07Var.setValue((bi5) obj);
                break;
            case 23:
                String str8 = (String) obj;
                str8.getClass();
                a07Var.setValue(str8);
                break;
            default:
                String str9 = (String) obj;
                str9.getClass();
                a07Var.setValue(str9);
                break;
        }
        return hebVar;
    }
}
