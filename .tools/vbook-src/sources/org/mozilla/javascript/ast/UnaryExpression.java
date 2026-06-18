package org.mozilla.javascript.ast;

import defpackage.dx1;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class UnaryExpression extends AstNode {
    private AstNode operand;

    public UnaryExpression(int i, int i2, AstNode astNode) {
        assertNotNull(astNode);
        setBounds(astNode.getPosition(), astNode.getLength() + astNode.getPosition());
        setOperator(i);
        setOperand(astNode);
    }

    public AstNode getOperand() {
        return this.operand;
    }

    public int getOperator() {
        return this.type;
    }

    public void setOperand(AstNode astNode) {
        assertNotNull(astNode);
        this.operand = astNode;
        astNode.setParent(this);
    }

    public void setOperator(int i) {
        if (Token.isValidToken(i)) {
            setType(i);
        } else {
            gp.l(dx1.f(i, "Invalid token: "));
        }
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(makeIndent(i));
        int type = getType();
        sb.append(AstNode.operatorToString(type));
        if (type == 32 || type == 31 || type == 139) {
            sb.append(" ");
        }
        sb.append(this.operand.toSource());
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.operand.visit(nodeVisitor);
        }
    }

    public UnaryExpression(int i) {
        super(i);
    }

    public UnaryExpression(int i, int i2) {
        super(i, i2);
    }

    public UnaryExpression() {
    }
}
