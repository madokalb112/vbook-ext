package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class qda implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;

    public /* synthetic */ qda(a07 a07Var, int i) {
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
                break;
            case 1:
                wga wgaVar = (wga) obj;
                wgaVar.getClass();
                a07Var.setValue(wgaVar);
                break;
            case 2:
                a07Var.setValue((bi5) obj);
                break;
            case 3:
                if (!((Boolean) obj).booleanValue()) {
                    a07Var.setValue((Object) null);
                }
                break;
            case 4:
                ((kb4) a07Var.getValue()).invoke((eb7) obj);
                break;
            case 5:
                ((Boolean) obj).getClass();
                a07Var.setValue(Boolean.FALSE);
                break;
            case 6:
                a07Var.setValue(Integer.valueOf((int) (((na5) obj).a & 4294967295L)));
                break;
            case 7:
                ((Boolean) obj).getClass();
                a07Var.setValue(Boolean.FALSE);
                break;
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                a07Var.setValue(bool);
                break;
            case 9:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                a07Var.setValue(bool2);
                break;
            case 10:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                a07Var.setValue(bool3);
                break;
            case 11:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                a07Var.setValue(bool4);
                break;
            case 12:
                a07Var.setValue(new na5(((na5) obj).a));
                break;
            case 13:
                bn8 bn8Var = (bn8) obj;
                bn8Var.getClass();
                bn8Var.c(((Boolean) a07Var.getValue()).booleanValue() ? 0.6f : 1.0f);
                break;
            case 14:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                a07Var.setValue(bool5);
                break;
            case 15:
                float fFloatValue = ((Number) ((ym) obj).d()).floatValue() % 360.0f;
                ur9 ur9Var = zma.a;
                a07Var.setValue(Float.valueOf(fFloatValue));
                break;
            case 16:
                float fFloatValue2 = ((Number) ((ym) obj).d()).floatValue();
                ur9 ur9Var2 = zma.a;
                a07Var.setValue(Float.valueOf(fFloatValue2));
                break;
            case 17:
                float fFloatValue3 = ((Number) ((ym) obj).d()).floatValue();
                ur9 ur9Var3 = zma.a;
                a07Var.setValue(Float.valueOf(fFloatValue3));
                break;
            case 18:
                float fFloatValue4 = ((Number) ((ym) obj).d()).floatValue();
                ur9 ur9Var4 = zma.a;
                a07Var.setValue(Float.valueOf(fFloatValue4));
                break;
            case 19:
                ((pn2) obj).getClass();
                break;
            case 20:
                pn2 pn2Var = (pn2) obj;
                pn2Var.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (((eb7) a07Var.getValue()).a >> 32));
                break;
            case 21:
                wga wgaVar2 = (wga) obj;
                wgaVar2.getClass();
                a07Var.setValue(wgaVar2);
                break;
            case 22:
                a07Var.setValue((bi5) obj);
                break;
            case 23:
                if (!((Boolean) obj).booleanValue()) {
                    a07Var.setValue((Object) null);
                }
                break;
            case 24:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                a07Var.setValue(bool6);
                break;
            case 25:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                a07Var.setValue(bool7);
                break;
            case 26:
                a07Var.setValue((bi5) obj);
                break;
            case 27:
                if (!((Boolean) obj).booleanValue()) {
                    a07Var.setValue((Object) null);
                }
                break;
            case 28:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                a07Var.setValue(bool8);
                break;
            default:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                a07Var.setValue(bool9);
                break;
        }
        return hebVar;
    }
}
