package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.reader.data.download.impl.AndroidDownloadService;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rf extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rf(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new rf((AndroidDownloadService) obj2, jt1Var, 0);
            case 1:
                return new rf((zk) obj2, jt1Var, 1);
            case 2:
                return new rf((ec0) obj2, jt1Var, 2);
            case 3:
                return new rf((ut0) obj2, jt1Var, 3);
            case 4:
                return new rf((rk0) obj2, jt1Var, 4);
            case 5:
                return new rf((jh4) obj2, jt1Var, 5);
            case 6:
                return new rf((oy0) obj2, jt1Var, 6);
            case 7:
                return new rf((vz0) obj2, jt1Var, 7);
            case 8:
                return new rf((b01) obj2, jt1Var, 8);
            case 9:
                return new rf((v41) obj2, jt1Var, 9);
            case 10:
                return new rf((e71) obj2, jt1Var, 10);
            case 11:
                return new rf((Object[]) obj2, jt1Var, 11);
            case 12:
                return new rf((ConstraintTrackingWorker) obj2, jt1Var, 12);
            case 13:
                return new rf((t02) obj2, jt1Var, 13);
            case 14:
                return new rf((cf2) obj2, jt1Var, 14);
            case 15:
                return new rf((eg2) obj2, jt1Var, 15);
            case 16:
                return new rf((ir2) obj2, jt1Var, 16);
            case 17:
                return new rf((nu2) obj2, jt1Var, 17);
            case 18:
                return new rf((pz2) obj2, jt1Var, 18);
            case 19:
                return new rf((q13) obj2, jt1Var, 19);
            case 20:
                return new rf((v13) obj2, jt1Var, 20);
            case 21:
                return new rf((za3) obj2, jt1Var, 21);
            case 22:
                return new rf((bc3) obj2, jt1Var, 22);
            case 23:
                return new rf((em3) obj2, jt1Var, 23);
            case 24:
                return new rf((en3) obj2, jt1Var, 24);
            case 25:
                return new rf((wo3) obj2, jt1Var, 25);
            case 26:
                return new rf((pp3) obj2, jt1Var, 26);
            case 27:
                return new rf((v24) obj2, jt1Var, 27);
            case 28:
                return new rf((m54) obj2, jt1Var, 28);
            default:
                return new rf((String) obj2, jt1Var, 29);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((rf) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object objN;
        Object value;
        Object objI;
        Object objP;
        Object objN2;
        Object objJ;
        Object value2;
        String str;
        Object tg3Var;
        int i = this.a;
        int i2 = 6;
        int i3 = 15;
        int i4 = 28;
        int i5 = 4;
        int i6 = 2;
        int i7 = 0;
        heb hebVar = heb.a;
        Object obj2 = this.c;
        xx1 xx1Var = xx1.a;
        int i8 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (i) {
            case 0:
                int i9 = this.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                d6a d6aVar = vg3.a;
                a91 a91VarA = ug8.a(e13.class);
                xz6 xz6Var = (xz6) vg3.a.getValue();
                qf qfVar = new qf((AndroidDownloadService) obj2, i7);
                this.b = 1;
                Object objA = xz6Var.a(new l51(3, qfVar, a91VarA), this);
                if (objA != xx1Var) {
                    objA = hebVar;
                }
                return objA == xx1Var ? xx1Var : hebVar;
            case 1:
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                zk zkVar = (zk) obj2;
                int i11 = zkVar.g;
                this.b = 1;
                return zk.a(zkVar, i11, this) == xx1Var ? xx1Var : hebVar;
            case 2:
                int i12 = this.b;
                if (i12 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    return ec0.a((ec0) obj2, this) == xx1Var ? xx1Var : hebVar;
                }
                if (i12 == 1) {
                    e11.e0(obj);
                    return hebVar;
                }
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                int i13 = this.b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                this.b = 1;
                tt0 tt0Var = ut0.a;
                Object objE = ((ut0) obj2).e(1, this);
                return objE == xx1Var ? xx1Var : objE;
            case 4:
                rk0 rk0Var = (rk0) obj2;
                ly8 ly8Var = rk0Var.t;
                int i14 = this.b;
                if (i14 == 0) {
                    e11.e0(obj);
                    wp3 wp3VarG = ((uw5) rk0Var.d).g(rk0Var.c);
                    this.b = 1;
                    objN = cx1.N(wp3VarG, this);
                    if (objN == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i14 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                    objN = obj;
                }
                zv5 zv5Var = (zv5) objN;
                if (zv5Var == null) {
                    return hebVar;
                }
                String str2 = (String) zv5Var.b.get("raw");
                String str3 = str2 != null ? str2 : "";
                fr9 fr9Var = rk0Var.w;
                if (fr9Var != null) {
                    while (true) {
                        Object value3 = fr9Var.getValue();
                        zv5 zv5Var2 = zv5Var;
                        if (!fr9Var.j(value3, kk0.a((kk0) value3, false, false, zv5Var2, null, null, 27))) {
                            zv5Var = zv5Var2;
                        }
                    }
                }
                fr9 fr9Var2 = rk0Var.v;
                if (fr9Var2 != null) {
                    do {
                        value = fr9Var2.getValue();
                    } while (!fr9Var2.j(value, jk0.a((jk0) value, false, str3, !((my8) ly8Var).b(), ((my8) ly8Var).c(), null, 17)));
                }
                rk0Var.k(str3);
                return hebVar;
            case 5:
                int i15 = this.b;
                if (i15 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    objI = ((jh4) obj2).i(this);
                    if (objI == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i15 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                    objI = obj;
                }
                return new tc((ky4) objI);
            case 6:
                int i16 = this.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                jh4 jh4Var = ((oy0) obj2).a;
                if (jh4Var == null) {
                    return null;
                }
                rf rfVar = new rf(jh4Var, objArr == true ? 1 : 0, 5);
                this.b = 1;
                Object objO = zib.o(200L, rfVar, this);
                return objO == xx1Var ? xx1Var : objO;
            case 7:
                vz0 vz0Var = (vz0) obj2;
                int i17 = this.b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                kb3 kb3VarF = ((uw5) vz0Var.c).f();
                sg sgVar = new sg(vz0Var, 3);
                this.b = 1;
                return kb3VarF.a(sgVar, this) == xx1Var ? xx1Var : hebVar;
            case 8:
                b01 b01Var = (b01) obj2;
                aw5 aw5Var = b01Var.c;
                int i18 = this.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                kb3 kb3VarF2 = ((uw5) aw5Var).f();
                b92 b92Var = ((uw5) aw5Var).a.b;
                b92Var.getClass();
                r82 r82Var = r82.a;
                qj qjVar = (qj) ((yf1) b92Var).a;
                b82 b82Var = new b82(b92Var, 10);
                qjVar.getClass();
                pp1 pp1VarR = qx1.R(new af9(1891282945, new String[]{"DbBook"}, qjVar, "DbBook.sq", "getAll", "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nORDER BY lastRead DESC", b82Var));
                aj2 aj2Var = rw2.a;
                tg3 tg3VarI = cx1.I(kb3VarF2, new kb3(qx1.E(pp1VarR, nh2.c), i2), ((j4b) b01Var.d).i(), new a01(i5, i7, objArr2 == true ? 1 : 0));
                sg sgVar2 = new sg(b01Var, i5);
                this.b = 1;
                return tg3VarI.a(sgVar2, this) == xx1Var ? xx1Var : hebVar;
            case 9:
                v41 v41Var = (v41) obj2;
                int i19 = this.b;
                if (i19 != 0) {
                    if (i19 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                fr9 fr9Var3 = ((hib) v41Var.d).d;
                sg sgVar3 = new sg(v41Var, 5);
                this.b = 1;
                fr9Var3.a(sgVar3, this);
                return xx1Var;
            case 10:
                e71 e71Var = (e71) obj2;
                int i20 = this.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                tg3 tg3VarI2 = cx1.I(new u31(e71Var.y, i6), e71Var.z, new fe8(((hib) e71Var.d).d), new a01(i5, i8, objArr3 == true ? 1 : 0));
                sg sgVar4 = new sg(e71Var, i2);
                this.b = 1;
                return tg3VarI2.a(sgVar4, this) == xx1Var ? xx1Var : hebVar;
            case 11:
                int i21 = this.b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                Double dW = hw9.w(String.valueOf(fw.p0(0, (Object[]) obj2)));
                Long l = dW != null ? new Long((long) dW.doubleValue()) : null;
                if (l == null) {
                    return hebVar;
                }
                long jLongValue = l.longValue();
                this.b = 1;
                return tw1.H(jLongValue, this) == xx1Var ? xx1Var : hebVar;
            case 12:
                int i22 = this.b;
                if (i22 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    Object objF = ConstraintTrackingWorker.f((ConstraintTrackingWorker) obj2, this);
                    return objF == xx1Var ? xx1Var : objF;
                }
                if (i22 == 1) {
                    e11.e0(obj);
                    return obj;
                }
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                t02 t02Var = (t02) obj2;
                int i23 = this.b;
                if (i23 != 0) {
                    if (i23 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                fr9 fr9Var4 = ((hib) t02Var.c).d;
                sg sgVar5 = new sg(t02Var, 7);
                this.b = 1;
                fr9Var4.a(sgVar5, this);
                return xx1Var;
            case 14:
                cf2 cf2Var = (cf2) obj2;
                rd8 rd8Var = cf2Var.e;
                int i24 = this.b;
                if (i24 == 0) {
                    e11.e0(obj);
                    zc8 zc8Var = ((sd8) rd8Var).a;
                    km0 km0Var = zc8Var.d;
                    ni5[] ni5VarArr = zc8.q;
                    if (!((Boolean) km0Var.c(ni5VarArr[2], zc8Var)).booleanValue()) {
                        return hebVar;
                    }
                    zc8 zc8Var2 = ((sd8) rd8Var).a;
                    wp3 wp3VarG2 = ((uw5) cf2Var.c).g((String) zc8Var2.b.c(ni5VarArr[0], zc8Var2));
                    this.b = 1;
                    objP = cx1.P(wp3VarG2, this);
                    if (objP == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i24 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                    objP = obj;
                }
                zv5 zv5Var3 = (zv5) objP;
                if (zv5Var3 == null) {
                    return hebVar;
                }
                cf2Var.i(cf2Var.f, new oe2(zv5Var3.a));
                return hebVar;
            case 15:
                eg2 eg2Var = (eg2) obj2;
                int i25 = this.b;
                if (i25 != 0) {
                    if (i25 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pg8 pg8Var = new pg8();
                pg8 pg8Var2 = new pg8();
                pg8 pg8Var3 = new pg8();
                b24 b24VarA = eg2Var.A.a();
                oe0 oe0Var = new oe0(pg8Var, pg8Var2, pg8Var3, eg2Var, 3);
                this.b = 1;
                return b24VarA.a(oe0Var, this) == xx1Var ? xx1Var : hebVar;
            case 16:
                ir2 ir2Var = (ir2) obj2;
                int i26 = this.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                wp3 wp3VarH = ((uw5) ir2Var.K).h(ir2Var.H);
                dr2 dr2Var = new dr2(ir2Var, i7);
                this.b = 1;
                return wp3VarH.a(dr2Var, this) == xx1Var ? xx1Var : hebVar;
            case 17:
                nu2 nu2Var = (nu2) obj2;
                int i27 = this.b;
                if (i27 != 0) {
                    if (i27 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                fr9 fr9Var5 = ((cq3) nu2Var.H).e;
                sg sgVar6 = new sg(nu2Var, 11);
                this.b = 1;
                fr9Var5.a(new gm0(sgVar6, i3), this);
                return xx1Var;
            case 18:
                pz2 pz2Var = (pz2) obj2;
                int i28 = this.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pp1 pp1VarR2 = qx1.R(pz2Var.a.t.P());
                aj2 aj2Var2 = rw2.a;
                y34 y34VarE = qx1.E(pp1VarR2, nh2.c);
                sg sgVar7 = new sg(pz2Var, 12);
                this.b = 1;
                return y34VarE.a(sgVar7, this) == xx1Var ? xx1Var : hebVar;
            case 19:
                int i29 = this.b;
                if (i29 != 0) {
                    if (i29 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                long j = ((q13) obj2).a;
                this.b = 1;
                Object objW = bv4.w(j, this);
                return objW == xx1Var ? xx1Var : objW;
            case 20:
                v13 v13Var = (v13) obj2;
                int i30 = this.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                p13 p13Var = (p13) v13Var.c;
                pp1 pp1VarR3 = qx1.R(p13Var.a.u.U());
                aj2 aj2Var3 = rw2.a;
                y34 y34VarE2 = qx1.E(pp1VarR3, nh2.c);
                sg sgVar8 = new sg(v13Var, 14);
                this.b = 1;
                Object objA2 = y34VarE2.a(new l13(sgVar8, p13Var, i7), this);
                if (objA2 != xx1Var) {
                    objA2 = hebVar;
                }
                return objA2 == xx1Var ? xx1Var : hebVar;
            case 21:
                za3 za3Var = (za3) obj2;
                int i31 = this.b;
                if (i31 != 0) {
                    if (i31 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                lb3 lb3Var = (lb3) za3Var.c;
                n92 n92Var = lb3Var.c.w;
                n92Var.getClass();
                ra2 ra2Var = ra2.a;
                qj qjVar2 = (qj) ((yf1) n92Var).a;
                q92 q92Var = new q92(i4);
                qjVar2.getClass();
                pp1 pp1VarR4 = qx1.R(new af9(619904542, new String[]{"DbEmojiCategory"}, qjVar2, "DbEmojiCategory.sq", "getAll", "SELECT DbEmojiCategory.id, DbEmojiCategory.thumb, DbEmojiCategory.count, DbEmojiCategory.position\nFROM DbEmojiCategory\nORDER BY position ASC", q92Var));
                aj2 aj2Var4 = rw2.a;
                y34 y34VarE3 = qx1.E(pp1VarR4, nh2.c);
                sg sgVar9 = new sg(za3Var, i3);
                this.b = 1;
                Object objA3 = y34VarE3.a(new l51(i8, sgVar9, lb3Var), this);
                if (objA3 != xx1Var) {
                    objA3 = hebVar;
                }
                return objA3 == xx1Var ? xx1Var : hebVar;
            case 22:
                bc3 bc3Var = (bc3) obj2;
                eb3 eb3Var = bc3Var.c;
                int i32 = this.b;
                if (i32 == 0) {
                    e11.e0(obj);
                    n92 n92Var2 = ((lb3) eb3Var).c.v;
                    n92Var2.getClass();
                    va2 va2Var = va2.a;
                    pp1 pp1VarR5 = qx1.R(new j92(n92Var2, new sa2(i5)));
                    aj2 aj2Var5 = rw2.a;
                    kb3 kb3Var = new kb3(qx1.E(pp1VarR5, nh2.c), i7);
                    this.b = 1;
                    objN2 = cx1.N(kb3Var, this);
                    if (objN2 != xx1Var) {
                    }
                    return xx1Var;
                }
                if (i32 != 1) {
                    if (i32 == 2) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                objN2 = obj;
                lb3 lb3Var2 = (lb3) eb3Var;
                n92 n92Var3 = lb3Var2.c.w;
                n92Var3.getClass();
                ra2 ra2Var2 = ra2.a;
                qj qjVar3 = (qj) ((yf1) n92Var3).a;
                q92 q92Var2 = new q92(i4);
                qjVar3.getClass();
                pp1 pp1VarR6 = qx1.R(new af9(619904542, new String[]{"DbEmojiCategory"}, qjVar3, "DbEmojiCategory.sq", "getAll", "SELECT DbEmojiCategory.id, DbEmojiCategory.thumb, DbEmojiCategory.count, DbEmojiCategory.position\nFROM DbEmojiCategory\nORDER BY position ASC", q92Var2));
                aj2 aj2Var6 = rw2.a;
                y34 y34VarE4 = qx1.E(pp1VarR6, nh2.c);
                l51 l51Var = new l51(i6, bc3Var, (List) objN2);
                this.b = 2;
                Object objA4 = y34VarE4.a(new l51(i8, l51Var, lb3Var2), this);
                if (objA4 != xx1Var) {
                    objA4 = hebVar;
                }
                if (objA4 != xx1Var) {
                    return hebVar;
                }
                return xx1Var;
            case 23:
                em3 em3Var = (em3) obj2;
                int i33 = this.b;
                if (i33 != 0) {
                    if (i33 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                u31 u31VarC = ((j4b) em3Var.e).c();
                sg sgVar10 = new sg(em3Var, 17);
                this.b = 1;
                return u31VarC.a(sgVar10, this) == xx1Var ? xx1Var : hebVar;
            case 24:
                en3 en3Var = (en3) obj2;
                int i34 = this.b;
                if (i34 == 0) {
                    e11.e0(obj);
                    qp3 qp3Var = en3Var.d;
                    String str4 = en3Var.c;
                    this.b = 1;
                    wa2 wa2Var = (wa2) ((cq3) qp3Var).a.x.T(str4).e();
                    if (wa2Var == null) {
                        objJ = lc3.a;
                    } else {
                        gn9 gn9Var = new gn9(wa2Var);
                        zy5 zy5VarN = gc1.N();
                        for (Map.Entry entry : wa2Var.r.entrySet()) {
                            zy5VarN.add(new br3((String) entry.getKey(), gn9Var.a((String) entry.getKey())));
                        }
                        objJ = gc1.J(zy5VarN);
                    }
                    if (objJ == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i34 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                    objJ = obj;
                }
                List list = (List) objJ;
                fr9 fr9Var6 = en3Var.e;
                if (fr9Var6 == null) {
                    return hebVar;
                }
                do {
                    value2 = fr9Var6.getValue();
                    dn3 dn3Var = (dn3) value2;
                    br3 br3Var = (br3) fc1.z0(list);
                    str = br3Var != null ? br3Var.a : null;
                    if (str == null) {
                        str = "";
                    }
                    dn3Var.getClass();
                } while (!fr9Var6.j(value2, new dn3(str, list)));
                return hebVar;
            case 25:
                wo3 wo3Var = (wo3) obj2;
                int i35 = this.b;
                if (i35 != 0) {
                    if (i35 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                kb3 kb3VarF3 = ((cq3) wo3Var.c).f();
                sg sgVar11 = new sg(wo3Var, 18);
                this.b = 1;
                return kb3VarF3.a(sgVar11, this) == xx1Var ? xx1Var : hebVar;
            case 26:
                pp3 pp3Var = (pp3) obj2;
                int i36 = this.b;
                if (i36 == 0) {
                    e11.e0(obj);
                    gr3 gr3Var = pp3Var.c;
                    this.b = 1;
                    jr3 jr3Var = (jr3) gr3Var;
                    pp1 pp1VarR7 = qx1.R(jr3Var.a.z.P());
                    aj2 aj2Var7 = rw2.a;
                    tg3Var = new tg3(i8, qx1.E(pp1VarR7, nh2.c), jr3Var);
                    if (tg3Var != xx1Var) {
                    }
                    return xx1Var;
                }
                if (i36 != 1) {
                    if (i36 == 2) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                tg3Var = obj;
                sg sgVar12 = new sg(pp3Var, 19);
                this.b = 2;
                if (((b24) tg3Var).a(sgVar12, this) != xx1Var) {
                    return hebVar;
                }
                return xx1Var;
            case 27:
                int i37 = this.b;
                if (i37 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    return cx1.F((v24) obj2, this) == xx1Var ? xx1Var : hebVar;
                }
                if (i37 == 1) {
                    e11.e0(obj);
                    return hebVar;
                }
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                int i38 = this.b;
                if (i38 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    return fe.O((m54) obj2, null, this) == xx1Var ? xx1Var : hebVar;
                }
                if (i38 == 1) {
                    e11.e0(obj);
                    return hebVar;
                }
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i39 = this.b;
                if (i39 != 0) {
                    if (i39 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                this.b = 1;
                String strR = ky0.r("composeResources/com.reader.resources/", (String) obj2);
                ur9 ur9Var = tl8.a;
                Object objB = lf2.b(strR);
                return objB == xx1Var ? xx1Var : objB;
        }
    }
}
