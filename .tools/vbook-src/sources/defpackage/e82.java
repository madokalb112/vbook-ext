package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class e82 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ e82(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) throws Exception {
        cr8 cr8VarP0;
        boolean z;
        int i = this.a;
        heb hebVar = heb.a;
        String str = this.b;
        switch (i) {
            case 0:
                rj rjVar = (rj) obj;
                rjVar.getClass();
                rjVar.g(0, str);
                return hebVar;
            case 1:
                rj rjVar2 = (rj) obj;
                rjVar2.getClass();
                rjVar2.g(0, str);
                return hebVar;
            case 2:
                rj rjVar3 = (rj) obj;
                rjVar3.getClass();
                rjVar3.g(0, str);
                return hebVar;
            case 3:
                rj rjVar4 = (rj) obj;
                rjVar4.getClass();
                rjVar4.g(0, str);
                return hebVar;
            case 4:
                rj rjVar5 = (rj) obj;
                rjVar5.getClass();
                rjVar5.g(0, str);
                return hebVar;
            case 5:
                rj rjVar6 = (rj) obj;
                rjVar6.getClass();
                rjVar6.g(0, str);
                return hebVar;
            case 6:
                rj rjVar7 = (rj) obj;
                rjVar7.getClass();
                rjVar7.g(0, str);
                return hebVar;
            case 7:
                rj rjVar8 = (rj) obj;
                rjVar8.getClass();
                rjVar8.g(0, str);
                return hebVar;
            case 8:
                rj rjVar9 = (rj) obj;
                rjVar9.getClass();
                rjVar9.g(0, str);
                return hebVar;
            case 9:
                rj rjVar10 = (rj) obj;
                rjVar10.getClass();
                rjVar10.g(0, str);
                return hebVar;
            case 10:
                rj rjVar11 = (rj) obj;
                rjVar11.getClass();
                rjVar11.g(0, str);
                return hebVar;
            case 11:
                rj rjVar12 = (rj) obj;
                rjVar12.getClass();
                rjVar12.g(0, str);
                return hebVar;
            case 12:
                rj rjVar13 = (rj) obj;
                rjVar13.getClass();
                rjVar13.g(0, str);
                return hebVar;
            case 13:
                rj rjVar14 = (rj) obj;
                rjVar14.getClass();
                rjVar14.g(0, str);
                return hebVar;
            case 14:
                rj rjVar15 = (rj) obj;
                rjVar15.getClass();
                rjVar15.g(0, str);
                return hebVar;
            case 15:
                rj rjVar16 = (rj) obj;
                rjVar16.getClass();
                rjVar16.g(0, str);
                return hebVar;
            case 16:
                rj rjVar17 = (rj) obj;
                rjVar17.getClass();
                rjVar17.g(0, str);
                return hebVar;
            case 17:
                rj rjVar18 = (rj) obj;
                rjVar18.getClass();
                rjVar18.g(0, str);
                return hebVar;
            case 18:
                rj rjVar19 = (rj) obj;
                rjVar19.getClass();
                rjVar19.g(0, str);
                return hebVar;
            case 19:
                rj rjVar20 = (rj) obj;
                rjVar20.getClass();
                rjVar20.g(0, str);
                return hebVar;
            case 20:
                rj rjVar21 = (rj) obj;
                rjVar21.getClass();
                rjVar21.g(0, str);
                return hebVar;
            case 21:
                rj rjVar22 = (rj) obj;
                rjVar22.getClass();
                rjVar22.g(0, str);
                return hebVar;
            case 22:
                rj rjVar23 = (rj) obj;
                rjVar23.getClass();
                rjVar23.g(0, str);
                return hebVar;
            case 23:
                rj rjVar24 = (rj) obj;
                rjVar24.getClass();
                rjVar24.g(0, str);
                return hebVar;
            case 24:
                rj rjVar25 = (rj) obj;
                rjVar25.getClass();
                rjVar25.g(0, str);
                return hebVar;
            case 25:
                rj rjVar26 = (rj) obj;
                rjVar26.getClass();
                rjVar26.g(0, str);
                return hebVar;
            case 26:
                rj rjVar27 = (rj) obj;
                rjVar27.getClass();
                rjVar27.g(0, str);
                return hebVar;
            case 27:
                wq8 wq8Var = (wq8) obj;
                wq8Var.getClass();
                cr8VarP0 = wq8Var.P0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    cr8VarP0.V(1, str);
                    z = cr8VarP0.J0() ? ((int) cr8VarP0.getLong(0)) != 0 : false;
                    cr8VarP0.close();
                } finally {
                }
                break;
            case 28:
                wq8 wq8Var2 = (wq8) obj;
                wq8Var2.getClass();
                cr8VarP0 = wq8Var2.P0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    cr8VarP0.V(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (cr8VarP0.J0()) {
                        arrayList.add(cr8VarP0.m0(0));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            default:
                wq8 wq8Var3 = (wq8) obj;
                wq8Var3.getClass();
                cr8VarP0 = wq8Var3.P0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    cr8VarP0.V(1, str);
                    z = cr8VarP0.J0() ? ((int) cr8VarP0.getLong(0)) != 0 : false;
                } finally {
                }
                break;
        }
        return Boolean.valueOf(z);
    }
}
