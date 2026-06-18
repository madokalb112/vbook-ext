package org.mozilla.javascript.ast;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class ThrowStatement extends AstNode {
    private AstNode expression;

    public ThrowStatement(int i, AstNode astNode) {
        super(i, astNode.getLength());
        this.type = 55;
        setExpression(astNode);
    }

    public AstNode getExpression() {
        return this.expression;
    }

    public void setExpression(AstNode astNode) {
        assertNotNull(astNode);
        this.expression = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return makeIndent(i) + "throw " + this.expression.toSource(0) + ";\n";
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expression.visit(nodeVisitor);
        }
    }

    public ThrowStatement(int i) {
        super(i);
        this.type = 55;
    }

    public ThrowStatement(int i, int i2) {
        super(i, i2);
        this.type = 55;
    }

    public ThrowStatement(AstNode astNode) {
        this.type = 55;
        setExpression(astNode);
    }

    public ThrowStatement() {
        this.type = 55;
    }

    public ThrowStatement(int i, int i2, AstNode astNode) {
        super(i, i2);
        this.type = 55;
        setExpression(astNode);
    }
}
