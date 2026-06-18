package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dd9 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd9(s4b s4bVar, int i, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 19;
        this.c = s4bVar;
        this.b = i;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new dd9((ed9) obj2, jt1Var, 0);
            case 1:
                return new dd9((pd9) obj2, jt1Var, 1);
            case 2:
                return new dd9((yl9) obj2, jt1Var, 2);
            case 3:
                return new dd9((ln9) obj2, jt1Var, 3);
            case 4:
                return new dd9((zo9) obj2, jt1Var, 4);
            case 5:
                return new dd9((fs9) obj2, jt1Var, 5);
            case 6:
                return new dd9((v1a) obj2, jt1Var, 6);
            case 7:
                return new dd9((h8a) obj2, jt1Var, 7);
            case 8:
                return new dd9((j22) obj2, jt1Var, 8);
            case 9:
                return new dd9((uy5) obj2, jt1Var, 9);
            case 10:
                return new dd9((gja) obj2, jt1Var, 10);
            case 11:
                return new dd9((hja) obj2, jt1Var, 11);
            case 12:
                return new dd9((lja) obj2, jt1Var, 12);
            case 13:
                return new dd9((nja) obj2, jt1Var, 13);
            case 14:
                return new dd9((zna) obj2, jt1Var, 14);
            case 15:
                return new dd9((usa) obj2, jt1Var, 15);
            case 16:
                return new dd9((kta) obj2, jt1Var, 16);
            case 17:
                return new dd9((yva) obj2, jt1Var, 17);
            case 18:
                return new dd9((j4b) obj2, jt1Var, 18);
            case 19:
                return new dd9((s4b) obj2, this.b, jt1Var);
            case 20:
                return new dd9((g7b) obj2, jt1Var, 20);
            case 21:
                return new dd9((ehb) obj2, jt1Var, 21);
            case 22:
                return new dd9((uhb) obj2, jt1Var, 22);
            case 23:
                return new dd9((hib) obj2, jt1Var, 23);
            case 24:
                return new dd9((af) obj2, jt1Var, 24);
            case 25:
                return new dd9((je4) obj2, jt1Var, 25);
            case 26:
                return new dd9((ai1) obj2, jt1Var, 26);
            case 27:
                return new dd9((l3c) obj2, jt1Var, 27);
            case 28:
                return new dd9((d6c) obj2, jt1Var, 28);
            default:
                return new dd9((e7c) obj2, jt1Var, 29);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 19:
                ((dd9) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return ((dd9) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object l;
        Object objN;
        Object objB;
        Object value2;
        Object objA;
        Object value3;
        boolean z;
        List listZ0;
        ym ymVar;
        Float f;
        p9b p9bVar;
        int i = this.a;
        int i2 = 7;
        int i3 = 24;
        int i4 = 11;
        int i5 = 14;
        int i6 = 18;
        int i7 = 2;
        Object obj2 = this.c;
        xx1 xx1Var = xx1.a;
        int i8 = 1;
        heb hebVar = heb.a;
        jt1 jt1Var = null;
        switch (i) {
            case 0:
                ed9 ed9Var = (ed9) obj2;
                int i9 = this.b;
                if (i9 != 0) {
                    if (i9 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    tg3 tg3VarI = cx1.I(ed9Var.j(), ((xw5) ed9Var.c).b(), ((j4b) ed9Var.d).i(), new a01(4, 5, jt1Var));
                    rb9 rb9Var = new rb9(ed9Var, i7);
                    this.b = 1;
                    if (tg3VarI.a(rb9Var, this) == xx1Var) {
                    }
                }
                break;
            case 1:
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    pd9 pd9Var = (pd9) obj2;
                    this.b = 1;
                    Object objB2 = ym.b(pd9Var.e, new Float(1.0f), pd9Var.a, null, this, 12);
                    if (objB2 != xx1Var) {
                        objB2 = hebVar;
                    }
                    if (objB2 == xx1Var) {
                    }
                }
                break;
            case 2:
                yl9 yl9Var = (yl9) obj2;
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    wp3 wp3VarE = ((cq3) yl9Var.K).e(yl9Var.H);
                    rb9 rb9Var2 = new rb9(yl9Var, 4);
                    this.b = 1;
                    if (wp3VarE.a(rb9Var2, this) == xx1Var) {
                    }
                }
                break;
            case 3:
                ln9 ln9Var = (ln9) obj2;
                int i12 = this.b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    wp3 wp3VarE2 = ((cq3) ln9Var.K).e(ln9Var.H);
                    rb9 rb9Var3 = new rb9(ln9Var, 5);
                    this.b = 1;
                    if (wp3VarE2.a(rb9Var3, this) == xx1Var) {
                    }
                }
                break;
            case 4:
                int i13 = this.b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    this.b = 1;
                    if (tw1.H(100L, this) == xx1Var) {
                    }
                }
                fr9 fr9Var = ((zo9) obj2).c;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                        ((yo9) value).getClass();
                    } while (!fr9Var.j(value, new yo9(false)));
                }
                break;
            case 5:
                fs9 fs9Var = (fs9) obj2;
                aw5 aw5Var = fs9Var.c;
                int i14 = this.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        e11.e0(obj);
                        l = obj;
                    } else if (i14 == 2) {
                        e11.e0(obj);
                    } else {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    e11.e0(obj);
                    this.b = 1;
                    qj qjVar = (qj) ((yf1) ((uw5) aw5Var).a.s).a;
                    q92 q92Var = new q92(10);
                    qjVar.getClass();
                    Long l2 = (Long) new af9(1613779802, new String[]{"DbContent"}, qjVar, "DbContent.sq", "countAll", "SELECT COUNT(*)\nFROM DbContent", q92Var).e();
                    l = new Long(l2 != null ? l2.longValue() : 0L);
                    if (l == xx1Var) {
                    }
                }
                long jLongValue = ((Number) l).longValue();
                b92 b92Var = ((uw5) aw5Var).a.b;
                b92Var.getClass();
                r82 r82Var = r82.a;
                qj qjVar2 = (qj) ((yf1) b92Var).a;
                b82 b82Var = new b82(b92Var, 10);
                qjVar2.getClass();
                pp1 pp1VarR = qx1.R(new af9(1891282945, new String[]{"DbBook"}, qjVar2, "DbBook.sq", "getAll", "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nORDER BY lastRead DESC", b82Var));
                aj2 aj2Var = rw2.a;
                nh2 nh2Var = nh2.c;
                kb3 kb3Var = new kb3(qx1.E(pp1VarR, nh2Var), 6);
                n92 n92Var = ((uw5) aw5Var).a.G;
                n92Var.getClass();
                mc2 mc2Var = mc2.a;
                qj qjVar3 = (qj) ((yf1) n92Var).a;
                pb2 pb2Var = new pb2(23);
                qjVar3.getClass();
                tg3 tg3VarH = cx1.H(kb3Var, new kb3(qx1.E(qx1.R(new af9(642483352, new String[]{"DbReadHistory"}, qjVar3, "DbReadHistory.sq", "getAll", "SELECT DbReadHistory.id, DbReadHistory.readTime, DbReadHistory.listenTime, DbReadHistory.createAt FROM DbReadHistory", pb2Var)), nh2Var), 13), fs9Var.f, ((j4b) fs9Var.d).i(), new es9(jLongValue, fs9Var, null));
                rb9 rb9Var4 = new rb9(fs9Var, 6);
                this.b = 2;
                if (tg3VarH.a(rb9Var4, this) == xx1Var) {
                }
                break;
            case 6:
                zx7 zx7Var = (v1a) obj2;
                int i15 = this.b;
                if (i15 != 0) {
                    if (i15 == 1 || i15 == 2) {
                        e11.e0(obj);
                    } else {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    e11.e0(obj);
                    PointerInputEventHandler pointerInputEventHandler = ((v1a) zx7Var).D;
                    this.b = 2;
                    if (pointerInputEventHandler.invoke(zx7Var, this) == xx1Var) {
                    }
                }
                break;
            case 7:
                h8a h8aVar = (h8a) obj2;
                int i16 = this.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        e11.e0(obj);
                        objN = obj;
                    } else if (i16 == 2) {
                        e11.e0(obj);
                    } else {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    e11.e0(obj);
                    tna tnaVar = h8aVar.c;
                    this.b = 1;
                    objN = ((zna) tnaVar).n();
                    if (objN == xx1Var) {
                    }
                }
                rb9 rb9Var5 = new rb9(h8aVar, i2);
                this.b = 2;
                if (((b24) objN).a(rb9Var5, this) == xx1Var) {
                }
                break;
            case 8:
                int i17 = this.b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    j22 j22Var = (j22) obj2;
                    this.b = 1;
                    j22Var.getClass();
                    Object objA0 = wx1.a0(new pg(j22Var, jt1Var, 6), this);
                    if (objA0 != xx1Var) {
                        objA0 = hebVar;
                    }
                    if (objA0 == xx1Var) {
                    }
                }
                break;
            case 9:
                int i18 = this.b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    uy5 uy5Var = (uy5) obj2;
                    this.b = 1;
                    uy5Var.getClass();
                    Object objA2 = uy5Var.a.a().a(new l51(8, new kz6(), uy5Var), this);
                    if (objA2 != xx1Var) {
                        objA2 = hebVar;
                    }
                    if (objA2 == xx1Var) {
                    }
                }
                break;
            case 10:
                int i19 = this.b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    y78 y78Var = ((gja) obj2).e;
                    this.b = 1;
                    ((c98) y78Var).m();
                    if (hebVar == xx1Var) {
                    }
                }
                break;
            case 11:
                int i20 = this.b;
                if (i20 != 0) {
                    if (i20 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    y78 y78Var2 = ((hja) obj2).e;
                    this.b = 1;
                    ((c98) y78Var2).q();
                    if (hebVar == xx1Var) {
                    }
                }
                break;
            case 12:
                int i21 = this.b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    lja ljaVar = (lja) obj2;
                    y78 y78Var3 = ljaVar.t;
                    String str = ljaVar.e;
                    this.b = 1;
                    ((c98) y78Var3).s(str);
                    if (hebVar == xx1Var) {
                    }
                }
                break;
            case 13:
                int i22 = this.b;
                if (i22 != 0) {
                    if (i22 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    nja njaVar = (nja) obj2;
                    y78 y78Var4 = njaVar.t;
                    String str2 = njaVar.e;
                    this.b = 1;
                    ((c98) y78Var4).u(str2);
                    if (hebVar == xx1Var) {
                    }
                }
                break;
            case 14:
                zna znaVar = (zna) obj2;
                rna rnaVar = znaVar.a;
                int i23 = this.b;
                if (i23 == 0) {
                    e11.e0(obj);
                    if (!((Boolean) rnaVar.l.c(rna.m[11], rnaVar)).booleanValue()) {
                        this.b = 1;
                        ur9 ur9Var = tl8.a;
                        objB = lf2.b("composeResources/com.reader.resources/files/tts_word.json");
                        if (objB == xx1Var) {
                        }
                    }
                } else if (i23 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                    objB = obj;
                }
                ym9.l(znaVar.b.I, new k49(i6, iw9.z((byte[]) objB), znaVar));
                rnaVar.l.e(rna.m[11], Boolean.TRUE);
                break;
            case 15:
                usa usaVar = (usa) obj2;
                int i24 = this.b;
                if (i24 != 0) {
                    if (i24 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    pg8 pg8Var = new pg8();
                    b24 b24VarA = usaVar.A.a();
                    l51 l51Var = new l51(16, pg8Var, usaVar);
                    this.b = 1;
                    if (b24VarA.a(l51Var, this) == xx1Var) {
                    }
                }
                break;
            case 16:
                int i25 = this.b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    kta ktaVar = (kta) obj2;
                    this.b = 1;
                    Object objB0 = ah1.b0(ktaVar.k, new ne0(ktaVar, jt1Var, i3), this);
                    if (objB0 != xx1Var) {
                        objB0 = hebVar;
                    }
                    if (objB0 == xx1Var) {
                    }
                }
                break;
            case 17:
                yva yvaVar = (yva) obj2;
                int i26 = this.b;
                if (i26 != 0) {
                    if (i26 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    hab habVar = yvaVar.c;
                    this.b = 1;
                    ((lab) habVar).a.p.e(zc8.q[14], null);
                    if (hebVar == xx1Var) {
                    }
                }
                yvaVar.j();
                break;
            case 18:
                j4b j4bVar = (j4b) obj2;
                e4b e4bVar = j4bVar.b;
                int i27 = this.b;
                if (i27 != 0) {
                    if (i27 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    fr9 fr9Var2 = j4bVar.e;
                    km0 km0Var = e4bVar.b;
                    ni5[] ni5VarArr = e4b.f;
                    Boolean bool = (Boolean) km0Var.c(ni5VarArr[0], e4bVar);
                    bool.booleanValue();
                    fr9Var2.getClass();
                    fr9Var2.l(null, bool);
                    fr9 fr9Var3 = j4bVar.g;
                    Boolean bool2 = (Boolean) e4bVar.d.c(ni5VarArr[2], e4bVar);
                    bool2.booleanValue();
                    fr9Var3.getClass();
                    fr9Var3.l(null, bool2);
                    b92 b92Var2 = j4bVar.a.x;
                    b92Var2.getClass();
                    lb2 lb2Var = lb2.a;
                    qj qjVar4 = (qj) ((yf1) b92Var2).a;
                    bb2 bb2Var = new bb2(b92Var2, i2);
                    qjVar4.getClass();
                    pp1 pp1VarR2 = qx1.R(new af9(630744953, new String[]{"DbExtension"}, qjVar4, "DbExtension.sq", "getTranslateExtension", "SELECT id, name, author, version, source, path, description, language, type, nsfw, development, draft, pinedAt, updateAt\nFROM DbExtension\nWHERE draft = 0 AND type = 6\nORDER BY pinedAt DESC, lastUse DESC, updateAt DESC", bb2Var));
                    aj2 aj2Var2 = rw2.a;
                    y34 y34VarE = qx1.E(pp1VarR2, nh2.c);
                    rb9 rb9Var6 = new rb9(j4bVar, 9);
                    this.b = 1;
                    if (y34VarE.a(rb9Var6, this) == xx1Var) {
                    }
                }
                break;
            case 19:
                e11.e0(obj);
                s4b s4bVar = (s4b) obj2;
                int i28 = this.b;
                s4bVar.z = i28;
                fr9 fr9Var4 = s4bVar.t;
                if (fr9Var4 != null) {
                    do {
                        value2 = fr9Var4.getValue();
                    } while (!fr9Var4.j(value2, k4b.b((k4b) value2, null, null, null, false, i28, null, null, null, 1919)));
                }
                break;
            case 20:
                int i29 = this.b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    this.b = 1;
                    if (((g7b) obj2).h(this) == xx1Var) {
                    }
                }
                break;
            case 21:
                ehb ehbVar = (ehb) obj2;
                int i30 = this.b;
                if (i30 == 0) {
                    e11.e0(obj);
                    fr9 fr9Var5 = ((hib) ehbVar.c).d;
                    rb9 rb9Var7 = new rb9(ehbVar, 10);
                    this.b = 1;
                    fr9Var5.a(rb9Var7, this);
                } else if (i30 == 1) {
                    e11.e0(obj);
                } else {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                }
                break;
            case 22:
                uhb uhbVar = (uhb) obj2;
                LinkedHashMap linkedHashMap = uhbVar.u;
                int i31 = this.b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                        objA = obj;
                    }
                    break;
                } else {
                    e11.e0(obj);
                    uhbVar.s = true;
                    q7 q7Var = uhbVar.c;
                    String str3 = uhbVar.e;
                    int i32 = uhbVar.f;
                    this.b = 1;
                    objA = ((s7) q7Var).a(i32, 24, this, str3);
                    if (objA == xx1Var) {
                    }
                }
                List<ihb> list = (List) objA;
                uhbVar.t = list.size() == 24;
                uhbVar.s = false;
                uhbVar.f++;
                for (ihb ihbVar : list) {
                    linkedHashMap.put(ihbVar.a, ihbVar);
                }
                fr9 fr9Var6 = uhbVar.d;
                if (fr9Var6 != null) {
                    do {
                        value3 = fr9Var6.getValue();
                        z = uhbVar.t;
                        Collection collectionValues = linkedHashMap.values();
                        collectionValues.getClass();
                        listZ0 = fc1.Z0(collectionValues);
                        ((thb) value3).getClass();
                    } while (!fr9Var6.j(value3, new thb(false, z, listZ0)));
                }
                break;
            case 23:
                int i33 = this.b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
                    firebaseAuth.getClass();
                    lx0 lx0VarA = cx1.A(new yw3(new bbc(firebaseAuth, 20), jt1Var, i8));
                    rb9 rb9Var8 = new rb9((hib) obj2, i4);
                    this.b = 1;
                    if (lx0VarA.a(rb9Var8, this) == xx1Var) {
                    }
                }
                break;
            case 24:
                int i34 = this.b;
                try {
                    if (i34 != 0) {
                        if (i34 != 1) {
                            gp.j("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            e11.e0(obj);
                        }
                        break;
                    } else {
                        e11.e0(obj);
                        this.b = 1;
                        if (hebVar == xx1Var) {
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                break;
            case 25:
                int i35 = this.b;
                if (i35 != 0) {
                    if (i35 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    this.b = 1;
                    if (tw1.H(700L, this) == xx1Var) {
                    }
                }
                je4 je4Var = (je4) obj2;
                je4Var.h.setValue(Boolean.FALSE);
                je4Var.i.setValue(p03.a);
                je4Var.j.setValue(0);
                break;
            case 26:
                int i36 = this.b;
                if (i36 != 0) {
                    if (i36 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    this.b = 1;
                    if (((bi1) ((ai1) obj2)).o(this) == xx1Var) {
                    }
                }
                break;
            case 27:
                l3c l3cVar = (l3c) obj2;
                int i37 = this.b;
                if (i37 != 0) {
                    if (i37 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    mf5 mf5VarC = ue5.d.c(l3cVar.b);
                    is4 is4Var = l3cVar.g;
                    String str4 = l3cVar.a;
                    nx9 nx9Var = new nx9(mf5VarC, i6);
                    qoa qoaVar = new qoa(l3cVar, jt1Var, 25);
                    this.b = 1;
                    Object objR0 = vo1.r0(is4Var, new v(15, gu4.b, new v(i5, str4, nx9Var)), qoaVar, this);
                    if (objR0 != xx1Var) {
                        objR0 = hebVar;
                    }
                    if (objR0 != xx1Var) {
                        objR0 = hebVar;
                    }
                    if (objR0 == xx1Var) {
                    }
                }
                break;
            case 28:
                d6c d6cVar = (d6c) obj2;
                int i38 = this.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        e11.e0(obj);
                    } else if (i38 == 2) {
                        e11.e0(obj);
                        ymVar = d6cVar.C;
                        f = new Float(0.0f);
                        p9bVar = new p9b(300, b83.b, 2);
                        this.b = 3;
                        if (ym.b(ymVar, f, p9bVar, null, this, 12) == xx1Var) {
                        }
                    } else if (i38 == 3) {
                        e11.e0(obj);
                    } else {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    e11.e0(obj);
                    ym ymVar2 = d6cVar.C;
                    Float f2 = new Float(1.0f);
                    this.b = 1;
                    if (ymVar2.f(this, f2) == xx1Var) {
                    }
                }
                this.b = 2;
                if (tw1.H(800L, this) == xx1Var) {
                }
                ymVar = d6cVar.C;
                f = new Float(0.0f);
                p9bVar = new p9b(300, b83.b, 2);
                this.b = 3;
                if (ym.b(ymVar, f, p9bVar, null, this, 12) == xx1Var) {
                }
                break;
            default:
                int i39 = this.b;
                if (i39 != 0) {
                    if (i39 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    o7c o7cVar = ((e7c) obj2).C;
                    this.b = 1;
                    Object objG = o7cVar.c.g("onPress", this);
                    if (objG != xx1Var) {
                        objG = hebVar;
                    }
                    if (objG == xx1Var) {
                    }
                }
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dd9(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
    }
}
