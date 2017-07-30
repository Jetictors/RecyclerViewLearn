package com.features.moneies.article.recyclerviewlearn.bean;

import java.util.List;

/**
 * 支付宝首页的数据对象
 * Created by loser's computer on 2017/7/30.
 */
public class AlipayIndexBean {

    private int itemType;
    private Express express;
    private HealthSafe healthSafe;
    private HealthCare healthCare;
    private AlipayHelper alipayHelper;
    private Bill bill;
    private Card card;
    private Safe safe;
    private Footer footer;
    private Other other;

    public AlipayIndexBean(){}

    public AlipayIndexBean(int itemType, Express express, HealthSafe healthSafe
            , HealthCare healthCare, AlipayHelper alipayHelper, Bill bill, Card card, Safe safe
            , Footer footer, Other other) {
        this.itemType = itemType;
        this.express = express;
        this.healthSafe = healthSafe;
        this.healthCare = healthCare;
        this.alipayHelper = alipayHelper;
        this.bill = bill;
        this.card = card;
        this.safe = safe;
        this.footer = footer;
        this.other = other;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public Express getExpress() {
        return express;
    }

    public void setExpress(Express express) {
        this.express = express;
    }

    public AlipayHelper getAlipayHelper() {
        return alipayHelper;
    }

    public void setAlipayHelper(AlipayHelper alipayHelper) {
        this.alipayHelper = alipayHelper;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Safe getSafe() {
        return safe;
    }

    public void setSafe(Safe safe) {
        this.safe = safe;
    }

    public Footer getFooter() {
        return footer;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    public Other getOther() {
        return other;
    }

    public void setOther(Other other) {
        this.other = other;
    }

    public HealthSafe getHealthSafe() {
        return healthSafe;
    }

    public void setHealthSafe(HealthSafe healthSafe) {
        this.healthSafe = healthSafe;
    }

    public HealthCare getHealthCare() {
        return healthCare;
    }

    public void setHealthCare(HealthCare healthCare) {
        this.healthCare = healthCare;
    }

    @Override
    public String toString() {
        return "AlipayIndexBean{" +
                "itemType=" + itemType +
                ", express=" + express +
                ", healthSafe=" + healthSafe +
                ", healthCare=" + healthCare +
                ", alipayHelper=" + alipayHelper +
                ", bill=" + bill +
                ", card=" + card +
                ", safe=" + safe +
                ", footer=" + footer +
                ", other=" + other +
                '}';
    }

    /**
     * 快递
     */
    public static class Express{

        /**
         * item类型说明
         */
        private String  typeText;

        /**
         * 快递时间
         */
        private String timeText;

        /**
         * 商品图标
         */
        private String expressIcon;

        /**
         * 签收状态
         */
        private int state;

        /**
         * 快递信息
         */
        private String expressInfo;

        /**
         * 快递类别
         */
        private String expressTypeName;

        /**
         * 快递单号
         */
        private String expressNumber;

        /**
         * 按钮文字
         */
        private String btnText;

        public Express() {
        }

        public Express(String typeText, String timeText, String expressIcon, int state
                , String expressInfo, String expressTypeName, String expressNumber, String btnText) {
            this.typeText = typeText;
            this.timeText = timeText;
            this.expressIcon = expressIcon;
            this.state = state;
            this.expressInfo = expressInfo;
            this.expressTypeName = expressTypeName;
            this.expressNumber = expressNumber;
            this.btnText = btnText;
        }

        public String getTypeText() {
            return typeText;
        }

        public void setTypeText(String typeText) {
            this.typeText = typeText;
        }

        public String getTimeText() {
            return timeText;
        }

        public void setTimeText(String timeText) {
            this.timeText = timeText;
        }

        public String getExpressIcon() {
            return expressIcon;
        }

        public void setExpressIcon(String expressIcon) {
            this.expressIcon = expressIcon;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public String getExpressInfo() {
            return expressInfo;
        }

        public void setExpressInfo(String expressInfo) {
            this.expressInfo = expressInfo;
        }

        public String getExpressTypeName() {
            return expressTypeName;
        }

        public void setExpressTypeName(String expressTypeName) {
            this.expressTypeName = expressTypeName;
        }

        public String getExpressNumber() {
            return expressNumber;
        }

        public void setExpressNumber(String expressNumber) {
            this.expressNumber = expressNumber;
        }

        public String getBtnText() {
            return btnText;
        }

        public void setBtnText(String btnText) {
            this.btnText = btnText;
        }

        @Override
        public String toString() {
            return "Express{" +
                    "typeText='" + typeText + '\'' +
                    ", timeText='" + timeText + '\'' +
                    ", expressIcon='" + expressIcon + '\'' +
                    ", state=" + state +
                    ", expressInfo='" + expressInfo + '\'' +
                    ", expressTypeName='" + expressTypeName + '\'' +
                    ", expressNumber='" + expressNumber + '\'' +
                    ", btnText='" + btnText + '\'' +
                    '}';
        }
    }

    /**
     * 健康 -> 保险
     */
    public static class HealthSafe{

        /**
         * item类型说明
         */
        private String  typeText;

        /**
         * 刷新时间
         */
        private String timeText;

        /**
         * 图标
         */
        private int HealthIcon;

        /**
         * 第一行文字
         */
        private String hintTextFirst;

        /**
         * 第二行文字
         */
        private String hintTextSecond;

        /**
         * 按钮文字
         */
        private String btnText;

        public HealthSafe() {
        }

        public HealthSafe(String typeText, String timeText, int healthIcon, String hintTextFirst
                , String hintTextSecond, String btnText) {
            this.typeText = typeText;
            this.timeText = timeText;
            HealthIcon = healthIcon;
            this.hintTextFirst = hintTextFirst;
            this.hintTextSecond = hintTextSecond;
            this.btnText = btnText;
        }

        public String getTypeText() {
            return typeText;
        }

        public void setTypeText(String typeText) {
            this.typeText = typeText;
        }

        public String getTimeText() {
            return timeText;
        }

        public void setTimeText(String timeText) {
            this.timeText = timeText;
        }

        public int getHealthIcon() {
            return HealthIcon;
        }

        public void setHealthIcon(int healthIcon) {
            HealthIcon = healthIcon;
        }

        public String getHintTextFirst() {
            return hintTextFirst;
        }

        public void setHintTextFirst(String hintTextFirst) {
            this.hintTextFirst = hintTextFirst;
        }

        public String getHintTextSecond() {
            return hintTextSecond;
        }

        public void setHintTextSecond(String hintTextSecond) {
            this.hintTextSecond = hintTextSecond;
        }

        public String getBtnText() {
            return btnText;
        }

        public void setBtnText(String btnText) {
            this.btnText = btnText;
        }

        @Override
        public String toString() {
            return "Health{" +
                    "typeText='" + typeText + '\'' +
                    ", timeText='" + timeText + '\'' +
                    ", HealthIcon=" + HealthIcon +
                    ", hintTextFirst='" + hintTextFirst + '\'' +
                    ", hintTextSecond='" + hintTextSecond + '\'' +
                    ", btnText='" + btnText + '\'' +
                    '}';
        }
    }

    /**
     * 健康 -> 天气关怀
     */
    public static class HealthCare{

        /**
         * item类型说明
         */
        private String  typeText;

        /**
         * 刷新时间
         */
        private String timeText;

        /**
         * 提示1
         */
        private String hintTextFirst;

        /**
         * 提示2
         */
        private int hintTextSecond;

        /**
         * 提示3
         */
        private String hintTextThird;

        /**
         * 按钮文字
         */
        private String btnText;

        public HealthCare() {
        }

        public HealthCare(String typeText, String timeText, String hintTextFirst, int hintTextSecond
                , String hintTextThird, String btnText) {
            this.typeText = typeText;
            this.timeText = timeText;
            this.hintTextFirst = hintTextFirst;
            this.hintTextSecond = hintTextSecond;
            this.hintTextThird = hintTextThird;
            this.btnText = btnText;
        }

        public String getTypeText() {
            return typeText;
        }

        public void setTypeText(String typeText) {
            this.typeText = typeText;
        }

        public String getTimeText() {
            return timeText;
        }

        public void setTimeText(String timeText) {
            this.timeText = timeText;
        }

        public String getHintTextFirst() {
            return hintTextFirst;
        }

        public void setHintTextFirst(String hintTextFirst) {
            this.hintTextFirst = hintTextFirst;
        }

        public int getHintTextSecond() {
            return hintTextSecond;
        }

        public void setHintTextSecond(int hintTextSecond) {
            this.hintTextSecond = hintTextSecond;
        }

        public String getHintTextThird() {
            return hintTextThird;
        }

        public void setHintTextThird(String hintTextThird) {
            this.hintTextThird = hintTextThird;
        }

        public String getBtnText() {
            return btnText;
        }

        public void setBtnText(String btnText) {
            this.btnText = btnText;
        }

        @Override
        public String toString() {
            return "HealthCare{" +
                    "typeText='" + typeText + '\'' +
                    ", timeText='" + timeText + '\'' +
                    ", hintTextFirst='" + hintTextFirst + '\'' +
                    ", hintTextSecond=" + hintTextSecond +
                    ", hintTextThird='" + hintTextThird + '\'' +
                    ", btnText='" + btnText + '\'' +
                    '}';
        }
    }

    /**
     * 支付助手
     */
    public static class AlipayHelper{

        /**
         * item类型说明
         */
        private String  typeText;

        /**
         * 刷新时间
         */
        private String timeText;

        /**
         * 金额
         */
        private String money;

        /**
         * 支付类型
         */
        private int alipayType;

        /**
         * 提示
         */
        private String hint;

        /**
         * 按钮文字
         */
        private String btnText;

        public AlipayHelper() {
        }

        public AlipayHelper(String typeText, String timeText, String money, int alipayType
                , String hint,String btnText) {
            this.typeText = typeText;
            this.timeText = timeText;
            this.money = money;
            this.alipayType = alipayType;
            this.hint = hint;
            this.btnText = btnText;
        }

        public String getTypeText() {
            return typeText;
        }

        public void setTypeText(String typeText) {
            this.typeText = typeText;
        }

        public String getTimeText() {
            return timeText;
        }

        public void setTimeText(String timeText) {
            this.timeText = timeText;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }

        public int getAlipayType() {
            return alipayType;
        }

        public void setAlipayType(int alipayType) {
            this.alipayType = alipayType;
        }

        public String getHint() {
            return hint;
        }

        public void setHint(String hint) {
            this.hint = hint;
        }

        public String getBtnText() {
            return btnText;
        }

        public void setBtnText(String btnText) {
            this.btnText = btnText;
        }

        @Override
        public String toString() {
            return "AlipayHelper{" +
                    "typeText='" + typeText + '\'' +
                    ", timeText='" + timeText + '\'' +
                    ", money='" + money + '\'' +
                    ", alipayType=" + alipayType +
                    ", hint='" + hint + '\'' +
                    ", btnText='" + btnText + '\'' +
                    '}';
        }
    }

    /**
     * 支付宝账单
     */
    public static class Bill{
        /**
         * item类型说明
         */
        private String  typeText;

        /**
         * 刷新时间
         */
        private String timeText;

        /**
         * 支出
         */
        private String expend;

        /**
         * 收入
         */
        private String income;

        /**
         * 按钮文字
         */
        private String btnText;

        public Bill() {
        }

        public Bill(String typeText, String timeText, String expend, String income, String btnText) {
            this.typeText = typeText;
            this.timeText = timeText;
            this.expend = expend;
            this.income = income;
            this.btnText = btnText;
        }

        public String getTypeText() {
            return typeText;
        }

        public void setTypeText(String typeText) {
            this.typeText = typeText;
        }

        public String getTimeText() {
            return timeText;
        }

        public void setTimeText(String timeText) {
            this.timeText = timeText;
        }

        public String getExpend() {
            return expend;
        }

        public void setExpend(String expend) {
            this.expend = expend;
        }

        public String getIncome() {
            return income;
        }

        public void setIncome(String income) {
            this.income = income;
        }

        public String getBtnText() {
            return btnText;
        }

        public void setBtnText(String btnText) {
            this.btnText = btnText;
        }

        @Override
        public String toString() {
            return "AlipayHelper{" +
                    "typeText='" + typeText + '\'' +
                    ", timeText='" + timeText + '\'' +
                    ", expend='" + expend + '\'' +
                    ", income='" + income + '\'' +
                    ", btnText='" + btnText + '\'' +
                    '}';
        }
    }

    /**
     * 蚂蚁保卡
     */
    public static class Card{

        /**
         * item类型说明
         */
        private String  typeText;

        /**
         * 刷新时间
         */
        private String timeText;

        /**
         * 图片
         */
        private int img;

        /**
         * 按钮文字
         */
        private String btnText;

        public Card() {
        }

        public Card(String typeText, String timeText, int img, String btnText) {
            this.typeText = typeText;
            this.timeText = timeText;
            this.img = img;
            this.btnText = btnText;
        }

        public String getTypeText() {
            return typeText;
        }

        public void setTypeText(String typeText) {
            this.typeText = typeText;
        }

        public String getTimeText() {
            return timeText;
        }

        public void setTimeText(String timeText) {
            this.timeText = timeText;
        }

        public int getImg() {
            return img;
        }

        public void setImg(int img) {
            this.img = img;
        }

        public String getBtnText() {
            return btnText;
        }

        public void setBtnText(String btnText) {
            this.btnText = btnText;
        }

        @Override
        public String toString() {
            return "Safe{" +
                    "typeText='" + typeText + '\'' +
                    ", timeText='" + timeText + '\'' +
                    ", img=" + img +
                    ", btnText='" + btnText + '\'' +
                    '}';
        }
    }

    /**
     * 保险
     */
    public static class Safe{

        /**
         * item类型说明
         */
        private String  typeText;

        /**
         * 刷新时间
         */
        private String timeText;

        /**
         * 图标
         */
        private int HealthIcon;

        /**
         * 第一行文字
         */
        private String hintTextFirst;

        /**
         * 第二行文字
         */
        private String hintTextSecond;

        /**
         * 按钮文字
         */
        private String btnText;

        public Safe() {
        }

        public Safe(String typeText, String timeText, int healthIcon, String hintTextFirst
                , String hintTextSecond, String btnText) {
            this.typeText = typeText;
            this.timeText = timeText;
            HealthIcon = healthIcon;
            this.hintTextFirst = hintTextFirst;
            this.hintTextSecond = hintTextSecond;
            this.btnText = btnText;
        }

        public String getTypeText() {
            return typeText;
        }

        public void setTypeText(String typeText) {
            this.typeText = typeText;
        }

        public String getTimeText() {
            return timeText;
        }

        public void setTimeText(String timeText) {
            this.timeText = timeText;
        }

        public int getHealthIcon() {
            return HealthIcon;
        }

        public void setHealthIcon(int healthIcon) {
            HealthIcon = healthIcon;
        }

        public String getHintTextFirst() {
            return hintTextFirst;
        }

        public void setHintTextFirst(String hintTextFirst) {
            this.hintTextFirst = hintTextFirst;
        }

        public String getHintTextSecond() {
            return hintTextSecond;
        }

        public void setHintTextSecond(String hintTextSecond) {
            this.hintTextSecond = hintTextSecond;
        }

        public String getBtnText() {
            return btnText;
        }

        public void setBtnText(String btnText) {
            this.btnText = btnText;
        }

        @Override
        public String toString() {
            return "Safe{" +
                    "typeText='" + typeText + '\'' +
                    ", timeText='" + timeText + '\'' +
                    ", HealthIcon=" + HealthIcon +
                    ", hintTextFirst='" + hintTextFirst + '\'' +
                    ", hintTextSecond='" + hintTextSecond + '\'' +
                    ", btnText='" + btnText + '\'' +
                    '}';
        }
    }

    /**
     * 底部栏
     */
    public static class Footer{

        /**
         * 提示
         */
        private String hint;

        public Footer() {
        }

        public Footer(String hint) {
            this.hint = hint;
        }

        public String getHint() {
            return hint;
        }

        public void setHint(String hint) {
            this.hint = hint;
        }

        @Override
        public String toString() {
            return "Footer{" +
                    "hint='" + hint + '\'' +
                    '}';
        }
    }

    /**
     * 其他
     */
    public static class Other{

        /**
         * item类型说明
         */
        private String  typeText;

        /**
         * 刷新时间
         */
        private String timeText;

        /**
         * 图标
         */
        private int OtherIcon;

        /**
         * 第一行文字
         */
        private String hintTextFirst;

        /**
         * 第二行文字
         */
        private String hintTextSecond;

        /**
         * 按钮文字
         */
        private String btnText;

        /**
         * itemView背景颜色
         */
        private int bgColor;

        public Other() {
        }

        public Other(String typeText, String timeText, int otherIcon, String hintTextFirst
                , String hintTextSecond, String btnText, int bgColor) {
            this.typeText = typeText;
            this.timeText = timeText;
            OtherIcon = otherIcon;
            this.hintTextFirst = hintTextFirst;
            this.hintTextSecond = hintTextSecond;
            this.btnText = btnText;
            this.bgColor = bgColor;
        }

        public String getTypeText() {
            return typeText;
        }

        public void setTypeText(String typeText) {
            this.typeText = typeText;
        }

        public String getTimeText() {
            return timeText;
        }

        public void setTimeText(String timeText) {
            this.timeText = timeText;
        }

        public int getOtherIcon() {
            return OtherIcon;
        }

        public void setOtherIcon(int otherIcon) {
            OtherIcon = otherIcon;
        }

        public String getHintTextFirst() {
            return hintTextFirst;
        }

        public void setHintTextFirst(String hintTextFirst) {
            this.hintTextFirst = hintTextFirst;
        }

        public String getHintTextSecond() {
            return hintTextSecond;
        }

        public void setHintTextSecond(String hintTextSecond) {
            this.hintTextSecond = hintTextSecond;
        }

        public String getBtnText() {
            return btnText;
        }

        public void setBtnText(String btnText) {
            this.btnText = btnText;
        }

        public int getBgColor() {
            return bgColor;
        }

        public void setBgColor(int bgColor) {
            this.bgColor = bgColor;
        }

        @Override
        public String toString() {
            return "Other{" +
                    "typeText='" + typeText + '\'' +
                    ", timeText='" + timeText + '\'' +
                    ", OtherIcon='" + OtherIcon + '\'' +
                    ", hintTextFirst='" + hintTextFirst + '\'' +
                    ", hintTextSecond='" + hintTextSecond + '\'' +
                    ", btnText='" + btnText + '\'' +
                    ", bgColor=" + bgColor +
                    '}';
        }
    }
}
