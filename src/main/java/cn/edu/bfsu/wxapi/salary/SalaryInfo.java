package cn.edu.bfsu.wxapi.salary;

import java.io.Serializable;
import java.math.BigDecimal;

public class SalaryInfo implements Serializable {

	private static final long serialVersionUID = -5204322802396465759L;

	private String RESOURCE_ID; //ID
	
	private String GZNF; // 工资年份
	private String GZYF; // 工资月份
	private String GH; // 工号
	private String XM; // 姓名
	private String BMDM; //部门代码
	private String BMMC; //部门名称
	private BigDecimal GWGZ; //岗位工资
	private BigDecimal XJGZ; //薪级工资
	private BigDecimal TB; //托补
	private BigDecimal DNF; //独奶费
	private BigDecimal FZBT; // 房租补贴
	private BigDecimal GJJ; // 公积金
	private BigDecimal GJFT; // 国家房贴
	private BigDecimal DHF; // 电话费
	private BigDecimal ZSB; // 支书补
	private BigDecimal JHL; // 教护龄
	private BigDecimal GZB; // 高知补
	private BigDecimal YSB; // 遗属补
	private BigDecimal QTB; // 其它补
	private BigDecimal XNBT; // 校内补贴
	private BigDecimal GL; // 工龄
	private BigDecimal GT; // 岗贴
	private BigDecimal JJ; // 奖金
	private BigDecimal YJJT; // 业绩津贴
	private BigDecimal KYYJJJL; // 科研业绩及奖励
	private BigDecimal XZGBT; // 新职工补贴
	private BigDecimal GHGBBT; // 工会干部补贴
	private BigDecimal ZYRCBT; // 卓越人才补贴
	private BigDecimal D13YGZ; // 第13月工资
	private BigDecimal QNBT; // 取暖补贴
	private BigDecimal QTSR; // 其它收入
	private BigDecimal BF; // 补发
	private BigDecimal YFHJ; // 应发合计
	private BigDecimal HY; // 互医
	private BigDecimal FF; // 房费
	private BigDecimal WSF; // 卫生费
	private BigDecimal SF; // 水费
	private BigDecimal NZJS; // 年终奖税
	private BigDecimal GRS; // 个人税
	private BigDecimal KK; // 扣款
	private BigDecimal KGJJ; // 扣公积金
	private BigDecimal YKZYNJ;// 预扣职业年金
	private BigDecimal YKYLX; // 预扣养老险
	private BigDecimal SYBX; // 失业保险
	private BigDecimal YLBX; // 养老保险
	private BigDecimal SFGZ; // 实发工资
	private String SFZJH; // 身份证号
	private String GZYHKH; // 工资银行卡号
	
