package com.features.moneies.article.recyclerviewlearn.bean;

/**
 * 支付宝首页的数据对象
 * Created by loser's computer on 2017/7/30.
 */
public class AlipayIndexBean {

    private int itemType;
    private AlipayHelper alipayHelper;
    private Bill bill;
    private Card card;
    private Other other;

    public AlipayIndexBean(){}

    public AlipayIndexBean(int itemType, AlipayHelper alipayHelper, Bill bill, Card card, Other other) {
        this.itemType = itemType;
        this.alipayHelper = alipayHelper;
        this.bill = bill;
        this.card = card;
        this.other = other;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
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

    public Other getOther() {
        return other;
    }

    public void setOther(Other other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "AlipayIndexBean{" +
                "itemType=" + itemType +
                ", alipayHelper=" + alipayHelper +
                ", bill=" + bill +
                ", card=" + card +
                ", other=" + other +
                '}';
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
         * 第一行文字
         */
        private String firstHint;

        /**
         * 第二行文字
         */
        private String secondtHint;

        /**
         * 第三行文字
         */
        private String thridHint;

        /**
         * 按钮文字
         */
        private String btnText;

        public AlipayHelper() {
        }

        public AlipayHelper(String typeText, String timeText, String firstHint, String secondtHint
                , String thridHint, String btnText) {
            this.typeText = typeText;
            this.timeText = timeText;
            this.firstHint = firstHint;
            this.secondtHint = secondtHint;
            this.thridHint = thridHint;
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

        public String getFirstHint() {
            return firstHint;
        }

        public void setFirstHint(String firstHint) {
            this.firstHint = firstHint;
        }

        public String getSecondtHint() {
            return secondtHint;
        }

        public void setSecondtHint(String secondtHint) {
            this.secondtHint = secondtHint;
        }

        public String getThridHint() {
            return thridHint;
        }

        public void setThridHint(String thridHint) {
            this.thridHint = thridHint;
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
                    ", firstHint='" + firstHint + '\'' +
                    ", secondtHint=" + secondtHint +
                    ", thridHint='" + thridHint + '\'' +
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
