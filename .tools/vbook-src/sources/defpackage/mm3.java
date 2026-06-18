package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class mm3 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mm3(kb4 kb4Var, yb4 yb4Var, a07 a07Var, a07 a07Var2, v78 v78Var) {
        this.a = 1;
        this.e = v78Var;
        this.f = yb4Var;
        this.b = kb4Var;
        this.c = a07Var;
        this.d = a07Var2;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        String str;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj = this.b;
        Object obj2 = this.f;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                zb4 zb4Var = (zb4) obj5;
                kb4 kb4Var = (kb4) obj;
                a07 a07Var = (a07) obj3;
                a07 a07Var2 = (a07) obj2;
                String str2 = (String) ((a07) obj4).getValue();
                if (bw9.a0(str2)) {
                    str2 = "1";
                }
                String str3 = (String) a07Var.getValue();
                if (bw9.a0(str3)) {
                    str3 = str2;
                }
                zb4Var.c((sl3) a07Var2.getValue(), str2, str3);
                kb4Var.invoke(Boolean.FALSE);
                return hebVar;
            case 1:
                v78 v78Var = (v78) obj5;
                yb4 yb4Var = (yb4) obj2;
                kb4 kb4Var2 = (kb4) obj;
                a07 a07Var3 = (a07) obj4;
                a07 a07Var4 = (a07) obj3;
                if (v78Var != null && (str = v78Var.a) != null && ((String) a07Var3.getValue()) == null && !bw9.a0(((wga) a07Var4.getValue()).a.b)) {
                    yb4Var.invoke(str, ((wga) a07Var4.getValue()).a.b);
                    kb4Var2.invoke(Boolean.FALSE);
                }
                return hebVar;
            case 2:
                yb4 yb4Var2 = (yb4) obj5;
                Long[] lArr = (Long[]) obj;
                a07 a07Var5 = (a07) obj4;
                a07 a07Var6 = (a07) obj3;
                a07 a07Var7 = (a07) obj2;
                if (((Number) a07Var5.getValue()).intValue() == 5) {
                    Long lN = iw9.N(((wga) a07Var6.getValue()).a.b);
                    Long lValueOf = Long.valueOf((lN != null ? lN.longValue() : 0L) * 60);
                    Boolean bool = (Boolean) a07Var7.getValue();
                    bool.booleanValue();
                    yb4Var2.invoke(lValueOf, bool);
                } else {
                    Long l = lArr[((Number) a07Var5.getValue()).intValue()];
                    Boolean bool2 = (Boolean) a07Var7.getValue();
                    bool2.booleanValue();
                    yb4Var2.invoke(l, bool2);
                }
                return hebVar;
            case 3:
                dc dcVar = (u90) obj5;
                qe9 qe9Var = (qe9) obj;
                a07 a07Var8 = (a07) obj4;
                a07 a07Var9 = (a07) obj3;
                a07 a07Var10 = (a07) obj2;
                if (dcVar != null) {
                    dcVar.a.a();
                }
                String str4 = (String) a07Var8.getValue();
                String str5 = (String) a07Var9.getValue();
                String str6 = (String) a07Var10.getValue();
                str4.getClass();
                str5.getClass();
                str6.getClass();
                qtb.h(qe9Var, vtb.a(qe9Var), new ug(qe9Var, str5, str6, str4, null, 27));
                return hebVar;
            case 4:
                kb4 kb4Var3 = (kb4) obj;
                String string = bw9.B0((String) ((a07) obj4).getValue()).toString();
                String string2 = bw9.B0((String) ((a07) obj3).getValue()).toString();
                String str7 = (String) ((a07) obj2).getValue();
                String string3 = bw9.B0((String) ((a07) obj5).getValue()).toString();
                if (bw9.a0(string3)) {
                    string3 = "/";
                }
                kb4Var3.invoke(new vvb(string, string2, str7, string3));
                return hebVar;
            case 5:
                qta qtaVar = (qta) obj3;
                StringBuilder sbM = dx1.m("TileManager. refreshTiles:", (String) obj5, ". interrupted, imageLoadRect is empty. imageLoadRect=");
                sbM.append(vv1.b0((ja5) obj));
                sbM.append(" -> ");
                sbM.append(vv1.b0((ja5) obj4));
                sbM.append(", imageSize=");
                sbM.append(rw1.l0(qtaVar.e.a));
                sbM.append(", contentSize=");
                sbM.append(rw1.l0(qtaVar.f));
                sbM.append(", preferredTileSize=");
                sbM.append(rw1.l0(qtaVar.g));
                sbM.append(", contentVisibleRect=");
                sbM.append(vv1.b0((ja5) obj2));
                sbM.append(", '");
                return j39.j(qtaVar.b, sbM, '\'');
            default:
                dhb dhbVar = (dhb) obj5;
                return Boolean.valueOf((lc5.Q((String) ((a07) obj4).getValue(), dhbVar.a) && lc5.Q((String) ((a07) obj3).getValue(), dhbVar.b) && ((String) ((a07) obj2).getValue()).length() <= 0 && ((ky4) ((a07) obj).getValue()) == null) ? false : true);
        }
    }

    public /* synthetic */ mm3(kb4 kb4Var, a07 a07Var, a07 a07Var2, a07 a07Var3, a07 a07Var4) {
        this.a = 4;
        this.b = kb4Var;
        this.c = a07Var;
        this.d = a07Var2;
        this.f = a07Var3;
        this.e = a07Var4;
    }

    public /* synthetic */ mm3(dhb dhbVar, a07 a07Var, a07 a07Var2, a07 a07Var3, a07 a07Var4) {
        this.a = 6;
        this.e = dhbVar;
        this.c = a07Var;
        this.d = a07Var2;
        this.f = a07Var3;
        this.b = a07Var4;
    }

    public /* synthetic */ mm3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.f = obj5;
    }
}
