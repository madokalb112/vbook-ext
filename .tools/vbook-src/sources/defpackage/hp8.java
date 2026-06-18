package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class hp8 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;

    public /* synthetic */ hp8(a07 a07Var, int i) {
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
                if (!((Boolean) obj).booleanValue()) {
                    a07Var.setValue((Object) null);
                }
                return hebVar;
            case 1:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((kb4) a07Var.getValue()).invoke(f)).floatValue());
            case 2:
                ((mj5) obj).getClass();
                ((ib4) a07Var.getValue()).invoke();
                return hebVar;
            case 3:
                a07Var.setValue((q09) obj);
                return hebVar;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                a07Var.setValue(bool);
                return hebVar;
            case 5:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                a07Var.setValue(bool2);
                return hebVar;
            case 6:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                a07Var.setValue(bool3);
                return hebVar;
            case 7:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                a07Var.setValue(bool4);
                return hebVar;
            case 8:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                a07Var.setValue(bool5);
                return hebVar;
            case 9:
                Boolean bool6 = (Boolean) obj;
                bool6.getClass();
                a07Var.setValue(bool6);
                return hebVar;
            case 10:
                a07Var.setValue((Long) obj);
                return hebVar;
            case 11:
                Boolean bool7 = (Boolean) obj;
                bool7.getClass();
                a07Var.setValue(bool7);
                return hebVar;
            case 12:
                Boolean bool8 = (Boolean) obj;
                bool8.getClass();
                a07Var.setValue(bool8);
                return hebVar;
            case 13:
                a07Var.setValue((Long) obj);
                return hebVar;
            case 14:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                a07Var.setValue(bool9);
                return hebVar;
            case 15:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                a07Var.setValue(bool10);
                return hebVar;
            case 16:
                Boolean bool11 = (Boolean) obj;
                bool11.booleanValue();
                a07Var.setValue(bool11);
                return hebVar;
            case 17:
                Boolean bool12 = (Boolean) obj;
                bool12.booleanValue();
                a07Var.setValue(bool12);
                return hebVar;
            case 18:
                Boolean bool13 = (Boolean) obj;
                bool13.booleanValue();
                a07Var.setValue(bool13);
                return hebVar;
            case 19:
                Boolean bool14 = (Boolean) obj;
                bool14.booleanValue();
                a07Var.setValue(bool14);
                return hebVar;
            case 20:
                Boolean bool15 = (Boolean) obj;
                bool15.booleanValue();
                a07Var.setValue(bool15);
                return hebVar;
            case 21:
                Boolean bool16 = (Boolean) obj;
                bool16.booleanValue();
                a07Var.setValue(bool16);
                return hebVar;
            case 22:
                Boolean bool17 = (Boolean) obj;
                bool17.booleanValue();
                a07Var.setValue(bool17);
                return hebVar;
            case 23:
                Boolean bool18 = (Boolean) obj;
                bool18.booleanValue();
                a07Var.setValue(bool18);
                return hebVar;
            case 24:
                String str = (String) obj;
                str.getClass();
                a07Var.setValue(str);
                return hebVar;
            case 25:
                String str2 = (String) obj;
                str2.getClass();
                a07Var.setValue(str2);
                return hebVar;
            case 26:
                String str3 = (String) obj;
                str3.getClass();
                a07Var.setValue(str3);
                return hebVar;
            case 27:
                Boolean bool19 = (Boolean) obj;
                bool19.booleanValue();
                a07Var.setValue(bool19);
                return hebVar;
            case 28:
                ((pn2) obj).getClass();
                return new ea5(((long) t96.M(((Number) a07Var.getValue()).floatValue())) << 32);
            default:
                a07Var.setValue(Float.valueOf(((Number) a07Var.getValue()).floatValue() + ((Float) obj).floatValue()));
                return hebVar;
        }
    }
}