	public String getRESOURCE_ID() {
		return RESOURCE_ID;
	}
	public void setRESOURCE_ID(String rESOURCE_ID) {
		RESOURCE_ID = rESOURCE_ID;
	}
	public String getGZNF() {
		return GZNF;
	}
	public void setGZNF(String gZNF) {
		GZNF = gZNF;
	}
	public String getGZYF() {
		return GZYF;
	}
	public void setGZYF(String gZYF) {
		GZYF = gZYF;
	}
	public String getGH() {
		return GH;
	}
	public void setGH(String gH) {
		GH = gH;
	}
	public String getXM() {
		return XM;
	}
	public void setXM(String xM) {
		XM = xM;
	}
	public String getBMDM() {
		return BMDM;
	}
	public void setBMDM(String bMDM) {
		BMDM = bMDM;
	}
	public String getBMMC() {
		return BMMC;
	}
	public void setBMMC(String bMMC) {
		BMMC = bMMC;
	}
	public BigDecimal getGWGZ() {
		return GWGZ;
	}
	public void setGWGZ(BigDecimal gWGZ) {
		GWGZ = gWGZ;
	}
	public BigDecimal getXJGZ() {
		return XJGZ;
	}
	public void setXJGZ(BigDecimal xJGZ) {
		XJGZ = xJGZ;
	}
	public BigDecimal getTB() {
		return TB;
	}
	public void setTB(BigDecimal tB) {
		TB = tB;
	}
	public BigDecimal getDNF() {
		return DNF;
	}
	public void setDNF(BigDecimal dNF) {
		DNF = dNF;
	}
	public BigDecimal getFZBT() {
		return FZBT;
	}
	public void setFZBT(BigDecimal fZBT) {
		FZBT = fZBT;
	}
	public BigDecimal getGJJ() {
		return GJJ;
	}
	public void setGJJ(BigDecimal gJJ) {
		GJJ = gJJ;
	}
	public BigDecimal getGJFT() {
		return GJFT;
	}
	public void setGJFT(BigDecimal gJFT) {
		GJFT = gJFT;
	}
	public BigDecimal getDHF() {
		return DHF;
	}
	public void setDHF(BigDecimal dHF) {
		DHF = dHF;
	}
	public BigDecimal getZSB() {
		return ZSB;
	}
	public void setZSB(BigDecimal zSB) {
		ZSB = zSB;
	}
	public BigDecimal getJHL() {
		return JHL;
	}
	public void setJHL(BigDecimal jHL) {
		JHL = jHL;
	}
	public BigDecimal getGZB() {
		return GZB;
	}
	public void setGZB(BigDecimal gZB) {
		GZB = gZB;
	}
	public BigDecimal getYSB() {
		return YSB;
	}
	public void setYSB(BigDecimal ySB) {
		YSB = ySB;
	}
	public BigDecimal getQTB() {
		return QTB;
	}
	public void setQTB(BigDecimal qTB) {
		QTB = qTB;
	}
	public BigDecimal getXNBT() {
		return XNBT;
	}
	public void setXNBT(BigDecimal xNBT) {
		XNBT = xNBT;
	}
	public BigDecimal getGL() {
		return GL;
	}
	public void setGL(BigDecimal gL) {
		GL = gL;
	}
	public BigDecimal getGT() {
		return GT;
	}
	public void setGT(BigDecimal gT) {
		GT = gT;
	}
	public BigDecimal getJJ() {
		return JJ;
	}
	public void setJJ(BigDecimal jJ) {
		JJ = jJ;
	}
	public BigDecimal getYJJT() {
		return YJJT;
	}
	public void setYJJT(BigDecimal yJJT) {
		YJJT = yJJT;
	}
	public BigDecimal getKYYJJJL() {
		return KYYJJJL;
	}
	public void setKYYJJJL(BigDecimal kYYJJJL) {
		KYYJJJL = kYYJJJL;
	}
	public BigDecimal getXZGBT() {
		return XZGBT;
	}
	public void setXZGBT(BigDecimal xZGBT) {
		XZGBT = xZGBT;
	}
	public BigDecimal getGHGBBT() {
		return GHGBBT;
	}
	public void setGHGBBT(BigDecimal gHGBBT) {
		GHGBBT = gHGBBT;
	}
	public BigDecimal getZYRCBT() {
		return ZYRCBT;
	}
	public void setZYRCBT(BigDecimal zYRCBT) {
		ZYRCBT = zYRCBT;
	}
	public BigDecimal getD13YGZ() {
		return D13YGZ;
	}
	public void setD13YGZ(BigDecimal d13ygz) {
		D13YGZ = d13ygz;
	}
	public BigDecimal getQNBT() {
		return QNBT;
	}
	public void setQNBT(BigDecimal qNBT) {
		QNBT = qNBT;
	}
	public BigDecimal getQTSR() {
		return QTSR;
	}
	public void setQTSR(BigDecimal qTSR) {
		QTSR = qTSR;
	}
	public BigDecimal getBF() {
		return BF;
	}
	public void setBF(BigDecimal bF) {
		BF = bF;
	}
	public BigDecimal getYFHJ() {
		return YFHJ;
	}
	public void setYFHJ(BigDecimal yFHJ) {
		YFHJ = yFHJ;
	}
	public BigDecimal getHY() {
		return HY;
	}
	public void setHY(BigDecimal hY) {
		HY = hY;
	}
	public BigDecimal getFF() {
		return FF;
	}
	public void setFF(BigDecimal fF) {
		FF = fF;
	}
	public BigDecimal getWSF() {
		return WSF;
	}
	public void setWSF(BigDecimal wSF) {
		WSF = wSF;
	}
	public BigDecimal getSF() {
		return SF;
	}
	public void setSF(BigDecimal sF) {
		SF = sF;
	}
	public BigDecimal getNZJS() {
		return NZJS;
	}
	public void setNZJS(BigDecimal nZJS) {
		NZJS = nZJS;
	}
	public BigDecimal getGRS() {
		return GRS;
	}
	public void setGRS(BigDecimal gRS) {
		GRS = gRS;
	}
	public BigDecimal getKK() {
		return KK;
	}
	public void setKK(BigDecimal kK) {
		KK = kK;
	}
	public BigDecimal getKGJJ() {
		return KGJJ;
	}
	public void setKGJJ(BigDecimal kGJJ) {
		KGJJ = kGJJ;
	}
	public BigDecimal getYKZYNJ() {
		return YKZYNJ;
	}
	public void setYKZYNJ(BigDecimal yKZYNJ) {
		YKZYNJ = yKZYNJ;
	}
	public BigDecimal getYKYLX() {
		return YKYLX;
	}
	public void setYKYLX(BigDecimal yKYLX) {
		YKYLX = yKYLX;
	}
	public BigDecimal getSYBX() {
		return SYBX;
	}
	public void setSYBX(BigDecimal sYBX) {
		SYBX = sYBX;
	}
	public BigDecimal getYLBX() {
		return YLBX;
	}
	public void setYLBX(BigDecimal yLBX) {
		YLBX = yLBX;
	}
	public BigDecimal getSFGZ() {
		return SFGZ;
	}
	public void setSFGZ(BigDecimal sFGZ) {
		SFGZ = sFGZ;
	}
	public String getSFZJH() {
		return SFZJH;
	}
	public void setSFZJH(String sFZJH) {
		SFZJH = sFZJH;
	}
	public String getGZYHKH() {
		return GZYHKH;
	}
	public void setGZYHKH(String gZYHKH) {
		GZYHKH = gZYHKH;
	}
	
	

}
