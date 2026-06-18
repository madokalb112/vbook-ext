package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fs2 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rs2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fs2(rs2 rs2Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = rs2Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        rs2 rs2Var = this.b;
        switch (i) {
            case 0:
                return new fs2(rs2Var, jt1Var, 0);
            default:
                return new fs2(rs2Var, jt1Var, 1);
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
        return ((fs2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                e11.e0(obj);
                return y86.P(new xl7((char) 8231, (char) 183), new xl7((char) 8226, (char) 183), new xl7((char) 12290, '.'), new xl7((char) 65106, '.'), new xl7((char) 65294, '.'), new xl7((char) 65072, ':'), new xl7((char) 8758, ':'), new xl7((char) 65109, ':'), new xl7((char) 65306, ':'), new xl7((char) 65110, '?'), new xl7((char) 65311, '?'), new xl7((char) 65111, '!'), new xl7('.', '.'), new xl7('?', '?'), new xl7(':', ':'), new xl7('!', '!'));
            default:
                e11.e0(obj);
                return y86.P(new xl7((char) 12296, (char) 10216), new xl7((char) 12297, (char) 10217), new xl7((char) 12298, (char) 10216), new xl7((char) 12299, (char) 10217), new xl7((char) 12288, ' '), new xl7(' ', ' '), new xl7((char) 713, (char) 175), new xl7((char) 8229, (char) 168), new xl7((char) 8231, (char) 183), new xl7((char) 8226, (char) 183), new xl7((char) 8245, '`'), new xl7((char) 65344, '`'), new xl7((char) 12290, '.'), new xl7((char) 65106, '.'), new xl7((char) 65294, '.'), new xl7('.', '.'), new xl7((char) 8230, (char) 8230), new xl7((char) 65104, ','), new xl7((char) 65292, ','), new xl7((char) 65105, ','), new xl7((char) 12289, ','), new xl7(',', ','), new xl7((char) 65072, ':'), new xl7((char) 8758, ':'), new xl7((char) 65108, ';'), new xl7((char) 65307, ';'), new xl7((char) 65109, ':'), new xl7((char) 65306, ':'), new xl7(':', ':'), new xl7((char) 65110, '?'), new xl7((char) 65311, '?'), new xl7('?', '?'), new xl7((char) 65111, '!'), new xl7((char) 65281, '!'), new xl7('!', '!'), new xl7((char) 65113, '('), new xl7((char) 65288, '('), new xl7((char) 65114, ')'), new xl7((char) 65289, ')'), new xl7((char) 65115, '{'), new xl7((char) 65371, '{'), new xl7((char) 65116, '}'), new xl7((char) 65373, '}'), new xl7((char) 12304, '['), new xl7((char) 65117, '['), new xl7((char) 65339, '['), new xl7((char) 12305, ']'), new xl7((char) 65118, ']'), new xl7((char) 65341, ']'), new xl7((char) 65342, '^'), new xl7((char) 65119, '#'), new xl7((char) 65283, '#'), new xl7((char) 65120, '&'), new xl7((char) 65286, '&'), new xl7((char) 65121, '*'), new xl7((char) 65290, '*'), new xl7((char) 65122, '+'), new xl7((char) 65291, '+'), new xl7('+', '+'), new xl7((char) 65123, '-'), new xl7((char) 65293, '-'), new xl7('-', '-'), new xl7((char) 65124, '<'), new xl7((char) 65308, '<'), new xl7((char) 65125, '>'), new xl7((char) 65310, '>'), new xl7('>', '>'), new xl7((char) 65126, '='), new xl7((char) 65309, '='), new xl7('=', '='), new xl7((char) 65129, '$'), new xl7((char) 65284, '$'), new xl7('$', '$'), new xl7((char) 65130, '%'), new xl7((char) 65285, '%'), new xl7((char) 65131, '@'), new xl7((char) 65312, '@'), new xl7((char) 8786, (char) 8776), new xl7((char) 8806, (char) 8804), new xl7((char) 8807, (char) 8805), new xl7((char) 65073, '|'), new xl7((char) 65372, '|'), new xl7((char) 65075, '|'), new xl7('|', '|'), new xl7((char) 65087, (char) 8743), new xl7((char) 65088, (char) 8744), new xl7((char) 65295, '/'), new xl7((char) 65340, '\\'), new xl7((char) 9588, '_'), new xl7((char) 65343, '_'), new xl7((char) 12300, (char) 8220), new xl7((char) 8220, (char) 8220), new xl7((char) 12301, (char) 8221), new xl7((char) 8221, (char) 8221), new xl7((char) 12302, (char) 8216), new xl7((char) 8216, (char) 8216), new xl7((char) 12303, (char) 8217), new xl7((char) 8217, (char) 8217), new xl7((char) 65282, '\"'), new xl7((char) 65374, '~'), new xl7((char) 65375, '('), new xl7((char) 65376, ')'), new xl7((char) 65345, 'a'), new xl7((char) 65346, 'b'), new xl7((char) 65347, 'c'), new xl7((char) 65348, 'd'), new xl7((char) 65349, 'e'), new xl7((char) 65350, 'f'), new xl7((char) 65351, 'g'), new xl7((char) 65352, 'h'), new xl7((char) 65353, 'i'), new xl7((char) 65354, 'j'), new xl7((char) 65355, 'k'), new xl7((char) 65356, 'l'), new xl7((char) 65357, 'm'), new xl7((char) 65358, 'n'), new xl7((char) 65359, 'o'), new xl7((char) 65360, 'p'), new xl7((char) 65361, 'q'), new xl7((char) 65362, 'r'), new xl7((char) 65363, 's'), new xl7((char) 65364, 't'), new xl7((char) 65365, 'u'), new xl7((char) 65366, 'v'), new xl7((char) 65367, 'w'), new xl7((char) 65368, 'x'), new xl7((char) 65369, 'y'), new xl7((char) 65370, 'z'), new xl7((char) 65313, 'A'), new xl7((char) 65314, 'B'), new xl7((char) 65315, 'C'), new xl7((char) 65316, 'D'), new xl7((char) 65317, 'E'), new xl7((char) 65318, 'F'), new xl7((char) 65319, 'G'), new xl7((char) 65320, 'H'), new xl7((char) 65321, 'I'), new xl7((char) 65322, 'J'), new xl7((char) 65323, 'K'), new xl7((char) 65324, 'L'), new xl7((char) 65325, 'M'), new xl7((char) 65326, 'N'), new xl7((char) 65327, 'O'), new xl7((char) 65328, 'P'), new xl7((char) 65329, 'Q'), new xl7((char) 65330, 'R'), new xl7((char) 65331, 'S'), new xl7((char) 65332, 'T'), new xl7((char) 65333, 'U'), new xl7((char) 65334, 'V'), new xl7((char) 65335, 'W'), new xl7((char) 65336, 'X'), new xl7((char) 65337, 'Y'), new xl7((char) 65338, 'Z'), new xl7((char) 65297, '1'), new xl7((char) 65298, '2'), new xl7((char) 65299, '3'), new xl7((char) 65300, '4'), new xl7((char) 65301, '5'), new xl7((char) 65302, '6'), new xl7((char) 65303, '7'), new xl7((char) 65304, '8'), new xl7((char) 65305, '9'), new xl7((char) 65296, '0'));
        }
    }
}
